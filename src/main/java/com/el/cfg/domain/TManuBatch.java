package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TManuBatch implements Serializable {
    /**
     *  null - T_MANU_BATCH.ID
     */
    private Long id;

    /**
     *  分单时间 - T_MANU_BATCH.DIST_DATE
     */
    private Date distDate;

    /**
     *  备注 - T_MANU_BATCH.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_MANU_BATCH.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_MANU_BATCH.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_MANU_BATCH.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_MANU_BATCH.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_MANU_BATCH.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_MANU_BATCH.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_MANU_BATCH.DATA_VERSION
     */
    private Long dataVersion;

    /**
     *  分单人ID 公司调度员ID - T_MANU_BATCH.DIST_ID
     */
    private Long distId;

    /**
     *  分单人姓名 公司调度员姓名 - T_MANU_BATCH.DIST_NAME
     */
    private String distName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDistDate() {
        return distDate;
    }

    public void setDistDate(Date distDate) {
        this.distDate = distDate;
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

    public Long getDistId() {
        return distId;
    }

    public void setDistId(Long distId) {
        this.distId = distId;
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", distDate=").append(distDate);
        sb.append(", remark=").append(remark);
        sb.append(", lockerId=").append(lockerId);
        sb.append(", lockTs=").append(lockTs);
        sb.append(", modifyerId=").append(modifyerId);
        sb.append(", modifyTs=").append(modifyTs);
        sb.append(", modifyAppsvr=").append(modifyAppsvr);
        sb.append(", modifyModule=").append(modifyModule);
        sb.append(", dataVersion=").append(dataVersion);
        sb.append(", distId=").append(distId);
        sb.append(", distName=").append(distName);
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