package com.el.stp.pm.service;

import com.el.stp.pm.domain.PriceAuditCondition;
import com.el.stp.pm.domain.PriceAuditDomain;
import com.el.stp.pm.mapper.PriceAuditMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class PriceAuditServiceImpl implements PriceAuditService{
    @Autowired
    private PriceAuditMapper priceAuditMapper;

    @Override
    public List<PriceAuditDomain> selectPriceAuditInfo(PriceAuditCondition priceAuditCondition) {
       /* Integer rowCount = quoteSearchMapper.selectQuoteNum(quoteSearch);
        quoteSearch.setRowCount(rowCount);
        List<QuoteSearchDomain> selectQuoteInfo = quoteSearchMapper.selectQuoteInfo(quoteSearch);
        return rowCount>0?selectQuoteInfo:null;*/
        Integer rowCount = priceAuditMapper.selectPriceAuditNum(priceAuditCondition);
        priceAuditCondition.setRowCount(rowCount);
        List<PriceAuditDomain> priceAuditDomainList = priceAuditMapper.selectPriceAuditInfo(priceAuditCondition);
        return rowCount>0?priceAuditDomainList:null;
    }
}
