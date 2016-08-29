package com.el.stp.cm_ou.controller;

import com.el.stp.cm_ou.domain.OrderPriceDomain;
import com.el.stp.cm_ou.service.OrderPriceService;
import com.el.stp.common.util.PageUtil;
import com.el.sys.domain.PagingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Spring on 2016/7/30.
 */
@RestController
@RequestMapping("api/cm_ou/cm011")
public class CmOrderPriceController {

    private final Logger log = LoggerFactory.getLogger(getClass());
@Autowired
private OrderPriceService orderPriceService;

//    订单核价
    @RequestMapping("/listView")
    public PageUtil listData(PagingBean pagingBean){

        List<OrderPriceDomain> orderPrices = orderPriceService.orderPriceInfo(pagingBean);
        return PageUtil.pageBean(orderPrices,pagingBean);
    }

//   订单核价-同意
   @RequestMapping("/updateListView")
    public Map<String, Object> orderInfo(@RequestParam("orderId") Integer orderId) {

        Map<String, Object> resultMap = new HashMap<>();
        List<OrderPriceDomain> orders = orderPriceService.orderUpdateInfo(orderId);
        return resultMap;
    }

//    订单核价-退回事件实现
    @RequestMapping("/orderPriceBackView")
    public Map<String, Object> orderPriceBackInfo(@RequestParam("orderId") Integer orderId,
                                                  @RequestParam("textareaContent") String textareaContent) {

        Map<String, Object> resultMap = new HashMap<>();
        List<OrderPriceDomain> orderPriceBack = orderPriceService.orderPriceBackInfo(orderId,textareaContent);
        return resultMap;
    }
}
