package com.el.stp.pm.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.pm.domain.QuoteSearchCondition;
import com.el.stp.pm.domain.QuoteSearchDomain;
import com.el.stp.pm.service.QuoteSearchService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Title:
 * Description:
 *
 * @Company: Elitesland
 * @project: stp-svr
 * @author: li-jc
 * @version: 1.0.0
 * @time: 2016/8/23
 */
@RestController
@RequestMapping("/api/pm/pm001")
public class PmQuoteSearchController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private QuoteSearchService quoteSearchService;

    @RequestMapping("/listView")
    public PageUtil quotesearch(@Param("quoteSearchCondition") QuoteSearchCondition quoteSearchCondition){
        List<QuoteSearchDomain> quoteSearchDomains = quoteSearchService.SelectQuoteInfo(quoteSearchCondition);
        return PageUtil.pageBean(quoteSearchDomains, quoteSearchCondition);
    }

}
