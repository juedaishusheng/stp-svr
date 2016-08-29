package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TStduomRate implements Serializable {
    /**
     *  null - T_STDUOM_RATE.ID
     */
    private Long id;

    /**
     *  单位从 - T_STDUOM_RATE.UOM_FROM
     */
    private String uomFrom;

    /**
     *  单位到 - T_STDUOM_RATE.UOM_TO
     */
    private String uomTo;

    /**
     *  转换系数 - T_STDUOM_RATE.UOM_RATE
     */
    private BigDecimal uomRate;

    /**
     *  锁定人ID - T_STDUOM_RATE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_STDUOM_RATE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_STDUOM_RATE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_STDUOM_RATE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_STDUOM_RATE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_STDUOM_RATE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_STDUOM_RATE.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUomFrom() {
        return uomFrom;
    }

    public void setUomFrom(String uomFrom) {
        this.uomFrom = uomFrom;
    }

    public String getUomTo() {
        return uomTo;
    }

    public void setUomTo(String uomTo) {
        this.uomTo = uomTo;
    }

    public BigDecimal getUomRate() {
        return uomRate;
    }

    public void setUomRate(BigDecimal uomRate) {
        this.uomRate = uomRate;
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
        sb.append(", uomFrom=").append(uomFrom);
        sb.append(", uomTo=").append(uomTo);
        sb.append(", uomRate=").append(uomRate);
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