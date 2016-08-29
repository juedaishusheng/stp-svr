package com.el.cfg.security.domain;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * @author neo.pan
 * @since 16/8/16
 */
public class MyAuthorizationInfo implements AuthorizationInfo {

    private Set<String> roles;

    public MyAuthorizationInfo(MyPrincipalCollection principalCollection) {
        this(principalCollection.getAccountAttributes().getRole());
    }

    public MyAuthorizationInfo(String role) {
        roles = Collections.singleton(role);
    }

    @Override
    public Collection<String> getRoles() {
        return roles;
    }

    @Override
    public Collection<String> getStringPermissions() {
        return null;
    }

    @Override
    public Collection<Permission> getObjectPermissions() {
        return null;
    }
}
