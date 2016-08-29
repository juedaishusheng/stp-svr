package com.el.stp.cm_ou.domain;

import com.el.cfg.domain.TFactStdcapa;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @author billy
 * @since 16/7/29.
 * 双击工厂查询进入页面数据
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FactoryCapacityDomain extends TFactStdcapa{

    /**
     * 对应的接单中心
     */
    private String ouName;

    /**
     * 工序类型
     */
    private String capaType;

    //==========产能数据 start=======
    /**
     * 产品名称
     */
    private String prodName;

    /**
     * 生产日期
     */
    private Date dt;
    public String getDtYmd(){return DateUtil.toYmd(getDt());}


    /**
     * 已占用产能
     */
    private Double capa;

    //==========产能数据  end =======

}
