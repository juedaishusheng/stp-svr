package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TDelinoteProd implements Serializable {
    /**
     *  null - T_DELINOTE_PROD.ID
     */
    private Long id;

    /**
     *  发货通知单ID - T_DELINOTE_PROD.DELINOTE_ID
     */
    private Long delinoteId;

    /**
     *  状态 - T_DELINOTE_PROD.LINE_STATUS
     */
    private String lineStatus;

    /**
     *  销售订单ID - T_DELINOTE_PROD.SO_ID
     */
    private Long soId;

    /**
     *  销售订单产品细表ID - T_DELINOTE_PROD.SOPROD_ID
     */
    private Long soprodId;

    /**
     *  订单工厂生产表ID - T_DELINOTE_PROD.SOMANU_ID
     */
    private Long somanuId;

    /**
     *  客户ID - T_DELINOTE_PROD.CUST_ID
     */
    private Long custId;

    /**
     *  产品ID - T_DELINOTE_PROD.PROD_ID
     */
    private Long prodId;

    /**
     *  销售订单正数 - T_DELINOTE_PROD.SOPROD_QTY
     */
    private Long soprodQty;

    /**
     *  仓库ID - T_DELINOTE_PROD.WH_ID
     */
    private Long whId;

    /**
     *  要求发货日期 - T_DELINOTE_PROD.DEMAND_DELI_DATE
     */
    private Date demandDeliDate;

    /**
     *  要求发货数量 - T_DELINOTE_PROD.DEMAND_DELI_QTY
     */
    private Long demandDeliQty;

    /**
     *  要求赠送数量 - T_DELINOTE_PROD.DEMAND_GIFT_QTY
     */
    private Long demandGiftQty;

    /**
     *  累计发货数量 - T_DELINOTE_PROD.SUM_DELI_QTY
     */
    private Long sumDeliQty;

    /**
     *  累计赠送数量 - T_DELINOTE_PROD.SUM_GIFT_QTY
     */
    private Long sumGiftQty;

    /**
     *  单位 - T_DELINOTE_PROD.UOM
     */
    private String uom;

    /**
     *  单位重量 - T_DELINOTE_PROD.UOM_WEIGHT
     */
    private BigDecimal uomWeight;

    /**
     *  总重量 - T_DELINOTE_PROD.WEIGHT
     */
    private BigDecimal weight;

    /**
     *  打包方式 - T_DELINOTE_PROD.PACKAGE_METHOD
     */
    private String packageMethod;

    /**
     *  每箱本数 - T_DELINOTE_PROD.QTY_PERPACKAGE
     */
    private Long qtyPerpackage;

    /**
     *  箱数 - T_DELINOTE_PROD.PACKAGE_QTY
     */
    private Long packageQty;

    /**
     *  余数 - T_DELINOTE_PROD.SPARE_QTY
     */
    private Long spareQty;

    /**
     *  送货地址号 - T_DELINOTE_PROD.DELI_ADDR_NO
     */
    private Long deliAddrNo;

    /**
     *  送货地址 - T_DELINOTE_PROD.DELI_ADDR_DESC
     */
    private String deliAddrDesc;

    /**
     *  送货联系人 - T_DELINOTE_PROD.CONT_PERSON
     */
    private String contPerson;

    /**
     *  联系电话 - T_DELINOTE_PROD.CONT_TEL
     */
    private String contTel;

    /**
     *  备注 - T_DELINOTE_PROD.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_DELINOTE_PROD.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_DELINOTE_PROD.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_DELINOTE_PROD.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_DELINOTE_PROD.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_DELINOTE_PROD.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_DELINOTE_PROD.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_DELINOTE_PROD.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDelinoteId() {
        return delinoteId;
    }

    public void setDelinoteId(Long delinoteId) {
        this.delinoteId = delinoteId;
    }

    public String getLineStatus() {
        return lineStatus;
    }

    public void setLineStatus(String lineStatus) {
        this.lineStatus = lineStatus;
    }

    public Long getSoId() {
        return soId;
    }

    public void setSoId(Long soId) {
        this.soId = soId;
    }

    public Long getSoprodId() {
        return soprodId;
    }

    public void setSoprodId(Long soprodId) {
        this.soprodId = soprodId;
    }

    public Long getSomanuId() {
        return somanuId;
    }

    public void setSomanuId(Long somanuId) {
        this.somanuId = somanuId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Long getSoprodQty() {
        return soprodQty;
    }

    public void setSoprodQty(Long soprodQty) {
        this.soprodQty = soprodQty;
    }

    public Long getWhId() {
        return whId;
    }

    public void setWhId(Long whId) {
        this.whId = whId;
    }

    public Date getDemandDeliDate() {
        return demandDeliDate;
    }

    public void setDemandDeliDate(Date demandDeliDate) {
        this.demandDeliDate = demandDeliDate;
    }

    public Long getDemandDeliQty() {
        return demandDeliQty;
    }

    public void setDemandDeliQty(Long demandDeliQty) {
        this.demandDeliQty = demandDeliQty;
    }

    public Long getDemandGiftQty() {
        return demandGiftQty;
    }

    public void setDemandGiftQty(Long demandGiftQty) {
        this.demandGiftQty = demandGiftQty;
    }

    public Long getSumDeliQty() {
        return sumDeliQty;
    }

    public void setSumDeliQty(Long sumDeliQty) {
        this.sumDeliQty = sumDeliQty;
    }

    public Long getSumGiftQty() {
        return sumGiftQty;
    }

    public void setSumGiftQty(Long sumGiftQty) {
        this.sumGiftQty = sumGiftQty;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public BigDecimal getUomWeight() {
        return uomWeight;
    }

    public void setUomWeight(BigDecimal uomWeight) {
        this.uomWeight = uomWeight;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getPackageMethod() {
        return packageMethod;
    }

    public void setPackageMethod(String packageMethod) {
        this.packageMethod = packageMethod;
    }

    public Long getQtyPerpackage() {
        return qtyPerpackage;
    }

    public void setQtyPerpackage(Long qtyPerpackage) {
        this.qtyPerpackage = qtyPerpackage;
    }

    public Long getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Long packageQty) {
        this.packageQty = packageQty;
    }

    public Long getSpareQty() {
        return spareQty;
    }

    public void setSpareQty(Long spareQty) {
        this.spareQty = spareQty;
    }

    public Long getDeliAddrNo() {
        return deliAddrNo;
    }

    public void setDeliAddrNo(Long deliAddrNo) {
        this.deliAddrNo = deliAddrNo;
    }

    public String getDeliAddrDesc() {
        return deliAddrDesc;
    }

    public void setDeliAddrDesc(String deliAddrDesc) {
        this.deliAddrDesc = deliAddrDesc;
    }

    public String getContPerson() {
        return contPerson;
    }

    public void setContPerson(String contPerson) {
        this.contPerson = contPerson;
    }

    public String getContTel() {
        return contTel;
    }

    public void setContTel(String contTel) {
        this.contTel = contTel;
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
        sb.append(", delinoteId=").append(delinoteId);
        sb.append(", lineStatus=").append(lineStatus);
        sb.append(", soId=").append(soId);
        sb.append(", soprodId=").append(soprodId);
        sb.append(", somanuId=").append(somanuId);
        sb.append(", custId=").append(custId);
        sb.append(", prodId=").append(prodId);
        sb.append(", soprodQty=").append(soprodQty);
        sb.append(", whId=").append(whId);
        sb.append(", demandDeliDate=").append(demandDeliDate);
        sb.append(", demandDeliQty=").append(demandDeliQty);
        sb.append(", demandGiftQty=").append(demandGiftQty);
        sb.append(", sumDeliQty=").append(sumDeliQty);
        sb.append(", sumGiftQty=").append(sumGiftQty);
        sb.append(", uom=").append(uom);
        sb.append(", uomWeight=").append(uomWeight);
        sb.append(", weight=").append(weight);
        sb.append(", packageMethod=").append(packageMethod);
        sb.append(", qtyPerpackage=").append(qtyPerpackage);
        sb.append(", packageQty=").append(packageQty);
        sb.append(", spareQty=").append(spareQty);
        sb.append(", deliAddrNo=").append(deliAddrNo);
        sb.append(", deliAddrDesc=").append(deliAddrDesc);
        sb.append(", contPerson=").append(contPerson);
        sb.append(", contTel=").append(contTel);
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