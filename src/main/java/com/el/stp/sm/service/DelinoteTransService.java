package com.el.stp.sm.service;

import com.el.stp.sm.domain.DelinoteDeliCondition;
import com.el.stp.sm.domain.DelinoteDeliDomain;

import java.util.List;

/**
 * 产品发货记录查询
 * Created by xuzhe on 2016/8/15.
 */
public interface DelinoteTransService {
    List<DelinoteDeliDomain> selectDelinoteTrans(DelinoteDeliCondition deli);
}
