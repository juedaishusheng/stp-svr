package com.el.cfg.security.domain;

import org.apache.shiro.authc.Account;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * @author neo.pan
 * @since 16/8/16
 */
public class MySimpleAccount implements Account {

    private PrincipalCollection principalCollection;
    private Object credentials;
    private Set<String> roles;

    public MySimpleAccount(MyAccountProperties properties, String realm) {
        principalCollection = new MyPrincipalCollection(properties, realm);
        credentials = properties.getPassword();
        roles = Collections.singleton(properties.getRole());
    }

    @Override
    public PrincipalCollection getPrincipals() {
        return principalCollection;
    }

    @Override
    public Object getCredentials() {
        return credentials;
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
