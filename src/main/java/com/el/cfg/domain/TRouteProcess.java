package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TRouteProcess implements Serializable {
    /**
     *  null - T_ROUTE_PROCESS.ID
     */
    private Long id;

    /**
     *  工艺ID - T_ROUTE_PROCESS.ROUTE_ID
     */
    private Long routeId;

    /**
     *  顺序号 - T_ROUTE_PROCESS.SORT_NO
     */
    private BigDecimal sortNo;

    /**
     *  工序ID - T_ROUTE_PROCESS.PROCESS_ID
     */
    private Long processId;

    /**
     *  下道工序顺序号 - T_ROUTE_PROCESS.NEXT_NO
     */
    private BigDecimal nextNo;

    /**
     *  锁定人ID - T_ROUTE_PROCESS.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_ROUTE_PROCESS.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_ROUTE_PROCESS.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_ROUTE_PROCESS.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_ROUTE_PROCESS.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_ROUTE_PROCESS.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_ROUTE_PROCESS.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public BigDecimal getSortNo() {
        return sortNo;
    }

    public void setSortNo(BigDecimal sortNo) {
        this.sortNo = sortNo;
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public BigDecimal getNextNo() {
        return nextNo;
    }

    public void setNextNo(BigDecimal nextNo) {
        this.nextNo = nextNo;
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
        sb.append(", routeId=").append(routeId);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", processId=").append(processId);
        sb.append(", nextNo=").append(nextNo);
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