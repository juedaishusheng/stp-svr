package com.el.stp.om.service;

import com.el.stp.om.domain.DelinoteProdCondition;
import com.el.stp.om.domain.DelinoteProdDomain;
import com.el.stp.om.mapper.DelinoteProdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by xuzhe on 2016/7/28.
 */
@Service
public class DelinoteProdServiceImpl implements DelinoteProdService {
    @Autowired
    private DelinoteProdMapper DelinoteProdMapper;

    @Override
    public List<DelinoteProdDomain> selectDelinoteInfo(DelinoteProdCondition delinoteProd) {
        Integer rowCount = DelinoteProdMapper.selectDelinoteProdNum(delinoteProd);
        delinoteProd.setRowCount(rowCount);
        List<DelinoteProdDomain> selectDelinoteInfo = DelinoteProdMapper.selectDelinoteInfo(delinoteProd);
        return rowCount>0?selectDelinoteInfo:null;
    }
}
