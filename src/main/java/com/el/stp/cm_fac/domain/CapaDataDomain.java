package com.el.stp.cm_fac.domain;


import com.el.util.DateUtil;
import lombok.Data;

import java.util.Date;


/**
 * Created by max on 2016/8/5 0005.
 * 产能数据
 */
@Data
public class CapaDataDomain {

    /**
     *生产日期
     */
    private Date dt;
    public String getDtYmd() { return DateUtil.toYmd(getDt());}

    /**
     * 产品名称
     */
    private String prodName;

    /**
     * 工序类型
     */
    private String capaType;

    /**
     * 合作产能
     */
    private String dailyCapa;

    /**
     * 已占用产能
     */
    private String capa;

    /**
     * 单位
     */
    private String uom;

    /**
     * 占用比利
     */
    private String capaPro;

}
