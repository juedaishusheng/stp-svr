package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TQuoteProd implements Serializable {
    /**
     *  null - T_QUOTE_PROD.ID
     */
    private Long id;

    /**
     *  报价单ID - T_QUOTE_PROD.QUOTE_ID
     */
    private Long quoteId;

    /**
     *  报价单行号 - T_QUOTE_PROD.LINE_NO
     */
    private Long lineNo;

    /**
     *  行类型 - T_QUOTE_PROD.LINE_TYPE
     */
    private String lineType;

    /**
     *  产品ID 对应T_PROD.ID - T_QUOTE_PROD.PROD_ID
     */
    private Long prodId;

    /**
     *  是否产品变更  0:否 1:是 - T_QUOTE_PROD.CHANGE_FLAG
     */
    private String changeFlag;

    /**
     *  版数 - T_QUOTE_PROD.VERSION_NUM
     */
    private Short versionNum;

    /**
     *  次数 - T_QUOTE_PROD.REPEAT_NUM
     */
    private Short repeatNum;

    /**
     *  订单状态 - T_QUOTE_PROD.QUOTE_STATUS
     */
    private String quoteStatus;

    /**
     *  分单状态 - T_QUOTE_PROD.DIST_STATUS
     */
    private String distStatus;

    /**
     *  结算状态 - T_QUOTE_PROD.SETTLE_STATUS
     */
    private String settleStatus;

    /**
     *  信用状态 - T_QUOTE_PROD.CREDIT_STATUS
     */
    private String creditStatus;

    /**
     *  本币币种 - T_QUOTE_PROD.HOME_CURR_CODE
     */
    private String homeCurrCode;

    /**
     *  原币币种 - T_QUOTE_PROD.FORE_CURR_CODE
     */
    private String foreCurrCode;

    /**
     *  汇率 - T_QUOTE_PROD.CURR_RATE
     */
    private BigDecimal currRate;

    /**
     *  核算单价 - T_QUOTE_PROD.CALC_PRICE
     */
    private BigDecimal calcPrice;

    /**
     *  原币核算单价 - T_QUOTE_PROD.CURR_CALC_PRICE
     */
    private BigDecimal currCalcPrice;

    /**
     *  报价单价 - T_QUOTE_PROD.QUOTE_PRICE
     */
    private BigDecimal quotePrice;

    /**
     *  原币报价单价 - T_QUOTE_PROD.CURR_QUOTE_PRICE
     */
    private BigDecimal currQuotePrice;

    /**
     *  核算金额 - T_QUOTE_PROD.CALC_AMT
     */
    private BigDecimal calcAmt;

    /**
     *  原币核算金额 - T_QUOTE_PROD.CURR_CALC_AMT
     */
    private BigDecimal currCalcAmt;

    /**
     *  报价金额 - T_QUOTE_PROD.QUOTE_AMT
     */
    private BigDecimal quoteAmt;

    /**
     *  原币报价金额 - T_QUOTE_PROD.CURR_QUOTE_AMT
     */
    private BigDecimal currQuoteAmt;

    /**
     *  客户金额 - T_QUOTE_PROD.CUST_AMT
     */
    private BigDecimal custAmt;

    /**
     *  原币客户金额 - T_QUOTE_PROD.CURR_CUST_AMT
     */
    private BigDecimal currCustAmt;

    /**
     *  赠送数量 - T_QUOTE_PROD.FORFREE_QTY
     */
    private Long forfreeQty;

    /**
     *  送检数量 - T_QUOTE_PROD.FORCHECK_QTY
     */
    private Long forcheckQty;

    /**
     *  存样数量 - T_QUOTE_PROD.FORKEEP_QTY
     */
    private Long forkeepQty;

    /**
     *  客样数量 - T_QUOTE_PROD.FORCUSTSAMPLE_QTY
     */
    private Long forcustsampleQty;

    /**
     *  正数 产品总数 - T_QUOTE_PROD.MANU_QTY
     */
    private Long manuQty;

    /**
     *  赠送/加放 0-正常，1-赠送 - T_QUOTE_PROD.FREE_FLAG
     */
    private Short freeFlag;

    /**
     *  成品单位 - T_QUOTE_PROD.PROD_UOM
     */
    private String prodUom;

    /**
     *  分单中数量 - T_QUOTE_PROD.DISTING_QTY
     */
    private Long distingQty;

    /**
     *  已分单数量 - T_QUOTE_PROD.DIST_QTY
     */
    private Long distQty;

    /**
     *  是否数量拆分 0-否，1-是 - T_QUOTE_PROD.QTY_SPLIT_FLAG
     */
    private Short qtySplitFlag;

    /**
     *  样书类型 - T_QUOTE_PROD.SAMPLE_TYPE
     */
    private String sampleType;

    /**
     *  包装方式 - T_QUOTE_PROD.PACKAGE_TYPE
     */
    private String packageType;

    /**
     *  手工包装类型 - T_QUOTE_PROD.MANU_PACK_TYPE
     */
    private String manuPackType;

    /**
     *  要求交期 - T_QUOTE_PROD.DUE_DATE
     */
    private Date dueDate;

    /**
     *  交货地址ID - T_QUOTE_PROD.DELI_ADDR_ID
     */
    private Long deliAddrId;

    /**
     *  交货地址描述 - T_QUOTE_PROD.DELI_ADDR_DESC
     */
    private String deliAddrDesc;

    /**
     *  交货方式 - T_QUOTE_PROD.DELI_METHOD
     */
    private String deliMethod;

    /**
     *  总印张数 - T_QUOTE_PROD.IMPRESSION_CNT
     */
    private Long impressionCnt;

    /**
     *  印刷完成张数 - T_QUOTE_PROD.PRINT_COMP_CNT
     */
    private Long printCompCnt;

    /**
     *  装订完成数 - T_QUOTE_PROD.BIND_COMP_CNT
     */
    private Long bindCompCnt;

    /**
     *  生产完成日期 - T_QUOTE_PROD.MANU_COMP_DATE
     */
    private Date manuCompDate;

    /**
     *  已入库数量 - T_QUOTE_PROD.WHIN_QTY
     */
    private Long whinQty;

    /**
     *  已发货数量 - T_QUOTE_PROD.DELI_QTY
     */
    private Long deliQty;

    /**
     *  最后发货日期 - T_QUOTE_PROD.LAST_DELI_DATE
     */
    private Date lastDeliDate;

    /**
     *  结算标记 未结算/已结算 - T_QUOTE_PROD.SETTLE_FLAG
     */
    private String settleFlag;

    /**
     *  已结算数量 - T_QUOTE_PROD.SETTLE_QTY
     */
    private Long settleQty;

    /**
     *  已结算金额 - T_QUOTE_PROD.SETTLE_AMT
     */
    private BigDecimal settleAmt;

    /**
     *  原币已结算金额 - T_QUOTE_PROD.CURR_SETTLE_AMT
     */
    private BigDecimal currSettleAmt;

    /**
     *  已开票金额 - T_QUOTE_PROD.INV_AMT
     */
    private BigDecimal invAmt;

    /**
     *  已回款金额 - T_QUOTE_PROD.RECV_AMT
     */
    private BigDecimal recvAmt;

    /**
     *  仓库ID - T_QUOTE_PROD.WH_ID
     */
    private Long whId;

    /**
     *  取消日期 - T_QUOTE_PROD.CANCLE_DATE
     */
    private Date cancleDate;

    /**
     *  纸张是否到位 - T_QUOTE_PROD.PAPER_READY_FLAG
     */
    private Short paperReadyFlag;

    /**
     *  备注 - T_QUOTE_PROD.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_QUOTE_PROD.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_QUOTE_PROD.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_QUOTE_PROD.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_QUOTE_PROD.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_QUOTE_PROD.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_QUOTE_PROD.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_QUOTE_PROD.DATA_VERSION
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

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getChangeFlag() {
        return changeFlag;
    }

    public void setChangeFlag(String changeFlag) {
        this.changeFlag = changeFlag;
    }

    public Short getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(Short versionNum) {
        this.versionNum = versionNum;
    }

    public Short getRepeatNum() {
        return repeatNum;
    }

    public void setRepeatNum(Short repeatNum) {
        this.repeatNum = repeatNum;
    }

    public String getQuoteStatus() {
        return quoteStatus;
    }

    public void setQuoteStatus(String quoteStatus) {
        this.quoteStatus = quoteStatus;
    }

    public String getDistStatus() {
        return distStatus;
    }

    public void setDistStatus(String distStatus) {
        this.distStatus = distStatus;
    }

    public String getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
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

    public BigDecimal getCustAmt() {
        return custAmt;
    }

    public void setCustAmt(BigDecimal custAmt) {
        this.custAmt = custAmt;
    }

    public BigDecimal getCurrCustAmt() {
        return currCustAmt;
    }

    public void setCurrCustAmt(BigDecimal currCustAmt) {
        this.currCustAmt = currCustAmt;
    }

    public Long getForfreeQty() {
        return forfreeQty;
    }

    public void setForfreeQty(Long forfreeQty) {
        this.forfreeQty = forfreeQty;
    }

    public Long getForcheckQty() {
        return forcheckQty;
    }

    public void setForcheckQty(Long forcheckQty) {
        this.forcheckQty = forcheckQty;
    }

    public Long getForkeepQty() {
        return forkeepQty;
    }

    public void setForkeepQty(Long forkeepQty) {
        this.forkeepQty = forkeepQty;
    }

    public Long getForcustsampleQty() {
        return forcustsampleQty;
    }

    public void setForcustsampleQty(Long forcustsampleQty) {
        this.forcustsampleQty = forcustsampleQty;
    }

    public Long getManuQty() {
        return manuQty;
    }

    public void setManuQty(Long manuQty) {
        this.manuQty = manuQty;
    }

    public Short getFreeFlag() {
        return freeFlag;
    }

    public void setFreeFlag(Short freeFlag) {
        this.freeFlag = freeFlag;
    }

    public String getProdUom() {
        return prodUom;
    }

    public void setProdUom(String prodUom) {
        this.prodUom = prodUom;
    }

    public Long getDistingQty() {
        return distingQty;
    }

    public void setDistingQty(Long distingQty) {
        this.distingQty = distingQty;
    }

    public Long getDistQty() {
        return distQty;
    }

    public void setDistQty(Long distQty) {
        this.distQty = distQty;
    }

    public Short getQtySplitFlag() {
        return qtySplitFlag;
    }

    public void setQtySplitFlag(Short qtySplitFlag) {
        this.qtySplitFlag = qtySplitFlag;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getManuPackType() {
        return manuPackType;
    }

    public void setManuPackType(String manuPackType) {
        this.manuPackType = manuPackType;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Long getDeliAddrId() {
        return deliAddrId;
    }

    public void setDeliAddrId(Long deliAddrId) {
        this.deliAddrId = deliAddrId;
    }

    public String getDeliAddrDesc() {
        return deliAddrDesc;
    }

    public void setDeliAddrDesc(String deliAddrDesc) {
        this.deliAddrDesc = deliAddrDesc;
    }

    public String getDeliMethod() {
        return deliMethod;
    }

    public void setDeliMethod(String deliMethod) {
        this.deliMethod = deliMethod;
    }

    public Long getImpressionCnt() {
        return impressionCnt;
    }

    public void setImpressionCnt(Long impressionCnt) {
        this.impressionCnt = impressionCnt;
    }

    public Long getPrintCompCnt() {
        return printCompCnt;
    }

    public void setPrintCompCnt(Long printCompCnt) {
        this.printCompCnt = printCompCnt;
    }

    public Long getBindCompCnt() {
        return bindCompCnt;
    }

    public void setBindCompCnt(Long bindCompCnt) {
        this.bindCompCnt = bindCompCnt;
    }

    public Date getManuCompDate() {
        return manuCompDate;
    }

    public void setManuCompDate(Date manuCompDate) {
        this.manuCompDate = manuCompDate;
    }

    public Long getWhinQty() {
        return whinQty;
    }

    public void setWhinQty(Long whinQty) {
        this.whinQty = whinQty;
    }

    public Long getDeliQty() {
        return deliQty;
    }

    public void setDeliQty(Long deliQty) {
        this.deliQty = deliQty;
    }

    public Date getLastDeliDate() {
        return lastDeliDate;
    }

    public void setLastDeliDate(Date lastDeliDate) {
        this.lastDeliDate = lastDeliDate;
    }

    public String getSettleFlag() {
        return settleFlag;
    }

    public void setSettleFlag(String settleFlag) {
        this.settleFlag = settleFlag;
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

    public BigDecimal getCurrSettleAmt() {
        return currSettleAmt;
    }

    public void setCurrSettleAmt(BigDecimal currSettleAmt) {
        this.currSettleAmt = currSettleAmt;
    }

    public BigDecimal getInvAmt() {
        return invAmt;
    }

    public void setInvAmt(BigDecimal invAmt) {
        this.invAmt = invAmt;
    }

    public BigDecimal getRecvAmt() {
        return recvAmt;
    }

    public void setRecvAmt(BigDecimal recvAmt) {
        this.recvAmt = recvAmt;
    }

    public Long getWhId() {
        return whId;
    }

    public void setWhId(Long whId) {
        this.whId = whId;
    }

    public Date getCancleDate() {
        return cancleDate;
    }

    public void setCancleDate(Date cancleDate) {
        this.cancleDate = cancleDate;
    }

    public Short getPaperReadyFlag() {
        return paperReadyFlag;
    }

    public void setPaperReadyFlag(Short paperReadyFlag) {
        this.paperReadyFlag = paperReadyFlag;
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
        sb.append(", lineType=").append(lineType);
        sb.append(", prodId=").append(prodId);
        sb.append(", changeFlag=").append(changeFlag);
        sb.append(", versionNum=").append(versionNum);
        sb.append(", repeatNum=").append(repeatNum);
        sb.append(", quoteStatus=").append(quoteStatus);
        sb.append(", distStatus=").append(distStatus);
        sb.append(", settleStatus=").append(settleStatus);
        sb.append(", creditStatus=").append(creditStatus);
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
        sb.append(", custAmt=").append(custAmt);
        sb.append(", currCustAmt=").append(currCustAmt);
        sb.append(", forfreeQty=").append(forfreeQty);
        sb.append(", forcheckQty=").append(forcheckQty);
        sb.append(", forkeepQty=").append(forkeepQty);
        sb.append(", forcustsampleQty=").append(forcustsampleQty);
        sb.append(", manuQty=").append(manuQty);
        sb.append(", freeFlag=").append(freeFlag);
        sb.append(", prodUom=").append(prodUom);
        sb.append(", distingQty=").append(distingQty);
        sb.append(", distQty=").append(distQty);
        sb.append(", qtySplitFlag=").append(qtySplitFlag);
        sb.append(", sampleType=").append(sampleType);
        sb.append(", packageType=").append(packageType);
        sb.append(", manuPackType=").append(manuPackType);
        sb.append(", dueDate=").append(dueDate);
        sb.append(", deliAddrId=").append(deliAddrId);
        sb.append(", deliAddrDesc=").append(deliAddrDesc);
        sb.append(", deliMethod=").append(deliMethod);
        sb.append(", impressionCnt=").append(impressionCnt);
        sb.append(", printCompCnt=").append(printCompCnt);
        sb.append(", bindCompCnt=").append(bindCompCnt);
        sb.append(", manuCompDate=").append(manuCompDate);
        sb.append(", whinQty=").append(whinQty);
        sb.append(", deliQty=").append(deliQty);
        sb.append(", lastDeliDate=").append(lastDeliDate);
        sb.append(", settleFlag=").append(settleFlag);
        sb.append(", settleQty=").append(settleQty);
        sb.append(", settleAmt=").append(settleAmt);
        sb.append(", currSettleAmt=").append(currSettleAmt);
        sb.append(", invAmt=").append(invAmt);
        sb.append(", recvAmt=").append(recvAmt);
        sb.append(", whId=").append(whId);
        sb.append(", cancleDate=").append(cancleDate);
        sb.append(", paperReadyFlag=").append(paperReadyFlag);
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