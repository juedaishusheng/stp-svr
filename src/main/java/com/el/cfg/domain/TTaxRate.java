package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TTaxRate implements Serializable {
    /**
     *  null - T_TAX_RATE.ID
     */
    private Long id;

    /**
     *  null - T_TAX_RATE.OU_ID
     */
    private Long ouId;

    /**
     *  null - T_TAX_RATE.MCU_ID
     */
    private Long mcuId;

    /**
     *  税区 - T_TAX_RATE.TAX_AREA
     */
    private String taxArea;

    /**
     *  税区说明 - T_TAX_RATE.AREA_DESC
     */
    private String areaDesc;

    /**
     *  税务机关1 - T_TAX_RATE.TAX_AUTH1
     */
    private Long taxAuth1;

    /**
     *  税率1 - T_TAX_RATE.TAX_RATE1
     */
    private BigDecimal taxRate1;

    /**
     *  税务机关2 - T_TAX_RATE.TAX_AUTH2
     */
    private Long taxAuth2;

    /**
     *  税率2 - T_TAX_RATE.TAX_RATE2
     */
    private BigDecimal taxRate2;

    /**
     *  税务机关3 - T_TAX_RATE.TAX_AUTH3
     */
    private Long taxAuth3;

    /**
     *  税率3 - T_TAX_RATE.TAX_RATE3
     */
    private BigDecimal taxRate3;

    /**
     *  税务机关4 - T_TAX_RATE.TAX_AUTH4
     */
    private Long taxAuth4;

    /**
     *  税率4 - T_TAX_RATE.TAX_RATE4
     */
    private BigDecimal taxRate4;

    /**
     *  税务机关5 - T_TAX_RATE.TAX_AUTH5
     */
    private Long taxAuth5;

    /**
     *  税率5 - T_TAX_RATE.TAX_RATE5
     */
    private BigDecimal taxRate5;

    /**
     *  null - T_TAX_RATE.ITEM_ID
     */
    private Long itemId;

    /**
     *  短项目号 - T_TAX_RATE.ITEM_CODE
     */
    private Long itemCode;

    /**
     *  第二项目号 - T_TAX_RATE.ITEM_CODE2
     */
    private String itemCode2;

    /**
     *  第三项目号 - T_TAX_RATE.ITEM_CODE3
     */
    private String itemCode3;

    /**
     *  计量单位 - T_TAX_RATE.UOM
     */
    private String uom;

    /**
     *  锁定人ID - T_TAX_RATE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_TAX_RATE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_TAX_RATE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_TAX_RATE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_TAX_RATE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_TAX_RATE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_TAX_RATE.DATA_VERSION
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

    public String getTaxArea() {
        return taxArea;
    }

    public void setTaxArea(String taxArea) {
        this.taxArea = taxArea;
    }

    public String getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }

    public Long getTaxAuth1() {
        return taxAuth1;
    }

    public void setTaxAuth1(Long taxAuth1) {
        this.taxAuth1 = taxAuth1;
    }

    public BigDecimal getTaxRate1() {
        return taxRate1;
    }

    public void setTaxRate1(BigDecimal taxRate1) {
        this.taxRate1 = taxRate1;
    }

    public Long getTaxAuth2() {
        return taxAuth2;
    }

    public void setTaxAuth2(Long taxAuth2) {
        this.taxAuth2 = taxAuth2;
    }

    public BigDecimal getTaxRate2() {
        return taxRate2;
    }

    public void setTaxRate2(BigDecimal taxRate2) {
        this.taxRate2 = taxRate2;
    }

    public Long getTaxAuth3() {
        return taxAuth3;
    }

    public void setTaxAuth3(Long taxAuth3) {
        this.taxAuth3 = taxAuth3;
    }

    public BigDecimal getTaxRate3() {
        return taxRate3;
    }

    public void setTaxRate3(BigDecimal taxRate3) {
        this.taxRate3 = taxRate3;
    }

    public Long getTaxAuth4() {
        return taxAuth4;
    }

    public void setTaxAuth4(Long taxAuth4) {
        this.taxAuth4 = taxAuth4;
    }

    public BigDecimal getTaxRate4() {
        return taxRate4;
    }

    public void setTaxRate4(BigDecimal taxRate4) {
        this.taxRate4 = taxRate4;
    }

    public Long getTaxAuth5() {
        return taxAuth5;
    }

    public void setTaxAuth5(Long taxAuth5) {
        this.taxAuth5 = taxAuth5;
    }

    public BigDecimal getTaxRate5() {
        return taxRate5;
    }

    public void setTaxRate5(BigDecimal taxRate5) {
        this.taxRate5 = taxRate5;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemCode() {
        return itemCode;
    }

    public void setItemCode(Long itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemCode2() {
        return itemCode2;
    }

    public void setItemCode2(String itemCode2) {
        this.itemCode2 = itemCode2;
    }

    public String getItemCode3() {
        return itemCode3;
    }

    public void setItemCode3(String itemCode3) {
        this.itemCode3 = itemCode3;
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
        sb.append(", taxArea=").append(taxArea);
        sb.append(", areaDesc=").append(areaDesc);
        sb.append(", taxAuth1=").append(taxAuth1);
        sb.append(", taxRate1=").append(taxRate1);
        sb.append(", taxAuth2=").append(taxAuth2);
        sb.append(", taxRate2=").append(taxRate2);
        sb.append(", taxAuth3=").append(taxAuth3);
        sb.append(", taxRate3=").append(taxRate3);
        sb.append(", taxAuth4=").append(taxAuth4);
        sb.append(", taxRate4=").append(taxRate4);
        sb.append(", taxAuth5=").append(taxAuth5);
        sb.append(", taxRate5=").append(taxRate5);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemCode=").append(itemCode);
        sb.append(", itemCode2=").append(itemCode2);
        sb.append(", itemCode3=").append(itemCode3);
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