package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSoDisc implements Serializable {
    /**
     *  null - T_SO_DISC.ID
     */
    private Long id;

    /**
     *  订单产品细表ID - T_SO_DISC.T_SO_PROD_ID
     */
    private Long tSoProdId;

    /**
     *  行号 - T_SO_DISC.LINE_NO
     */
    private BigDecimal lineNo;

    /**
     *  折让类别 - T_SO_DISC.DISC_TYPE
     */
    private String discType;

    /**
     *  折让说明 - T_SO_DISC.DISC_DESC
     */
    private String discDesc;

    /**
     *  折让金额 - T_SO_DISC.DISC_AMT
     */
    private BigDecimal discAmt;

    /**
     *  价格类型 初始/变更 - T_SO_DISC.PRICE_TYPE
     */
    private String priceType;

    /**
     *  价格确认信息 - T_SO_DISC.PRICE_CONFIRM_DESC
     */
    private String priceConfirmDesc;

    /**
     *  备注 - T_SO_DISC.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_SO_DISC.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_SO_DISC.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_SO_DISC.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_SO_DISC.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_SO_DISC.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_SO_DISC.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_SO_DISC.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long gettSoProdId() {
        return tSoProdId;
    }

    public void settSoProdId(Long tSoProdId) {
        this.tSoProdId = tSoProdId;
    }

    public BigDecimal getLineNo() {
        return lineNo;
    }

    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getDiscDesc() {
        return discDesc;
    }

    public void setDiscDesc(String discDesc) {
        this.discDesc = discDesc;
    }

    public BigDecimal getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigDecimal discAmt) {
        this.discAmt = discAmt;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getPriceConfirmDesc() {
        return priceConfirmDesc;
    }

    public void setPriceConfirmDesc(String priceConfirmDesc) {
        this.priceConfirmDesc = priceConfirmDesc;
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
        sb.append(", tSoProdId=").append(tSoProdId);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", discType=").append(discType);
        sb.append(", discDesc=").append(discDesc);
        sb.append(", discAmt=").append(discAmt);
        sb.append(", priceType=").append(priceType);
        sb.append(", priceConfirmDesc=").append(priceConfirmDesc);
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