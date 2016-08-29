package com.el.cfg.security.realm;

import com.el.cfg.security.domain.MyAccountProperties;
import com.el.cfg.security.domain.MyAuthenticationInfo;
import com.el.cfg.security.domain.MyAuthorizationInfo;
import com.el.cfg.security.domain.MyPrincipalCollection;
import com.el.cfg.security.mapper.MyAccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.PasswordMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created on 16/7/23.
 *
 * @author panlw
 */
@Slf4j
public class MyJdbcRealm extends AuthorizingRealm {

    @Autowired
    private MyAccountMapper myAccountMapper;

    public MyJdbcRealm() {
        setCredentialsMatcher(new PasswordMatcher() {{
            setPasswordService(new MyPasswordService());
        }});
    }

    // 1. 获取认证信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        final String username = ((UsernamePasswordToken) token).getUsername();
        if (!StringUtils.hasText(username)) {
            log.debug("[APP-AUTH] doGetAuthenticationInfo - username or password is blank");
            return null;
        }

        final MyAccountProperties accountAttributes = myAccountMapper.accountOf(username);
        if (accountAttributes == null) {
            log.debug("[APP-AUTH] doGetAuthenticationInfo - account of {} cannot be found", username);
            return null;
        }
        log.debug("[APP-AUTH] doGetAuthenticationInfo - account attributes: {}", accountAttributes);

        return new MyAuthenticationInfo(accountAttributes, getName());
    }

    // 2. 获取授权信息
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return new MyAuthorizationInfo((MyPrincipalCollection) principals);
    }
}
