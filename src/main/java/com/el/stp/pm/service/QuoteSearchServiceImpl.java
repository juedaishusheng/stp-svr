package com.el.stp.pm.service;

import com.el.stp.pm.domain.QuoteSearchCondition;
import com.el.stp.pm.domain.QuoteSearchDomain;
import com.el.stp.pm.mapper.QuoteSearchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
@Service
public class QuoteSearchServiceImpl implements QuoteSearchService{
    @Autowired
    private QuoteSearchMapper quoteSearchMapper;

    @Override
    public List<QuoteSearchDomain> SelectQuoteInfo(QuoteSearchCondition quoteSearch) {
        Date date=quoteSearch.getEndDate();
        if(null != date){
            Calendar c = Calendar.getInstance();
            c.setTime(date);   //设置当前日期
            c.add(Calendar.DATE, 1); //日期加1天
            date = c.getTime();
            quoteSearch.setEndDate(date);
        };
        Integer rowCount = quoteSearchMapper.selectQuoteNum(quoteSearch);
        quoteSearch.setRowCount(rowCount);
        return rowCount>0?quoteSearchMapper.selectQuoteInfo(quoteSearch):null;
    }
}
