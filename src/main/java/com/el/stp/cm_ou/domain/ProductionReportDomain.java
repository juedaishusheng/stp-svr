package com.el.stp.cm_ou.domain;

import com.el.util.DateUtil;
import lombok.Data;

import java.util.Date;

/**
 * Created by Spring on 2016/8/8.
 */
@Data
public class ProductionReportDomain {

    /**
     * 产品编号
     */
    private String  prodCode;
    /**
     * 产品名称
     */
    private String  prodName;
    /**
     * 报工时间
     */
    private Date rptDt;
    public String getRptDtYmd() {
        return DateUtil.toYmd(getRptDt());
    }
    /**
     * 报工人员
     */
    private String  contName;
    /**
     * 工序类型
     */
    private String  rptType;
    /**
     * 工序名称
     */
    private String  rptName;
    /**
     * 单位
     */
    private String  uom;
    /**
     * 需求总数
     */
    private String  sum;
    /**
     * 累计报工数量
     */
    private String  rptQtyAmt;
    /**
     * 报工数量
     */
    private String  rptQty;
}
