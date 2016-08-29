package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TFactRelate implements Serializable {
    /**
     *  null - T_FACT_RELATE.ID
     */
    private Long id;

    /**
     *  工厂ID 对应T_FACTORY.ID - T_FACT_RELATE.FACT_ID
     */
    private Long factId;

    /**
     *  分单中心ID 对应T_OU.ID - T_FACT_RELATE.OU_ID
     */
    private Long ouId;

    /**
     *  分单中心编号 对应T_OU.ID - T_FACT_RELATE.OU_CODE
     */
    private String ouCode;

    /**
     *  生产质量等级 A/B/C - T_FACT_RELATE.QUALIFY_LEVEL
     */
    private String qualifyLevel;

    /**
     *  印刷难度等级 A/B/C - T_FACT_RELATE.PRINT_DIFF_LEVEL
     */
    private String printDiffLevel;

    /**
     *  装订难度等级 A/B/C - T_FACT_RELATE.BIND_DIFF_LEVEL
     */
    private String bindDiffLevel;

    /**
     *  工厂状态 有效/无效 - T_FACT_RELATE.FACT_STATUS
     */
    private String factStatus;

    /**
     *  调度员联系人行号 - T_FACT_RELATE.SCHEDULER_LINE_NO
     */
    private BigDecimal schedulerLineNo;

    /**
     *  准时交付率 - T_FACT_RELATE.ONTIME_RATE
     */
    private BigDecimal ontimeRate;

    /**
     *  合作开始日期 - T_FACT_RELATE.VALID_FROM
     */
    private Date validFrom;

    /**
     *  合作到期日期 - T_FACT_RELATE.VALID_TO
     */
    private Date validTo;

    /**
     *  锁定人ID - T_FACT_RELATE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_FACT_RELATE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_FACT_RELATE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_FACT_RELATE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_FACT_RELATE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_FACT_RELATE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_FACT_RELATE.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFactId() {
        return factId;
    }

    public void setFactId(Long factId) {
        this.factId = factId;
    }

    public Long getOuId() {
        return ouId;
    }

    public void setOuId(Long ouId) {
        this.ouId = ouId;
    }

    public String getOuCode() {
        return ouCode;
    }

    public void setOuCode(String ouCode) {
        this.ouCode = ouCode;
    }

    public String getQualifyLevel() {
        return qualifyLevel;
    }

    public void setQualifyLevel(String qualifyLevel) {
        this.qualifyLevel = qualifyLevel;
    }

    public String getPrintDiffLevel() {
        return printDiffLevel;
    }

    public void setPrintDiffLevel(String printDiffLevel) {
        this.printDiffLevel = printDiffLevel;
    }

    public String getBindDiffLevel() {
        return bindDiffLevel;
    }

    public void setBindDiffLevel(String bindDiffLevel) {
        this.bindDiffLevel = bindDiffLevel;
    }

    public String getFactStatus() {
        return factStatus;
    }

    public void setFactStatus(String factStatus) {
        this.factStatus = factStatus;
    }

    public BigDecimal getSchedulerLineNo() {
        return schedulerLineNo;
    }

    public void setSchedulerLineNo(BigDecimal schedulerLineNo) {
        this.schedulerLineNo = schedulerLineNo;
    }

    public BigDecimal getOntimeRate() {
        return ontimeRate;
    }

    public void setOntimeRate(BigDecimal ontimeRate) {
        this.ontimeRate = ontimeRate;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
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
        sb.append(", factId=").append(factId);
        sb.append(", ouId=").append(ouId);
        sb.append(", ouCode=").append(ouCode);
        sb.append(", qualifyLevel=").append(qualifyLevel);
        sb.append(", printDiffLevel=").append(printDiffLevel);
        sb.append(", bindDiffLevel=").append(bindDiffLevel);
        sb.append(", factStatus=").append(factStatus);
        sb.append(", schedulerLineNo=").append(schedulerLineNo);
        sb.append(", ontimeRate=").append(ontimeRate);
        sb.append(", validFrom=").append(validFrom);
        sb.append(", validTo=").append(validTo);
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