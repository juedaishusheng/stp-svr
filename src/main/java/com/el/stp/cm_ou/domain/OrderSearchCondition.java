package com.el.stp.cm_ou.domain;

import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created on 2016/8/12 12:23.
 * 订单查询条件（业务公司）
 *
 * @author Conway
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class OrderSearchCondition extends PagingBean {
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 交货开始日期
     */
    private String startDuedate;
    /**
     * 交货结束日期
     */
    private String endDuedate;

    /**
     * 生产工厂
     */
    private String factoryAddr;
    /**
     * 订单状态
     */
    private String orderStatus;
    /**
     * 产品信息确认
     */
    private String productStatus;
    /**
     * 分单状态
     */
    private String acptStatus;
    /**
     * 分单方式
     */
    private String acptMethod;
    /**
     * 纸张确认
     */
    private String paperReadyStatus;
    /**
     * 当前登录角色的工厂ID
     */
    private String ouid;

    @Override
    public String toString() {
        return "OrderSearchCondition{" +
            "productName='" + productName + '\'' +
            ", orderNo='" + orderNo + '\'' +
            ", startDuedate='" + startDuedate + '\'' +
            ", endDuedate='" + endDuedate + '\'' +
            ", factoryAddr='" + factoryAddr + '\'' +
            ", orderStatus='" + orderStatus + '\'' +
            ", productStatus='" + productStatus + '\'' +
            ", acptStatus='" + acptStatus + '\'' +
            ", acptMethod='" + acptMethod + '\'' +
            ", paperReadyStatus='" + paperReadyStatus + '\'' +
            '}';
    }
}
