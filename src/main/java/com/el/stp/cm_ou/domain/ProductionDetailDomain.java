package com.el.stp.cm_ou.domain;

import lombok.Data;

/**
 * Created by Spring on 2016/8/8.
 */
@Data
public class ProductionDetailDomain {

    /**
     * 产品编号
     */
    private String  prodCode;
    /**
     * 产品名称
     */
    private String  prodName;
    /**
     * 产品类型
     */
    private String  prodType;
    /**
     * 质量等级
     */
    private String qualityLevel;

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
    private String prodQty;
    /**
     * 产品信息未确认数量
     */
    private String prodInfoStatus;
    /**
     * 完成率
     */
    private String finish;
}
