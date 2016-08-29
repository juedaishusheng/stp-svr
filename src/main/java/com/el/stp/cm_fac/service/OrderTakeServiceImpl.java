package com.el.stp.cm_fac.service;

import com.el.stp.cm_fac.domain.CapacityDataDomain;
import com.el.stp.cm_fac.domain.MeetOrderDomain;
import com.el.stp.cm_fac.domain.ProductSpecsDomain;
import com.el.stp.cm_fac.mapper.OrderTakeMapper;
import com.el.stp.cm_ou.domain.FactoryCapacityDomain;
import com.el.stp.cm_ou.domain.OrderPriceDomain;
import com.el.sys.domain.PagingBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * @author Spring
 * 订单接单
 */
@Service
public class OrderTakeServiceImpl implements OrderTakeService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private OrderTakeMapper orderTakeMapper;

    //订单接单主页面数据查询
    @Override
    public List<MeetOrderDomain> orderTakeIn(PagingBean pagingBean) {
//        List<MeetOrderDomain> OrderDomainList = orderTakeMapper.orderTakeIn(pagingBean);
//        return OrderDomainList;
        Integer rowCount = orderTakeMapper.totalOrderTake();
        pagingBean.setRowCount(rowCount);
        return rowCount > 0 ? orderTakeMapper.orderTakeIn(pagingBean) : null;
    }

    @Override
    public List<MeetOrderDomain> orderDetailsList(Integer id){
        List<MeetOrderDomain> OrderDetail = orderTakeMapper.orderDetailsList(id);
        return  OrderDetail;
    }

    /**
     * 订单接单子页面-产品明细
     */
//    @Override
//    public List<MeetOrderDomain> ProductDetailList() {
//        return null;
//    }
    @Override
    public List<ProductSpecsDomain> productDetailList() {
        List<ProductSpecsDomain> ProductDetailList = orderTakeMapper.productDetailList();
        return ProductDetailList;
    }

    /**
     * 订单详情-产品明细-产能需求
     */
    @Override
    public List<ProductSpecsDomain> productDetailDemand(String prodId) {
        List<ProductSpecsDomain> productDetailDemand = orderTakeMapper.productDetailDemand(prodId);
        return productDetailDemand;
    }

    /**
     * 订单接单子页面-产能数据
     */
    @Override
    public List<CapacityDataDomain> productDataList(PagingBean pagingBean){
//        List<CapacityDataDomain> ProductDataList = orderTakeMapper.productDataList(pagingBean);
//        return ProductDataList;
        Integer rowCount = orderTakeMapper.totalProductData();
        pagingBean.setRowCount(rowCount);
        return rowCount > 0 ? orderTakeMapper.productDataList(pagingBean) : null;
    }

    //产能数据查询按钮事件
    @Override
    public List<CapacityDataDomain> capacityData(Date dateFrom, Date dateTo) {
        return orderTakeMapper.capacityData(dateFrom,dateTo);
    }

}
