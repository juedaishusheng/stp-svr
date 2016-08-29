package com.el.stp.om.service;

import com.el.stp.om.domain.SoProdCondition;
import com.el.stp.om.domain.SoProdDomain;

import java.util.List;

/**
 * Created by xuzhe on 2016/8/26.
 */
public interface UnCreditAuditService {
    /**
     * 初始化查询
     * @param soProd
     * @return
     */
    List<SoProdDomain> selectCreditAudit(SoProdCondition soProd);
}
