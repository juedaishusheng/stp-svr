package com.el.stp.cm_fac.controller;

import com.el.stp.cm_fac.domain.*;
import com.el.stp.cm_fac.service.OuService;
import com.el.stp.cm_ou.domain.*;
import com.el.stp.cm_ou.service.FactoryOrderDetailService;
import com.el.stp.common.util.PageUtil;
import com.el.sys.domain.PagingBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author max
 * @Created on 16/8/1.
 */
@RestController
@RequestMapping("/api/cm_fac/cm203")
public class CmOuController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private OuService ouService;
    @Autowired
    private FactoryOrderDetailService factoryOrderDetailService;

     // 公司查询-页面主数据查询
    @RequestMapping("/listView")
    public PageUtil ous(OuCondition ou) {
        if(StringUtils.isEmpty(ou)){
            ou = new OuCondition();
        }
        List<OuDomain> ous = ouService.ouInfo(ou);
        return PageUtil.pageBean(ous,ou);
    }

    // 公司查询-子页面查询数据
    @RequestMapping("/detailTables")
    public OuDomain ouDetailsTable(@RequestParam("ouId") Integer ouId) {
        OuDomain ouDomain = ouService.tableInfo(ouId);
        return ouDomain;
    }

    // 公司查询-子页面 产能数据数据
    @RequestMapping("/dblViewProData")
    public PageUtil proData(CapaCondition capa) {
        if(StringUtils.isEmpty(capa)){
            capa = new CapaCondition();
        }
        List<CapaDataDomain> capas = ouService.capaInfo(capa);
        return PageUtil.pageBean(capas,capa);
    }

    // 公司查询-子页面 印刷订单数据
    @RequestMapping("/dblViewPrintData")
    public PageUtil printData(CapaCondition capa) {
        if(StringUtils.isEmpty(capa)){
            capa = new CapaCondition();
        }
        List<PrintDataDomain> capas = ouService.printInfo(capa);
        return PageUtil.pageBean(capas,capa);
    }

    // 公司查询-子页面查询数据
    @RequestMapping("/prinDetailView")
    public  Map<String,Object> printDetails(@RequestParam("soManuId") Integer soManuId,@RequestParam("manuDistId") Integer manuDistId,@RequestParam("soNo") String soNo) {
        Map<String,Object> resultMap = new HashMap<>();
        List<SchedulingDomain> schedulingInfo = ouService.schedulingInfo();
        List<ProductionDetailDomain> prodDetails = ouService.productionDetailInfo();
        List<ProductionRecordDomain> prodRecords = ouService.productionRecordInfo();
        List<CompletionDomain> completionInfo = ouService.completionInfo();
        List<ProductionReportDomain> prodReportInfo = ouService.productionReportInfo();

        resultMap.put("soNo",soNo);//订单编号
        resultMap.put("schedulingInfo",schedulingInfo);//订单排产
        resultMap.put("prodDetails",prodDetails);//产品明细
        resultMap.put("prodRecords",prodRecords);//生产记录
        resultMap.put("completionInfo",completionInfo);//完工入库
        resultMap.put("prodReportInfo",prodReportInfo);//生产报工

        return resultMap;
    }
}
