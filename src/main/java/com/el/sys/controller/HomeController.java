package com.el.sys.controller;

import com.el.cfg.security.ShiroRole;
import com.el.cfg.security.ShiroUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 16/7/24.
 *
 * @author panlw
 */
@Controller
public class HomeController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/")
    public String home() {
        log.debug("[APP-AUTH] Current user's principals: " + ShiroUtil.accountAttributes());
        log.debug("[APP-AUTH] Current user has role SYS: " + ShiroUtil.isRoleOf(ShiroRole.SYS));
        return "home";
    }
}
