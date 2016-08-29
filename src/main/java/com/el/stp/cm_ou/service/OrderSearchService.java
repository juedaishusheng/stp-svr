package com.el.stp.cm_ou.service;

import com.el.stp.cm_ou.domain.OrderSearchCondition;
import com.el.stp.cm_ou.domain.OrderSearchDetailDomain;
import com.el.stp.cm_ou.domain.OrderSearchDomain;

import java.util.List;

/**
 * Created on 2016/8/12 10:52.
 *  订单查询（业务公司）
 * @author Conway
 */
public interface OrderSearchService {
    //订单查询
    List<OrderSearchDomain> orderSerachList(OrderSearchCondition searchCondition);

    //暂停分单
    Integer pauseSeperate(String orderID);

    //订单明细
    OrderSearchDetailDomain orderProductAcptStatusSearch(String somanuId, String manudistId, String soid);

    //产品明细
    List<OrderSearchDetailDomain> productSearchByOrder(String somanuId, String manudistId, String soprodId);

    //工序产能
    List<OrderSearchDetailDomain> processTypeSearch(String somanuId,String manudistprodId,String soprodId);

    //分单对象
    List<OrderSearchDetailDomain> productSeperateObject(String soId);

    //进度跟踪
    List<OrderSearchDetailDomain> trackingProgressSearch(String somanuid,String manudistid,String acptMethod);

    //进度跟踪-完工列表
    List<OrderSearchDetailDomain> trackingProgressCompletionSearch(String somanuid);


}
