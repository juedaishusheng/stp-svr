package com.el.stp.cm_fac.domain;

import lombok.Data;

/**
 * 产品明细
 * Created by seven on 16/8/13.
 */
@Data
public class ProductSpecsDomain {

    /**
     *产品编号
     */
    private String prodCode;

    /**
     * 产品名称
     */
    private String prodName;

    /**
     * 产品类型
     */
    private String prodType;

    /**
     * 质量等级
     */
    private String qualifyLevel;

    /**
     * 印刷难度等级
     */
    private String printDiffLevel;

    /**
     * 装订难度等级
     */
    private String bindDiffLevel;

    /**
     * 装订方式
     */
    private String bindType;

    /**
     * 产品数量
     */
    private Integer manuQty;

    /**
     * 工序类型
     */
    private String cat3;

    /**
     * 工序所需产能
     */
    private Integer processQty;

    /**
     * 单位
     */
    private String processUom;

    /**
     * 产品ID
     */
    private String prodId;

}
