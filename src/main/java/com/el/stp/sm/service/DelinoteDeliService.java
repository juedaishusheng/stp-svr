package com.el.stp.sm.service;

import com.el.stp.sm.domain.DelinoteDeliCondition;
import com.el.stp.sm.domain.DelinoteDeliDomain;

import java.util.List;

/**
 * 发货通知单物流信息查询
 * Created by xuzhe on 2016/8/3.
 */
public interface DelinoteDeliService {
    List<DelinoteDeliDomain> selectDelinoteDeli(DelinoteDeliCondition deli);

}
