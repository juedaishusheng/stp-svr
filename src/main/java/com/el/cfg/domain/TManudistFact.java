package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TManudistFact implements Serializable {
    /**
     *  null - T_MANUDIST_FACT.ID
     */
    private Long id;

    /**
     *  批次ID 对应T_MANU_BATCH.ID - T_MANUDIST_FACT.BATCH_ID
     */
    private Long batchId;

    /**
     *  订单ID 对应T_SO.ID - T_MANUDIST_FACT.SO_ID
     */
    private Long soId;

    /**
     *  工厂ID 对应T_FACTORY.ID - T_MANUDIST_FACT.FACT_ID
     */
    private Long factId;

    /**
     *  分单总数量 （一般不用） - T_MANUDIST_FACT.DIST_QTY
     */
    private String distQty;

    /**
     *  计算金额 所有的分单产品计算单价*分单数量的和 - T_MANUDIST_FACT.CALC_AMT
     */
    private BigDecimal calcAmt;

    /**
     *  成本金额 所有的分单产品成本单价*分单数量的和（外发成本价） - T_MANUDIST_FACT.COST_AMT
     */
    private BigDecimal costAmt;

    /**
     *  协商金额 调度员输入的变更后的分单金额 - T_MANUDIST_FACT.ARGUED_AMT
     */
    private BigDecimal arguedAmt;

    /**
     *  变价原因 - T_MANUDIST_FACT.ARGUE_DESC
     */
    private String argueDesc;

    /**
     *  核价人 - T_MANUDIST_FACT.PRICE_APPRER
     */
    private String priceApprer;

    /**
     *  核价描述 - T_MANUDIST_FACT.PRICE_APPR_COMMENT
     */
    private String priceApprComment;

    /**
     *  核价时间 - T_MANUDIST_FACT.PRICE_APPR_TIME
     */
    private Date priceApprTime;

    /**
     *  接单状态 02-已确认，03-已退单，04-已拒绝 - T_MANUDIST_FACT.ACPT_STATUS
     */
    private String acptStatus;

    /**
     *  接单反馈内容 - T_MANUDIST_FACT.ACPT_COMMENT
     */
    private String acptComment;

    /**
     *  接单时间 - T_MANUDIST_FACT.ACPT_TIME
     */
    private Date acptTime;

    /**
     *  接单人 - T_MANUDIST_FACT.ACPT_USER
     */
    private String acptUser;

    /**
     *  备注 - T_MANUDIST_FACT.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_MANUDIST_FACT.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_MANUDIST_FACT.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_MANUDIST_FACT.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_MANUDIST_FACT.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_MANUDIST_FACT.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_MANUDIST_FACT.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_MANUDIST_FACT.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Long getSoId() {
        return soId;
    }

    public void setSoId(Long soId) {
        this.soId = soId;
    }

    public Long getFactId() {
        return factId;
    }

    public void setFactId(Long factId) {
        this.factId = factId;
    }

    public String getDistQty() {
        return distQty;
    }

    public void setDistQty(String distQty) {
        this.distQty = distQty;
    }

    public BigDecimal getCalcAmt() {
        return calcAmt;
    }

    public void setCalcAmt(BigDecimal calcAmt) {
        this.calcAmt = calcAmt;
    }

    public BigDecimal getCostAmt() {
        return costAmt;
    }

    public void setCostAmt(BigDecimal costAmt) {
        this.costAmt = costAmt;
    }

    public BigDecimal getArguedAmt() {
        return arguedAmt;
    }

    public void setArguedAmt(BigDecimal arguedAmt) {
        this.arguedAmt = arguedAmt;
    }

    public String getArgueDesc() {
        return argueDesc;
    }

    public void setArgueDesc(String argueDesc) {
        this.argueDesc = argueDesc;
    }

    public String getPriceApprer() {
        return priceApprer;
    }

    public void setPriceApprer(String priceApprer) {
        this.priceApprer = priceApprer;
    }

    public String getPriceApprComment() {
        return priceApprComment;
    }

    public void setPriceApprComment(String priceApprComment) {
        this.priceApprComment = priceApprComment;
    }

    public Date getPriceApprTime() {
        return priceApprTime;
    }

    public void setPriceApprTime(Date priceApprTime) {
        this.priceApprTime = priceApprTime;
    }

    public String getAcptStatus() {
        return acptStatus;
    }

    public void setAcptStatus(String acptStatus) {
        this.acptStatus = acptStatus;
    }

    public String getAcptComment() {
        return acptComment;
    }

    public void setAcptComment(String acptComment) {
        this.acptComment = acptComment;
    }

    public Date getAcptTime() {
        return acptTime;
    }

    public void setAcptTime(Date acptTime) {
        this.acptTime = acptTime;
    }

    public String getAcptUser() {
        return acptUser;
    }

    public void setAcptUser(String acptUser) {
        this.acptUser = acptUser;
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
        sb.append(", batchId=").append(batchId);
        sb.append(", soId=").append(soId);
        sb.append(", factId=").append(factId);
        sb.append(", distQty=").append(distQty);
        sb.append(", calcAmt=").append(calcAmt);
        sb.append(", costAmt=").append(costAmt);
        sb.append(", arguedAmt=").append(arguedAmt);
        sb.append(", argueDesc=").append(argueDesc);
        sb.append(", priceApprer=").append(priceApprer);
        sb.append(", priceApprComment=").append(priceApprComment);
        sb.append(", priceApprTime=").append(priceApprTime);
        sb.append(", acptStatus=").append(acptStatus);
        sb.append(", acptComment=").append(acptComment);
        sb.append(", acptTime=").append(acptTime);
        sb.append(", acptUser=").append(acptUser);
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