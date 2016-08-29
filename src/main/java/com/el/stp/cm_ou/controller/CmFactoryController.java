package com.el.stp.cm_ou.controller;


import com.el.stp.cm_ou.domain.*;
import com.el.stp.cm_ou.service.FactoryCapacityService;
import com.el.stp.cm_ou.service.FactoryOrderDetailService;
import com.el.stp.cm_ou.service.FactoryService;
import com.el.stp.common.util.DateUtil;
import com.el.stp.common.util.PageUtil;
import com.el.sys.domain.PagingBean;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author billy
 * @since 16/7/29.
 */
@RestController
@RequestMapping("/api/cm_ou/cm004")

public class CmFactoryController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private FactoryService factoryService;

    @Autowired
    private FactoryCapacityService factoryCapacityService;

    @Autowired
    private FactoryOrderDetailService factoryOrderDetailService;

    /**
     * 工厂查询
     *
     * @return
     */
    @RequestMapping("/listView")
    public PageUtil factoryList(FactoryCondition factoryCondition) {

        //TODO ouId 从用户登录信息取值
        factoryCondition.setOuId(1);
        List<FactoryDomain> factories = factoryService.factoryInfo(factoryCondition);

        return PageUtil.pageBean(factories,factoryCondition);
    }

    /**
     * 工厂查询--信息详情
     *
     * @return
     */
    @RequestMapping("/headInfo")
    public List<FactoryDomain> headInfo(@RequestParam("factId") Integer factId) {
        List<FactoryDomain> headInfo = factoryService.headInfo(factId);
        return headInfo;
    }

    /**
     * 工序产能
     *
     * @return
     */
    @RequestMapping("/processCapacity")
    public List<FactoryCapacityDomain> capacitys() {
        List<FactoryCapacityDomain> capacitys = factoryCapacityService.capacitys();
        return capacitys;
    }

    /**
     * 产能数据tab数据
     *
     * @return
     */
    @RequestMapping("/capacity")
    public PageUtil capacityData(DateCondition dateCondition) {
        //TODO ouId 从用户登录信息取值
        dateCondition.setOuId(1);
        List<FactoryCapacityDomain> capacitys = factoryCapacityService.capacityData(dateCondition);
        return PageUtil.pageBean(capacitys,dateCondition);
    }

    /**
     * 印刷订单tab数据
     *
     * @return
     */
    @RequestMapping("/printSo")
    public PageUtil printSoData(DateCondition dateCondition) {
        //TODO ouId 从用户登录信息取值
        dateCondition.setOuId(1);
        List<PrintSoDomain> soInfo = factoryCapacityService.printSoData(dateCondition);
        return PageUtil.pageBean(soInfo,dateCondition);
    }
    /**
     * 工序价格
     *
     * @return seven 修改 16-8-2
     */
    @RequestMapping("/processPrice")
    public List<ProcessPriceDomain> processPrice(@Param("addrNo")String addrNo) {
        List<ProcessPriceDomain> processPriceDomainIn = factoryCapacityService.processPriceIn(addrNo);
        return processPriceDomainIn;
    }


    @RequestMapping("/printOrderView")
    public Map<String, Object> printOrderList() {
        Map<String, Object> resultMap = new HashMap<>();

        PagingBean pagingBean = new PagingBean();
        pagingBean.setPageIndex(1);
        pagingBean.setRowCount(1);

        List<PrintSoDomain> printOrders = factoryCapacityService.printOrderInfo();

        resultMap.put("results", printOrders);
        resultMap.put("paging", pagingBean);
        return resultMap;
    }

    /**
     * 印刷订单-订单生产明细-工序类型
     * @return
     */
    @RequestMapping("/capaType")
    public List<FactoryCapacityDomain> capaType() {
        List<FactoryCapacityDomain> capaTypes = factoryOrderDetailService.capaTypes();
        return capaTypes;
    }

    /**
     * 印刷订单-订单生产明细
     * @return
     */
    @RequestMapping("/soProdDetail")
    public Map<String,Object> productionRecord(@Param("factId")Integer factId,
                                               @Param("soId")Integer soId) {
        Map<String,Object> resultMap = new HashMap<>();

        List<SchedulingDomain> schedulingInfo = factoryOrderDetailService.schedulingInfo(factId,soId);
        List<ProductionDetailDomain> prodDetails = factoryOrderDetailService.productionDetailInfo(factId,soId);
        List<ProductionRecordDomain> prodRecords = factoryOrderDetailService.productionRecordInfo();
        List<CompletionDomain> completionInfo = factoryOrderDetailService.completionInfo(factId,soId);
        List<ProductionReportDomain> prodReportInfo = factoryOrderDetailService.productionReportInfo(factId,soId);

        resultMap.put("schedulingInfo",schedulingInfo);//订单排产
        resultMap.put("prodDetails",prodDetails);//产品明细
        resultMap.put("prodRecords",prodRecords);//生产记录
        resultMap.put("completionInfo",completionInfo);//完工入库
        resultMap.put("prodReportInfo",prodReportInfo);//生产报工

        return resultMap;
    }


}
