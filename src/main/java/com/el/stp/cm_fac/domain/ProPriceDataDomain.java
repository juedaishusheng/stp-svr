package com.el.stp.cm_fac.domain;

import lombok.Data;

/**
 * Created by max on 2016/8/5 0005.
 * 工序价格
 */
@Data
public class ProPriceDataDomain {

    /**
     * 工序编号
     */
    private String  processCode;
    /**
     *工序名称
     */
    private String  processName;
    /**
     *工序大类
     */
    private String  cat1;
    /**
     *工序小类
     */
    private String  cat2;
    /**工序子类
     *
     */
    private String  cat3;
    /**
     *工序单价
     */
    private String  price;
    /**
     *计量单位
     */
    private String  priceUom;
}
