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
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author neo.pan
 * @since 16/8/14
 */
@Slf4j
public class MyCasRealm extends CasRealm {

    @Autowired
    private MyAccountMapper myAccountMapper;

    // 1. 获取认证信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        final AuthenticationInfo authcInfo = super.doGetAuthenticationInfo(token);
        if (authcInfo == null) {
            log.debug("[APP-AUTH] doGetAuthenticationInfo - authentication failed");
            return null;
        }

        final String username = (String) getAvailablePrincipal(authcInfo.getPrincipals());
        final MyAccountProperties accountAttributes = myAccountMapper.accountOf(username);
        if (accountAttributes == null) {
            log.debug("[APP-AUTH] doGetAuthenticationInfo - account of {} cannot be found", username);
            return null;
        }
        log.debug("[APP-AUTH] doGetAuthenticationInfo - account attributes: {}", accountAttributes);

        return new MyAuthenticationInfo(accountAttributes, authcInfo);
    }

    // 2. 获取授权信息
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return new MyAuthorizationInfo((MyPrincipalCollection) principals);
    }
}
