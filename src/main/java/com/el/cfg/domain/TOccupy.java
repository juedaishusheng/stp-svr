package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TOccupy implements Serializable {
    /**
     *  null - T_OCCUPY.ID
     */
    private Long id;

    /**
     *  公司ID 对应T_OU.ID - T_OCCUPY.OU_ID
     */
    private Long ouId;

    /**
     *  分单中心ID 对应T_OU.ID - T_OCCUPY.DISTOU_ID
     */
    private Long distouId;

    /**
     *  工厂ID 对应T_FACTORY.ID - T_OCCUPY.FACT_ID
     */
    private Long factId;

    /**
     *  订单ID 对应T_SO.ID - T_OCCUPY.SO_ID
     */
    private Long soId;

    /**
     *  订单生产表ID 对应T_SO_MANU.ID - T_OCCUPY.SO_MANU_ID
     */
    private Long soManuId;

    /**
     *  产品ID 对应T_PROD.ID - T_OCCUPY.PROD_ID
     */
    private Long prodId;

    /**
     *  日期 - T_OCCUPY.DT
     */
    private Date dt;

    /**
     *  产能类型 - T_OCCUPY.CAPA_TYPE
     */
    private String capaType;

    /**
     *  占用数量 - T_OCCUPY.CAPA
     */
    private BigDecimal capa;

    /**
     *  备注 - T_OCCUPY.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_OCCUPY.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_OCCUPY.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_OCCUPY.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_OCCUPY.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_OCCUPY.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_OCCUPY.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_OCCUPY.DATA_VERSION
     */
    private Long dataVersion;

    /**
     *  单位 - T_OCCUPY.UOM
     */
    private String uom;

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

    public Long getDistouId() {
        return distouId;
    }

    public void setDistouId(Long distouId) {
        this.distouId = distouId;
    }

    public Long getFactId() {
        return factId;
    }

    public void setFactId(Long factId) {
        this.factId = factId;
    }

    public Long getSoId() {
        return soId;
    }

    public void setSoId(Long soId) {
        this.soId = soId;
    }

    public Long getSoManuId() {
        return soManuId;
    }

    public void setSoManuId(Long soManuId) {
        this.soManuId = soManuId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public String getCapaType() {
        return capaType;
    }

    public void setCapaType(String capaType) {
        this.capaType = capaType;
    }

    public BigDecimal getCapa() {
        return capa;
    }

    public void setCapa(BigDecimal capa) {
        this.capa = capa;
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

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ouId=").append(ouId);
        sb.append(", distouId=").append(distouId);
        sb.append(", factId=").append(factId);
        sb.append(", soId=").append(soId);
        sb.append(", soManuId=").append(soManuId);
        sb.append(", prodId=").append(prodId);
        sb.append(", dt=").append(dt);
        sb.append(", capaType=").append(capaType);
        sb.append(", capa=").append(capa);
        sb.append(", remark=").append(remark);
        sb.append(", lockerId=").append(lockerId);
        sb.append(", lockTs=").append(lockTs);
        sb.append(", modifyerId=").append(modifyerId);
        sb.append(", modifyTs=").append(modifyTs);
        sb.append(", modifyAppsvr=").append(modifyAppsvr);
        sb.append(", modifyModule=").append(modifyModule);
        sb.append(", dataVersion=").append(dataVersion);
        sb.append(", uom=").append(uom);
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