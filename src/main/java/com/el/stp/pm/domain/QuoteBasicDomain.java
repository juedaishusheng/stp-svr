package com.el.stp.pm.domain;

import lombok.Data;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA
 * Title:报价单基本信息
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
public class QuoteBasicDomain {
    /**
     * T_QUOTE主键
     * */
    private String Id;
    /**
     * 报价单单号
     */
    private String quoteNo;
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
     * 交货时间
     */
    private String dueDate;
    /**
     * 业务员名称
     * */
    private String agentName;
    /**
     * 业务部门名称
     * */
    private String depName;
    /**
     * 登记时间
     * */
    private String quoteDate;
    /**
     * 生效时间
     * */
    private String effectDate;
    /**
     * 付款方式
     * */
    private String payMentMethod;
    /**
     * 付款条约
     * */
    private String payMentTerms;
}
