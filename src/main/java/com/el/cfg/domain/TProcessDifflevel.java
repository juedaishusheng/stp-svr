package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TProcessDifflevel implements Serializable {
    /**
     *  null - T_PROCESS_DIFFLEVEL.ID
     */
    private Long id;

    /**
     *  公司ID - T_PROCESS_DIFFLEVEL.OU_ID
     */
    private Long ouId;

    /**
     *  工序ID - T_PROCESS_DIFFLEVEL.PROCESS_ID
     */
    private Long processId;

    /**
     *  工序编号 - T_PROCESS_DIFFLEVEL.PROCESS_CODE
     */
    private String processCode;

    /**
     *  难度等级 - T_PROCESS_DIFFLEVEL.DIFF_LEVEL
     */
    private String diffLevel;

    /**
     *  调整系数 - T_PROCESS_DIFFLEVEL.ALTER_RATIO
     */
    private BigDecimal alterRatio;

    /**
     *  备注 - T_PROCESS_DIFFLEVEL.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_PROCESS_DIFFLEVEL.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PROCESS_DIFFLEVEL.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PROCESS_DIFFLEVEL.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PROCESS_DIFFLEVEL.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PROCESS_DIFFLEVEL.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PROCESS_DIFFLEVEL.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PROCESS_DIFFLEVEL.DATA_VERSION
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

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public String getDiffLevel() {
        return diffLevel;
    }

    public void setDiffLevel(String diffLevel) {
        this.diffLevel = diffLevel;
    }

    public BigDecimal getAlterRatio() {
        return alterRatio;
    }

    public void setAlterRatio(BigDecimal alterRatio) {
        this.alterRatio = alterRatio;
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
        sb.append(", processId=").append(processId);
        sb.append(", processCode=").append(processCode);
        sb.append(", diffLevel=").append(diffLevel);
        sb.append(", alterRatio=").append(alterRatio);
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