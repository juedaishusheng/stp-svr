package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TProdRoute implements Serializable {
    /**
     *  null - T_PROD_ROUTE.ID
     */
    private Long id;

    /**
     *  产品ID - T_PROD_ROUTE.PROD_ID
     */
    private Long prodId;

    /**
     *  序号 - T_PROD_ROUTE.ROUTE_SORTNO
     */
    private Long routeSortno;

    /**
     *  工艺ID 来自工艺主数据表，可不填 - T_PROD_ROUTE.ROUTE_ID
     */
    private Long routeId;

    /**
     *  工艺段说明 - T_PROD_ROUTE.ROUTE_DESC
     */
    private String routeDesc;

    /**
     *  下道工艺段序号 - T_PROD_ROUTE.NEXT_SORTNO
     */
    private Long nextSortno;

    /**
     *  对应部件ID 可不填 - T_PROD_ROUTE.PART_ID
     */
    private Long partId;

    /**
     *  备注 - T_PROD_ROUTE.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_PROD_ROUTE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PROD_ROUTE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PROD_ROUTE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PROD_ROUTE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PROD_ROUTE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PROD_ROUTE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PROD_ROUTE.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Long getRouteSortno() {
        return routeSortno;
    }

    public void setRouteSortno(Long routeSortno) {
        this.routeSortno = routeSortno;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public String getRouteDesc() {
        return routeDesc;
    }

    public void setRouteDesc(String routeDesc) {
        this.routeDesc = routeDesc;
    }

    public Long getNextSortno() {
        return nextSortno;
    }

    public void setNextSortno(Long nextSortno) {
        this.nextSortno = nextSortno;
    }

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
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
        sb.append(", prodId=").append(prodId);
        sb.append(", routeSortno=").append(routeSortno);
        sb.append(", routeId=").append(routeId);
        sb.append(", routeDesc=").append(routeDesc);
        sb.append(", nextSortno=").append(nextSortno);
        sb.append(", partId=").append(partId);
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