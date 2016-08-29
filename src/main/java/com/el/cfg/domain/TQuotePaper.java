package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TQuotePaper implements Serializable {
    /**
     *  null - T_QUOTE_PAPER.ID
     */
    private Long id;

    /**
     *  报价单ID - T_QUOTE_PAPER.QUOTE_ID
     */
    private Long quoteId;

    /**
     *  行号 - T_QUOTE_PAPER.LINE_NO
     */
    private Long lineNo;

    /**
     *  纸张料号ID - T_QUOTE_PAPER.PAPER_ITEM_ID
     */
    private Long paperItemId;

    /**
     *  纸张种类 0:纸张 1:辅料 - T_QUOTE_PAPER.PAPER_TYPE
     */
    private Short paperType;

    /**
     *  工艺ID - T_QUOTE_PAPER.ROUTE_ID
     */
    private Long routeId;

    /**
     *  工序ID - T_QUOTE_PAPER.PROCESS_ID
     */
    private Long processId;

    /**
     *  产品ID - T_QUOTE_PAPER.PROD_ID
     */
    private Long prodId;

    /**
     *  产品部件ID - T_QUOTE_PAPER.PROD_PART_ID
     */
    private Long prodPartId;

    /**
     *  数量 - T_QUOTE_PAPER.ITEM_QTY
     */
    private BigDecimal itemQty;

    /**
     *  单位 - T_QUOTE_PAPER.ITEM_UOM
     */
    private String itemUom;

    /**
     *  本币币种 - T_QUOTE_PAPER.HOME_CURR_CODE
     */
    private String homeCurrCode;

    /**
     *  原币币种 - T_QUOTE_PAPER.FORE_CURR_CODE
     */
    private String foreCurrCode;

    /**
     *  汇率 - T_QUOTE_PAPER.CURR_RATE
     */
    private BigDecimal currRate;

    /**
     *  核算单价 - T_QUOTE_PAPER.CALC_PRICE
     */
    private BigDecimal calcPrice;

    /**
     *  原币核算单价 - T_QUOTE_PAPER.CURR_CALC_PRICE
     */
    private BigDecimal currCalcPrice;

    /**
     *  报价单价 - T_QUOTE_PAPER.QUOTE_PRICE
     */
    private BigDecimal quotePrice;

    /**
     *  原币报价单价 - T_QUOTE_PAPER.CURR_QUOTE_PRICE
     */
    private BigDecimal currQuotePrice;

    /**
     *  核算金额 - T_QUOTE_PAPER.CALC_AMT
     */
    private BigDecimal calcAmt;

    /**
     *  原币核算金额 - T_QUOTE_PAPER.CURR_CALC_AMT
     */
    private BigDecimal currCalcAmt;

    /**
     *  报价金额 - T_QUOTE_PAPER.QUOTE_AMT
     */
    private BigDecimal quoteAmt;

    /**
     *  原币报价金额 - T_QUOTE_PAPER.CURR_QUOTE_AMT
     */
    private BigDecimal currQuoteAmt;

    /**
     *  价格类型 初始/变更 - T_QUOTE_PAPER.PRICE_TYPE
     */
    private String priceType;

    /**
     *  价格确认信息 - T_QUOTE_PAPER.PRICE_CONFIRM_DESC
     */
    private String priceConfirmDesc;

    /**
     *  备注 - T_QUOTE_PAPER.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_QUOTE_PAPER.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_QUOTE_PAPER.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_QUOTE_PAPER.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_QUOTE_PAPER.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_QUOTE_PAPER.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_QUOTE_PAPER.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_QUOTE_PAPER.DATA_VERSION
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

    public Long getLineNo() {
        return lineNo;
    }

    public void setLineNo(Long lineNo) {
        this.lineNo = lineNo;
    }

    public Long getPaperItemId() {
        return paperItemId;
    }

    public void setPaperItemId(Long paperItemId) {
        this.paperItemId = paperItemId;
    }

    public Short getPaperType() {
        return paperType;
    }

    public void setPaperType(Short paperType) {
        this.paperType = paperType;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Long getProdPartId() {
        return prodPartId;
    }

    public void setProdPartId(Long prodPartId) {
        this.prodPartId = prodPartId;
    }

    public BigDecimal getItemQty() {
        return itemQty;
    }

    public void setItemQty(BigDecimal itemQty) {
        this.itemQty = itemQty;
    }

    public String getItemUom() {
        return itemUom;
    }

    public void setItemUom(String itemUom) {
        this.itemUom = itemUom;
    }

    public String getHomeCurrCode() {
        return homeCurrCode;
    }

    public void setHomeCurrCode(String homeCurrCode) {
        this.homeCurrCode = homeCurrCode;
    }

    public String getForeCurrCode() {
        return foreCurrCode;
    }

    public void setForeCurrCode(String foreCurrCode) {
        this.foreCurrCode = foreCurrCode;
    }

    public BigDecimal getCurrRate() {
        return currRate;
    }

    public void setCurrRate(BigDecimal currRate) {
        this.currRate = currRate;
    }

    public BigDecimal getCalcPrice() {
        return calcPrice;
    }

    public void setCalcPrice(BigDecimal calcPrice) {
        this.calcPrice = calcPrice;
    }

    public BigDecimal getCurrCalcPrice() {
        return currCalcPrice;
    }

    public void setCurrCalcPrice(BigDecimal currCalcPrice) {
        this.currCalcPrice = currCalcPrice;
    }

    public BigDecimal getQuotePrice() {
        return quotePrice;
    }

    public void setQuotePrice(BigDecimal quotePrice) {
        this.quotePrice = quotePrice;
    }

    public BigDecimal getCurrQuotePrice() {
        return currQuotePrice;
    }

    public void setCurrQuotePrice(BigDecimal currQuotePrice) {
        this.currQuotePrice = currQuotePrice;
    }

    public BigDecimal getCalcAmt() {
        return calcAmt;
    }

    public void setCalcAmt(BigDecimal calcAmt) {
        this.calcAmt = calcAmt;
    }

    public BigDecimal getCurrCalcAmt() {
        return currCalcAmt;
    }

    public void setCurrCalcAmt(BigDecimal currCalcAmt) {
        this.currCalcAmt = currCalcAmt;
    }

    public BigDecimal getQuoteAmt() {
        return quoteAmt;
    }

    public void setQuoteAmt(BigDecimal quoteAmt) {
        this.quoteAmt = quoteAmt;
    }

    public BigDecimal getCurrQuoteAmt() {
        return currQuoteAmt;
    }

    public void setCurrQuoteAmt(BigDecimal currQuoteAmt) {
        this.currQuoteAmt = currQuoteAmt;
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
        sb.append(", quoteId=").append(quoteId);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", paperItemId=").append(paperItemId);
        sb.append(", paperType=").append(paperType);
        sb.append(", routeId=").append(routeId);
        sb.append(", processId=").append(processId);
        sb.append(", prodId=").append(prodId);
        sb.append(", prodPartId=").append(prodPartId);
        sb.append(", itemQty=").append(itemQty);
        sb.append(", itemUom=").append(itemUom);
        sb.append(", homeCurrCode=").append(homeCurrCode);
        sb.append(", foreCurrCode=").append(foreCurrCode);
        sb.append(", currRate=").append(currRate);
        sb.append(", calcPrice=").append(calcPrice);
        sb.append(", currCalcPrice=").append(currCalcPrice);
        sb.append(", quotePrice=").append(quotePrice);
        sb.append(", currQuotePrice=").append(currQuotePrice);
        sb.append(", calcAmt=").append(calcAmt);
        sb.append(", currCalcAmt=").append(currCalcAmt);
        sb.append(", quoteAmt=").append(quoteAmt);
        sb.append(", currQuoteAmt=").append(currQuoteAmt);
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