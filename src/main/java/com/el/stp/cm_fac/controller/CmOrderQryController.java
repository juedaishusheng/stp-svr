package com.el.stp.cm_fac.controller;

import com.el.stp.cm_fac.service.CmOrderQryService;
import com.el.stp.cm_fac.domain.CmOrderQryDtlData;
import com.el.stp.cm_fac.domain.CmOrderQryMainCondition;
import com.el.stp.cm_fac.domain.CmOrderQryMainDomain;
import com.el.stp.cm_fac.domain.CmOrderQryProdProcessDomain;
import com.el.stp.common.util.PageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Vincent on 2016/8/8.
 * 产能调度--生产工厂-订单查询（CM209）
 */
@RestController
@RequestMapping("/api/cm_fac/cm209")
public class CmOrderQryController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private CmOrderQryService cmOrderQryService;

    //查询
    @RequestMapping("/listView")
    public PageUtil cmOrderQry(CmOrderQryMainCondition cmOrderQryMainCondition) {


        List<CmOrderQryMainDomain> cmOrderQryMainDomainList = cmOrderQryService.queryOrderMain(cmOrderQryMainCondition);

        return PageUtil.pageBean(cmOrderQryMainDomainList, cmOrderQryMainCondition);
    }
    //子页面的数据
    @RequestMapping("/dblDtlData")
    public CmOrderQryDtlData cmOrderDtlDataQry(@RequestParam("soId") Integer soId) {
        CmOrderQryDtlData cmOrderDtlData = cmOrderQryService.queryOrderDtlData(soId);
        return cmOrderDtlData;
    }

    //产能需求的数据
    @RequestMapping("/dblProdProcess")
    public List<CmOrderQryProdProcessDomain> cmOrderProdProcessQry(@RequestParam("prodId") Integer prodId) {
        List<CmOrderQryProdProcessDomain> cmOrderQryProdProcessDomains = cmOrderQryService.queryOrderProdProcess(prodId);
        return cmOrderQryProdProcessDomains;
    }




}
