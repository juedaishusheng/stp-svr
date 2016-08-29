package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TPapertrans implements Serializable {
    /**
     *  null - T_PAPERTRANS.ID
     */
    private Long id;

    /**
     *  公司ID 对应T_OU.ID - T_PAPERTRANS.OU_ID
     */
    private Long ouId;

    /**
     *  MCUID - T_PAPERTRANS.MCU_ID
     */
    private Long mcuId;

    /**
     *  工厂ID 对应T_FACTORY.ID - T_PAPERTRANS.FACT_ID
     */
    private Long factId;

    /**
     *  调拨单号 - T_PAPERTRANS.DOC_NO
     */
    private String docNo;

    /**
     *  类型 - T_PAPERTRANS.DOC_TYPE
     */
    private String docType;

    /**
     *  调拨日期 - T_PAPERTRANS.DOC_DATE
     */
    private Date docDate;

    /**
     *  状态 - T_PAPERTRANS.DOC_STATUS
     */
    private String docStatus;

    /**
     *  销售订单ID 对应T_SO.ID - T_PAPERTRANS.SO_ID
     */
    private Long soId;

    /**
     *  销售订单产品细表ID 对应T_SO_PROD.ID - T_PAPERTRANS.SOPROD_ID
     */
    private Long soprodId;

    /**
     *  产品ID 对应T_PROD.ID - T_PAPERTRANS.PROD_ID
     */
    private Long prodId;

    /**
     *  出仓ID - T_PAPERTRANS.OUTWH_ID
     */
    private Long outwhId;

    /**
     *  入仓ID - T_PAPERTRANS.INWH_ID
     */
    private Long inwhId;

    /**
     *  发出方仓管 - T_PAPERTRANS.OUTWH_PIC
     */
    private String outwhPic;

    /**
     *  接收方仓管 - T_PAPERTRANS.INWH_PIC
     */
    private String inwhPic;

    /**
     *  纸张料号ID - T_PAPERTRANS.ITEM_ID
     */
    private Long itemId;

    /**
     *  批次描述 - T_PAPERTRANS.BATCH_DESC
     */
    private String batchDesc;

    /**
     *  计划发出数量 - T_PAPERTRANS.PLAN_OUT_QTY
     */
    private Long planOutQty;

    /**
     *  实际发出数量 - T_PAPERTRANS.ACTU_OUT_QTY
     */
    private Long actuOutQty;

    /**
     *  已接收数量 - T_PAPERTRANS.RECVED_QTY
     */
    private Long recvedQty;

    /**
     *  单位 - T_PAPERTRANS.UOM
     */
    private String uom;

    /**
     *  锁定人ID - T_PAPERTRANS.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PAPERTRANS.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PAPERTRANS.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PAPERTRANS.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PAPERTRANS.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PAPERTRANS.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PAPERTRANS.DATA_VERSION
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

    public Long getMcuId() {
        return mcuId;
    }

    public void setMcuId(Long mcuId) {
        this.mcuId = mcuId;
    }

    public Long getFactId() {
        return factId;
    }

    public void setFactId(Long factId) {
        this.factId = factId;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
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

    public Long getOutwhId() {
        return outwhId;
    }

    public void setOutwhId(Long outwhId) {
        this.outwhId = outwhId;
    }

    public Long getInwhId() {
        return inwhId;
    }

    public void setInwhId(Long inwhId) {
        this.inwhId = inwhId;
    }

    public String getOutwhPic() {
        return outwhPic;
    }

    public void setOutwhPic(String outwhPic) {
        this.outwhPic = outwhPic;
    }

    public String getInwhPic() {
        return inwhPic;
    }

    public void setInwhPic(String inwhPic) {
        this.inwhPic = inwhPic;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getBatchDesc() {
        return batchDesc;
    }

    public void setBatchDesc(String batchDesc) {
        this.batchDesc = batchDesc;
    }

    public Long getPlanOutQty() {
        return planOutQty;
    }

    public void setPlanOutQty(Long planOutQty) {
        this.planOutQty = planOutQty;
    }

    public Long getActuOutQty() {
        return actuOutQty;
    }

    public void setActuOutQty(Long actuOutQty) {
        this.actuOutQty = actuOutQty;
    }

    public Long getRecvedQty() {
        return recvedQty;
    }

    public void setRecvedQty(Long recvedQty) {
        this.recvedQty = recvedQty;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
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
        sb.append(", mcuId=").append(mcuId);
        sb.append(", factId=").append(factId);
        sb.append(", docNo=").append(docNo);
        sb.append(", docType=").append(docType);
        sb.append(", docDate=").append(docDate);
        sb.append(", docStatus=").append(docStatus);
        sb.append(", soId=").append(soId);
        sb.append(", soprodId=").append(soprodId);
        sb.append(", prodId=").append(prodId);
        sb.append(", outwhId=").append(outwhId);
        sb.append(", inwhId=").append(inwhId);
        sb.append(", outwhPic=").append(outwhPic);
        sb.append(", inwhPic=").append(inwhPic);
        sb.append(", itemId=").append(itemId);
        sb.append(", batchDesc=").append(batchDesc);
        sb.append(", planOutQty=").append(planOutQty);
        sb.append(", actuOutQty=").append(actuOutQty);
        sb.append(", recvedQty=").append(recvedQty);
        sb.append(", uom=").append(uom);
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