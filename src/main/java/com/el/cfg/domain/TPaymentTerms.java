package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TPaymentTerms implements Serializable {
    /**
     *  null - T_PAYMENT_TERMS.ID
     */
    private Long id;

    /**
     *  null - T_PAYMENT_TERMS.OU_ID
     */
    private Long ouId;

    /**
     *  null - T_PAYMENT_TERMS.MCU_ID
     */
    private Long mcuId;

    /**
     *  条款编号 - T_PAYMENT_TERMS.TERM_CODE
     */
    private String termCode;

    /**
     *  条款说明 - T_PAYMENT_TERMS.TERM_DESC
     */
    private String termDesc;

    /**
     *  折扣百分比 - T_PAYMENT_TERMS.DISC_PERCENT
     */
    private BigDecimal discPercent;

    /**
     *  折扣天数 - T_PAYMENT_TERMS.DISC_DAYS
     */
    private Short discDays;

    /**
     *  付款净天数 - T_PAYMENT_TERMS.NET_DAYS
     */
    private Short netDays;

    /**
     *  到期日期 - T_PAYMENT_TERMS.DUE_DATE
     */
    private Date dueDate;

    /**
     *  分割次数 - T_PAYMENT_TERMS.SPLIT_NUM
     */
    private Short splitNum;

    /**
     *  帐龄付款天数 - T_PAYMENT_TERMS.AGING_DAYS
     */
    private Short agingDays;

    /**
     *  有效利率 - T_PAYMENT_TERMS.INTEREST_RATE
     */
    private BigDecimal interestRate;

    /**
     *  最近日期月份 - T_PAYMENT_TERMS.PROX_DATE_MONTH
     */
    private Short proxDateMonth;

    /**
     *  大致日期天数 - T_PAYMENT_TERMS.PROX_DATE_DAY
     */
    private Short proxDateDay;

    /**
     *  锁定人ID - T_PAYMENT_TERMS.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PAYMENT_TERMS.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PAYMENT_TERMS.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PAYMENT_TERMS.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PAYMENT_TERMS.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PAYMENT_TERMS.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PAYMENT_TERMS.DATA_VERSION
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

    public String getTermCode() {
        return termCode;
    }

    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public String getTermDesc() {
        return termDesc;
    }

    public void setTermDesc(String termDesc) {
        this.termDesc = termDesc;
    }

    public BigDecimal getDiscPercent() {
        return discPercent;
    }

    public void setDiscPercent(BigDecimal discPercent) {
        this.discPercent = discPercent;
    }

    public Short getDiscDays() {
        return discDays;
    }

    public void setDiscDays(Short discDays) {
        this.discDays = discDays;
    }

    public Short getNetDays() {
        return netDays;
    }

    public void setNetDays(Short netDays) {
        this.netDays = netDays;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Short getSplitNum() {
        return splitNum;
    }

    public void setSplitNum(Short splitNum) {
        this.splitNum = splitNum;
    }

    public Short getAgingDays() {
        return agingDays;
    }

    public void setAgingDays(Short agingDays) {
        this.agingDays = agingDays;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public Short getProxDateMonth() {
        return proxDateMonth;
    }

    public void setProxDateMonth(Short proxDateMonth) {
        this.proxDateMonth = proxDateMonth;
    }

    public Short getProxDateDay() {
        return proxDateDay;
    }

    public void setProxDateDay(Short proxDateDay) {
        this.proxDateDay = proxDateDay;
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
        sb.append(", termCode=").append(termCode);
        sb.append(", termDesc=").append(termDesc);
        sb.append(", discPercent=").append(discPercent);
        sb.append(", discDays=").append(discDays);
        sb.append(", netDays=").append(netDays);
        sb.append(", dueDate=").append(dueDate);
        sb.append(", splitNum=").append(splitNum);
        sb.append(", agingDays=").append(agingDays);
        sb.append(", interestRate=").append(interestRate);
        sb.append(", proxDateMonth=").append(proxDateMonth);
        sb.append(", proxDateDay=").append(proxDateDay);
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