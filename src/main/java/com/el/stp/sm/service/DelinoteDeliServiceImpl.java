package com.el.stp.sm.service;

import com.el.stp.sm.domain.DelinoteDeliCondition;
import com.el.stp.sm.domain.DelinoteDeliDomain;
import com.el.stp.sm.mapper.DelinoteDeliMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuzhe on 2016/8/3.
 */
@Service
public class DelinoteDeliServiceImpl implements DelinoteDeliService {
    @Autowired
    private DelinoteDeliMapper delinoteDeliMapper;

    /**
     * 发货通知单物流信息查询
     *
     * @param deli
     * @return
     */
    @Override
    public List<DelinoteDeliDomain> selectDelinoteDeli(DelinoteDeliCondition deli) {
        Integer rowCount = delinoteDeliMapper.selectDelinoteDeliNum(deli);
        deli.setRowCount(rowCount);
        List<DelinoteDeliDomain> delinoteDeli = delinoteDeliMapper.selectDelinoteDeli(deli);
        return  rowCount>0?delinoteDeli:null;
    }

}
