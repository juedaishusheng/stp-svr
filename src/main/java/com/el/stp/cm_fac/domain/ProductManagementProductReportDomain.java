package com.el.stp.cm_fac.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by seven on 2016/8/22.
 */
@Data
public class ProductManagementProductReportDomain {
    /**
     * 产品编号
     */
    private Integer prodCode;

    /**
     * 产品名称
     */
    private String prodName;

    /**
     * 报工时间
     */
    private Date rptDt;

    /**
     * 报工人员
     */
    private String rpterName;

    /**
     * 报工类型
     */
    private String rptType;

    /**
     * 单位
     */
    private String rptUom;

    /**
     * 需求总数
     */
    private Integer capa;

    /**
     * 本次报工数量
     */
    private Integer rptQty;

}
