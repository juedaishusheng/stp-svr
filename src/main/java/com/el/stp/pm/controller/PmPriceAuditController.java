package com.el.stp.pm.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.pm.domain.PriceAuditCondition;
import com.el.stp.pm.domain.PriceAuditDomain;
import com.el.stp.pm.service.PriceAuditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Title:待价格审核
 * Description:
 *
 * @Company: Elitesland
 * @project: stp-svr
 * @author: james.zhang
 * @version: 1.0.0
 * @time: 2016/8/24
 */
@RestController
@RequestMapping("/api/pm/pm004")
public class PmPriceAuditController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private PriceAuditService priceAuditService;

    @RequestMapping("/listView")
    private PageUtil priceAuditSearch(PriceAuditCondition priceAuditCondition){
        log.info("!!!!!priceAuditSearch start");
        log.info("!!!!!priceAuditCondition is:"+priceAuditCondition);
        List<PriceAuditDomain> priceAuditDomainList = priceAuditService.selectPriceAuditInfo(priceAuditCondition);
        /*log.info("!!!!!priceAuditSearch end and priceAuditDomainList is:"+priceAuditDomainList);*/
        return PageUtil.pageBean(priceAuditDomainList, priceAuditCondition);
    }

}
