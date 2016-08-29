package com.el.stp.pm.service;

import com.el.stp.pm.domain.QuoteSearchCondition;
import com.el.stp.pm.domain.QuoteSearchDomain;

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
public interface QuoteSearchService {
    List<QuoteSearchDomain> SelectQuoteInfo(QuoteSearchCondition quoteSearch);
}
