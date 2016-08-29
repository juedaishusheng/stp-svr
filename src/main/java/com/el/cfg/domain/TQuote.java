package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TQuote implements Serializable {
    /**
     *  null - T_QUOTE.ID
     */
    private Long id;

    /**
     *  公司ID - T_QUOTE.OU_ID
     */
    private Long ouId;

    /**
     *  MCUID - T_QUOTE.MCU_ID
     */
    private Long mcuId;

    /**
     *  报价单编号 - T_QUOTE.QUOTE_NO
     */
    private String quoteNo;

    /**
     *  客户ID - T_QUOTE.CUST_ID
     */
    private Long custId;

    /**
     *  要求交期 - T_QUOTE.DUE_DATE
     */
    private Date dueDate;

    /**
     *  生产交期 要求交期-生产交货要求提前期（天） - T_QUOTE.MANU_DUE_DATE
     */
    private Date manuDueDate;

    /**
     *  业务员ID 对应T_ADDRESS_BOOK.ID - T_QUOTE.AGENT_ID
     */
    private Long agentId;

    /**
     *  登记时间 - T_QUOTE.QUOTE_DATE
     */
    private Date quoteDate;

    /**
     *  生效时间 - T_QUOTE.EFFECT_DATE
     */
    private Date effectDate;

    /**
     *  付款方式 - T_QUOTE.PAYMENT_METHOD
     */
    private String paymentMethod;

    /**
     *  付款条款 - T_QUOTE.PAYMENT_TERMS
     */
    private String paymentTerms;

    /**
     *  订单状态 - T_QUOTE.QUOTE_STATUS
     */
    private String quoteStatus;

    /**
     *  报价单类型 - T_QUOTE.QUOTE_TYPE
     */
    private String quoteType;

    /**
     *  报价单名称 - T_QUOTE.QUOTE_NAME
     */
    private String quoteName;

    /**
     *  客户订单号 - T_QUOTE.CUST_SO_NO
     */
    private String custSoNo;

    /**
     *  跟单员ID - T_QUOTE.MERCHER_ID
     */
    private Long mercherId;

    /**
     *  销售经理ID - T_QUOTE.SALE_MANAGER_ID
     */
    private Long saleManagerId;

    /**
     *  合同号 - T_QUOTE.CONTRACT_NO
     */
    private String contractNo;

    /**
     *  批次 - T_QUOTE.BATCH_DESC
     */
    private String batchDesc;

    /**
     *  审核人ID - T_QUOTE.APPRER_ID
     */
    private Long apprerId;

    /**
     *  审核日期 - T_QUOTE.APPR_DATE
     */
    private Date apprDate;

    /**
     *  审核意见 - T_QUOTE.APPR_COMMENT
     */
    private String apprComment;

    /**
     *  价格审核人ID - T_QUOTE.PRICE_APPRER_ID
     */
    private Long priceApprerId;

    /**
     *  价格审核日期 - T_QUOTE.PRICE_APPR_DATE
     */
    private Date priceApprDate;

    /**
     *  价格审核意见 - T_QUOTE.PRICE_APPR_COMMENT
     */
    private String priceApprComment;

    /**
     *  价格计算日期 - T_QUOTE.PRICE_CALC_DATE
     */
    private Date priceCalcDate;

    /**
     *  本币币种 - T_QUOTE.HOME_CURR_CODE
     */
    private String homeCurrCode;

    /**
     *  外币币种 - T_QUOTE.FORE_CURR_CODE
     */
    private String foreCurrCode;

    /**
     *  汇率 - T_QUOTE.CURR_RATE
     */
    private BigDecimal currRate;

    /**
     *  本币金额 - T_QUOTE.AMT
     */
    private BigDecimal amt;

    /**
     *  外币金额 - T_QUOTE.CURR_AMT
     */
    private BigDecimal currAmt;

    /**
     *  是否绿色印刷 0-否，1-是 - T_QUOTE.GREEN_FLAG
     */
    private Short greenFlag;

    /**
     *  是否保密 - T_QUOTE.SECRET_FLAG
     */
    private Short secretFlag;

    /**
     *  特殊要求说明 - T_QUOTE.SPECIAL_REMARK
     */
    private String specialRemark;

    /**
     *  送货地址ID - T_QUOTE.DELI_ADDR_ID
     */
    private Long deliAddrId;

    /**
     *  交货地点描述 - T_QUOTE.DELI_ADDR_DESC
     */
    private String deliAddrDesc;

    /**
     *  送货联系人ID - T_QUOTE.DELI_CONT_ID
     */
    private Long deliContId;

    /**
     *  送货联系人 - T_QUOTE.DELI_CONT_DESC
     */
    private String deliContDesc;

    /**
     *  交货方式 - T_QUOTE.DELI_METHOD
     */
    private String deliMethod;

    /**
     *  印加比率 - T_QUOTE.PRINT_ADDUP_RATIO
     */
    private BigDecimal printAddupRatio;

    /**
     *  装加比率 - T_QUOTE.BIND_ADDUP_RATIO
     */
    private BigDecimal bindAddupRatio;

    /**
     *  产品描述 - T_QUOTE.PROD_DESC
     */
    private String prodDesc;

    /**
     *  版本号描述 - T_QUOTE.VERSION
     */
    private String version;

    /**
     *  备注 - T_QUOTE.REMARK
     */
    private String remark;

    /**
     *  预留MCUID1 - T_QUOTE.URC_MCU1
     */
    private Long urcMcu1;

    /**
     *  预留MCUID2 - T_QUOTE.URC_MCU2
     */
    private Long urcMcu2;

    /**
     *  预留MCUID3 - T_QUOTE.URC_MCU3
     */
    private Long urcMcu3;

    /**
     *  预留状态1 - T_QUOTE.URC_STATUS1
     */
    private String urcStatus1;

    /**
     *  预留状态2 - T_QUOTE.URC_STATUS2
     */
    private String urcStatus2;

    /**
     *  预留状态3 - T_QUOTE.URC_STATUS3
     */
    private String urcStatus3;

    /**
     *  预留字符串1 - T_QUOTE.URC_C1
     */
    private String urcC1;

    /**
     *  预留字符串2 - T_QUOTE.URC_C2
     */
    private String urcC2;

    /**
     *  预留字符串3 - T_QUOTE.URC_C3
     */
    private String urcC3;

    /**
     *  预留字符串4 - T_QUOTE.URC_C4
     */
    private String urcC4;

    /**
     *  预留字符串5 - T_QUOTE.URC_C5
     */
    private String urcC5;

    /**
     *  预留日期1 - T_QUOTE.URC_D1
     */
    private Date urcD1;

    /**
     *  预留日期2 - T_QUOTE.URC_D2
     */
    private Date urcD2;

    /**
     *  预留日期3 - T_QUOTE.URC_D3
     */
    private Date urcD3;

    /**
     *  预留数字1 - T_QUOTE.URC_N1
     */
    private BigDecimal urcN1;

    /**
     *  预留数字2 - T_QUOTE.URC_N2
     */
    private BigDecimal urcN2;

    /**
     *  预留数字3 - T_QUOTE.URC_N3
     */
    private BigDecimal urcN3;

    /**
     *  预留数字4 - T_QUOTE.URC_N4
     */
    private BigDecimal urcN4;

    /**
     *  预留数字5 - T_QUOTE.URC_N5
     */
    private BigDecimal urcN5;

    /**
     *  锁定人ID - T_QUOTE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_QUOTE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_QUOTE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_QUOTE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_QUOTE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_QUOTE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_QUOTE.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOuId() {
        return ouId;
    }

    public void setOuId(Long ouId) {
        this.ouId = ouId;
    }

    public Long getMcuId() {
        return mcuId;
    }

    public void setMcuId(Long mcuId) {
        this.mcuId = mcuId;
    }

    public String getQuoteNo() {
        return quoteNo;
    }

    public void setQuoteNo(String quoteNo) {
        this.quoteNo = quoteNo;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getManuDueDate() {
        return manuDueDate;
    }

    public void setManuDueDate(Date manuDueDate) {
        this.manuDueDate = manuDueDate;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Date getQuoteDate() {
        return quoteDate;
    }

    public void setQuoteDate(Date quoteDate) {
        this.quoteDate = quoteDate;
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public String getQuoteStatus() {
        return quoteStatus;
    }

    public void setQuoteStatus(String quoteStatus) {
        this.quoteStatus = quoteStatus;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public String getCustSoNo() {
        return custSoNo;
    }

    public void setCustSoNo(String custSoNo) {
        this.custSoNo = custSoNo;
    }

    public Long getMercherId() {
        return mercherId;
    }

    public void setMercherId(Long mercherId) {
        this.mercherId = mercherId;
    }

    public Long getSaleManagerId() {
        return saleManagerId;
    }

    public void setSaleManagerId(Long saleManagerId) {
        this.saleManagerId = saleManagerId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getBatchDesc() {
        return batchDesc;
    }

    public void setBatchDesc(String batchDesc) {
        this.batchDesc = batchDesc;
    }

    public Long getApprerId() {
        return apprerId;
    }

    public void setApprerId(Long apprerId) {
        this.apprerId = apprerId;
    }

    public Date getApprDate() {
        return apprDate;
    }

    public void setApprDate(Date apprDate) {
        this.apprDate = apprDate;
    }

    public String getApprComment() {
        return apprComment;
    }

    public void setApprComment(String apprComment) {
        this.apprComment = apprComment;
    }

    public Long getPriceApprerId() {
        return priceApprerId;
    }

    public void setPriceApprerId(Long priceApprerId) {
        this.priceApprerId = priceApprerId;
    }

    public Date getPriceApprDate() {
        return priceApprDate;
    }

    public void setPriceApprDate(Date priceApprDate) {
        this.priceApprDate = priceApprDate;
    }

    public String getPriceApprComment() {
        return priceApprComment;
    }

    public void setPriceApprComment(String priceApprComment) {
        this.priceApprComment = priceApprComment;
    }

    public Date getPriceCalcDate() {
        return priceCalcDate;
    }

    public void setPriceCalcDate(Date priceCalcDate) {
        this.priceCalcDate = priceCalcDate;
    }

    public String getHomeCurrCode() {
        return homeCurrCode;
    }

    public void setHomeCurrCode(String homeCurrCode) {
        this.homeCurrCode = homeCurrCode;
    }

    public String getForeCurrCode() {
        return foreCurrCode;
    }

    public void setForeCurrCode(String foreCurrCode) {
        this.foreCurrCode = foreCurrCode;
    }

    public BigDecimal getCurrRate() {
        return currRate;
    }

    public void setCurrRate(BigDecimal currRate) {
        this.currRate = currRate;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getCurrAmt() {
        return currAmt;
    }

    public void setCurrAmt(BigDecimal currAmt) {
        this.currAmt = currAmt;
    }

    public Short getGreenFlag() {
        return greenFlag;
    }

    public void setGreenFlag(Short greenFlag) {
        this.greenFlag = greenFlag;
    }

    public Short getSecretFlag() {
        return secretFlag;
    }

    public void setSecretFlag(Short secretFlag) {
        this.secretFlag = secretFlag;
    }

    public String getSpecialRemark() {
        return specialRemark;
    }

    public void setSpecialRemark(String specialRemark) {
        this.specialRemark = specialRemark;
    }

    public Long getDeliAddrId() {
        return deliAddrId;
    }

    public void setDeliAddrId(Long deliAddrId) {
        this.deliAddrId = deliAddrId;
    }

    public String getDeliAddrDesc() {
        return deliAddrDesc;
    }

    public void setDeliAddrDesc(String deliAddrDesc) {
        this.deliAddrDesc = deliAddrDesc;
    }

    public Long getDeliContId() {
        return deliContId;
    }

    public void setDeliContId(Long deliContId) {
        this.deliContId = deliContId;
    }

    public String getDeliContDesc() {
        return deliContDesc;
    }

    public void setDeliContDesc(String deliContDesc) {
        this.deliContDesc = deliContDesc;
    }

    public String getDeliMethod() {
        return deliMethod;
    }

    public void setDeliMethod(String deliMethod) {
        this.deliMethod = deliMethod;
    }

    public BigDecimal getPrintAddupRatio() {
        return printAddupRatio;
    }

    public void setPrintAddupRatio(BigDecimal printAddupRatio) {
        this.printAddupRatio = printAddupRatio;
    }

    public BigDecimal getBindAddupRatio() {
        return bindAddupRatio;
    }

    public void setBindAddupRatio(BigDecimal bindAddupRatio) {
        this.bindAddupRatio = bindAddupRatio;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getUrcMcu1() {
        return urcMcu1;
    }

    public void setUrcMcu1(Long urcMcu1) {
        this.urcMcu1 = urcMcu1;
    }

    public Long getUrcMcu2() {
        return urcMcu2;
    }

    public void setUrcMcu2(Long urcMcu2) {
        this.urcMcu2 = urcMcu2;
    }

    public Long getUrcMcu3() {
        return urcMcu3;
    }

    public void setUrcMcu3(Long urcMcu3) {
        this.urcMcu3 = urcMcu3;
    }

    public String getUrcStatus1() {
        return urcStatus1;
    }

    public void setUrcStatus1(String urcStatus1) {
        this.urcStatus1 = urcStatus1;
    }

    public String getUrcStatus2() {
        return urcStatus2;
    }

    public void setUrcStatus2(String urcStatus2) {
        this.urcStatus2 = urcStatus2;
    }

    public String getUrcStatus3() {
        return urcStatus3;
    }

    public void setUrcStatus3(String urcStatus3) {
        this.urcStatus3 = urcStatus3;
    }

    public String getUrcC1() {
        return urcC1;
    }

    public void setUrcC1(String urcC1) {
        this.urcC1 = urcC1;
    }

    public String getUrcC2() {
        return urcC2;
    }

    public void setUrcC2(String urcC2) {
        this.urcC2 = urcC2;
    }

    public String getUrcC3() {
        return urcC3;
    }

    public void setUrcC3(String urcC3) {
        this.urcC3 = urcC3;
    }

    public String getUrcC4() {
        return urcC4;
    }

    public void setUrcC4(String urcC4) {
        this.urcC4 = urcC4;
    }

    public String getUrcC5() {
        return urcC5;
    }

    public void setUrcC5(String urcC5) {
        this.urcC5 = urcC5;
    }

    public Date getUrcD1() {
        return urcD1;
    }

    public void setUrcD1(Date urcD1) {
        this.urcD1 = urcD1;
    }

    public Date getUrcD2() {
        return urcD2;
    }

    public void setUrcD2(Date urcD2) {
        this.urcD2 = urcD2;
    }

    public Date getUrcD3() {
        return urcD3;
    }

    public void setUrcD3(Date urcD3) {
        this.urcD3 = urcD3;
    }

    public BigDecimal getUrcN1() {
        return urcN1;
    }

    public void setUrcN1(BigDecimal urcN1) {
        this.urcN1 = urcN1;
    }

    public BigDecimal getUrcN2() {
        return urcN2;
    }

    public void setUrcN2(BigDecimal urcN2) {
        this.urcN2 = urcN2;
    }

    public BigDecimal getUrcN3() {
        return urcN3;
    }

    public void setUrcN3(BigDecimal urcN3) {
        this.urcN3 = urcN3;
    }

    public BigDecimal getUrcN4() {
        return urcN4;
    }

    public void setUrcN4(BigDecimal urcN4) {
        this.urcN4 = urcN4;
    }

    public BigDecimal getUrcN5() {
        return urcN5;
    }

    public void setUrcN5(BigDecimal urcN5) {
        this.urcN5 = urcN5;
    }

    public Long getLockerId() {
        return lockerId;
    }

    public void setLockerId(Long lockerId) {
        this.lockerId = lockerId;
    }

    public Date getLockTs() {
        return lockTs;
    }

    public void setLockTs(Date lockTs) {
        this.lockTs = lockTs;
    }

    public Long getModifyerId() {
        return modifyerId;
    }

    public void setModifyerId(Long modifyerId) {
        this.modifyerId = modifyerId;
    }

    public Date getModifyTs() {
        return modifyTs;
    }

    public void setModifyTs(Date modifyTs) {
        this.modifyTs = modifyTs;
    }

    public String getModifyAppsvr() {
        return modifyAppsvr;
    }

    public void setModifyAppsvr(String modifyAppsvr) {
        this.modifyAppsvr = modifyAppsvr;
    }

    public String getModifyModule() {
        return modifyModule;
    }

    public void setModifyModule(String modifyModule) {
        this.modifyModule = modifyModule;
    }

    public Long getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Long dataVersion) {
        this.dataVersion = dataVersion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ouId=").append(ouId);
        sb.append(", mcuId=").append(mcuId);
        sb.append(", quoteNo=").append(quoteNo);
        sb.append(", custId=").append(custId);
        sb.append(", dueDate=").append(dueDate);
        sb.append(", manuDueDate=").append(manuDueDate);
        sb.append(", agentId=").append(agentId);
        sb.append(", quoteDate=").append(quoteDate);
        sb.append(", effectDate=").append(effectDate);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", paymentTerms=").append(paymentTerms);
        sb.append(", quoteStatus=").append(quoteStatus);
        sb.append(", quoteType=").append(quoteType);
        sb.append(", quoteName=").append(quoteName);
        sb.append(", custSoNo=").append(custSoNo);
        sb.append(", mercherId=").append(mercherId);
        sb.append(", saleManagerId=").append(saleManagerId);
        sb.append(", contractNo=").append(contractNo);
        sb.append(", batchDesc=").append(batchDesc);
        sb.append(", apprerId=").append(apprerId);
        sb.append(", apprDate=").append(apprDate);
        sb.append(", apprComment=").append(apprComment);
        sb.append(", priceApprerId=").append(priceApprerId);
        sb.append(", priceApprDate=").append(priceApprDate);
        sb.append(", priceApprComment=").append(priceApprComment);
        sb.append(", priceCalcDate=").append(priceCalcDate);
        sb.append(", homeCurrCode=").append(homeCurrCode);
        sb.append(", foreCurrCode=").append(foreCurrCode);
        sb.append(", currRate=").append(currRate);
        sb.append(", amt=").append(amt);
        sb.append(", currAmt=").append(currAmt);
        sb.append(", greenFlag=").append(greenFlag);
        sb.append(", secretFlag=").append(secretFlag);
        sb.append(", specialRemark=").append(specialRemark);
        sb.append(", deliAddrId=").append(deliAddrId);
        sb.append(", deliAddrDesc=").append(deliAddrDesc);
        sb.append(", deliContId=").append(deliContId);
        sb.append(", deliContDesc=").append(deliContDesc);
        sb.append(", deliMethod=").append(deliMethod);
        sb.append(", printAddupRatio=").append(printAddupRatio);
        sb.append(", bindAddupRatio=").append(bindAddupRatio);
        sb.append(", prodDesc=").append(prodDesc);
        sb.append(", version=").append(version);
        sb.append(", remark=").append(remark);
        sb.append(", urcMcu1=").append(urcMcu1);
        sb.append(", urcMcu2=").append(urcMcu2);
        sb.append(", urcMcu3=").append(urcMcu3);
        sb.append(", urcStatus1=").append(urcStatus1);
        sb.append(", urcStatus2=").append(urcStatus2);
        sb.append(", urcStatus3=").append(urcStatus3);
        sb.append(", urcC1=").append(urcC1);
        sb.append(", urcC2=").append(urcC2);
        sb.append(", urcC3=").append(urcC3);
        sb.append(", urcC4=").append(urcC4);
        sb.append(", urcC5=").append(urcC5);
        sb.append(", urcD1=").append(urcD1);
        sb.append(", urcD2=").append(urcD2);
        sb.append(", urcD3=").append(urcD3);
        sb.append(", urcN1=").append(urcN1);
        sb.append(", urcN2=").append(urcN2);
        sb.append(", urcN3=").append(urcN3);
        sb.append(", urcN4=").append(urcN4);
        sb.append(", urcN5=").append(urcN5);
        sb.append(", lockerId=").append(lockerId);
        sb.append(", lockTs=").append(lockTs);
        sb.append(", modifyerId=").append(modifyerId);
        sb.append(", modifyTs=").append(modifyTs);
        sb.append(", modifyAppsvr=").append(modifyAppsvr);
        sb.append(", modifyModule=").append(modifyModule);
        sb.append(", dataVersion=").append(dataVersion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public void setAudit(DbAudit audit) {
        this.modifyerId = audit.getUserId();
        this.modifyModule = audit.getProgId();
        this.modifyAppsvr = audit.getNodeId();
    }
}