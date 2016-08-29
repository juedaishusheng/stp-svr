package com.el.stp.om.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.om.domain.SoProdCondition;
import com.el.stp.om.domain.SoProdDomain;
import com.el.stp.om.service.UnCreditAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 待信用审核订单
 * Created by xuzhe on 2016/8/26.
 */
@RestController
@RequestMapping("api/om/om004")
public class OmUnCreditAuditController {
    @Autowired
    private UnCreditAuditService unCreditAuditService;

    @RequestMapping("/listView")
    public PageUtil creditAudit(SoProdCondition soProd){
        List<SoProdDomain> creditAudit =unCreditAuditService.selectCreditAudit(soProd);
        return PageUtil.pageBean(creditAudit,soProd);
    }
}
