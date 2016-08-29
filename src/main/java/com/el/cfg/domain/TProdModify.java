package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TProdModify implements Serializable {
    /**
     *  null - T_PROD_MODIFY.ID
     */
    private Long id;

    /**
     *  公司ID - T_PROD_MODIFY.OU_ID
     */
    private Long ouId;

    /**
     *  产品ID - T_PROD_MODIFY.PROD_ID
     */
    private Long prodId;

    /**
     *  变更类型 - T_PROD_MODIFY.MODIFY_TYPE
     */
    private String modifyType;

    /**
     *  变更时间 - T_PROD_MODIFY.MODIFY_DATE
     */
    private Date modifyDate;

    /**
     *  变更人ID - T_PROD_MODIFY.MODIFY_USER_ID
     */
    private Long modifyUserId;

    /**
     *  变更内容描述 - T_PROD_MODIFY.MODIFY_DESC
     */
    private String modifyDesc;

    /**
     *  锁定人ID - T_PROD_MODIFY.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PROD_MODIFY.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PROD_MODIFY.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PROD_MODIFY.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PROD_MODIFY.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PROD_MODIFY.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PROD_MODIFY.DATA_VERSION
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

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getModifyType() {
        return modifyType;
    }

    public void setModifyType(String modifyType) {
        this.modifyType = modifyType;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public String getModifyDesc() {
        return modifyDesc;
    }

    public void setModifyDesc(String modifyDesc) {
        this.modifyDesc = modifyDesc;
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
        sb.append(", prodId=").append(prodId);
        sb.append(", modifyType=").append(modifyType);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", modifyUserId=").append(modifyUserId);
        sb.append(", modifyDesc=").append(modifyDesc);
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