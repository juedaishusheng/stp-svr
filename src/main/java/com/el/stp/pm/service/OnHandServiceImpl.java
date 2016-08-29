package com.el.stp.pm.service;

import com.el.stp.pm.domain.OnHandCondition;
import com.el.stp.pm.domain.OnHandDomain;
import com.el.stp.pm.mapper.OnHandMapper;
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
public class OnHandServiceImpl implements OnHandService{
    @Autowired
    private OnHandMapper onHandMapper;

    @Override
    public List<OnHandDomain> selectOnHandInfo(OnHandCondition onHandCondition) {
       /* Integer rowCount = quoteSearchMapper.selectQuoteNum(quoteSearch);
        quoteSearch.setRowCount(rowCount);
        List<QuoteSearchDomain> selectQuoteInfo = quoteSearchMapper.selectQuoteInfo(quoteSearch);
        return rowCount>0?selectQuoteInfo:null;*/
        Integer rowCount = onHandMapper.selectOnHandNum(onHandCondition);
        onHandCondition.setRowCount(rowCount);
        List<OnHandDomain> onHandDomainList = onHandMapper.selectOnHandInfo(onHandCondition);
        return rowCount>0?onHandDomainList:null;
    }
}
