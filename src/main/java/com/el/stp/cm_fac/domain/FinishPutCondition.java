package com.el.stp.cm_fac.domain;

import lombok.Data;

/**
 * Created by Spring on 2016/8/22.
 */
@Data
public class FinishPutCondition {

    private Long id;

    //产品编号
    private String prodCode;

    //产品名称
    private String prodName;

    //本次入库数量
    private Integer whinQty;

    //备注
    private String remark;
}
