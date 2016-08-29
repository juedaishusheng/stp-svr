package com.el.stp.fc.service;

import com.el.stp.fc.domian.ProdInCondition;
import com.el.stp.fc.domian.ProdInDomain;
import com.el.stp.fc.mapper.ProdInMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 成品入库单管理service impl
 * Created by xuzhe on 2016/8/1.
 */
@Service
public class ProdInServiceImpl implements ProdInService {
    @Autowired
    ProdInMapper prodInMapper;

    /**
     * 成品入库单管理汇总
     *
     * @param pro
     * @return
     */
    @Override
    public List<ProdInDomain> prodInInfo(ProdInCondition pro) {
        Integer rowCount = prodInMapper.prodInNum(pro);
        if(pro!=null)pro.setRowCount(rowCount);
        return rowCount>0?prodInMapper.prodInInfo(pro):null;
    }

    /**
     * 成品入库单管理明细
     *
     * @param pro
     * @return
     */
    @Override
    public List<ProdInDomain> prodInDetailInfo(ProdInCondition pro) {
        Integer rowCount = prodInMapper.countProdInDetailInfo(pro);
        if(pro!=null)pro.setRowCount(rowCount);
        return rowCount>0?prodInMapper.prodInDetailInfo(pro):null;
    }
}
