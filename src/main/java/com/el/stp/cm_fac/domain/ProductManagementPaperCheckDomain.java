package com.el.stp.cm_fac.domain;

import lombok.Data;

import java.util.Date;
import java.util.function.DoubleUnaryOperator;

/**
 * Created by caoyixiang on 16/8/21.
 */
@Data
public class ProductManagementPaperCheckDomain {

    /**
     * 调拨单号
     */
    private String docNo;

    /**
     * 单据日期
     */
    private Date docDate;

    /**
     * 纸张编码
     */
    private Integer itemId;

    /**
     * 纸张名称
     */
    private String intemName;

    /**
     * 纸张类型
     */
    private String lineType;

    /**
     * 品牌
     */
    private String cat1;

    /**
     * 厂家
     */
    private String cat2;

    /**
     * 长
     */
    private String cat7;

    /**
     * 宽
     */
    private String cat8;

    /**
     * 克重
     */
    private String cat9;

    /**
     * 调拨数量
     */
    private Integer planOutQty;

    /**
     * 纸张确认状态
     */
    private String PaperReadyStatus;
}
