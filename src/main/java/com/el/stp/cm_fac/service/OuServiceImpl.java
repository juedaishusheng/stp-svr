package com.el.stp.cm_fac.service;

import com.el.stp.cm_fac.domain.*;
import com.el.stp.cm_fac.mapper.OuMapper;
import com.el.stp.cm_ou.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created on 16/8/1.
 * @author Max
 */
@Service
public class OuServiceImpl implements OuService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private OuMapper ouMapper;

    //公司查询
    @Override
    public List<OuDomain> ouInfo(OuCondition ou) {
        Integer rowCount = ouMapper.ouInfoNum(ou);
        ou.setRowCount(rowCount);
        return rowCount>0?ouMapper.ouInfo(ou):null;
    }

    //公司查询-子页面 基本数据，工序产能，工序价格
    @Override
    public OuDomain tableInfo(Integer ouId) {
        List<OuDomain> ous = ouMapper.headInfo(ouId);
        OuDomain ouDomain = new OuDomain();
        ouDomain = ous.get(0);
        //工序产能信息
        List<FactStdcapaDomain> factStdcapaDomains = ouMapper.stdCapaInfo(ouId);
        //工序价格
        List<ProPriceDataDomain> proPriceDataDomains = ouMapper.priceInfo(ouId);

        ouDomain.setFactStdcapaDomains(factStdcapaDomains);
        ouDomain.setProPriceDataDomains(proPriceDataDomains);
        return ouDomain;
    }

    //公司查询-子页面  产能数据
    @Override
    public List<CapaDataDomain> capaInfo(CapaCondition capa) {
        Integer rowCount = ouMapper.capaInfoNum(capa);
        capa.setRowCount(rowCount);
        return rowCount>0?ouMapper.capaInfo(capa):null;
    }

    //公司查询-子页面  印刷订单
    @Override
    public List<PrintDataDomain> printInfo(CapaCondition capa) {
        Integer rowCount = ouMapper.printInfoNum(capa);
        capa.setRowCount(rowCount);
        return rowCount>0?ouMapper.printInfo(capa):null;
    }

    @Override
    //公司查询-子页面  印刷订单详情页  订单排场
    public List<SchedulingDomain> schedulingInfo() {
        return ouMapper.orderPompInfo(1);
    }

    @Override
    //公司查询-子页面  印刷订单详情页  产品明细
    public List<ProductionDetailDomain> productionDetailInfo() {
        return ouMapper.productDetailInfo(1);
    }

    @Override
    //公司查询-子页面  印刷订单详情页  生产报工
    public List<ProductionReportDomain> productionReportInfo() {
        return ouMapper.productReportInfo(1);
    }

    @Override
    //公司查询-子页面  印刷订单详情页  完工入库
    public List<CompletionDomain> completionInfo() {
        List<CompletionDomain> list = new ArrayList<CompletionDomain>();
        List<CompletionDomain> cds = ouMapper.completionInfo(1);
        for(CompletionDomain cd : cds){
            cd.setUnInQty(cd.getManuQty()-cd.getAddInQty());
            list.add(cd);
        }
        return list;
    }

    @Override
    //公司查询-子页面  印刷订单详情页  生产记录
    public List<ProductionRecordDomain> productionRecordInfo() {
        return ouMapper.productionRecordInfo(1);
    }
}
