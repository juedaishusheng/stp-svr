package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TPrintPo implements Serializable {
    /**
     *  null - T_PRINT_PO.ID
     */
    private Long id;

    /**
     *  公司ID 对应T_OU.ID - T_PRINT_PO.OU_ID
     */
    private Long ouId;

    /**
     *  工厂ID 对应T_FACTORY.ID - T_PRINT_PO.FACT_ID
     */
    private Long factId;

    /**
     *  订单ID 对应T_SO.ID - T_PRINT_PO.SO_ID
     */
    private Long soId;

    /**
     *  订单编号 对应T_SO.SO_NO - T_PRINT_PO.SO_NO
     */
    private String soNo;

    /**
     *  订单工厂生产表ID 对应T_SO_MANU.ID - T_PRINT_PO.SO_MANU_ID
     */
    private Long soManuId;

    /**
     *  供应商编号 - T_PRINT_PO.SUPP_CODE
     */
    private String suppCode;

    /**
     *  供应商名称 - T_PRINT_PO.SUPP_NAME
     */
    private String suppName;

    /**
     *  采购单编号 - T_PRINT_PO.PO_NO
     */
    private String poNo;

    /**
     *  行号 - T_PRINT_PO.LINE_NO
     */
    private BigDecimal lineNo;

    /**
     *  产品编号 对应T_PROD.PROD_CODE - T_PRINT_PO.PROD_CODE
     */
    private String prodCode;

    /**
     *  产品名称 对应T_PROD.PROD_NAME - T_PRINT_PO.PROD_NAME
     */
    private String prodName;

    /**
     *  采购数量 - T_PRINT_PO.QTY
     */
    private Long qty;

    /**
     *  单位 - T_PRINT_PO.UOM
     */
    private String uom;

    /**
     *  单价 - T_PRINT_PO.PRICE
     */
    private BigDecimal price;

    /**
     *  采购金额 - T_PRINT_PO.AMT
     */
    private BigDecimal amt;

    /**
     *  采购单日期 - T_PRINT_PO.PO_DATE
     */
    private Date poDate;

    /**
     *  采购入库数量 - T_PRINT_PO.WHIN_QTY
     */
    private Long whinQty;

    /**
     *  入库单价 - T_PRINT_PO.WHIN_PRICE
     */
    private BigDecimal whinPrice;

    /**
     *  采购入库金额 - T_PRINT_PO.WHIN_AMT
     */
    private BigDecimal whinAmt;

    /**
     *  发票总额 - T_PRINT_PO.INV_AMT
     */
    private BigDecimal invAmt;

    /**
     *  未开票金额 - T_PRINT_PO.NOINV_AMT
     */
    private BigDecimal noinvAmt;

    /**
     *  付款金额 - T_PRINT_PO.PAY_AMT
     */
    private BigDecimal payAmt;

    /**
     *  未付款金额 - T_PRINT_PO.NOPAY_AMT
     */
    private BigDecimal nopayAmt;

    /**
     *  锁定人ID - T_PRINT_PO.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PRINT_PO.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PRINT_PO.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PRINT_PO.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PRINT_PO.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PRINT_PO.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PRINT_PO.DATA_VERSION
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

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public Long getSoManuId() {
        return soManuId;
    }

    public void setSoManuId(Long soManuId) {
        this.soManuId = soManuId;
    }

    public String getSuppCode() {
        return suppCode;
    }

    public void setSuppCode(String suppCode) {
        this.suppCode = suppCode;
    }

    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public BigDecimal getLineNo() {
        return lineNo;
    }

    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public Date getPoDate() {
        return poDate;
    }

    public void setPoDate(Date poDate) {
        this.poDate = poDate;
    }

    public Long getWhinQty() {
        return whinQty;
    }

    public void setWhinQty(Long whinQty) {
        this.whinQty = whinQty;
    }

    public BigDecimal getWhinPrice() {
        return whinPrice;
    }

    public void setWhinPrice(BigDecimal whinPrice) {
        this.whinPrice = whinPrice;
    }

    public BigDecimal getWhinAmt() {
        return whinAmt;
    }

    public void setWhinAmt(BigDecimal whinAmt) {
        this.whinAmt = whinAmt;
    }

    public BigDecimal getInvAmt() {
        return invAmt;
    }

    public void setInvAmt(BigDecimal invAmt) {
        this.invAmt = invAmt;
    }

    public BigDecimal getNoinvAmt() {
        return noinvAmt;
    }

    public void setNoinvAmt(BigDecimal noinvAmt) {
        this.noinvAmt = noinvAmt;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public BigDecimal getNopayAmt() {
        return nopayAmt;
    }

    public void setNopayAmt(BigDecimal nopayAmt) {
        this.nopayAmt = nopayAmt;
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
        sb.append(", soNo=").append(soNo);
        sb.append(", soManuId=").append(soManuId);
        sb.append(", suppCode=").append(suppCode);
        sb.append(", suppName=").append(suppName);
        sb.append(", poNo=").append(poNo);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", prodCode=").append(prodCode);
        sb.append(", prodName=").append(prodName);
        sb.append(", qty=").append(qty);
        sb.append(", uom=").append(uom);
        sb.append(", price=").append(price);
        sb.append(", amt=").append(amt);
        sb.append(", poDate=").append(poDate);
        sb.append(", whinQty=").append(whinQty);
        sb.append(", whinPrice=").append(whinPrice);
        sb.append(", whinAmt=").append(whinAmt);
        sb.append(", invAmt=").append(invAmt);
        sb.append(", noinvAmt=").append(noinvAmt);
        sb.append(", payAmt=").append(payAmt);
        sb.append(", nopayAmt=").append(nopayAmt);
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