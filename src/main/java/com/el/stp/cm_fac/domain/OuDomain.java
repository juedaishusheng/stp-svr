package com.el.stp.cm_fac.domain;

import com.el.sys.domain.PagingBean;
import com.el.util.DateUtil;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author max
 * @Created on 16/8/1.
 * 公司表映射实体类
 */
@Data
public class OuDomain {

    /**
     * 工序产能
     */
    private List<FactStdcapaDomain> factStdcapaDomains;

    /**
     * 产能数据
     */
    private List<CapaDataDomain> capaDataDomains;

    /**
     * 印刷订单
     */
    private List<PrintDataDomain> printDataDomains;

    /**
     * 工序价格
     */
    private List<ProPriceDataDomain> proPriceDataDomains;

    /**
     * 表序列号
     */
    private Integer ouId;

    /**
     * 公司编号
     */
    private String ouCode;

    /**
     * 公司名称
     */
    private String ouName;

    /**
     * 公司总机
     */
    private String tel1;

    /**
     * 城市
     */
    private String city;

    /**
     * 地址1
     */
    private String add1;

    /**
     * 地址2
     */
    private String add2;

    /**
     * 上月交付准时率
     */
    private String ontimeRate;

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
