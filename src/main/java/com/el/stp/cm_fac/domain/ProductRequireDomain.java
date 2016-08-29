package com.el.stp.cm_fac.domain;

import lombok.Data;

/**
 * Created by Spring on 2016/8/19.
 */
@Data
public class ProductRequireDomain {
    /**
     * 工序类型
     */
    private String cat3;

    /**
     * 工序所需产能
     */
    private Integer processQty;

    /**
     * 单位
     */
    private String processUom;
}
