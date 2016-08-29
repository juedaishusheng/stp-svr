package com.el.stp.cm_ou.domain;

import com.el.util.DateUtil;
import lombok.Data;

import java.util.Date;

/**
 * Created by Spring on 2016/8/8.
 */
@Data
public class SchedulingDomain {

    private Integer soId;
    /**
     * 日期
     */
    private Date dt;
    public String getDtYmd() {
        return DateUtil.toYmd(getDt());
    }
    /**
     * 产品编号
     */
    private String  prodCode;
    /**
     * 产品名称
     */
    private String  prodName;
    /**
     * 工序类型
     */
    private String rptType;
    /**
     * 工序名称
     */
    private String rptName;
    /**
     * 工序排产产能
     */
    private String capa;
    /**
     * 单位
     */
    private String uom;
}
