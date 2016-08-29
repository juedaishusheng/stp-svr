package com.el.stp.cm_ou.domain;

import com.el.cfg.domain.TFactory;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @author billy
 * @since 16/7/29.
 */
@Data
public class FactoryDomain {


    /**
     * 工厂编号
     */
    private Integer addrNo;
    private Integer factId;

    /**
     * 工厂名称
     */
    private String addrName;

    /**
     * 上月交付准时率
     */
    private Double ontimeRate;

    /**
     *合作开始日期
     */
    private Date validFrom;
    public String getValidFromYmd() {
        return DateUtil.toYmd(getValidFrom());
    }

    /**
     *合作结束日期
     */
    private Date validTo;
    public String getValidToYmd() {
        return DateUtil.toYmd(getValidTo());
    }
    /**
     * 质量等级
     */
    private String qualifyLevel;

    /**
     * 印刷难度等级
     */
    private String printDiffLevel;

    /**
     * 装订难度等级
     */
    private String bindDiffLevel;

    /**
     * 生产中数量
     */
    private Integer manuNum;

    /**
     * 纸张未确认数量
     */
    private Integer paperReadyNum;

    /**
     * 产品信息未确认数量
     */
    private Integer prodInfoNum;
}
