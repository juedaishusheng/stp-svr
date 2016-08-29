package com.el.cfg.security.filter;

import org.apache.shiro.web.filter.authz.AuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.Arrays;

import static com.el.cfg.security.ShiroUtil.isRoleIn;

/**
 * Created on 16/7/29.
 *
 * @author panlw
 */
public class AnyRolesAuthorizationFilter extends AuthorizationFilter {

    @Override
    protected boolean isAccessAllowed(
        ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        //no roles specified, so nothing to check - allow access.
        final String[] roles = (String[]) mappedValue;
        return (roles == null) || (roles.length == 0) || isRoleIn(Arrays.asList(roles));
    }
}
