package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TQuotePriceAppr implements Serializable {
    /**
     *  null - T_QUOTE_PRICE_APPR.ID
     */
    private Long id;

    /**
     *  报价单ID - T_QUOTE_PRICE_APPR.QUOTE_ID
     */
    private Long quoteId;

    /**
     *  价格审核人ID - T_QUOTE_PRICE_APPR.PRICE_APPRER_ID
     */
    private Long priceApprerId;

    /**
     *  价格审核日期 - T_QUOTE_PRICE_APPR.PRICE_APPR_DATE
     */
    private Date priceApprDate;

    /**
     *  价格审核意见 - T_QUOTE_PRICE_APPR.PRICE_APPR_COMMENT
     */
    private String priceApprComment;

    /**
     *  锁定人ID - T_QUOTE_PRICE_APPR.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_QUOTE_PRICE_APPR.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_QUOTE_PRICE_APPR.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_QUOTE_PRICE_APPR.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_QUOTE_PRICE_APPR.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_QUOTE_PRICE_APPR.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_QUOTE_PRICE_APPR.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Long quoteId) {
        this.quoteId = quoteId;
    }

    public Long getPriceApprerId() {
        return priceApprerId;
    }

    public void setPriceApprerId(Long priceApprerId) {
        this.priceApprerId = priceApprerId;
    }

    public Date getPriceApprDate() {
        return priceApprDate;
    }

    public void setPriceApprDate(Date priceApprDate) {
        this.priceApprDate = priceApprDate;
    }

    public String getPriceApprComment() {
        return priceApprComment;
    }

    public void setPriceApprComment(String priceApprComment) {
        this.priceApprComment = priceApprComment;
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
        sb.append(", quoteId=").append(quoteId);
        sb.append(", priceApprerId=").append(priceApprerId);
        sb.append(", priceApprDate=").append(priceApprDate);
        sb.append(", priceApprComment=").append(priceApprComment);
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