package com.el.sys.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 16/7/26.
 *
 * @author panlw
 */
@RestController
@RequestMapping("/api/sys")
public class UserOpsController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/users")
    public List<String> usernames() {
        log.debug("[APP-TEST] list usernames");
        return Arrays.asList("admin", "simon", "panlw");
    }
}
