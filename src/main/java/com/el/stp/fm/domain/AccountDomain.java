package com.el.stp.fm.domain;

import com.el.cfg.domain.*;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Johnny on 2016/8/2.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AccountDomain extends TSoProd{


    /**
     * 发货查询
     */
    private TDelinoteProd tdp;

    /**
     * 完工查询
     */
    private TProdin tp;


    /**
     * 发票查询
     */
    private TCustsettleInv csi;


    /**
     * 结算单查询
     */
    private CustAccountDomain cad;

    /**
     * 收款查询
     */
    private TCustinvRecv cr;


    /**
     *入库日期
     */
    private Date docDate;
    public String getDocDateYmd() {
        return DateUtil.toYmd(getDocDate());
    }


    /**
     * 收款日期
     */
    private Date recvDate;
    public String getRecvDateYmd() {
        return DateUtil.toYmd(getRecvDate());
    }

    /**
     * 发票号码
     */
    private String gtInvNo;


    /**
     *开票日期
     */
    private Date invDate;
    public String getInvDateYmd() {
        return DateUtil.toYmd(getInvDate());
    }

    /**
     *到期日期
     */
    private Date dueDate;
    public String getDueDateYmd() {
        return DateUtil.toYmd(getDueDate());
    }


    /**
     * 公司编号
     */
    private Integer ouId;

    /**
     * 结算公司编码
     */
    private String ouCode;

    /**
     * 结算公司编号
     */
    private String ouName;

    /**
     * 客户编码
     */
    private String custCode;

    /**
     * 客户名称
     */
    private String custName;

    /**
     * 订单编号
     */
    private String soNo;

    /**
     * 产品编号
     */
    private String prodCode;

    /**
     * 产品名称
     */
    private String prodName;

    /**
     * 订单日期
     */
    private Date soDate;
    public String getSoDateYmd() {
        return DateUtil.toYmd(getSoDate());
    }
    /**
     * 逾期款
     */
    private Double overdueAmt;

    /**
     * 逾期天数
     */
    private Integer overdueDays;

    /**
     * 营业员
     */
    private String custId;

    /**
     * 结算日期
     */
    private Date settleDate;
    public String getSettleDateYmd() {
        return DateUtil.toYmd(getSettleDate());
    }

    /**
     * 订单客户
     */
    private String prodCustCode;


    private Double price;

    /**
     * 营业员
     */
    private Integer agentId;

    /**
     * 要求发货日期
     */
    private Date demandDeliDate;
    public String getDemandDeliDateYmd() {
        return DateUtil.toYmd(getDemandDeliDate());
    }

    /**
     * 收款金额总计
     */
    private BigDecimal recvAmtTotal;

    /**
     * 开票金额总计
     */
    private BigDecimal invAmtTotal;

    /**
     * 立账本币金额总计
     */
    private BigDecimal accountAmtTotal;

    /**
     * 订单本币金额
     */
    private BigDecimal soAmtTotal;

    /**
     * 订单金额总合
     */
    private BigDecimal quoteAmtTotal;

    /**
     * 应税额总合计
     */
    private BigDecimal netAmtTotal;

    /**
     * 税额总合计
     */
    private BigDecimal taxAmtTotal;

    /**
     * 原币金额合计
     */
    private BigDecimal currQuoteAmtTotal;



}
