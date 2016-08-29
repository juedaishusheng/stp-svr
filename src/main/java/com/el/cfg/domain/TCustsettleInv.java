package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TCustsettleInv implements Serializable {
    /**
     *  null - T_CUSTSETTLE_INV.ID
     */
    private Long id;

    /**
     *  公司ID - T_CUSTSETTLE_INV.OU_ID
     */
    private Long ouId;

    /**
     *  结算单ID - T_CUSTSETTLE_INV.SETTLE_ID
     */
    private Long settleId;

    /**
     *  开票行号 - T_CUSTSETTLE_INV.LINE_NO
     */
    private BigDecimal lineNo;

    /**
     *  发票号 - T_CUSTSETTLE_INV.INV_NO
     */
    private String invNo;

    /**
     *  金税发票号 - T_CUSTSETTLE_INV.GT_INV_NO
     */
    private String gtInvNo;

    /**
     *  发票总额 - T_CUSTSETTLE_INV.INV_AMT
     */
    private BigDecimal invAmt;

    /**
     *  应税额 - T_CUSTSETTLE_INV.NET_AMT
     */
    private BigDecimal netAmt;

    /**
     *  税额 - T_CUSTSETTLE_INV.TAX_AMT
     */
    private BigDecimal taxAmt;

    /**
     *  未结金额 - T_CUSTSETTLE_INV.OPEN_AMT
     */
    private BigDecimal openAmt;

    /**
     *  到期日期 - T_CUSTSETTLE_INV.DUE_DATE
     */
    private Date dueDate;

    /**
     *  本位币 - T_CUSTSETTLE_INV.HOME_CURR
     */
    private String homeCurr;

    /**
     *  外币金额 - T_CUSTSETTLE_INV.CURR_AMT
     */
    private BigDecimal currAmt;

    /**
     *  外币未结金额 - T_CUSTSETTLE_INV.CURR_OPEN_AMT
     */
    private BigDecimal currOpenAmt;

    /**
     *  订单编号 - T_CUSTSETTLE_INV.SO_NO
     */
    private String soNo;

    /**
     *  产品编号 - T_CUSTSETTLE_INV.PROD_CODE
     */
    private String prodCode;

    /**
     *  开票日期 - T_CUSTSETTLE_INV.INV_DATE
     */
    private Date invDate;

    /**
     *  客户ID - T_CUSTSETTLE_INV.CUST_ID
     */
    private Long custId;

    /**
     *  逾期金额 - T_CUSTSETTLE_INV.OVERDUE_AMT
     */
    private BigDecimal overdueAmt;

    /**
     *  逾期天数 - T_CUSTSETTLE_INV.OVERDUE_DAYS
     */
    private Integer overdueDays;

    /**
     *  锁定人ID - T_CUSTSETTLE_INV.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_CUSTSETTLE_INV.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_CUSTSETTLE_INV.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_CUSTSETTLE_INV.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_CUSTSETTLE_INV.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_CUSTSETTLE_INV.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_CUSTSETTLE_INV.DATA_VERSION
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

    public Long getSettleId() {
        return settleId;
    }

    public void setSettleId(Long settleId) {
        this.settleId = settleId;
    }

    public BigDecimal getLineNo() {
        return lineNo;
    }

    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    public String getInvNo() {
        return invNo;
    }

    public void setInvNo(String invNo) {
        this.invNo = invNo;
    }

    public String getGtInvNo() {
        return gtInvNo;
    }

    public void setGtInvNo(String gtInvNo) {
        this.gtInvNo = gtInvNo;
    }

    public BigDecimal getInvAmt() {
        return invAmt;
    }

    public void setInvAmt(BigDecimal invAmt) {
        this.invAmt = invAmt;
    }

    public BigDecimal getNetAmt() {
        return netAmt;
    }

    public void setNetAmt(BigDecimal netAmt) {
        this.netAmt = netAmt;
    }

    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    public BigDecimal getOpenAmt() {
        return openAmt;
    }

    public void setOpenAmt(BigDecimal openAmt) {
        this.openAmt = openAmt;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getHomeCurr() {
        return homeCurr;
    }

    public void setHomeCurr(String homeCurr) {
        this.homeCurr = homeCurr;
    }

    public BigDecimal getCurrAmt() {
        return currAmt;
    }

    public void setCurrAmt(BigDecimal currAmt) {
        this.currAmt = currAmt;
    }

    public BigDecimal getCurrOpenAmt() {
        return currOpenAmt;
    }

    public void setCurrOpenAmt(BigDecimal currOpenAmt) {
        this.currOpenAmt = currOpenAmt;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public BigDecimal getOverdueAmt() {
        return overdueAmt;
    }

    public void setOverdueAmt(BigDecimal overdueAmt) {
        this.overdueAmt = overdueAmt;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
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
        sb.append(", settleId=").append(settleId);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", invNo=").append(invNo);
        sb.append(", gtInvNo=").append(gtInvNo);
        sb.append(", invAmt=").append(invAmt);
        sb.append(", netAmt=").append(netAmt);
        sb.append(", taxAmt=").append(taxAmt);
        sb.append(", openAmt=").append(openAmt);
        sb.append(", dueDate=").append(dueDate);
        sb.append(", homeCurr=").append(homeCurr);
        sb.append(", currAmt=").append(currAmt);
        sb.append(", currOpenAmt=").append(currOpenAmt);
        sb.append(", soNo=").append(soNo);
        sb.append(", prodCode=").append(prodCode);
        sb.append(", invDate=").append(invDate);
        sb.append(", custId=").append(custId);
        sb.append(", overdueAmt=").append(overdueAmt);
        sb.append(", overdueDays=").append(overdueDays);
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