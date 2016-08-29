package com.el.stp.cm_ou.service;

import com.el.stp.cm_ou.domain.OrderPriceDomain;
import com.el.stp.cm_ou.mapper.OrderPriceMapper;
import com.el.sys.domain.PagingBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Spring on 2016/8/1.
 */
@Service
public class OrderPriceServiceImpl implements OrderPriceService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private OrderPriceMapper orderPriceMapper;

    //    订单核价
    @Override
    public List<OrderPriceDomain> orderPriceInfo(PagingBean pagingBean) {
//        List<OrderPriceDomain> orderPrices = orderPriceMapper.orderPriceInfo(pagingBean);
//        return orderPrices;
        Integer rowCount = orderPriceMapper.totalOrderPrice();
        pagingBean.setRowCount(rowCount);
        return rowCount > 0 ? orderPriceMapper.orderPriceInfo(pagingBean) : null;
    }

    //   订单核价-同意
    @Transactional
    @Override
    public List<OrderPriceDomain> orderUpdateInfo(Integer orderId){
        List<OrderPriceDomain> orders = orderPriceMapper.orderUpdateInfo(orderId);
        return  orders;
    }

    //    订单核价-退回事件实现
    @Transactional
    @Override
    public List<OrderPriceDomain> orderPriceBackInfo(Integer orderId ,String textareaContent){
        List<OrderPriceDomain> orderPriceBack = orderPriceMapper.orderPriceBackInfo(orderId,textareaContent);
        return  orderPriceBack;
    }

}
