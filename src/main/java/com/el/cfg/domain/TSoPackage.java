package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSoPackage implements Serializable {
    /**
     *  null - T_SO_PACKAGE.ID
     */
    private Long id;

    /**
     *  订单产品细表ID - T_SO_PACKAGE.T_SO_PROD_ID
     */
    private Long tSoProdId;

    /**
     *  行号 - T_SO_PACKAGE.LINE_NO
     */
    private BigDecimal lineNo;

    /**
     *  包装项目 配套、装袋、打包、装箱 - T_SO_PACKAGE.PACKAGE_ITEM
     */
    private String packageItem;

    /**
     *  包装组 - T_SO_PACKAGE.PACKAGE_GROUP
     */
    private Short packageGroup;

    /**
     *  每包数量 - T_SO_PACKAGE.QTY_PER_PACKAGE
     */
    private Long qtyPerPackage;

    /**
     *  包装排列 - T_SO_PACKAGE.PACKAGE_ARRANGE
     */
    private String packageArrange;

    /**
     *  总包数 - T_SO_PACKAGE.PACKAGE_CNT
     */
    private Long packageCnt;

    /**
     *  总数量 - T_SO_PACKAGE.TOTAL_QTY
     */
    private Long totalQty;

    /**
     *  总重量 - T_SO_PACKAGE.TOTAL_WEIGHT
     */
    private BigDecimal totalWeight;

    /**
     *  总体积 - T_SO_PACKAGE.TOTAL_VOLUMN
     */
    private BigDecimal totalVolumn;

    /**
     *  包装描述 - T_SO_PACKAGE.PACKGE_DESC
     */
    private String packgeDesc;

    /**
     *  要求发货日期 - T_SO_PACKAGE.DEMAND_DELI_DATE
     */
    private Date demandDeliDate;

    /**
     *  单位 - T_SO_PACKAGE.ITEM_UOM
     */
    private String itemUom;

    /**
     *  本币币种 - T_SO_PACKAGE.HOME_CURR_CODE
     */
    private String homeCurrCode;

    /**
     *  原币币种 - T_SO_PACKAGE.FORE_CURR_CODE
     */
    private String foreCurrCode;

    /**
     *  汇率 - T_SO_PACKAGE.CURR_RATE
     */
    private BigDecimal currRate;

    /**
     *  核算单价 - T_SO_PACKAGE.CALC_PRICE
     */
    private BigDecimal calcPrice;

    /**
     *  原币核算单价 - T_SO_PACKAGE.CURR_CALC_PRICE
     */
    private BigDecimal currCalcPrice;

    /**
     *  报价单价 - T_SO_PACKAGE.QUOTE_PRICE
     */
    private BigDecimal quotePrice;

    /**
     *  原币报价单价 - T_SO_PACKAGE.CURR_QUOTE_PRICE
     */
    private BigDecimal currQuotePrice;

    /**
     *  核算金额 - T_SO_PACKAGE.CALC_AMT
     */
    private BigDecimal calcAmt;

    /**
     *  原币核算金额 - T_SO_PACKAGE.CURR_CALC_AMT
     */
    private BigDecimal currCalcAmt;

    /**
     *  报价金额 - T_SO_PACKAGE.QUOTE_AMT
     */
    private BigDecimal quoteAmt;

    /**
     *  原币报价金额 - T_SO_PACKAGE.CURR_QUOTE_AMT
     */
    private BigDecimal currQuoteAmt;

    /**
     *  价格类型 初始/变更 - T_SO_PACKAGE.PRICE_TYPE
     */
    private String priceType;

    /**
     *  价格确认信息 - T_SO_PACKAGE.PRICE_CONFIRM_DESC
     */
    private String priceConfirmDesc;

    /**
     *  备注 - T_SO_PACKAGE.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_SO_PACKAGE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_SO_PACKAGE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_SO_PACKAGE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_SO_PACKAGE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_SO_PACKAGE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_SO_PACKAGE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_SO_PACKAGE.DATA_VERSION
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

    public String getPackageItem() {
        return packageItem;
    }

    public void setPackageItem(String packageItem) {
        this.packageItem = packageItem;
    }

    public Short getPackageGroup() {
        return packageGroup;
    }

    public void setPackageGroup(Short packageGroup) {
        this.packageGroup = packageGroup;
    }

    public Long getQtyPerPackage() {
        return qtyPerPackage;
    }

    public void setQtyPerPackage(Long qtyPerPackage) {
        this.qtyPerPackage = qtyPerPackage;
    }

    public String getPackageArrange() {
        return packageArrange;
    }

    public void setPackageArrange(String packageArrange) {
        this.packageArrange = packageArrange;
    }

    public Long getPackageCnt() {
        return packageCnt;
    }

    public void setPackageCnt(Long packageCnt) {
        this.packageCnt = packageCnt;
    }

    public Long getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Long totalQty) {
        this.totalQty = totalQty;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public BigDecimal getTotalVolumn() {
        return totalVolumn;
    }

    public void setTotalVolumn(BigDecimal totalVolumn) {
        this.totalVolumn = totalVolumn;
    }

    public String getPackgeDesc() {
        return packgeDesc;
    }

    public void setPackgeDesc(String packgeDesc) {
        this.packgeDesc = packgeDesc;
    }

    public Date getDemandDeliDate() {
        return demandDeliDate;
    }

    public void setDemandDeliDate(Date demandDeliDate) {
        this.demandDeliDate = demandDeliDate;
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
        sb.append(", tSoProdId=").append(tSoProdId);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", packageItem=").append(packageItem);
        sb.append(", packageGroup=").append(packageGroup);
        sb.append(", qtyPerPackage=").append(qtyPerPackage);
        sb.append(", packageArrange=").append(packageArrange);
        sb.append(", packageCnt=").append(packageCnt);
        sb.append(", totalQty=").append(totalQty);
        sb.append(", totalWeight=").append(totalWeight);
        sb.append(", totalVolumn=").append(totalVolumn);
        sb.append(", packgeDesc=").append(packgeDesc);
        sb.append(", demandDeliDate=").append(demandDeliDate);
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