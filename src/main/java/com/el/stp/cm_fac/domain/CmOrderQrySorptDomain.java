package com.el.stp.cm_fac.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Vincent on 2016/8/8.
 *   CM029子页面生产报工
 */
@Data
public class CmOrderQrySorptDomain {

    private Integer sorptId;

    private Integer ouId;//公司ID

    private Integer factId;//工厂ID

    private Integer soId;//订单ID

    private Integer soManuId;//订单生产表ID

    private Integer prodId;//产品ID

    private String prodCode;//产品编号

    private String prodName;//产品名称

    private String rptType;//报工类型

    private String rptUom;//单位

    private  Integer rptQty;

    private Integer conttelId;

    private String contName;

    private String tel1;

}
