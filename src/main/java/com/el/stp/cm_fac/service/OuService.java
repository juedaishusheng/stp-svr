package com.el.stp.cm_fac.service;

import com.el.stp.cm_fac.domain.*;
import com.el.stp.cm_ou.domain.*;

import java.util.List;

/**
 * Created on 16/8/1.
 * @max
 */
public interface OuService {

    //公司查询
    List<OuDomain> ouInfo(OuCondition ou);

    //公司查询子页面基本数据，工序产能，工序价格数据查询
    OuDomain tableInfo(Integer ouId);

    //公司查询-子页面 产能数据查询
    List<CapaDataDomain> capaInfo(CapaCondition capa);

    //公司查询-子页面 印刷订单查询
    List<PrintDataDomain> printInfo(CapaCondition capa);

    //订单排场
    List<SchedulingDomain> schedulingInfo();

    //产品明细
    List<ProductionDetailDomain> productionDetailInfo();

    //生产报工
    List<ProductionReportDomain> productionReportInfo();

    //完工入库
    List<CompletionDomain> completionInfo();

    //生产记录
    List<ProductionRecordDomain> productionRecordInfo();

}
