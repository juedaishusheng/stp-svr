package com.el.stp.cm_fac.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Vincent on 2016/8/12.
 * CM209子页面的订单排产
 */
@Data
public class CmOrderQryOccupyDomain {

    private Integer occupyId;//工厂产能占用 ID

    private Integer lineNo;//行号

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dt;//日期

    private String prodCode;//产品编号

    private String prodName;//产品名称

    private String processType;//工序类型

    private String processName;//工序名称

    private BigDecimal capa;//占用数量 工序排产产能

    private String rptUom;//报工单位

    private Integer ouId;//公司ID

    private Integer distouId;//分单中心ID

    private Integer factId;//工厂ID

    private Integer soId;//订单ID

    private Integer soManuId;//订单生产表ID

    private Integer prodId;//产品ID

    private String capaType;//产能类型

}
