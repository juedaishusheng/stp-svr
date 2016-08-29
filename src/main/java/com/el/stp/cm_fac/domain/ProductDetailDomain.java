package com.el.stp.cm_fac.domain;

import lombok.Data;

/**
 * Created by Spring on 2016/8/19.
 */
@Data
public class ProductDetailDomain {

    //T_SO主键ID
    private Integer sid;
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
     * 产品总数（PCS)
     */
    private Integer manuQty;

    /**
     * 产品信息是否确认
     */
    private String prodInfoStatus;

    /**
     * 完成率
     */
    private Long finishRate;
}
