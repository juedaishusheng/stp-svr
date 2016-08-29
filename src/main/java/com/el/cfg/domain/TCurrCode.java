package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TCurrCode implements Serializable {
    /**
     *  null - T_CURR_CODE.ID
     */
    private Long id;

    /**
     *  null - T_CURR_CODE.OU_ID
     */
    private Long ouId;

    /**
     *  null - T_CURR_CODE.MCU_ID
     */
    private Long mcuId;

    /**
     *  币种 - T_CURR_CODE.CURR_CODE
     */
    private String currCode;

    /**
     *  名称 - T_CURR_CODE.CURR_NAME
     */
    private String currName;

    /**
     *  显示小数位数 - T_CURR_CODE.CURR_DISP_DECIMAL
     */
    private Short currDispDecimal;

    /**
     *  锁定人ID - T_CURR_CODE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_CURR_CODE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_CURR_CODE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_CURR_CODE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_CURR_CODE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_CURR_CODE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_CURR_CODE.DATA_VERSION
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

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public String getCurrName() {
        return currName;
    }

    public void setCurrName(String currName) {
        this.currName = currName;
    }

    public Short getCurrDispDecimal() {
        return currDispDecimal;
    }

    public void setCurrDispDecimal(Short currDispDecimal) {
        this.currDispDecimal = currDispDecimal;
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
        sb.append(", currCode=").append(currCode);
        sb.append(", currName=").append(currName);
        sb.append(", currDispDecimal=").append(currDispDecimal);
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