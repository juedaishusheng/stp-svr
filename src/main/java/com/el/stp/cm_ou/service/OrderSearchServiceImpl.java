package com.el.stp.cm_ou.service;

import com.el.stp.cm_ou.domain.OrderSearchCondition;
import com.el.stp.cm_ou.domain.OrderSearchDetailDomain;
import com.el.stp.cm_ou.domain.OrderSearchDomain;
import com.el.stp.cm_ou.mapper.OrderSearchMapper;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2016/8/12 10:46.
 * 订单查询（业务公司）
 * @author Conway
 */
@Service
public class OrderSearchServiceImpl implements OrderSearchService {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private OrderSearchMapper orderSearchMapper;

    //分单方式
    public static enum SeparatedMethod{
        MANUAL("01"),AUTOMATIC("02");
        SeparatedMethod(String statusCode){
            this.statusCode=statusCode;
        }
        @Getter
        private final String statusCode;
        public String toString(){
            return statusCode;
        }
    }
    @Override
    public List<OrderSearchDomain> orderSerachList(OrderSearchCondition searchCondition) {
        Integer rowCount=orderSearchMapper.orderSearchNum(searchCondition);//分页数据总条数
        searchCondition.setRowCount(rowCount);
        return rowCount>0?orderSearchMapper.orderSerachList(searchCondition):null;
    }

    @Transactional
    @Override
    public Integer pauseSeperate(String orderID) {
        if(orderSearchMapper.selectIsExistsFactgroupBySoid(orderID)>0){
            orderSearchMapper.deleteSoCalcBySoid(orderID);
            orderSearchMapper.deleteSoFactgroupBySoid(orderID);
            orderSearchMapper.updateSoCalcBySoid(orderID);
            return 1;
        }
        return 0;
    }

    @Override
    public OrderSearchDetailDomain orderProductAcptStatusSearch(String somanuId, String manudistId, String soid) {
        List<OrderSearchDetailDomain> orderSearchDetailDomains = orderSearchMapper.orderProductAcptStatusSearch(somanuId, manudistId, soid);
        return (orderSearchDetailDomains!=null&&orderSearchDetailDomains.size()>0)?orderSearchDetailDomains.get(0):null;
    }

    @Override
    public List<OrderSearchDetailDomain> productSearchByOrder(String somanuId, String manudistId, String soprodId) {
        return orderSearchMapper.orderProductSearch(somanuId,manudistId,soprodId);
    }

    @Override
    public List<OrderSearchDetailDomain> processTypeSearch(String somanuId,String manudistprodId,String soprodId) {
        List<OrderSearchDetailDomain> orderSearchDetailDomains = new ArrayList<>();
        orderSearchDetailDomains.addAll(orderSearchMapper.productSearchCapacity01(somanuId));
        orderSearchDetailDomains.addAll(orderSearchMapper.productSearchCapacity01(manudistprodId));
        orderSearchDetailDomains.addAll(orderSearchMapper.productSearchCapacity01(soprodId));
        return orderSearchDetailDomains;
    }

    @Override
    public List<OrderSearchDetailDomain> productSeperateObject(String soId) {
        return orderSearchMapper.productSeperateObject(soId);
    }

    @Override
    public List<OrderSearchDetailDomain> trackingProgressSearch(String somanuid, String manudistid,String acptMethod) {
        if(SeparatedMethod.valueOf("MANUAL").toString().equals(acptMethod)){
            return orderSearchMapper.trackingProgress01Search(somanuid);
        }
        if(SeparatedMethod.valueOf("AUTOMATIC").toString().equals(acptMethod)){
            return orderSearchMapper.trackingProgress02Search(somanuid,manudistid);
        }
        return null;
    }

    @Override
    public List<OrderSearchDetailDomain> trackingProgressCompletionSearch(String somanuid) {
        return orderSearchMapper.trackingProgressCompletionSearch(somanuid);
    }
}
