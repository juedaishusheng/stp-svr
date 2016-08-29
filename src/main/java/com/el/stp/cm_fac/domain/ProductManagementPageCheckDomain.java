package com.el.stp.cm_fac.domain;

import lombok.Data;

/**
 * Created by caoyixiang on 16/8/20.
 */
@Data
public class ProductManagementPageCheckDomain {

    /**
     * 工序类型
     */
    private String capaType;

    /**
     * 工序所需产能
     */
    private String capa;

    /**
     * 单位
     */
    private String uom;
}
