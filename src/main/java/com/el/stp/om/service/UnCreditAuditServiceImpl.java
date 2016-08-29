package com.el.stp.om.service;

import com.el.stp.om.domain.SoProdCondition;
import com.el.stp.om.domain.SoProdDomain;
import com.el.stp.om.mapper.PrintSaleSoMapper;
import com.el.stp.om.mapper.UnCreditAuditMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuzhe on 2016/8/26.
 */
@Service
public class UnCreditAuditServiceImpl implements UnCreditAuditService{
    @Autowired
    private UnCreditAuditMapper unCreditAuditMapper;

    @Override
    public List<SoProdDomain> selectCreditAudit(SoProdCondition soProd) {
        Integer rowCount = unCreditAuditMapper.selectCreditAuditNum(soProd);
        soProd.setRowCount(rowCount);
        List<SoProdDomain> selectCreditAudit= unCreditAuditMapper.selectCreditAudit(soProd);
        return rowCount>0?selectCreditAudit:null;
    }

}
