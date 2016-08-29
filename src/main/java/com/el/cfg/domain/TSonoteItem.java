package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TSonoteItem implements Serializable {
    /**
     *  null - T_SONOTE_ITEM.ID
     */
    private Long id;

    /**
     *  公司ID 对应T_OU.ID - T_SONOTE_ITEM.OU_ID
     */
    private Long ouId;

    /**
     *  工厂ID 对应T_FACTORY.ID - T_SONOTE_ITEM.FACT_ID
     */
    private Long factId;

    /**
     *  订单ID 对应T_SO.ID - T_SONOTE_ITEM.SO_ID
     */
    private Long soId;

    /**
     *  订单生产表ID 对应T_SO_MANU.ID - T_SONOTE_ITEM.SO_MANU_ID
     */
    private Long soManuId;

    /**
     *  产品ID 对应T_PROD.ID - T_SONOTE_ITEM.PROD_ID
     */
    private Long prodId;

    /**
     *  部件ID 对应T_PART.ID - T_SONOTE_ITEM.PART_ID
     */
    private Long partId;

    /**
     *  记录时间 - T_SONOTE_ITEM.ITEM_DT
     */
    private Date itemDt;

    /**
     *  记录人ID - T_SONOTE_ITEM.RPTER_ID
     */
    private Long rpterId;

    /**
     *  记录人姓名 - T_SONOTE_ITEM.RPTER_NAME
     */
    private String rpterName;

    /**
     *  记录编号 - T_SONOTE_ITEM.ITEM_NO
     */
    private String itemNo;

    /**
     *  记录描述 - T_SONOTE_ITEM.ITEM_DESC
     */
    private String itemDesc;

    /**
     *  造成的影响 - T_SONOTE_ITEM.ITEM_IMPACT
     */
    private String itemImpact;

    /**
     *  解决方案 - T_SONOTE_ITEM.ITEM_SOLUTION
     */
    private String itemSolution;

    /**
     *  有效标志 0-无效，1-有效 - T_SONOTE_ITEM.VALID_FLAG
     */
    private Short validFlag;

    /**
     *  备注 - T_SONOTE_ITEM.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_SONOTE_ITEM.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_SONOTE_ITEM.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_SONOTE_ITEM.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_SONOTE_ITEM.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_SONOTE_ITEM.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_SONOTE_ITEM.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_SONOTE_ITEM.DATA_VERSION
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

    public Long getFactId() {
        return factId;
    }

    public void setFactId(Long factId) {
        this.factId = factId;
    }

    public Long getSoId() {
        return soId;
    }

    public void setSoId(Long soId) {
        this.soId = soId;
    }

    public Long getSoManuId() {
        return soManuId;
    }

    public void setSoManuId(Long soManuId) {
        this.soManuId = soManuId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public Date getItemDt() {
        return itemDt;
    }

    public void setItemDt(Date itemDt) {
        this.itemDt = itemDt;
    }

    public Long getRpterId() {
        return rpterId;
    }

    public void setRpterId(Long rpterId) {
        this.rpterId = rpterId;
    }

    public String getRpterName() {
        return rpterName;
    }

    public void setRpterName(String rpterName) {
        this.rpterName = rpterName;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemImpact() {
        return itemImpact;
    }

    public void setItemImpact(String itemImpact) {
        this.itemImpact = itemImpact;
    }

    public String getItemSolution() {
        return itemSolution;
    }

    public void setItemSolution(String itemSolution) {
        this.itemSolution = itemSolution;
    }

    public Short getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(Short validFlag) {
        this.validFlag = validFlag;
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
        sb.append(", factId=").append(factId);
        sb.append(", soId=").append(soId);
        sb.append(", soManuId=").append(soManuId);
        sb.append(", prodId=").append(prodId);
        sb.append(", partId=").append(partId);
        sb.append(", itemDt=").append(itemDt);
        sb.append(", rpterId=").append(rpterId);
        sb.append(", rpterName=").append(rpterName);
        sb.append(", itemNo=").append(itemNo);
        sb.append(", itemDesc=").append(itemDesc);
        sb.append(", itemImpact=").append(itemImpact);
        sb.append(", itemSolution=").append(itemSolution);
        sb.append(", validFlag=").append(validFlag);
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