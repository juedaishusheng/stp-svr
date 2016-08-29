package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TSorpt implements Serializable {
    /**
     *  null - T_SORPT.ID
     */
    private Long id;

    /**
     *  公司ID 对应T_OU.ID - T_SORPT.OU_ID
     */
    private Long ouId;

    /**
     *  工厂ID 对应T_FACTORY.ID - T_SORPT.FACT_ID
     */
    private Long factId;

    /**
     *  订单ID 对应T_SO.ID - T_SORPT.SO_ID
     */
    private Long soId;

    /**
     *  订单生产表ID 对应T_SO_MANU.ID - T_SORPT.SO_MANU_ID
     */
    private Long soManuId;

    /**
     *  产品ID 对应T_PROD.ID - T_SORPT.PROD_ID
     */
    private Long prodId;

    /**
     *  部件ID 对应T_PART.ID - T_SORPT.PART_ID
     */
    private Long partId;

    /**
     *  报工时间 - T_SORPT.RPT_DT
     */
    private Date rptDt;

    /**
     *  报工人ID - T_SORPT.RPTER_ID
     */
    private Long rpterId;

    /**
     *  报工人姓名 - T_SORPT.RPTER_NAME
     */
    private String rpterName;

    /**
     *  报工类型 工序类型 - T_SORPT.RPT_TYPE
     */
    private String rptType;

    /**
     *  报工数量 - T_SORPT.RPT_QTY
     */
    private Long rptQty;

    /**
     *  单位 - T_SORPT.RPT_UOM
     */
    private String rptUom;

    /**
     *  备注 - T_SORPT.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_SORPT.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_SORPT.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_SORPT.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_SORPT.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_SORPT.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_SORPT.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_SORPT.DATA_VERSION
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

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public Date getRptDt() {
        return rptDt;
    }

    public void setRptDt(Date rptDt) {
        this.rptDt = rptDt;
    }

    public Long getRpterId() {
        return rpterId;
    }

    public void setRpterId(Long rpterId) {
        this.rpterId = rpterId;
    }

    public String getRpterName() {
        return rpterName;
    }

    public void setRpterName(String rpterName) {
        this.rpterName = rpterName;
    }

    public String getRptType() {
        return rptType;
    }

    public void setRptType(String rptType) {
        this.rptType = rptType;
    }

    public Long getRptQty() {
        return rptQty;
    }

    public void setRptQty(Long rptQty) {
        this.rptQty = rptQty;
    }

    public String getRptUom() {
        return rptUom;
    }

    public void setRptUom(String rptUom) {
        this.rptUom = rptUom;
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
        sb.append(", ouId=").append(ouId);
        sb.append(", factId=").append(factId);
        sb.append(", soId=").append(soId);
        sb.append(", soManuId=").append(soManuId);
        sb.append(", prodId=").append(prodId);
        sb.append(", partId=").append(partId);
        sb.append(", rptDt=").append(rptDt);
        sb.append(", rpterId=").append(rpterId);
        sb.append(", rpterName=").append(rpterName);
        sb.append(", rptType=").append(rptType);
        sb.append(", rptQty=").append(rptQty);
        sb.append(", rptUom=").append(rptUom);
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