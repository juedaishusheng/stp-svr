package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TFactStdcapa implements Serializable {
    /**
     *  null - T_FACT_STDCAPA.ID
     */
    private Long id;

    /**
     *  工厂合作关系ID 对应T_FACT_RELATE.ID - T_FACT_STDCAPA.RELATE_ID
     */
    private Long relateId;

    /**
     *  工厂ID 对应T_FACTORY.ID - T_FACT_STDCAPA.FACT_ID
     */
    private Long factId;

    /**
     *  分单中心ID 对应T_OU.ID - T_FACT_STDCAPA.OU_ID
     */
    private Long ouId;

    /**
     *  产能类型 工序类型 - T_FACT_STDCAPA.CAPA_TYPE
     */
    private String capaType;

    /**
     *  日标准产能 - T_FACT_STDCAPA.DAILY_CAPA
     */
    private BigDecimal dailyCapa;

    /**
     *  产能单位 - T_FACT_STDCAPA.UOM
     */
    private String uom;

    /**
     *  锁定人ID - T_FACT_STDCAPA.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_FACT_STDCAPA.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_FACT_STDCAPA.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_FACT_STDCAPA.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_FACT_STDCAPA.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_FACT_STDCAPA.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_FACT_STDCAPA.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRelateId() {
        return relateId;
    }

    public void setRelateId(Long relateId) {
        this.relateId = relateId;
    }

    public Long getFactId() {
        return factId;
    }

    public void setFactId(Long factId) {
        this.factId = factId;
    }

    public Long getOuId() {
        return ouId;
    }

    public void setOuId(Long ouId) {
        this.ouId = ouId;
    }

    public String getCapaType() {
        return capaType;
    }

    public void setCapaType(String capaType) {
        this.capaType = capaType;
    }

    public BigDecimal getDailyCapa() {
        return dailyCapa;
    }

    public void setDailyCapa(BigDecimal dailyCapa) {
        this.dailyCapa = dailyCapa;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
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
        sb.append(", relateId=").append(relateId);
        sb.append(", factId=").append(factId);
        sb.append(", ouId=").append(ouId);
        sb.append(", capaType=").append(capaType);
        sb.append(", dailyCapa=").append(dailyCapa);
        sb.append(", uom=").append(uom);
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