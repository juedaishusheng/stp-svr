package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TUdcType implements Serializable {
    /**
     *  null - T_UDC_TYPE.ID
     */
    private Long id;

    /**
     *  对应T_OU.ID - T_UDC_TYPE.OU_ID
     */
    private Long ouId;

    /**
     *  null - T_UDC_TYPE.MCU_ID
     */
    private Long mcuId;

    /**
     *  所在模块 平台自己的以字母开头，以与JDE区分 - T_UDC_TYPE.DOMAIN_CODE
     */
    private String domainCode;

    /**
     *  类型 - T_UDC_TYPE.UDC_TYPE
     */
    private String udcType;

    /**
     *  描述 - T_UDC_TYPE.UDC_DESC
     */
    private String udcDesc;

    /**
     *  是否使用 0-否，1-是 - T_UDC_TYPE.UDC_ENABLED
     */
    private Short udcEnabled;

    /**
     *  锁定人ID - T_UDC_TYPE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_UDC_TYPE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_UDC_TYPE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_UDC_TYPE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_UDC_TYPE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_UDC_TYPE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_UDC_TYPE.DATA_VERSION
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

    public String getDomainCode() {
        return domainCode;
    }

    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }

    public String getUdcType() {
        return udcType;
    }

    public void setUdcType(String udcType) {
        this.udcType = udcType;
    }

    public String getUdcDesc() {
        return udcDesc;
    }

    public void setUdcDesc(String udcDesc) {
        this.udcDesc = udcDesc;
    }

    public Short getUdcEnabled() {
        return udcEnabled;
    }

    public void setUdcEnabled(Short udcEnabled) {
        this.udcEnabled = udcEnabled;
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
        sb.append(", domainCode=").append(domainCode);
        sb.append(", udcType=").append(udcType);
        sb.append(", udcDesc=").append(udcDesc);
        sb.append(", udcEnabled=").append(udcEnabled);
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