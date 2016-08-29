package com.el.sys.controller;

import com.el.sys.domain.Lock;
import com.el.sys.service.LockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created on 16/4/8.
 *
 * @author panlw
 */
@RestController
@RequestMapping("/api/pub")
public class PublicController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private LockService lockService;

    /**
     * 节点健康状态
     *
     * @param locale
     * @param request
     * @return
     */
    @RequestMapping("/health")
    public ModelMap health(Locale locale, HttpServletRequest request) {
        log.info("Welcome home. The client locale is " + locale.toString());
        DateFormat dateFormat = DateFormat.getDateTimeInstance(
            DateFormat.LONG, DateFormat.LONG, locale);
        return new ModelMap() {{
            addAttribute("health", true);
            addAttribute("time", dateFormat.format(new Date()));
        }};
    }

    /**
     * 请求解锁
     *
     * @param lock 锁
     */
    @RequestMapping(path = "/unlock", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void unlock(Lock lock) {
        log.info("[SMS-LOCK] unlock request: " + lock);
        lockService.unlock(lock);
    }

}
