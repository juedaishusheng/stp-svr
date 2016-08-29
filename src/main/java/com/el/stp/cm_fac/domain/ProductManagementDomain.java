package com.el.stp.cm_fac.domain;

import com.el.stp.common.util.PageUtil;
import com.el.util.DateUtil;
import lombok.Data;

import java.util.Date;

/**
 * Created by seven on 16/8/17.
 */

@Data
public class ProductManagementDomain {

    //T_SO_MANU.SO_ID
    private  Integer soId;

    //T_SO主键ID
    private Integer sid;
    /**
     * 生产管理-文件检查
     * 产能需求WHERE条件(缺失T-SO-MANU下的SO_MANU_ID)
     * 暂用T-SO-MANU表中订单产品明细表ID(SO_PROD_ID)
     */
    private Integer soProdId;
    /**
     * 公司编号
     */
    private String ouCode;

    /**
     * 公司名称
     */
    private String ouName;

    /**
     * 订单编号
     */
    private String soNo;

    /**
     * 生产交期
     */
    private Date returnDate;//数据表里面缺失字段,此字段需要修改
    private String getReturnDateYmd(){
        return DateUtil.toYmd(getReturnDate());
    }

    /**
     * 接单员
     */
    private String acptUser;

    /**
     * 接单时间
     */
    private Date acptTime;
    private String getAcptTimeYmd(){
        return DateUtil.toYmd(getAcptTime());
    }

    /**
     * 产品编号
     */
    private String prodCode;

    /**
     * 产品名称
     */
    private String prodName;

    /**
     * 产品类型
     */
    private String prodType;

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
     * 装订方式
     */
    private String bindType;

    /**
     * 产品数量
     */
    private Long distQty;

    /**
     * 纸张确认状态
     */
    private String paperReadyStatus;

    /**
     * 纸张确认人
     */
    private String paperApprer;

    /**
     * 纸张确认时间
     */
    private Date paperApprDate;
    private String getPaperApprDateYmd(){
        return DateUtil.toYmd(getPaperApprDate());
    }

    /**
     * 产品信息确认状态
     */
    private String prodInfoStatus;

    /**
     * 产品信息确认人
     */
    private String prodApprer;

    /**
     * 产品信息确认时间
     */
    private Date prodApprDate;
    private String getProdApprDateYmd(){
        return DateUtil.toYmd(getProdApprDate());
    }

}
