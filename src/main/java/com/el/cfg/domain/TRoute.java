package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TRoute implements Serializable {
    /**
     *  null - T_ROUTE.ID
     */
    private Long id;

    /**
     *  公司ID - T_ROUTE.OU_ID
     */
    private Long ouId;

    /**
     *  工艺编号 - T_ROUTE.ROUTE_CODE
     */
    private String routeCode;

    /**
     *  工艺名称 - T_ROUTE.ROUTE_NAME
     */
    private String routeName;

    /**
     *  分类码1 - T_ROUTE.CAT1
     */
    private String cat1;

    /**
     *  分类码2 - T_ROUTE.CAT2
     */
    private String cat2;

    /**
     *  分类码3 - T_ROUTE.CAT3
     */
    private String cat3;

    /**
     *  分类码4 - T_ROUTE.CAT4
     */
    private String cat4;

    /**
     *  分类码5 - T_ROUTE.CAT5
     */
    private String cat5;

    /**
     *  锁定人ID - T_ROUTE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_ROUTE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_ROUTE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_ROUTE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_ROUTE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_ROUTE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_ROUTE.DATA_VERSION
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

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getCat1() {
        return cat1;
    }

    public void setCat1(String cat1) {
        this.cat1 = cat1;
    }

    public String getCat2() {
        return cat2;
    }

    public void setCat2(String cat2) {
        this.cat2 = cat2;
    }

    public String getCat3() {
        return cat3;
    }

    public void setCat3(String cat3) {
        this.cat3 = cat3;
    }

    public String getCat4() {
        return cat4;
    }

    public void setCat4(String cat4) {
        this.cat4 = cat4;
    }

    public String getCat5() {
        return cat5;
    }

    public void setCat5(String cat5) {
        this.cat5 = cat5;
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
        sb.append(", routeCode=").append(routeCode);
        sb.append(", routeName=").append(routeName);
        sb.append(", cat1=").append(cat1);
        sb.append(", cat2=").append(cat2);
        sb.append(", cat3=").append(cat3);
        sb.append(", cat4=").append(cat4);
        sb.append(", cat5=").append(cat5);
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