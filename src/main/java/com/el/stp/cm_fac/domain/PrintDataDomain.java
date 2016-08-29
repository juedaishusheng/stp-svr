package com.el.stp.cm_fac.domain;

import com.el.util.DateUtil;
import lombok.Data;

import java.util.Date;

/**
 * Created by max on 2016/8/5 0005.
 * 印刷订单
 */
@Data
public class PrintDataDomain {

    /**
     * T_SO_MANU ID号
     */
    private Integer soManuId;

    /**
     * 手工分单工厂ID  MANU_DIST_ID
     */
    private Integer manuDistId;

    /**
     * 订单编号
     */
    private String soNo;
    /**
     *接单员
     */
    private String accpUser;
    /**
     *接单时间
     */
    private Date accpDate;
    public String getAccpDateYmd() {return DateUtil.toYmd(getAccpDate());}
    /**
     *生产交期
     */
    private Date manuCompDate;
    public String getManuCompDateYmd(){return DateUtil.toYmd(getManuCompDate());}
    /**
     *产品编号
     */
    private String prodCode;
    /**
     *产品名称
     */
    private String prodName;
    /**
     *产品类型
     */
    private String profType;
    /**
     *质量等级
     */
    private String qualityLevel;
    /**
     *印刷难度等级
     */
    private String printDiffLevel;
    /**
     *装订难度等级
     */
    private String bindDiffLevel;
    /**
     *装订方式
     */
    private String bindType;
    /**
     *产品数量
     */
    private Integer distQty;
    /**
     *生产状态
     */
    private String manuStatus;
}
