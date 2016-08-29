package com.el.stp.cm_ou.controller;

import com.el.stp.cm_ou.domain.OrderSearchCondition;
import com.el.stp.cm_ou.domain.OrderSearchDetailDomain;
import com.el.stp.cm_ou.domain.OrderSearchDomain;
import com.el.stp.cm_ou.service.OrderSearchService;
import com.el.stp.common.util.PageUtil;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 2016/8/9 9:09.
 * 业务公司-订单查询
 * @author Conway
 */
@RestController
@RequestMapping("/api/mock/cm012")
public class CmOrderSearchController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private OrderSearchService orderSearchService;

    //订单查询列表
    @RequestMapping("/listView")
    public PageUtil orderListView(OrderSearchCondition searchCondition) {
        if(StringUtils.isEmpty(searchCondition)){
            searchCondition=new OrderSearchCondition();
        }
        List<OrderSearchDomain> orderSearchDomainsList=orderSearchService.orderSerachList(searchCondition);
        return PageUtil.pageBean(orderSearchDomainsList,searchCondition);
    }

    //暂停分单
    @RequestMapping("/pauseSeperate")
    public Integer pauseSeperate(@Param("orderid") String orderid){
        return orderSearchService.pauseSeperate(orderid);
    }

    //修改价格
    @RequestMapping("/updatePrice")
    public List<String> updatePrice(@Param("orderid") String orderid){
        return Arrays.asList("1","2","3","4" );
    }

    //订单详情(客户信息、订单信息)
    @RequestMapping("/orderDetailSearch")
    public OrderSearchDetailDomain orderDetailSearch(@Param("somanuId") String somanuId,@Param("soId") String soId,
                                                     @Param("manudistId") String manudistId) {
        return orderSearchService.orderProductAcptStatusSearch(somanuId, manudistId, soId);
    }

    //订单详情(产品信息)
    @RequestMapping("/productSearchByOrder")
    public List<OrderSearchDetailDomain> productSearchByOrder(@Param("somanuId")String somanuId,@Param("manudistId")String manudistId,
                                                              @Param("soprodId")String soprodId) {
        return orderSearchService.productSearchByOrder(somanuId,manudistId,soprodId);
    }

    //订单详情(工序类型)
    @RequestMapping("/processType")
    public List<OrderSearchDetailDomain> processType(@Param("somanuId") String somanuId, @Param("manudistprodId") String manudistprodId,
                                                     @Param("soprodId") String soprodId) {
        return orderSearchService.processTypeSearch(somanuId, manudistprodId, soprodId);
    }

    //订单详情(分单对象)
    @RequestMapping("/productSeperateObject")
    public List<OrderSearchDetailDomain> productSeperateObject(@Param("soId") String soId){
        return orderSearchService.productSeperateObject(soId);
    }

    //订单详情(进度跟踪)
    @RequestMapping("/trackingProgressSearch")
    public List<OrderSearchDetailDomain> trackingProgressSearch(@Param("somanuId")String somanuId,@Param("manudistId") String manudistId,
                                                                @Param("acptMethod")String acptMethod){
        return orderSearchService.trackingProgressSearch(somanuId,manudistId,acptMethod);
    }

    //订单详情(进度跟踪-完工列表)
    @RequestMapping("/trackingProgressCompletionSearch")
    public List<OrderSearchDetailDomain> trackingProgressCompletionSearch(@Param("somanuId")String somanuId){
        return orderSearchService.trackingProgressCompletionSearch(somanuId);
    }
}
