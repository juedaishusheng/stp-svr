package com.el.stp.sm.service;

import com.el.stp.sm.domain.DelinoteDeliCondition;
import com.el.stp.sm.domain.DelinoteDeliDomain;
import com.el.stp.sm.mapper.DelinoteTransMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuzhe on 2016/8/15.
 */
@Service
public class DelinoteTransServieImpl implements DelinoteTransService {
    @Autowired
    private DelinoteTransMapper delinoteTransMapper;

    /**
     * 产品发货记录查询
     *
     * @param deli
     * @return
     */
    @Override
    public List<DelinoteDeliDomain> selectDelinoteTrans(DelinoteDeliCondition deli) {
        Integer rowCount = delinoteTransMapper.selectDelinoteTransNum(deli);
        deli.setRowCount(rowCount);
        List<DelinoteDeliDomain> delinoteTrans = delinoteTransMapper.selectDelinoteTrans(deli);
        return rowCount > 0 ? delinoteTrans : null;
    }
}
