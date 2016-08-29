package com.el.stp.cm_fac.controller;


import com.el.stp.cm_fac.domain.CapacityDataDomain;
import com.el.stp.cm_fac.domain.MeetOrderDomain;
import com.el.stp.cm_fac.domain.ProductSpecsDomain;
import com.el.stp.cm_fac.service.OrderTakeService;
import com.el.stp.cm_ou.domain.FactoryCapacityDomain;
import com.el.stp.common.util.DateUtil;
import com.el.stp.common.util.PageUtil;
import com.el.sys.domain.PagingBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author spring
 */

@RestController
@RequestMapping("/api/cm_fac/cm205")
public class CmOrderTakeController {

    @Autowired
    private OrderTakeService orderTakeService;

    private final Logger log = LoggerFactory.getLogger(getClass());

    //订单接单主页面
    @RequestMapping("/listView")
    public PageUtil orderTakeList(PagingBean pagingBean) {

        List<MeetOrderDomain> OrderDomains = orderTakeService.orderTakeIn(pagingBean);
        return PageUtil.pageBean(OrderDomains,pagingBean);
    }

    /**
     * 单击进入查询表头信息
     *
     *@return
     */
    @RequestMapping("/dblView")
    public List<MeetOrderDomain> orderDetailsList(@RequestParam("id") Integer id) {
        List<MeetOrderDomain> OrderDetailsList = orderTakeService.orderDetailsList(id);
        return OrderDetailsList;
    }

    /**
     * 订单接单子页面-产品明细 seven
     */
    @RequestMapping("/productDetail")
    public List<ProductSpecsDomain> productDetailList() {
        List<ProductSpecsDomain> ProductDetailList = orderTakeService.productDetailList();
        return ProductDetailList;
    }

    /**
     * 订单接单-产能明细-产能需求
     * @return
     */
    @RequestMapping("/productDetailDemand")
    public List<ProductSpecsDomain> productDetailDemand(@RequestParam("prodId")String prodId) {
        List<ProductSpecsDomain> ProductDetailDemand = orderTakeService.productDetailDemand(prodId);
        return ProductDetailDemand;
    }


    /**
     * 订单接单子页面-产能数据
     */
    @RequestMapping("/productData")
    public PageUtil productDataList(PagingBean pagingBean) {
        List<CapacityDataDomain> ProductDataList = orderTakeService.productDataList(pagingBean);
        return PageUtil.pageBean(ProductDataList,pagingBean);
    }

    /**
     * 产能数据-查询功能
     * @return
     */
    @RequestMapping("/capacityData")
    public List<CapacityDataDomain> capacityData(@RequestParam(value="dateFrom", required=false)String dateFrom,
                                                    @RequestParam(value="dateTo", required=false)String dateTo) {

        Date from = DateUtil.fromYmd(dateFrom);
        Date to = DateUtil.fromYmd(dateTo);
        List<CapacityDataDomain> Capacitys = orderTakeService.capacityData(from,to);
        return Capacitys;
    }


}
