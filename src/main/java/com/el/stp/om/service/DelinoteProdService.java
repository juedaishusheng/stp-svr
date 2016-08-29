package com.el.stp.om.service;


import com.el.stp.om.domain.DelinoteProdCondition;
import com.el.stp.om.domain.DelinoteProdDomain;

import java.util.List;

/**
 * Created by xuzhe on 2016/7/28.
 */
public interface DelinoteProdService {
    List<DelinoteProdDomain> selectDelinoteInfo(DelinoteProdCondition delinoteProd);
}
