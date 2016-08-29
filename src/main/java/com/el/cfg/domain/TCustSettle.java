package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TCustSettle implements Serializable {
    /**
     *  null - T_CUST_SETTLE.ID
     */
    private Long id;

    /**
     *  公司ID - T_CUST_SETTLE.OU_ID
     */
    private Long ouId;

    /**
     *  客户ID - T_CUST_SETTLE.CUST_ID
     */
    private Long custId;

    /**
     *  结算单号 - T_CUST_SETTLE.DOC_NO
     */
    private String docNo;

    /**
     *  结算日期 - T_CUST_SETTLE.SETTLE_DATE
     */
    private Date settleDate;

    /**
     *  状态 草稿/已确认/已立账 - T_CUST_SETTLE.DOC_STATUS
     */
    private String docStatus;

    /**
     *  销售订单ID - T_CUST_SETTLE.SO_ID
     */
    private Long soId;

    /**
     *  销售订单产品细表ID - T_CUST_SETTLE.SO_PROD_ID
     */
    private Long soProdId;

    /**
     *  产品ID - T_CUST_SETTLE.PROD_ID
     */
    private Long prodId;

    /**
     *  行号 - T_CUST_SETTLE.LINE_NO
     */
    private BigDecimal lineNo;

    /**
     *  单位 - T_CUST_SETTLE.UOM
     */
    private String uom;

    /**
     *  单价 - T_CUST_SETTLE.PRICE
     */
    private BigDecimal price;

    /**
     *  订单数量 - T_CUST_SETTLE.SO_QTY
     */
    private Long soQty;

    /**
     *  订单本币金额 - T_CUST_SETTLE.SO_AMT
     */
    private BigDecimal soAmt;

    /**
     *  本单结算数量 - T_CUST_SETTLE.SETTLE_QTY
     */
    private Long settleQty;

    /**
     *  本单结算金额 - T_CUST_SETTLE.SETTLE_AMT
     */
    private BigDecimal settleAmt;

    /**
     *  立账日期 - T_CUST_SETTLE.ACCOUNT_DATE
     */
    private Date accountDate;

    /**
     *  立账本币金额 - T_CUST_SETTLE.ACCOUNT_AMT
     */
    private BigDecimal accountAmt;

    /**
     *  立账标记 - T_CUST_SETTLE.ACCOUNT_FLAG
     */
    private String accountFlag;

    /**
     *  锁定人ID - T_CUST_SETTLE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_CUST_SETTLE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_CUST_SETTLE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_CUST_SETTLE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_CUST_SETTLE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_CUST_SETTLE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_CUST_SETTLE.DATA_VERSION
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

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public Date getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }

    public Long getSoId() {
        return soId;
    }

    public void setSoId(Long soId) {
        this.soId = soId;
    }

    public Long getSoProdId() {
        return soProdId;
    }

    public void setSoProdId(Long soProdId) {
        this.soProdId = soProdId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public BigDecimal getLineNo() {
        return lineNo;
    }

    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getSoQty() {
        return soQty;
    }

    public void setSoQty(Long soQty) {
        this.soQty = soQty;
    }

    public BigDecimal getSoAmt() {
        return soAmt;
    }

    public void setSoAmt(BigDecimal soAmt) {
        this.soAmt = soAmt;
    }

    public Long getSettleQty() {
        return settleQty;
    }

    public void setSettleQty(Long settleQty) {
        this.settleQty = settleQty;
    }

    public BigDecimal getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(BigDecimal settleAmt) {
        this.settleAmt = settleAmt;
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public BigDecimal getAccountAmt() {
        return accountAmt;
    }

    public void setAccountAmt(BigDecimal accountAmt) {
        this.accountAmt = accountAmt;
    }

    public String getAccountFlag() {
        return accountFlag;
    }

    public void setAccountFlag(String accountFlag) {
        this.accountFlag = accountFlag;
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
        sb.append(", custId=").append(custId);
        sb.append(", docNo=").append(docNo);
        sb.append(", settleDate=").append(settleDate);
        sb.append(", docStatus=").append(docStatus);
        sb.append(", soId=").append(soId);
        sb.append(", soProdId=").append(soProdId);
        sb.append(", prodId=").append(prodId);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", uom=").append(uom);
        sb.append(", price=").append(price);
        sb.append(", soQty=").append(soQty);
        sb.append(", soAmt=").append(soAmt);
        sb.append(", settleQty=").append(settleQty);
        sb.append(", settleAmt=").append(settleAmt);
        sb.append(", accountDate=").append(accountDate);
        sb.append(", accountAmt=").append(accountAmt);
        sb.append(", accountFlag=").append(accountFlag);
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