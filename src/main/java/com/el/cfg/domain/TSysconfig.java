package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TSysconfig implements Serializable {
    /**
     *  null - T_SYSCONFIG.ID
     */
    private Long id;

    /**
     *  编号 - T_SYSCONFIG.CONF_CODE
     */
    private String confCode;

    /**
     *  名称 - T_SYSCONFIG.CONF_NAME
     */
    private String confName;

    /**
     *  类型 系统/OU/个人 - T_SYSCONFIG.CONF_TYPE
     */
    private String confType;

    /**
     *  描述 - T_SYSCONFIG.CONF_DESC
     */
    private String confDesc;

    /**
     *  值 - T_SYSCONFIG.CONF_VALUE
     */
    private String confValue;

    /**
     *  适用于类型=OU时 - T_SYSCONFIG.OU_ID
     */
    private Long ouId;

    /**
     *  适用于类型=个人时 - T_SYSCONFIG.USER_ID
     */
    private Long userId;

    /**
     *  锁定人ID - T_SYSCONFIG.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_SYSCONFIG.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_SYSCONFIG.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_SYSCONFIG.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_SYSCONFIG.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_SYSCONFIG.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_SYSCONFIG.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConfCode() {
        return confCode;
    }

    public void setConfCode(String confCode) {
        this.confCode = confCode;
    }

    public String getConfName() {
        return confName;
    }

    public void setConfName(String confName) {
        this.confName = confName;
    }

    public String getConfType() {
        return confType;
    }

    public void setConfType(String confType) {
        this.confType = confType;
    }

    public String getConfDesc() {
        return confDesc;
    }

    public void setConfDesc(String confDesc) {
        this.confDesc = confDesc;
    }

    public String getConfValue() {
        return confValue;
    }

    public void setConfValue(String confValue) {
        this.confValue = confValue;
    }

    public Long getOuId() {
        return ouId;
    }

    public void setOuId(Long ouId) {
        this.ouId = ouId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
        sb.append(", confCode=").append(confCode);
        sb.append(", confName=").append(confName);
        sb.append(", confType=").append(confType);
        sb.append(", confDesc=").append(confDesc);
        sb.append(", confValue=").append(confValue);
        sb.append(", ouId=").append(ouId);
        sb.append(", userId=").append(userId);
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