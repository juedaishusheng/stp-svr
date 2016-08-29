package com.el.stp.cm_fac.domain;

import com.el.util.DateUtil;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Logger;

/**
 * 产能数据
 * Created by seven on 16/8/15.
 */
@Data
public class CapacityDataDomain {

    /**
     * 生产日期
     */
    private Date dt;
    public String getDtYmd(){return DateUtil.toYmd(getDt());}

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
    private Double dailyCapa;

    /**
     * 已占用产能
     */
    private Double capa;


    /**
     * 单位
     */
    private String uom;

    /**
     * 占用比例
     */
    private Float alScale;
    public BigDecimal getAlScale() {
        BigDecimal bigDecimal = new BigDecimal(alScale);
        return bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
