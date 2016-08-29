package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TProdin implements Serializable {
    /**
     *  null - T_PRODIN.ID
     */
    private Long id;

    /**
     *  公司ID 对应T_OU.ID - T_PRODIN.OU_ID
     */
    private Long ouId;

    /**
     *  MCUID - T_PRODIN.MCU_ID
     */
    private Long mcuId;

    /**
     *  工厂ID 对应T_FACTORY.ID - T_PRODIN.FACT_ID
     */
    private Long factId;

    /**
     *  单号 - T_PRODIN.DOC_NO
     */
    private String docNo;

    /**
     *  类型 - T_PRODIN.DOC_TYPE
     */
    private String docType;

    /**
     *  入库日期 - T_PRODIN.DOC_DATE
     */
    private Date docDate;

    /**
     *  状态 - T_PRODIN.DOC_STATUS
     */
    private String docStatus;

    /**
     *  仓库ID - T_PRODIN.WH_ID
     */
    private Long whId;

    /**
     *  入库人 - T_PRODIN.WHIN_PIC
     */
    private String whinPic;

    /**
     *  销售订单ID 对应T_SO.ID - T_PRODIN.SO_ID
     */
    private Long soId;

    /**
     *  销售订单产品细表ID 对应T_SO_PROD.ID - T_PRODIN.SOPROD_ID
     */
    private Long soprodId;

    /**
     *  订单工厂生产表ID 对应T_SO_MANU.ID - T_PRODIN.SOMANU_ID
     */
    private Long somanuId;

    /**
     *  客户ID 对应T_CUST.ID - T_PRODIN.CUST_ID
     */
    private Long custId;

    /**
     *  产品ID 对应T_PROD.ID - T_PRODIN.PROD_ID
     */
    private Long prodId;

    /**
     *  入库数量 - T_PRODIN.WHIN_QTY
     */
    private Long whinQty;

    /**
     *  销售订单正数 - T_PRODIN.SOPROD_QTY
     */
    private Long soprodQty;

    /**
     *  底 - T_PRODIN.BOTTOM
     */
    private Integer bottom;

    /**
     *  高 - T_PRODIN.HEIGHT
     */
    private Integer height;

    /**
     *  包册数 - T_PRODIN.QTY_PERPACKAG
     */
    private Long qtyPerpackag;

    /**
     *  尾数 - T_PRODIN.SPARE_QTY
     */
    private Long spareQty;

    /**
     *  备注 - T_PRODIN.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_PRODIN.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PRODIN.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PRODIN.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PRODIN.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PRODIN.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PRODIN.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PRODIN.DATA_VERSION
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

    public Long getWhId() {
        return whId;
    }

    public void setWhId(Long whId) {
        this.whId = whId;
    }

    public String getWhinPic() {
        return whinPic;
    }

    public void setWhinPic(String whinPic) {
        this.whinPic = whinPic;
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

    public Long getWhinQty() {
        return whinQty;
    }

    public void setWhinQty(Long whinQty) {
        this.whinQty = whinQty;
    }

    public Long getSoprodQty() {
        return soprodQty;
    }

    public void setSoprodQty(Long soprodQty) {
        this.soprodQty = soprodQty;
    }

    public Integer getBottom() {
        return bottom;
    }

    public void setBottom(Integer bottom) {
        this.bottom = bottom;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Long getQtyPerpackag() {
        return qtyPerpackag;
    }

    public void setQtyPerpackag(Long qtyPerpackag) {
        this.qtyPerpackag = qtyPerpackag;
    }

    public Long getSpareQty() {
        return spareQty;
    }

    public void setSpareQty(Long spareQty) {
        this.spareQty = spareQty;
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
        sb.append(", ouId=").append(ouId);
        sb.append(", mcuId=").append(mcuId);
        sb.append(", factId=").append(factId);
        sb.append(", docNo=").append(docNo);
        sb.append(", docType=").append(docType);
        sb.append(", docDate=").append(docDate);
        sb.append(", docStatus=").append(docStatus);
        sb.append(", whId=").append(whId);
        sb.append(", whinPic=").append(whinPic);
        sb.append(", soId=").append(soId);
        sb.append(", soprodId=").append(soprodId);
        sb.append(", somanuId=").append(somanuId);
        sb.append(", custId=").append(custId);
        sb.append(", prodId=").append(prodId);
        sb.append(", whinQty=").append(whinQty);
        sb.append(", soprodQty=").append(soprodQty);
        sb.append(", bottom=").append(bottom);
        sb.append(", height=").append(height);
        sb.append(", qtyPerpackag=").append(qtyPerpackag);
        sb.append(", spareQty=").append(spareQty);
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