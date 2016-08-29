package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSoManu implements Serializable {
    /**
     *  null - T_SO_MANU.ID
     */
    private Long id;

    /**
     *  订单ID 对应T_SO.ID - T_SO_MANU.SO_ID
     */
    private Long soId;

    /**
     *  订单产品细表ID 对应T_SO_PROD.ID - T_SO_MANU.SO_PROD_ID
     */
    private Long soProdId;

    /**
     *  分单方式 01-自动分单，02-手工分单 - T_SO_MANU.DIST_METHOD
     */
    private String distMethod;

    /**
     *  接单时间 - T_SO_MANU.ACPT_TIME
     */
    private Date acptTime;

    /**
     *  接单状态 01-已接单你，02-已确认，03-已退单 - T_SO_MANU.ACPT_STATUS
     */
    private String acptStatus;

    /**
     *  分单数量 - T_SO_MANU.DIST_QTY
     */
    private Long distQty;

    /**
     *  计算单价 产品按照工序计算单价 - T_SO_MANU.CALC_PRICE
     */
    private BigDecimal calcPrice;

    /**
     *  计算金额 产品单价*分单数量 - T_SO_MANU.CALC_AMT
     */
    private BigDecimal calcAmt;

    /**
     *  接单金额 所有产品计算金额的和 - T_SO_MANU.ACPT_AMT
     */
    private BigDecimal acptAmt;

    /**
     *  接单反馈内容 - T_SO_MANU.ACPT_COMMENT
     */
    private String acptComment;

    /**
     *  接单人 - T_SO_MANU.ACPT_USER
     */
    private String acptUser;

    /**
     *  退单时间 - T_SO_MANU.RETURN_DATE
     */
    private Date returnDate;

    /**
     *  退单说明 - T_SO_MANU.RETURN_COMMENT
     */
    private String returnComment;

    /**
     *  退单人 - T_SO_MANU.RETURN_USER
     */
    private String returnUser;

    /**
     *  工厂计划交期 （不用） - T_SO_MANU.PLAN_DELI_DATE
     */
    private Date planDeliDate;

    /**
     *  纸张完备状态 01-未确认，02-已确认，03-其他 - T_SO_MANU.PAPER_READY_STATUS
     */
    private String paperReadyStatus;

    /**
     *  纸张确认人 - T_SO_MANU.PAPER_APPRER
     */
    private String paperApprer;

    /**
     *  纸张确认时间 - T_SO_MANU.PAPER_APPR_DATE
     */
    private Date paperApprDate;

    /**
     *  工厂生产状态 01-生产中，02-已完结，03-已完成，04-已终止 - T_SO_MANU.MANU_STATUS
     */
    private String manuStatus;

    /**
     *  入库状态 - T_SO_MANU.WHIN_STATUS
     */
    private String whinStatus;

    /**
     *  发货状态 - T_SO_MANU.DELI_STATUS
     */
    private String deliStatus;

    /**
     *  工厂结算状态 - T_SO_MANU.FACT_SETTLE_STATUS
     */
    private String factSettleStatus;

    /**
     *  产品信息确认状态 01-未确认，02-已确认，03-其他 - T_SO_MANU.PROD_INFO_STATUS
     */
    private String prodInfoStatus;

    /**
     *  产品信息确认人 - T_SO_MANU.PROD_APPRER
     */
    private String prodApprer;

    /**
     *  产品信息确认时间 - T_SO_MANU.PROD_APPR_DATE
     */
    private Date prodApprDate;

    /**
     *  总印张数 - T_SO_MANU.IMPRESSION_CNT
     */
    private Long impressionCnt;

    /**
     *  印刷完成张数 - T_SO_MANU.PRINT_COMP_CNT
     */
    private Long printCompCnt;

    /**
     *  装订完成数 - T_SO_MANU.BIND_COMP_CNT
     */
    private Long bindCompCnt;

    /**
     *  已入库数量 - T_SO_MANU.WHIN_QTY
     */
    private Long whinQty;

    /**
     *  已发货数量 - T_SO_MANU.DELI_QTY
     */
    private Long deliQty;

    /**
     *  生产完成日期 - T_SO_MANU.MANU_COMP_DATE
     */
    private Date manuCompDate;

    /**
     *  金额 - T_SO_MANU.AMT
     */
    private BigDecimal amt;

    /**
     *  备注 - T_SO_MANU.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_SO_MANU.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_SO_MANU.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_SO_MANU.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_SO_MANU.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_SO_MANU.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_SO_MANU.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_SO_MANU.DATA_VERSION
     */
    private Long dataVersion;

    /**
     *  工厂ID 对应T_FACTORY.ID - T_SO_MANU.FACT_ID
     */
    private Long factId;

    /**
     *  完结描述 - T_SO_MANU.CLOSE_DESC
     */
    private String closeDesc;

    /**
     *  手工分单工厂ID 对应T_MANUDIST_FACR.ID - T_SO_MANU.MANU_DIST_ID
     */
    private Long manuDistId;

    /**
     *  null - T_SO_MANU.字段45
     */
    private String 字段45;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDistMethod() {
        return distMethod;
    }

    public void setDistMethod(String distMethod) {
        this.distMethod = distMethod;
    }

    public Date getAcptTime() {
        return acptTime;
    }

    public void setAcptTime(Date acptTime) {
        this.acptTime = acptTime;
    }

    public String getAcptStatus() {
        return acptStatus;
    }

    public void setAcptStatus(String acptStatus) {
        this.acptStatus = acptStatus;
    }

    public Long getDistQty() {
        return distQty;
    }

    public void setDistQty(Long distQty) {
        this.distQty = distQty;
    }

    public BigDecimal getCalcPrice() {
        return calcPrice;
    }

    public void setCalcPrice(BigDecimal calcPrice) {
        this.calcPrice = calcPrice;
    }

    public BigDecimal getCalcAmt() {
        return calcAmt;
    }

    public void setCalcAmt(BigDecimal calcAmt) {
        this.calcAmt = calcAmt;
    }

    public BigDecimal getAcptAmt() {
        return acptAmt;
    }

    public void setAcptAmt(BigDecimal acptAmt) {
        this.acptAmt = acptAmt;
    }

    public String getAcptComment() {
        return acptComment;
    }

    public void setAcptComment(String acptComment) {
        this.acptComment = acptComment;
    }

    public String getAcptUser() {
        return acptUser;
    }

    public void setAcptUser(String acptUser) {
        this.acptUser = acptUser;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnComment() {
        return returnComment;
    }

    public void setReturnComment(String returnComment) {
        this.returnComment = returnComment;
    }

    public String getReturnUser() {
        return returnUser;
    }

    public void setReturnUser(String returnUser) {
        this.returnUser = returnUser;
    }

    public Date getPlanDeliDate() {
        return planDeliDate;
    }

    public void setPlanDeliDate(Date planDeliDate) {
        this.planDeliDate = planDeliDate;
    }

    public String getPaperReadyStatus() {
        return paperReadyStatus;
    }

    public void setPaperReadyStatus(String paperReadyStatus) {
        this.paperReadyStatus = paperReadyStatus;
    }

    public String getPaperApprer() {
        return paperApprer;
    }

    public void setPaperApprer(String paperApprer) {
        this.paperApprer = paperApprer;
    }

    public Date getPaperApprDate() {
        return paperApprDate;
    }

    public void setPaperApprDate(Date paperApprDate) {
        this.paperApprDate = paperApprDate;
    }

    public String getManuStatus() {
        return manuStatus;
    }

    public void setManuStatus(String manuStatus) {
        this.manuStatus = manuStatus;
    }

    public String getWhinStatus() {
        return whinStatus;
    }

    public void setWhinStatus(String whinStatus) {
        this.whinStatus = whinStatus;
    }

    public String getDeliStatus() {
        return deliStatus;
    }

    public void setDeliStatus(String deliStatus) {
        this.deliStatus = deliStatus;
    }

    public String getFactSettleStatus() {
        return factSettleStatus;
    }

    public void setFactSettleStatus(String factSettleStatus) {
        this.factSettleStatus = factSettleStatus;
    }

    public String getProdInfoStatus() {
        return prodInfoStatus;
    }

    public void setProdInfoStatus(String prodInfoStatus) {
        this.prodInfoStatus = prodInfoStatus;
    }

    public String getProdApprer() {
        return prodApprer;
    }

    public void setProdApprer(String prodApprer) {
        this.prodApprer = prodApprer;
    }

    public Date getProdApprDate() {
        return prodApprDate;
    }

    public void setProdApprDate(Date prodApprDate) {
        this.prodApprDate = prodApprDate;
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

    public Date getManuCompDate() {
        return manuCompDate;
    }

    public void setManuCompDate(Date manuCompDate) {
        this.manuCompDate = manuCompDate;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
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

    public Long getFactId() {
        return factId;
    }

    public void setFactId(Long factId) {
        this.factId = factId;
    }

    public String getCloseDesc() {
        return closeDesc;
    }

    public void setCloseDesc(String closeDesc) {
        this.closeDesc = closeDesc;
    }

    public Long getManuDistId() {
        return manuDistId;
    }

    public void setManuDistId(Long manuDistId) {
        this.manuDistId = manuDistId;
    }

    public String get字段45() {
        return 字段45;
    }

    public void set字段45(String 字段45) {
        this.字段45 = 字段45;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", soId=").append(soId);
        sb.append(", soProdId=").append(soProdId);
        sb.append(", distMethod=").append(distMethod);
        sb.append(", acptTime=").append(acptTime);
        sb.append(", acptStatus=").append(acptStatus);
        sb.append(", distQty=").append(distQty);
        sb.append(", calcPrice=").append(calcPrice);
        sb.append(", calcAmt=").append(calcAmt);
        sb.append(", acptAmt=").append(acptAmt);
        sb.append(", acptComment=").append(acptComment);
        sb.append(", acptUser=").append(acptUser);
        sb.append(", returnDate=").append(returnDate);
        sb.append(", returnComment=").append(returnComment);
        sb.append(", returnUser=").append(returnUser);
        sb.append(", planDeliDate=").append(planDeliDate);
        sb.append(", paperReadyStatus=").append(paperReadyStatus);
        sb.append(", paperApprer=").append(paperApprer);
        sb.append(", paperApprDate=").append(paperApprDate);
        sb.append(", manuStatus=").append(manuStatus);
        sb.append(", whinStatus=").append(whinStatus);
        sb.append(", deliStatus=").append(deliStatus);
        sb.append(", factSettleStatus=").append(factSettleStatus);
        sb.append(", prodInfoStatus=").append(prodInfoStatus);
        sb.append(", prodApprer=").append(prodApprer);
        sb.append(", prodApprDate=").append(prodApprDate);
        sb.append(", impressionCnt=").append(impressionCnt);
        sb.append(", printCompCnt=").append(printCompCnt);
        sb.append(", bindCompCnt=").append(bindCompCnt);
        sb.append(", whinQty=").append(whinQty);
        sb.append(", deliQty=").append(deliQty);
        sb.append(", manuCompDate=").append(manuCompDate);
        sb.append(", amt=").append(amt);
        sb.append(", remark=").append(remark);
        sb.append(", lockerId=").append(lockerId);
        sb.append(", lockTs=").append(lockTs);
        sb.append(", modifyerId=").append(modifyerId);
        sb.append(", modifyTs=").append(modifyTs);
        sb.append(", modifyAppsvr=").append(modifyAppsvr);
        sb.append(", modifyModule=").append(modifyModule);
        sb.append(", dataVersion=").append(dataVersion);
        sb.append(", factId=").append(factId);
        sb.append(", closeDesc=").append(closeDesc);
        sb.append(", manuDistId=").append(manuDistId);
        sb.append(", 字段45=").append(字段45);
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