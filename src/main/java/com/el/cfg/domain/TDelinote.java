package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TDelinote implements Serializable {
    /**
     *  null - T_DELINOTE.ID
     */
    private Long id;

    /**
     *  公司ID - T_DELINOTE.OU_ID
     */
    private Long ouId;

    /**
     *  MCUID - T_DELINOTE.MCU_ID
     */
    private Long mcuId;

    /**
     *  工厂ID - T_DELINOTE.FACT_ID
     */
    private Long factId;

    /**
     *  单号 - T_DELINOTE.DOC_NO
     */
    private String docNo;

    /**
     *  类型 - T_DELINOTE.DOC_TYPE
     */
    private String docType;

    /**
     *  单据日期 - T_DELINOTE.DOC_DATE
     */
    private Date docDate;

    /**
     *  备注 - T_DELINOTE.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_DELINOTE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_DELINOTE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_DELINOTE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_DELINOTE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_DELINOTE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_DELINOTE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_DELINOTE.DATA_VERSION
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

    public Long getFactId() {
        return factId;
    }

    public void setFactId(Long factId) {
        this.factId = factId;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        sb.append(", factId=").append(factId);
        sb.append(", docNo=").append(docNo);
        sb.append(", docType=").append(docType);
        sb.append(", docDate=").append(docDate);
        sb.append(", remark=").append(remark);
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