package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TCustinvRecv implements Serializable {
    /**
     *  null - T_CUSTINV_RECV.ID
     */
    private Long id;

    /**
     *  公司ID - T_CUSTINV_RECV.OU_ID
     */
    private Long ouId;

    /**
     *  客户ID - T_CUSTINV_RECV.CUST_ID
     */
    private Long custId;

    /**
     *  发票表ID - T_CUSTINV_RECV.CUSTSETT_ID
     */
    private Long custsettId;

    /**
     *  行号 - T_CUSTINV_RECV.LINE_NO
     */
    private BigDecimal lineNo;

    /**
     *  收款日期 - T_CUSTINV_RECV.RECV_DATE
     */
    private Date recvDate;

    /**
     *  收款金额 - T_CUSTINV_RECV.RECV_AMT
     */
    private BigDecimal recvAmt;

    /**
     *  货币码 - T_CUSTINV_RECV.CURR_CODE
     */
    private String currCode;

    /**
     *  汇率 - T_CUSTINV_RECV.CURR_DATE
     */
    private BigDecimal currDate;

    /**
     *  外币收款金额 - T_CUSTINV_RECV.CURR_AMT
     */
    private BigDecimal currAmt;

    /**
     *  订单编号 - T_CUSTINV_RECV.SO_NO
     */
    private String soNo;

    /**
     *  付款人 - T_CUSTINV_RECV.PAYER
     */
    private String payer;

    /**
     *  发票号 - T_CUSTINV_RECV.INV_NO
     */
    private String invNo;

    /**
     *  金税发票号 - T_CUSTINV_RECV.GT_INV_NO
     */
    private String gtInvNo;

    /**
     *  收款号码 - T_CUSTINV_RECV.RECV_NO
     */
    private String recvNo;

    /**
     *  锁定人ID - T_CUSTINV_RECV.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_CUSTINV_RECV.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_CUSTINV_RECV.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_CUSTINV_RECV.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_CUSTINV_RECV.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_CUSTINV_RECV.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_CUSTINV_RECV.DATA_VERSION
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

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getCustsettId() {
        return custsettId;
    }

    public void setCustsettId(Long custsettId) {
        this.custsettId = custsettId;
    }

    public BigDecimal getLineNo() {
        return lineNo;
    }

    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    public Date getRecvDate() {
        return recvDate;
    }

    public void setRecvDate(Date recvDate) {
        this.recvDate = recvDate;
    }

    public BigDecimal getRecvAmt() {
        return recvAmt;
    }

    public void setRecvAmt(BigDecimal recvAmt) {
        this.recvAmt = recvAmt;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public BigDecimal getCurrDate() {
        return currDate;
    }

    public void setCurrDate(BigDecimal currDate) {
        this.currDate = currDate;
    }

    public BigDecimal getCurrAmt() {
        return currAmt;
    }

    public void setCurrAmt(BigDecimal currAmt) {
        this.currAmt = currAmt;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
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

    public String getRecvNo() {
        return recvNo;
    }

    public void setRecvNo(String recvNo) {
        this.recvNo = recvNo;
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
        sb.append(", custId=").append(custId);
        sb.append(", custsettId=").append(custsettId);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", recvDate=").append(recvDate);
        sb.append(", recvAmt=").append(recvAmt);
        sb.append(", currCode=").append(currCode);
        sb.append(", currDate=").append(currDate);
        sb.append(", currAmt=").append(currAmt);
        sb.append(", soNo=").append(soNo);
        sb.append(", payer=").append(payer);
        sb.append(", invNo=").append(invNo);
        sb.append(", gtInvNo=").append(gtInvNo);
        sb.append(", recvNo=").append(recvNo);
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