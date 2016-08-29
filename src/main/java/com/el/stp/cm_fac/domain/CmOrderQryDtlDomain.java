package com.el.stp.cm_fac.domain;

import lombok.Data;

/**
 * Created by Vincent on 2016/8/8.
 * cm209子页面的数据 产品明细
 */
@Data
public class CmOrderQryDtlDomain {

    private Integer soProdId;

    private Integer soId;//订单ID

    private Integer lineNo;//订单行号

    private Integer prodId;

    private String prodCode;//产品编号

    private String prodName;//产品名称

    private String prodType;//产品类型

    private String qualityLevel;//生产质量等级

    private String printDiffLevel;//印刷难度等级

    private String bindDiffLevel;//装订难度等级

    private String bindType;//装订方式

    private Integer distQty;//产品数量

    private String prodInfoStatus;//产品信息是否确认
}
