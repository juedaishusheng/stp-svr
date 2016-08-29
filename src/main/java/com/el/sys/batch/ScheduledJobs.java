package com.el.sys.batch;

import com.el.stp.fm.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created on 16/5/27.
 *
 * @author panlw
 */
//@Component
public class ScheduledJobs {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private AccountService accountService;

    @Scheduled(cron = "0 0 1 * * *")
    public void doSomething() {
        log.info("[STP-BATCH] BEGIN");
        // TODO ScheduledJobs
        accountService.autoStatementBtn();
        log.info("[STP-BATCH] END");
    }
}
