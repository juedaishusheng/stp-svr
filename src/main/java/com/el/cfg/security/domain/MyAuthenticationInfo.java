package com.el.cfg.security.domain;

import lombok.Getter;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @author neo.pan
 * @since 16/8/16
 */
public class MyAuthenticationInfo implements AuthenticationInfo {

    @Getter
    private PrincipalCollection principals;

    @Getter
    private Object credentials;

    public MyAuthenticationInfo(MyAccountProperties accountAttributes, String realmName) {
        this.principals = new MyPrincipalCollection(accountAttributes, realmName);
        this.credentials = accountAttributes.getPassword();
    }

    public MyAuthenticationInfo(MyAccountAttributes accountAttributes, AuthenticationInfo authcInfo) {
        this.principals = new MyPrincipalCollection(accountAttributes, authcInfo.getPrincipals());
        this.credentials = authcInfo.getCredentials();
    }
}
