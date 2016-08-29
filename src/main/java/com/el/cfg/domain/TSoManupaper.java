package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSoManupaper implements Serializable {
    /**
     *  null - T_SO_MANUPAPER.ID
     */
    private Long id;

    /**
     *  订单产品细表ID - T_SO_MANUPAPER.SO_PROD_ID
     */
    private Long soProdId;

    /**
     *  订单生产表ID - T_SO_MANUPAPER.SO_MANU_ID
     */
    private Long soManuId;

    /**
     *  产品部件ID - T_SO_MANUPAPER.PART_ID
     */
    private Long partId;

    /**
     *  纸张料号ID - T_SO_MANUPAPER.PAPER_ITEM_ID
     */
    private Long paperItemId;

    /**
     *  纸张来源方式 - T_SO_MANUPAPER.PAPER_SOURCE
     */
    private String paperSource;

    /**
     *  纸张用量 - T_SO_MANUPAPER.QTY
     */
    private BigDecimal qty;

    /**
     *  单位 - T_SO_MANUPAPER.UOM
     */
    private String uom;

    /**
     *  纸张完备状态 - T_SO_MANUPAPER.PAPER_READY_STATUS
     */
    private String paperReadyStatus;

    /**
     *  备注 - T_SO_MANUPAPER.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_SO_MANUPAPER.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_SO_MANUPAPER.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_SO_MANUPAPER.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_SO_MANUPAPER.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_SO_MANUPAPER.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_SO_MANUPAPER.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_SO_MANUPAPER.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSoProdId() {
        return soProdId;
    }

    public void setSoProdId(Long soProdId) {
        this.soProdId = soProdId;
    }

    public Long getSoManuId() {
        return soManuId;
    }

    public void setSoManuId(Long soManuId) {
        this.soManuId = soManuId;
    }

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public Long getPaperItemId() {
        return paperItemId;
    }

    public void setPaperItemId(Long paperItemId) {
        this.paperItemId = paperItemId;
    }

    public String getPaperSource() {
        return paperSource;
    }

    public void setPaperSource(String paperSource) {
        this.paperSource = paperSource;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getPaperReadyStatus() {
        return paperReadyStatus;
    }

    public void setPaperReadyStatus(String paperReadyStatus) {
        this.paperReadyStatus = paperReadyStatus;
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
        sb.append(", soProdId=").append(soProdId);
        sb.append(", soManuId=").append(soManuId);
        sb.append(", partId=").append(partId);
        sb.append(", paperItemId=").append(paperItemId);
        sb.append(", paperSource=").append(paperSource);
        sb.append(", qty=").append(qty);
        sb.append(", uom=").append(uom);
        sb.append(", paperReadyStatus=").append(paperReadyStatus);
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