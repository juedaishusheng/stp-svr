package com.el.cfg.security;

import org.apache.shiro.web.filter.mgt.FilterChainResolver;
import org.apache.shiro.web.mgt.WebSecurityManager;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.apache.shiro.web.servlet.ShiroHttpServletRequest;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * @author neo.pan
 * @since 16/8/1
 */
class MySpringShiroFilter extends AbstractShiroFilter {

    MySpringShiroFilter(WebSecurityManager webSecurityManager, FilterChainResolver resolver) {
        super();
        if (webSecurityManager == null) {
            throw new IllegalArgumentException("WebSecurityManager property cannot be null.");
        }
        setSecurityManager(webSecurityManager);
        if (resolver != null) {
            setFilterChainResolver(resolver);
        }
    }

    @Override
    protected ServletResponse wrapServletResponse(HttpServletResponse orig, ShiroHttpServletRequest request) {
        return new MyShiroHttpServletResponse(orig, getServletContext(), request);
    }
}
