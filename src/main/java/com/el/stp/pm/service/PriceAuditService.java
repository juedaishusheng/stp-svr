package com.el.stp.pm.service;

import com.el.stp.pm.domain.PriceAuditCondition;
import com.el.stp.pm.domain.PriceAuditDomain;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Title:待价格审核
 * Description:
 *
 * @Company: Elitesland
 * @project: stp-svr
 * @author: james.zhang
 * @version: 1.0.0
 * @time: 2016/8/24
 */
public interface PriceAuditService {
    List<PriceAuditDomain> selectPriceAuditInfo(PriceAuditCondition priceAuditCondition);
}
