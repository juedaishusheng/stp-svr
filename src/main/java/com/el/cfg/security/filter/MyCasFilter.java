package com.el.cfg.security.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.cas.CasFilter;
import org.apache.shiro.util.StringUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @author neo.pan
 * @since 16/8/15
 */
@Slf4j
public class MyCasFilter extends CasFilter {

    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) throws Exception {
        final HttpServletRequest httpRequest = (HttpServletRequest) request;
        log.debug("[CAS-AUTH] callback {} with query: {}",
            httpRequest.getRequestURL().toString(), httpRequest.getQueryString());
        AuthenticationToken token = super.createToken(request, response);
        log.debug("[CAS-AUTH] received credentials is {}", token.getCredentials());
        return token;
    }

    @Override
    protected boolean onLoginFailure(
        AuthenticationToken token, AuthenticationException ae, ServletRequest request, ServletResponse response) {

        final String ticket = (String) token.getCredentials();
        if (!StringUtils.hasText(ticket)) {
            log.debug("[CAS-AUTH] doGetAuthenticationInfo - no credentials means SLO");
            return false;
        }

        return super.onLoginFailure(token, ae, request, response);
    }
}
