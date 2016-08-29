package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TManudistProd implements Serializable {
    /**
     *  null - T_MANUDIST_PROD.ID
     */
    private Long id;

    /**
     *  手工分单工厂ID 对应T_MANUDIST_FACT.ID - T_MANUDIST_PROD.MANU_DIST_ID
     */
    private Long manuDistId;

    /**
     *  订单ID 对应T_SO.ID - T_MANUDIST_PROD.SO_ID
     */
    private Long soId;

    /**
     *  工厂ID 对应T_FACTORY.ID - T_MANUDIST_PROD.FACT_ID
     */
    private Long factId;

    /**
     *  订单细表ID 对应T_SO_PROD.ID - T_MANUDIST_PROD.SOPROD_ID
     */
    private Long soprodId;

    /**
     *  产品ID 对应T_PROD.ID - T_MANUDIST_PROD.PROD_ID
     */
    private Long prodId;

    /**
     *  分单数量 - T_MANUDIST_PROD.DIST_QTY
     */
    private Long distQty;

    /**
     *  计算单价 单位产品按照工序计算的工厂单价 - T_MANUDIST_PROD.CALC_PRICE
     */
    private BigDecimal calcPrice;

    /**
     *  成本单价 单位产品按照工序计算的成本单价 - T_MANUDIST_PROD.COST_PRICE
     */
    private BigDecimal costPrice;

    /**
     *  计算金额 计算单价*分单数量 - T_MANUDIST_PROD.CALC_AMT
     */
    private BigDecimal calcAmt;

    /**
     *  备注 - T_MANUDIST_PROD.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_MANUDIST_PROD.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_MANUDIST_PROD.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_MANUDIST_PROD.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_MANUDIST_PROD.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_MANUDIST_PROD.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_MANUDIST_PROD.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_MANUDIST_PROD.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getManuDistId() {
        return manuDistId;
    }

    public void setManuDistId(Long manuDistId) {
        this.manuDistId = manuDistId;
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

    public Long getSoprodId() {
        return soprodId;
    }

    public void setSoprodId(Long soprodId) {
        this.soprodId = soprodId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
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

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getCalcAmt() {
        return calcAmt;
    }

    public void setCalcAmt(BigDecimal calcAmt) {
        this.calcAmt = calcAmt;
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
        sb.append(", manuDistId=").append(manuDistId);
        sb.append(", soId=").append(soId);
        sb.append(", factId=").append(factId);
        sb.append(", soprodId=").append(soprodId);
        sb.append(", prodId=").append(prodId);
        sb.append(", distQty=").append(distQty);
        sb.append(", calcPrice=").append(calcPrice);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", calcAmt=").append(calcAmt);
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