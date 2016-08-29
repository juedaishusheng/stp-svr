package com.el.stp.sm.service;

import com.el.stp.om.domain.DelinoteProdDomain;
import com.el.stp.sm.domain.SmDelinoteProdDomain;

import java.util.Date;
import java.util.List;

/**
 * 待处理发货通知单查询
 * Created by xuzhe on 2016/8/3.
 */
public interface SmDelinoteProdService {
    List<SmDelinoteProdDomain> selectUnDelinoteInfo(SmDelinoteProdDomain deli);
}
