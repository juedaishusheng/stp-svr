package com.el.cfg.security.domain;

import lombok.Getter;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;

/**
 * @author neo.pan
 * @since 16/8/16
 */
public class MyPrincipalCollection extends SimplePrincipalCollection {

    private static final long serialVersionUID = -6305224034025797559L;

    @Getter
    private MyAccountAttributes accountAttributes;

    public String getUsername() {
        return accountAttributes.getUsername();
    }

    public MyPrincipalCollection(MyAccountAttributes accountAttributes, String realmName) {
        super(accountAttributes.getUsername(), realmName);
        this.accountAttributes = accountAttributes;
    }

    public MyPrincipalCollection(MyAccountAttributes accountAttributes, PrincipalCollection principals) {
        super(principals);
        this.accountAttributes = accountAttributes;
    }
}
