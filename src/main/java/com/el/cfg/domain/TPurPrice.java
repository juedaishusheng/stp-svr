package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TPurPrice implements Serializable {
    /**
     *  null - T_PUR_PRICE.ID
     */
    private Long id;

    /**
     *  null - T_PUR_PRICE.OU_ID
     */
    private Long ouId;

    /**
     *  null - T_PUR_PRICE.MCU_ID
     */
    private Long mcuId;

    /**
     *  商品ID - T_PUR_PRICE.ITEM_ID
     */
    private Long itemId;

    /**
     *  外部编号 - T_PUR_PRICE.OUTER_ID
     */
    private Long outerId;

    /**
     *  外部编号2 - T_PUR_PRICE.OUTER_ID2
     */
    private String outerId2;

    /**
     *  外部编号3 - T_PUR_PRICE.OUTER_ID3
     */
    private String outerId3;

    /**
     *  协议号 - T_PUR_PRICE.CONTRACT_NO
     */
    private String contractNo;

    /**
     *  地址号 - T_PUR_PRICE.ADDR_NO
     */
    private Long addrNo;

    /**
     *  价格 - T_PUR_PRICE.PRICE
     */
    private BigDecimal price;

    /**
     *  价格单位 - T_PUR_PRICE.PRICE_UOM
     */
    private String priceUom;

    /**
     *  币种 - T_PUR_PRICE.CURR
     */
    private String curr;

    /**
     *  数量 - T_PUR_PRICE.QTY
     */
    private BigDecimal qty;

    /**
     *  起始时间 - T_PUR_PRICE.BEGIN_DATE
     */
    private Date beginDate;

    /**
     *  截止时间 - T_PUR_PRICE.END_DATE
     */
    private Date endDate;

    /**
     *  锁定人ID - T_PUR_PRICE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PUR_PRICE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PUR_PRICE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PUR_PRICE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PUR_PRICE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PUR_PRICE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PUR_PRICE.DATA_VERSION
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

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getOuterId() {
        return outerId;
    }

    public void setOuterId(Long outerId) {
        this.outerId = outerId;
    }

    public String getOuterId2() {
        return outerId2;
    }

    public void setOuterId2(String outerId2) {
        this.outerId2 = outerId2;
    }

    public String getOuterId3() {
        return outerId3;
    }

    public void setOuterId3(String outerId3) {
        this.outerId3 = outerId3;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Long getAddrNo() {
        return addrNo;
    }

    public void setAddrNo(Long addrNo) {
        this.addrNo = addrNo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPriceUom() {
        return priceUom;
    }

    public void setPriceUom(String priceUom) {
        this.priceUom = priceUom;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
        sb.append(", itemId=").append(itemId);
        sb.append(", outerId=").append(outerId);
        sb.append(", outerId2=").append(outerId2);
        sb.append(", outerId3=").append(outerId3);
        sb.append(", contractNo=").append(contractNo);
        sb.append(", addrNo=").append(addrNo);
        sb.append(", price=").append(price);
        sb.append(", priceUom=").append(priceUom);
        sb.append(", curr=").append(curr);
        sb.append(", qty=").append(qty);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
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