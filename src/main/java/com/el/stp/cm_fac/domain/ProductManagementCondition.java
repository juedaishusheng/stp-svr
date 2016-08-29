package com.el.stp.cm_fac.domain;

import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Spring on 2016/8/18.
 * 生产管理主页查询条件
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ProductManagementCondition extends PagingBean{

    /*产品名称*/
    private String prodName;

    /*订单编号*/
    private String soNo;

    /*产品信息确认*/
    private String prodAppr;

    /*纸张确认*/
    private String paperAppr;
}
