package com.el.stp.cm_fac.domain;

import lombok.Data;

/**
 * Created by max on 2016/8/4
 * 工序表映射实体类
 */
@Data
public class FactStdcapaDomain {

    /**
     * 工序类型
     */
    private String capaType;

    /**
     * 工序合作产能
     */
    private String dailyCapa;

    /**
     * 单位
     */
    private String uom;
}
