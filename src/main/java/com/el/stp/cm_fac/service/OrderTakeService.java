package com.el.stp.cm_fac.service;

import com.el.stp.cm_fac.domain.CapacityDataDomain;
import com.el.stp.cm_fac.domain.MeetOrderDomain;
import com.el.stp.cm_fac.domain.ProductSpecsDomain;
import com.el.sys.domain.PagingBean;

import java.util.Date;
import java.util.List;

/**
 * @author spring
 * 订单接单
 */
public interface OrderTakeService {

    /**
     * 订单接单主页面
     */
    List<MeetOrderDomain> orderTakeIn(PagingBean pagingBean);


    /**
     * 订单接单子页面
     */
    List<MeetOrderDomain> orderDetailsList(Integer id);

    /**
     * 订单接单子页面-产品明细 seven
     */
    List<ProductSpecsDomain> productDetailList();
    /**
     * 订单详情-产品明细产能需求 seven
     */
    List<ProductSpecsDomain> productDetailDemand(String prodId);

    /**
     * 订单接单子页面-产能数据
     */
    List<CapacityDataDomain> productDataList(PagingBean pagingBean);

    /**
     *订单接单子页面-产能数据查询按钮事件
     */
    List<CapacityDataDomain> capacityData(Date dateFrom, Date dateTo);
}
