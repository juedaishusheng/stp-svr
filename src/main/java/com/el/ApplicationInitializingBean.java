package com.el;

import com.el.sys.service.LockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created on 16/7/26.
 *
 * @author panlw
 */
@Component
public class ApplicationInitializingBean implements InitializingBean {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public void afterPropertiesSet() throws Exception {
        clearNodeLocks();
    }

    @Autowired
    private LockService lockService;

    private void clearNodeLocks() {
        log.info("[APP-INIT] all locks clearing...");
        lockService.unlockNode();
        log.info("[APP-INIT] all locks cleared.");
    }
}
