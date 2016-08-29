package com.el.cfg.security.realm;

import com.el.cfg.security.domain.MyPrincipalCollection;
import com.el.cfg.security.domain.MySimpleAccount;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author neo.pan
 * @since 16/8/16
 */
@Slf4j
public class MySimpleRealm extends AuthorizingRealm {

    private Map<String, Account> accountMap = new HashMap<>();

    public MySimpleRealm(String realmName, MySimpleRealmProperties realmProperties) {
        realmProperties.getAccounts()
            .forEach(x -> accountMap.put(x.getUsername(), new MySimpleAccount(x, realmName)));
    }

    // 1. 获取认证信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        final UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        final String username = usernamePasswordToken.getUsername();
        final String password = String.valueOf(usernamePasswordToken.getPassword());
        if (!StringUtils.hasText(username) || !StringUtils.hasText(password)) {
            log.debug("[APP-AUTH] doGetAuthenticationInfo - username or password is blank");
            return null;
        }

        final Account account = accountMap.get(username);
        if (account == null) {
            log.debug("[APP-AUTH] doGetAuthenticationInfo - account of {} cannot be found", username);
            return null;
        }
        if (!password.equals(account.getCredentials())) {
            log.debug("[APP-AUTH] doGetAuthenticationInfo - password is wrong", password);
            return null;
        }
        log.debug("[APP-AUTH] doGetAuthenticationInfo - account: {}", account);

        return account;
    }

    // 2. 获取授权信息
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        final MyPrincipalCollection principalCollection = (MyPrincipalCollection) principals;
        final String username = principalCollection.getUsername();
        if (!StringUtils.hasText(username)) {
            log.debug("[APP-AUTH] doGetAuthorizationInfo - username is blank");
            return null;
        }

        final Account account = accountMap.get(username);
        if (account == null) {
            log.debug("[APP-AUTH] doGetAuthorizationInfo - account of {} cannot be found", username);
            return null;
        }

        return account;
    }
}
