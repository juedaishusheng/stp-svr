package com.el.stp.pm.domain;

import lombok.Data;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA
 * Title:待价格审核
 * Description:
 *
 * @Company: Elitesland
 * @project: stp-svr
 * @author: james.zhang
 * @version: 1.0.0
 * @time: 2016/8/24
 */
@Data
@ToString(callSuper = true)
public class PriceAuditDomain {
    private String Id;
    /**
     * 报价单行号
     */
    private String lineNo;
    /**
     * 报价单ID
     */
    private String quoteId;
    /**
     * 报价单单号
     */
    private String quoteNo;
    /**
     * 订单状态
     */
    private String quoteStatus;
    /**
     * 登记时间
     */
    private String quoteDate;
    /**
     * 客户ID
     */
    private String custId;
    /**
     * 客户编码
     */
    private String custCode;
    /**
     * 客户名称
     */
    private String custName;
    /**
     * 公司ID
     */
    private String ouId;
    /**
     * 编号
     */
    private String ouCode;
    /**
     * 名称
     */
    private String ouName;
    /**
     * 跟单员ID
     */
    private String mercherId;
    /**
     * 销售经理ID
     */
    private String saleManagerId;
    /**
     * 本币金额
     */
    private String sumAmt;
    /**
     * 报价单价
     */
    private String quotePrice;
    /**
     * 正数
     */
    private String manuQty;
    /**
     * 报价金额
     */
    private String quoteAmt;
    /**
     * 产品ID
     */
    private String prodId;
    /**
     * 客户金额
     */
    private String custAmt;
    /**
     * 赠送/加放
     * 删除该字段
     */
    /*private String freeFlag;*/
    /**
     * 产品大类
     */
    private String prodType;
    /**
     * 产品编号
     */
    private String prodCode;
    /**
     * 产品名称
     */
    private String prodName;
    /**
     * 业务员名称
     * */
    private String agentName;
    /**
     * 部门名称
     * */
    private String depName;
}
