package com.el.cfg.security.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static javax.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
 * @see MyFormAuthenticationFilter in https://github.com/johntostring/spring-boot-shiro
 */
@Slf4j
public class MyFormAuthenticationFilter extends FormAuthenticationFilter {

    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        log.error("[APP-AUTH] login failure: " + e.getMessage());
        return true; // failure is true
    }

    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
        log.debug("[APP-AUTH] login success");
        WebUtils.issueRedirect(request, response, getSuccessUrl());
        return false; // success is false
    }

    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        if (super.executeLogin(request, response)) { // result is onLoginFailure or onLoginSuccess
            log.debug("[APP-AUTH] login failure");
            WebUtils.issueRedirect(request, response, getLoginUrl() + "?error");
        }
        // @see FormAuthenticationFilter.onLoginSuccess
        // we handled the success redirect directly, prevent the chain from continuing.
        return false;
    }

    @Override
    protected void redirectToLogin(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        final String contentType = request.getContentType();
        if (contentType != null && contentType.contains(APPLICATION_JSON_VALUE)) {
            log.debug("[APP-AUTH] this is AJAX request");
            response.setStatus(SC_UNAUTHORIZED);
        } else {
            log.debug("[APP-AUTH] this is PAGE request");
            super.redirectToLogin(servletRequest, servletResponse);
        }
    }
}
