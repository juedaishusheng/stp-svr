package com.el.stp.fc.service;

import com.el.stp.fc.domian.ProdInCondition;
import com.el.stp.fc.domian.ProdInDomain;

import java.util.List;

/**
 * Created by xuzhe on 2016/8/1.
 */
public interface ProdInService {
    //成品入库单管理汇总
    List<ProdInDomain> prodInInfo(ProdInCondition pro);

    //成品入库单管理明细
    List<ProdInDomain> prodInDetailInfo(ProdInCondition pro);
}
