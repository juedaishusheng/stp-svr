package com.el.stp.cm_fac.domain;

import lombok.Data;

/**
 * Created by Vincent on 2016/8/12.
 * CM209 子页面产能需求
 */
@Data
public class CmOrderQryProdProcessDomain {
    private Integer lineNo;
    private Integer prodProcessId;//ID
    private Integer prodId;//产品ID；
    private String processType;//工序类型
    private Integer processQty;//工序所需产能
    private Integer processId;//工序ID

    private String processCode;//工序编号
    private String processName;//工序名称
    private String priceUom;//计价单位
    private String rptUom;//报工单位
}
