package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TWh implements Serializable {
    /**
     *  null - T_WH.ID
     */
    private Long id;

    /**
     *  公司ID - T_WH.OU_ID
     */
    private Long ouId;

    /**
     *  null - T_WH.MCU_ID
     */
    private Long mcuId;

    /**
     *  地址号 - T_WH.ADDR_NO
     */
    private Long addrNo;

    /**
     *  编号 - T_WH.WH_CODE
     */
    private String whCode;

    /**
     *  名称 - T_WH.WH_NAME
     */
    private String whName;

    /**
     *  类型 - T_WH.WH_TYPE
     */
    private String whType;

    /**
     *  锁定人ID - T_WH.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_WH.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_WH.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_WH.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_WH.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_WH.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_WH.DATA_VERSION
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

    public Long getAddrNo() {
        return addrNo;
    }

    public void setAddrNo(Long addrNo) {
        this.addrNo = addrNo;
    }

    public String getWhCode() {
        return whCode;
    }

    public void setWhCode(String whCode) {
        this.whCode = whCode;
    }

    public String getWhName() {
        return whName;
    }

    public void setWhName(String whName) {
        this.whName = whName;
    }

    public String getWhType() {
        return whType;
    }

    public void setWhType(String whType) {
        this.whType = whType;
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
        sb.append(", addrNo=").append(addrNo);
        sb.append(", whCode=").append(whCode);
        sb.append(", whName=").append(whName);
        sb.append(", whType=").append(whType);
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