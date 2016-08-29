package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TCust implements Serializable {
    /**
     *  null - T_CUST.ID
     */
    private Long id;

    /**
     *  对应T_OU.ID - T_CUST.OU_ID
     */
    private Long ouId;

    /**
     *  null - T_CUST.MCU_ID
     */
    private Long mcuId;

    /**
     *  客户编号 - T_CUST.CUST_CODE
     */
    private String custCode;

    /**
     *  客户名称 - T_CUST.CUST_NAME
     */
    private String custName;

    /**
     *  客户简称 - T_CUST.CUST_ABBR
     */
    private String custAbbr;

    /**
     *  客户状态 - T_CUST.CUST_STATUS
     */
    private String custStatus;

    /**
     *  地址号 - T_CUST.ADDR_NO
     */
    private Long addrNo;

    /**
     *  记账分类 - T_CUST.ACC_CLASS
     */
    private String accClass;

    /**
     *  货币码 - T_CUST.CURR_CODE
     */
    private String currCode;

    /**
     *  税区 - T_CUST.TAX_AREA
     */
    private String taxArea;

    /**
     *  税码 - T_CUST.TAX_CODE
     */
    private String taxCode;

    /**
     *  信用额度 - T_CUST.CREDIT_LIMIT
     */
    private BigDecimal creditLimit;

    /**
     *  是否禁止 - T_CUST.BLOCK_FLAG
     */
    private String blockFlag;

    /**
     *  付款条款 - T_CUST.PAYMENT_TERMS
     */
    private String paymentTerms;

    /**
     *  付款方式 - T_CUST.PAYMENT_METHOD
     */
    private String paymentMethod;

    /**
     *  销售员ID - T_CUST.PIC_ID
     */
    private Long picId;

    /**
     *  帐户开设人 - T_CUST.OPEN_BY_NAME
     */
    private String openByName;

    /**
     *  帐户开设日期 - T_CUST.OPEN_DATE
     */
    private Date openDate;

    /**
     *  价格组 - T_CUST.PRICE_GROUP
     */
    private String priceGroup;

    /**
     *  预留字符串1 - T_CUST.URC_C1
     */
    private String urcC1;

    /**
     *  预留字符串2 - T_CUST.URC_C2
     */
    private String urcC2;

    /**
     *  预留字符串3 - T_CUST.URC_C3
     */
    private String urcC3;

    /**
     *  预留字符串4 - T_CUST.URC_C4
     */
    private String urcC4;

    /**
     *  预留字符串5 - T_CUST.URC_C5
     */
    private String urcC5;

    /**
     *  预留日期1 - T_CUST.URC_D1
     */
    private Date urcD1;

    /**
     *  预留日期2 - T_CUST.URC_D2
     */
    private Date urcD2;

    /**
     *  预留日期3 - T_CUST.URC_D3
     */
    private Date urcD3;

    /**
     *  预留数字1 - T_CUST.URC_N1
     */
    private BigDecimal urcN1;

    /**
     *  预留数字2 - T_CUST.URC_N2
     */
    private BigDecimal urcN2;

    /**
     *  预留数字3 - T_CUST.URC_N3
     */
    private BigDecimal urcN3;

    /**
     *  预留数字4 - T_CUST.URC_N4
     */
    private BigDecimal urcN4;

    /**
     *  预留数字5 - T_CUST.URC_N5
     */
    private BigDecimal urcN5;

    /**
     *  锁定人ID - T_CUST.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_CUST.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_CUST.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_CUST.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_CUST.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_CUST.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_CUST.DATA_VERSION
     */
    private Long dataVersion;

    /**
     *  拼音 - T_CUST.PY
     */
    private String py;

    /**
     *  拼音简称 - T_CUST.PY_ABBR
     */
    private String pyAbbr;

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

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAbbr() {
        return custAbbr;
    }

    public void setCustAbbr(String custAbbr) {
        this.custAbbr = custAbbr;
    }

    public String getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(String custStatus) {
        this.custStatus = custStatus;
    }

    public Long getAddrNo() {
        return addrNo;
    }

    public void setAddrNo(Long addrNo) {
        this.addrNo = addrNo;
    }

    public String getAccClass() {
        return accClass;
    }

    public void setAccClass(String accClass) {
        this.accClass = accClass;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public String getTaxArea() {
        return taxArea;
    }

    public void setTaxArea(String taxArea) {
        this.taxArea = taxArea;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getBlockFlag() {
        return blockFlag;
    }

    public void setBlockFlag(String blockFlag) {
        this.blockFlag = blockFlag;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Long getPicId() {
        return picId;
    }

    public void setPicId(Long picId) {
        this.picId = picId;
    }

    public String getOpenByName() {
        return openByName;
    }

    public void setOpenByName(String openByName) {
        this.openByName = openByName;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public String getPriceGroup() {
        return priceGroup;
    }

    public void setPriceGroup(String priceGroup) {
        this.priceGroup = priceGroup;
    }

    public String getUrcC1() {
        return urcC1;
    }

    public void setUrcC1(String urcC1) {
        this.urcC1 = urcC1;
    }

    public String getUrcC2() {
        return urcC2;
    }

    public void setUrcC2(String urcC2) {
        this.urcC2 = urcC2;
    }

    public String getUrcC3() {
        return urcC3;
    }

    public void setUrcC3(String urcC3) {
        this.urcC3 = urcC3;
    }

    public String getUrcC4() {
        return urcC4;
    }

    public void setUrcC4(String urcC4) {
        this.urcC4 = urcC4;
    }

    public String getUrcC5() {
        return urcC5;
    }

    public void setUrcC5(String urcC5) {
        this.urcC5 = urcC5;
    }

    public Date getUrcD1() {
        return urcD1;
    }

    public void setUrcD1(Date urcD1) {
        this.urcD1 = urcD1;
    }

    public Date getUrcD2() {
        return urcD2;
    }

    public void setUrcD2(Date urcD2) {
        this.urcD2 = urcD2;
    }

    public Date getUrcD3() {
        return urcD3;
    }

    public void setUrcD3(Date urcD3) {
        this.urcD3 = urcD3;
    }

    public BigDecimal getUrcN1() {
        return urcN1;
    }

    public void setUrcN1(BigDecimal urcN1) {
        this.urcN1 = urcN1;
    }

    public BigDecimal getUrcN2() {
        return urcN2;
    }

    public void setUrcN2(BigDecimal urcN2) {
        this.urcN2 = urcN2;
    }

    public BigDecimal getUrcN3() {
        return urcN3;
    }

    public void setUrcN3(BigDecimal urcN3) {
        this.urcN3 = urcN3;
    }

    public BigDecimal getUrcN4() {
        return urcN4;
    }

    public void setUrcN4(BigDecimal urcN4) {
        this.urcN4 = urcN4;
    }

    public BigDecimal getUrcN5() {
        return urcN5;
    }

    public void setUrcN5(BigDecimal urcN5) {
        this.urcN5 = urcN5;
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

    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py;
    }

    public String getPyAbbr() {
        return pyAbbr;
    }

    public void setPyAbbr(String pyAbbr) {
        this.pyAbbr = pyAbbr;
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
        sb.append(", custCode=").append(custCode);
        sb.append(", custName=").append(custName);
        sb.append(", custAbbr=").append(custAbbr);
        sb.append(", custStatus=").append(custStatus);
        sb.append(", addrNo=").append(addrNo);
        sb.append(", accClass=").append(accClass);
        sb.append(", currCode=").append(currCode);
        sb.append(", taxArea=").append(taxArea);
        sb.append(", taxCode=").append(taxCode);
        sb.append(", creditLimit=").append(creditLimit);
        sb.append(", blockFlag=").append(blockFlag);
        sb.append(", paymentTerms=").append(paymentTerms);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", picId=").append(picId);
        sb.append(", openByName=").append(openByName);
        sb.append(", openDate=").append(openDate);
        sb.append(", priceGroup=").append(priceGroup);
        sb.append(", urcC1=").append(urcC1);
        sb.append(", urcC2=").append(urcC2);
        sb.append(", urcC3=").append(urcC3);
        sb.append(", urcC4=").append(urcC4);
        sb.append(", urcC5=").append(urcC5);
        sb.append(", urcD1=").append(urcD1);
        sb.append(", urcD2=").append(urcD2);
        sb.append(", urcD3=").append(urcD3);
        sb.append(", urcN1=").append(urcN1);
        sb.append(", urcN2=").append(urcN2);
        sb.append(", urcN3=").append(urcN3);
        sb.append(", urcN4=").append(urcN4);
        sb.append(", urcN5=").append(urcN5);
        sb.append(", lockerId=").append(lockerId);
        sb.append(", lockTs=").append(lockTs);
        sb.append(", modifyerId=").append(modifyerId);
        sb.append(", modifyTs=").append(modifyTs);
        sb.append(", modifyAppsvr=").append(modifyAppsvr);
        sb.append(", modifyModule=").append(modifyModule);
        sb.append(", dataVersion=").append(dataVersion);
        sb.append(", py=").append(py);
        sb.append(", pyAbbr=").append(pyAbbr);
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