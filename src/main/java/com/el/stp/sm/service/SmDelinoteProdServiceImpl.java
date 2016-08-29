package com.el.stp.sm.service;

import com.el.stp.om.domain.DelinoteProdDomain;
import com.el.stp.sm.domain.SmDelinoteProdDomain;
import com.el.stp.sm.mapper.SmDelinoteProdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 待处理发货通知单查询
 * Created by xuzhe on 2016/8/3.
 */
@Service
public class SmDelinoteProdServiceImpl implements SmDelinoteProdService {
    @Autowired
    private SmDelinoteProdMapper smDelinoteProdMapper;

    @Override
    public List<SmDelinoteProdDomain> selectUnDelinoteInfo(SmDelinoteProdDomain deli) {
        Integer rowCount = smDelinoteProdMapper.selectUnDelinoteProdNum(deli);
        deli.setRowCount(rowCount);
        List<SmDelinoteProdDomain> selectDelinoteInfo = smDelinoteProdMapper.selectUnDelinoteInfo(deli);
        return rowCount>0?selectDelinoteInfo:null;
    }
}
