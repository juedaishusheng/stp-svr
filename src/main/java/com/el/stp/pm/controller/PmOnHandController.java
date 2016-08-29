package com.el.stp.pm.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.pm.domain.OnHandCondition;
import com.el.stp.pm.domain.OnHandDomain;
import com.el.stp.pm.service.OnHandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Title:待处理(营业)
 * Description:
 *
 * @Company: Elitesland
 * @project: stp-svr
 * @author: james.zhang
 * @version: 1.0.0
 * @time: 2016/8/24
 */
@RestController
@RequestMapping("/api/pm/pm002")
public class PmOnHandController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private OnHandService onHandService;

    @RequestMapping("/listView")
    private PageUtil onHandSearch(OnHandCondition onHandCondition){
        log.info("!!!!!onHandSearch start");
        log.info("!!!!!onHandCondition is:"+onHandCondition);
        List<OnHandDomain> onHandDomainList = onHandService.selectOnHandInfo(onHandCondition);
        /*log.info("!!!!!onHandSearch end and onHandDomainList is:"+onHandDomainList);*/
        return PageUtil.pageBean(onHandDomainList, onHandCondition);
    }

}
