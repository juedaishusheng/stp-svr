package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TProdSetDtl implements Serializable {
    /**
     *  null - T_PROD_SET_DTL.ID
     */
    private Long id;

    /**
     *  套装ID 对应T_SO_PROD.ID - T_PROD_SET_DTL.SET_ID
     */
    private Long setId;

    /**
     *  行号 - T_PROD_SET_DTL.LINE_NO
     */
    private Long lineNo;

    /**
     *  产品ID - T_PROD_SET_DTL.PROD_ID
     */
    private Long prodId;

    /**
     *  产品数量 - T_PROD_SET_DTL.PROD_QTY
     */
    private Long prodQty;

    /**
     *  备注 - T_PROD_SET_DTL.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_PROD_SET_DTL.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PROD_SET_DTL.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PROD_SET_DTL.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PROD_SET_DTL.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PROD_SET_DTL.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PROD_SET_DTL.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PROD_SET_DTL.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSetId() {
        return setId;
    }

    public void setSetId(Long setId) {
        this.setId = setId;
    }

    public Long getLineNo() {
        return lineNo;
    }

    public void setLineNo(Long lineNo) {
        this.lineNo = lineNo;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Long getProdQty() {
        return prodQty;
    }

    public void setProdQty(Long prodQty) {
        this.prodQty = prodQty;
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
        sb.append(", setId=").append(setId);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", prodId=").append(prodId);
        sb.append(", prodQty=").append(prodQty);
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