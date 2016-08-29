package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TProdHistory implements Serializable {
    /**
     *  null - T_PROD_HISTORY.ID
     */
    private Long id;

    /**
     *  产品变更表ID - T_PROD_HISTORY.PROD_MODIFY_ID
     */
    private Long prodModifyId;

    /**
     *  变更内容类型 - T_PROD_HISTORY.CONTENT_TYPE
     */
    private String contentType;

    /**
     *  锁定人ID - T_PROD_HISTORY.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PROD_HISTORY.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PROD_HISTORY.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PROD_HISTORY.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PROD_HISTORY.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PROD_HISTORY.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PROD_HISTORY.DATA_VERSION
     */
    private Long dataVersion;

    /**
     *  变更内容快照 - T_PROD_HISTORY.CONTENT_SNAPSHOT
     */
    private String contentSnapshot;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProdModifyId() {
        return prodModifyId;
    }

    public void setProdModifyId(Long prodModifyId) {
        this.prodModifyId = prodModifyId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
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

    public String getContentSnapshot() {
        return contentSnapshot;
    }

    public void setContentSnapshot(String contentSnapshot) {
        this.contentSnapshot = contentSnapshot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prodModifyId=").append(prodModifyId);
        sb.append(", contentType=").append(contentType);
        sb.append(", lockerId=").append(lockerId);
        sb.append(", lockTs=").append(lockTs);
        sb.append(", modifyerId=").append(modifyerId);
        sb.append(", modifyTs=").append(modifyTs);
        sb.append(", modifyAppsvr=").append(modifyAppsvr);
        sb.append(", modifyModule=").append(modifyModule);
        sb.append(", dataVersion=").append(dataVersion);
        sb.append(", contentSnapshot=").append(contentSnapshot);
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