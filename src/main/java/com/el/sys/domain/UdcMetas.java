package com.el.sys.domain;

import lombok.Getter;
import lombok.ToString;

/**
 * Created on 16/7/29.
 *
 * @author panlw
 */
@ToString
public enum UdcMetas implements UdcMeta {

    DEMO("E7", "C1", "DEMO"),
    COUNTRY("00", "EC", "国家"),

    /**
     * 生产状态
     */
    PRODCUT_STATUS("E7","B6",""),

    /**
     * 发货通知单状态
     */
    DELINOTE_PROD_STATUS("E7","C2",""),

    /**
     * 打包方式
     */
    PACKAGE_METHOD("E7","C3",""),

    /**
     * 分单方式
     */
    SEPERATE_METHOD("E7","A5",""),

    /**
     * 生产质量等级
     */
    QUALITY_LEVEL("E7", "A1",""),

    /**
     * 接单方式
     */
    ORDERS_METHOD("E7","A6",""),

    /**
     * 印刷难度等级
     */
    PRINT_DIFF_LEVEL("E7", "A2",""),

    /**
     * 纸张完备状态
     */
    PAPER_STATUS("E7", "B5",""),

    /**
     * 装订难度等级
     */
    BIND_DIFF_LEVEL("E7", "A3",""),

    /**
     * 工厂生产状态
     */
    FACTORY_PRODUCT_STATUS("E7", "B6",""),

    /**
     * 入库状态
     */
    WAREHOUSING_STATUS("E7", "B7",""),

    /**
     * 产品信息确认状态
     */
    PRODUCT_CONFIRMATION_STATUS("E7", "B8",""),

    /**
     * 不可接单原因代码
     */
    NON_ORDERS_CODE("E7", "B9",""),

    /**
     * 分单状态
     */
    SEPERATE_STATUS("E7", "C1","")

    ;

    @Getter
    private final String domainCode;
    @Getter
    private final String udcType;
    @Getter
    private final String udcDesc;

    UdcMetas(String domainCode, String udcType, String udcDesc) {
        this.domainCode = domainCode;
        this.udcType = udcType;
        this.udcDesc = udcDesc;
    }
}
