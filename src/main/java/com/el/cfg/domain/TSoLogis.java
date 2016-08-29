package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSoLogis implements Serializable {
    /**
     *  null - T_SO_LOGIS.ID
     */
    private Long id;

    /**
     *  订单产品细表ID - T_SO_LOGIS.T_SO_PROD_ID
     */
    private Long tSoProdId;

    /**
     *  行号 - T_SO_LOGIS.LINE_NO
     */
    private BigDecimal lineNo;

    /**
     *  运输方式 - T_SO_LOGIS.TRANS_TYPE
     */
    private String transType;

    /**
     *  始发地址 - T_SO_LOGIS.FROM_ADDRESS_DESC
     */
    private String fromAddressDesc;

    /**
     *  目的地址 - T_SO_LOGIS.TO_ADDRESS_DESC
     */
    private String toAddressDesc;

    /**
     *  运输数量本 - T_SO_LOGIS.TRANS_QTY
     */
    private Long transQty;

    /**
     *  运输重量 - T_SO_LOGIS.TRANS_WEIGHT
     */
    private BigDecimal transWeight;

    /**
     *  运输体积 - T_SO_LOGIS.TRANS_VOLUMN
     */
    private BigDecimal transVolumn;

    /**
     *  距离范围描述 - T_SO_LOGIS.DISTANCE_DESC
     */
    private String distanceDesc;

    /**
     *  载重量 - T_SO_LOGIS.TRANS_CAPACITY
     */
    private BigDecimal transCapacity;

    /**
     *  报价单位 - T_SO_LOGIS.QUOTE_UOM
     */
    private String quoteUom;

    /**
     *  报价数量 - T_SO_LOGIS.QUOTE_QTY
     */
    private BigDecimal quoteQty;

    /**
     *  本币币种 - T_SO_LOGIS.HOME_CURR_CODE
     */
    private String homeCurrCode;

    /**
     *  原币币种 - T_SO_LOGIS.FORE_CURR_CODE
     */
    private String foreCurrCode;

    /**
     *  汇率 - T_SO_LOGIS.CURR_RATE
     */
    private BigDecimal currRate;

    /**
     *  核算单价 - T_SO_LOGIS.CALC_PRICE
     */
    private BigDecimal calcPrice;

    /**
     *  原币核算单价 - T_SO_LOGIS.CURR_CALC_PRICE
     */
    private BigDecimal currCalcPrice;

    /**
     *  报价单价 - T_SO_LOGIS.QUOTE_PRICE
     */
    private BigDecimal quotePrice;

    /**
     *  原币报价单价 - T_SO_LOGIS.CURR_QUOTE_PRICE
     */
    private BigDecimal currQuotePrice;

    /**
     *  核算金额 - T_SO_LOGIS.CALC_AMT
     */
    private BigDecimal calcAmt;

    /**
     *  原币核算金额 - T_SO_LOGIS.CURR_CALC_AMT
     */
    private BigDecimal currCalcAmt;

    /**
     *  报价金额 - T_SO_LOGIS.QUOTE_AMT
     */
    private BigDecimal quoteAmt;

    /**
     *  原币报价金额 - T_SO_LOGIS.CURR_QUOTE_AMT
     */
    private BigDecimal currQuoteAmt;

    /**
     *  价格类型 初始/变更 - T_SO_LOGIS.PRICE_TYPE
     */
    private String priceType;

    /**
     *  价格确认信息 - T_SO_LOGIS.PRICE_CONFIRM_DESC
     */
    private String priceConfirmDesc;

    /**
     *  备注 - T_SO_LOGIS.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_SO_LOGIS.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_SO_LOGIS.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_SO_LOGIS.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_SO_LOGIS.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_SO_LOGIS.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_SO_LOGIS.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_SO_LOGIS.DATA_VERSION
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

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getFromAddressDesc() {
        return fromAddressDesc;
    }

    public void setFromAddressDesc(String fromAddressDesc) {
        this.fromAddressDesc = fromAddressDesc;
    }

    public String getToAddressDesc() {
        return toAddressDesc;
    }

    public void setToAddressDesc(String toAddressDesc) {
        this.toAddressDesc = toAddressDesc;
    }

    public Long getTransQty() {
        return transQty;
    }

    public void setTransQty(Long transQty) {
        this.transQty = transQty;
    }

    public BigDecimal getTransWeight() {
        return transWeight;
    }

    public void setTransWeight(BigDecimal transWeight) {
        this.transWeight = transWeight;
    }

    public BigDecimal getTransVolumn() {
        return transVolumn;
    }

    public void setTransVolumn(BigDecimal transVolumn) {
        this.transVolumn = transVolumn;
    }

    public String getDistanceDesc() {
        return distanceDesc;
    }

    public void setDistanceDesc(String distanceDesc) {
        this.distanceDesc = distanceDesc;
    }

    public BigDecimal getTransCapacity() {
        return transCapacity;
    }

    public void setTransCapacity(BigDecimal transCapacity) {
        this.transCapacity = transCapacity;
    }

    public String getQuoteUom() {
        return quoteUom;
    }

    public void setQuoteUom(String quoteUom) {
        this.quoteUom = quoteUom;
    }

    public BigDecimal getQuoteQty() {
        return quoteQty;
    }

    public void setQuoteQty(BigDecimal quoteQty) {
        this.quoteQty = quoteQty;
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
        sb.append(", tSoProdId=").append(tSoProdId);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", transType=").append(transType);
        sb.append(", fromAddressDesc=").append(fromAddressDesc);
        sb.append(", toAddressDesc=").append(toAddressDesc);
        sb.append(", transQty=").append(transQty);
        sb.append(", transWeight=").append(transWeight);
        sb.append(", transVolumn=").append(transVolumn);
        sb.append(", distanceDesc=").append(distanceDesc);
        sb.append(", transCapacity=").append(transCapacity);
        sb.append(", quoteUom=").append(quoteUom);
        sb.append(", quoteQty=").append(quoteQty);
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