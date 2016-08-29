package com.el.stp.fm.service;

import com.el.cfg.domain.TCustSettle;
import com.el.cfg.mapper.TCustSettleMapper;
import com.el.stp.fm.domain.CustAccountCondition;
import com.el.stp.fm.domain.CustAccountDomain;
import com.el.stp.fm.mapper.CustAccountMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by max on 2016/8/2.
 */

@Service
public class CustAccountServiceImpl implements CustAccountService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private CustAccountMapper custAccountMapper;

    @Autowired
    private TCustSettleMapper tCustSettleMapper;


    @Override
    public List<CustAccountDomain> custAccountInfo(CustAccountCondition ca){

        Integer rowCount=custAccountMapper.custAccountNum(ca);
        ca.setRowCount(rowCount);
        return rowCount>0?custAccountMapper.custAccountInfo(ca):null;


    }

    @Override
    public Boolean accountBtn(Long settleId){
        log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!accountBtn start");
        TCustSettle  tCustSettle = tCustSettleMapper.selectByPrimaryKey(settleId);
        if (tCustSettle == null) {
            return false;
        }else{
            tCustSettle.setDocStatus("已立账");
            tCustSettle.setAccountAmt(tCustSettle.getSettleAmt());
            tCustSettle.setAccountDate(new Date());
            tCustSettle.setAccountFlag("Y");
            tCustSettleMapper.updateByPrimaryKey(tCustSettle);
            return true;
        }

    }

}
