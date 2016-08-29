package com.el.stp.fm.service;

import com.el.stp.fm.domain.PrintPoCondition;
import com.el.stp.fm.domain.PrintPoDomain;
import com.el.stp.fm.mapper.PrintPoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Johnny on 2016/7/31.
 */
@Service
public class PrintPoServiceImpl implements PrintPoService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private PrintPoMapper printPoMapper;


    @Override
    /**
     * 主页面数据查询
     */
    public List<PrintPoDomain> printPoInfo(PrintPoCondition ppc) {
        Integer rowCount=printPoMapper.printPoNum(ppc);
        ppc.setRowCount(rowCount);
        return rowCount>0?printPoMapper.printPoInfo(ppc):null;

    }

    /**
     * 合计查询
     * @return
     */
    @Override
    public List<PrintPoDomain> totalInfo(PrintPoCondition ppc){
        List<PrintPoDomain> printPoDomains = printPoMapper.printPoTotal(ppc);

        log.info("``````进入total");

        BigDecimal amtTotal = new BigDecimal(0);
        BigDecimal invAmtTotal = new BigDecimal(0);
        BigDecimal noinvAmtTotal = new BigDecimal(0);
        BigDecimal nopayAmtTotal = new BigDecimal(0);

        for(PrintPoDomain print:printPoDomains){
            amtTotal=amtTotal.add(print.getAmt());
            invAmtTotal=invAmtTotal.add(print.getInvAmt());
            noinvAmtTotal=noinvAmtTotal.add(print.getNoinvAmt());
            nopayAmtTotal=nopayAmtTotal.add(print.getNopayAmt());

            log.info("print----------------",amtTotal);
        }
        PrintPoDomain total = new PrintPoDomain();
        total.setAmtTotal(amtTotal);
        total.setInvAmtTotal(invAmtTotal);
        total.setNoinvAmtTotal(noinvAmtTotal);
        total.setNopayAmtTotal(nopayAmtTotal);

        List<PrintPoDomain> totals = new ArrayList<>();
       totals.add(total);

        return totals;
    }
}
