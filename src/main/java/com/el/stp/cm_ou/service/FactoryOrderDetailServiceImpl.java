package com.el.stp.cm_ou.service;

import com.el.stp.cm_ou.domain.*;
import com.el.stp.cm_ou.mapper.FactoryOrderDetailMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Spring on 2016/8/8.
 */
@Service
public class FactoryOrderDetailServiceImpl implements FactoryOrderDetailService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private FactoryOrderDetailMapper factoryOrderDetailMapper;

    @Override
    public List<SchedulingDomain> schedulingInfo(Integer factId,Integer soId) {
        List<SchedulingDomain> schedulings = factoryOrderDetailMapper.schedulingInfo(factId,soId);
        return schedulings;
    }

    @Override
    public List<ProductionDetailDomain> productionDetailInfo(Integer factId,Integer soId) {
        List<ProductionDetailDomain> productionDetails = factoryOrderDetailMapper.productionDetailInfo(factId,soId);
        return productionDetails;
    }

    @Override
    public List<ProductionReportDomain> productionReportInfo(Integer factId,Integer soId) {
        List<ProductionReportDomain> productionReports = factoryOrderDetailMapper.productionReportInfo(factId,soId);
        return productionReports;
    }

    @Override
    public List<CompletionDomain> completionInfo(Integer factId,Integer soId) {
        List<CompletionDomain> completions = factoryOrderDetailMapper.completionInfo(factId,soId);
        return completions;
    }

    @Override
    public List<ProductionRecordDomain> productionRecordInfo() {
        List<ProductionRecordDomain> productionRecords = factoryOrderDetailMapper.productionRecordInfo();
        return productionRecords;
    }

    @Override
    public List<FactoryCapacityDomain> capaTypes() {
        List<FactoryCapacityDomain> capaTypes = factoryOrderDetailMapper.capaTypes();
        return capaTypes;
    }

}
