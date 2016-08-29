package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TPaperPrice implements Serializable {
    /**
     *  null - T_PAPER_PRICE.ID
     */
    private Long id;

    /**
     *  OUID - T_PAPER_PRICE.OU_ID
     */
    private Long ouId;

    /**
     *  价格类型 标准销售价/标准采购价/社价/厂价 - T_PAPER_PRICE.PRICE_TYPE
     */
    private String priceType;

    /**
     *  地址号 - T_PAPER_PRICE.ADDR_NO
     */
    private Long addrNo;

    /**
     *  纸张类别 卷筒,平张 - T_PAPER_PRICE.PAPER_CLASS
     */
    private String paperClass;

    /**
     *  纸张种类 - T_PAPER_PRICE.PAPER_TYPE
     */
    private String paperType;

    /**
     *  纸张品牌 - T_PAPER_PRICE.PAPER_BRAND
     */
    private String paperBrand;

    /**
     *  纸张克重 - T_PAPER_PRICE.PAPER_WEIGHT
     */
    private String paperWeight;

    /**
     *  计价单位 - T_PAPER_PRICE.PRICE_UOM
     */
    private String priceUom;

    /**
     *  价格 - T_PAPER_PRICE.PRICE
     */
    private BigDecimal price;

    /**
     *  锁定人ID - T_PAPER_PRICE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PAPER_PRICE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PAPER_PRICE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PAPER_PRICE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PAPER_PRICE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PAPER_PRICE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PAPER_PRICE.DATA_VERSION
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

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public Long getAddrNo() {
        return addrNo;
    }

    public void setAddrNo(Long addrNo) {
        this.addrNo = addrNo;
    }

    public String getPaperClass() {
        return paperClass;
    }

    public void setPaperClass(String paperClass) {
        this.paperClass = paperClass;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getPaperBrand() {
        return paperBrand;
    }

    public void setPaperBrand(String paperBrand) {
        this.paperBrand = paperBrand;
    }

    public String getPaperWeight() {
        return paperWeight;
    }

    public void setPaperWeight(String paperWeight) {
        this.paperWeight = paperWeight;
    }

    public String getPriceUom() {
        return priceUom;
    }

    public void setPriceUom(String priceUom) {
        this.priceUom = priceUom;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
        sb.append(", priceType=").append(priceType);
        sb.append(", addrNo=").append(addrNo);
        sb.append(", paperClass=").append(paperClass);
        sb.append(", paperType=").append(paperType);
        sb.append(", paperBrand=").append(paperBrand);
        sb.append(", paperWeight=").append(paperWeight);
        sb.append(", priceUom=").append(priceUom);
        sb.append(", price=").append(price);
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