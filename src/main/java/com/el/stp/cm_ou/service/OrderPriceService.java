package com.el.stp.cm_ou.service;

import com.el.stp.cm_ou.domain.OrderPriceDomain;
import com.el.sys.domain.PagingBean;

import java.util.List;

/**
 * Created by Spring on 2016/8/1.
 */
public interface OrderPriceService {

    //    订单核价
    List<OrderPriceDomain> orderPriceInfo(PagingBean pagingBean);
    //   订单核价-同意
    List<OrderPriceDomain> orderUpdateInfo(Integer orderId);
    //    订单核价-退回事件实现
    List<OrderPriceDomain> orderPriceBackInfo(Integer orderId,String textareaContent);
}
