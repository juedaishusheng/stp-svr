package com.el.cfg.security.controller;

import com.el.cfg.security.ShiroRealmProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author neo.pan
 * @since 16/8/15
 */
@Slf4j
@Controller
public class LogoutController {

    @Autowired
    private ShiroRealmProperties realmProperties;

    @RequestMapping("/logout")
    public void logout(HttpServletResponse response) throws IOException {
        final String logoutUrl = realmProperties.getLogoutUrl();
        log.debug("[APP-AUTH] logout: {}", logoutUrl);
        response.sendRedirect(logoutUrl);
    }
}
