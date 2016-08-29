package com.el.cfg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.*;

/**
 * Created on 16/4/9.
 *
 * @author panlw
 */
@Component
public class SessionMonitor
    implements HttpSessionListener, HttpSessionIdListener, HttpSessionAttributeListener {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public SessionMonitor() {
        log.info("[APP-SESS] session monitor created.");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        final String sessId = se.getSession().getId();
        log.info("[APP-SESS] sessionCreated: " + sessId
            + " - " + se.getSession().getMaxInactiveInterval() + "s");
    }

    @Override
    public void sessionIdChanged(HttpSessionEvent se, String sessIdOld) {
        final String sessId = se.getSession().getId();
        log.info("[APP-SESS] sessionIdChanged: " + sessIdOld + " -> " + sessId
            + " - " + se.getSession().getMaxInactiveInterval() + "s");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        final String sessId = se.getSession().getId();
        log.info("[APP-SESS] sessionDestroyed: " + sessId);
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        if (log.isDebugEnabled()) {
            log.debug(String.format(
                "[APP-SESS] attributeAdded: (%s = %s) into session [%s] by %s",
                se.getName(), se.getValue().getClass(),
                se.getSession().getId(), se.getSource().getClass()));
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        if (log.isDebugEnabled()) {
            log.debug(String.format(
                "[APP-SESS] attributeRemoved: (%s = %s) from session [%s] by %s",
                se.getName(), se.getValue().getClass(),
                se.getSession().getId(), se.getSource().getClass()));
        }
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        if (log.isDebugEnabled()) {
            log.debug(String.format(
                "[APP-SESS] attributeReplaced: (%s = %s) into session [%s] by %s",
                se.getName(), se.getValue().getClass(),
                se.getSession().getId(), se.getSource().getClass()));
        }
    }
}
