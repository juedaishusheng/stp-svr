package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TPoPay implements Serializable {
    /**
     *  null - T_PO_PAY.ID
     */
    private Long id;

    /**
     *  公司ID - T_PO_PAY.OU_ID
     */
    private Long ouId;

    /**
     *  印刷采购单ID - T_PO_PAY.PPO_ID
     */
    private Long ppoId;

    /**
     *  供应商编号 - T_PO_PAY.SUPP_CODE
     */
    private String suppCode;

    /**
     *  供应商名称 - T_PO_PAY.SUPP_NAME
     */
    private String suppName;

    /**
     *  付款编号 - T_PO_PAY.PAY_NO
     */
    private String payNo;

    /**
     *  行号 - T_PO_PAY.LINE_NO
     */
    private BigDecimal lineNo;

    /**
     *  采购单编号 - T_PO_PAY.PO_NO
     */
    private String poNo;

    /**
     *  付款金额 - T_PO_PAY.PAY_AMT
     */
    private BigDecimal payAmt;

    /**
     *  付款日期 - T_PO_PAY.PAY_DATE
     */
    private Date payDate;

    /**
     *  锁定人ID - T_PO_PAY.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PO_PAY.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PO_PAY.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PO_PAY.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PO_PAY.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PO_PAY.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PO_PAY.DATA_VERSION
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

    public Long getPpoId() {
        return ppoId;
    }

    public void setPpoId(Long ppoId) {
        this.ppoId = ppoId;
    }

    public String getSuppCode() {
        return suppCode;
    }

    public void setSuppCode(String suppCode) {
        this.suppCode = suppCode;
    }

    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public BigDecimal getLineNo() {
        return lineNo;
    }

    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
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
        sb.append(", ppoId=").append(ppoId);
        sb.append(", suppCode=").append(suppCode);
        sb.append(", suppName=").append(suppName);
        sb.append(", payNo=").append(payNo);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", poNo=").append(poNo);
        sb.append(", payAmt=").append(payAmt);
        sb.append(", payDate=").append(payDate);
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