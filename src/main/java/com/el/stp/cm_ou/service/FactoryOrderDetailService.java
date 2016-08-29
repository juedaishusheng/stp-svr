package com.el.stp.cm_ou.service;

import com.el.stp.cm_ou.domain.*;

import java.util.List;

/**
 * Created by Spring on 2016/8/8.
 */
public interface FactoryOrderDetailService {

    List<SchedulingDomain> schedulingInfo(Integer factId,Integer soId);
    List<ProductionDetailDomain> productionDetailInfo(Integer factId,Integer soId);
    List<ProductionReportDomain> productionReportInfo(Integer factId,Integer soId);
    List<CompletionDomain> completionInfo(Integer factId,Integer soId);
    List<ProductionRecordDomain> productionRecordInfo();

    List<FactoryCapacityDomain> capaTypes();
}
