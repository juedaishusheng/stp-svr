package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TProcessPrice implements Serializable {
    /**
     *  null - T_PROCESS_PRICE.ID
     */
    private Long id;

    /**
     *  公司ID 对应T_OU.ID - T_PROCESS_PRICE.OU_ID
     */
    private Long ouId;

    /**
     *  地址号 工厂编号 - T_PROCESS_PRICE.ADDR_NO
     */
    private Long addrNo;

    /**
     *  工序ID 对应T_PROCESS.ID - T_PROCESS_PRICE.PROCESS_ID
     */
    private Long processId;

    /**
     *  工序编号 对应T_PROCESS.PROCESS_NO - T_PROCESS_PRICE.PROCESS_CODE
     */
    private String processCode;

    /**
     *  价格类型 标准销售价/标准采购价/社价/厂价 - T_PROCESS_PRICE.PRICE_TYPE
     */
    private String priceType;

    /**
     *  报价参数1 - T_PROCESS_PRICE.PARA1
     */
    private String para1;

    /**
     *  报价参数2 - T_PROCESS_PRICE.PARA2
     */
    private String para2;

    /**
     *  报价参数3 - T_PROCESS_PRICE.PARA3
     */
    private String para3;

    /**
     *  报价参数4 - T_PROCESS_PRICE.PARA4
     */
    private String para4;

    /**
     *  报价参数5 - T_PROCESS_PRICE.PARA5
     */
    private String para5;

    /**
     *  价格 - T_PROCESS_PRICE.PRICE
     */
    private BigDecimal price;

    /**
     *  计价单位 - T_PROCESS_PRICE.PRICE_UOM
     */
    private String priceUom;

    /**
     *  最小起印金额 - T_PROCESS_PRICE.STARTUP_AMT
     */
    private BigDecimal startupAmt;

    /**
     *  断点数量 - T_PROCESS_PRICE.BREAKPOINT_QTY
     */
    private BigDecimal breakpointQty;

    /**
     *  数量倍数 - T_PROCESS_PRICE.QTY_MULTI
     */
    private Long qtyMulti;

    /**
     *  日期从 - T_PROCESS_PRICE.DATE_FROM
     */
    private Date dateFrom;

    /**
     *  日期到 - T_PROCESS_PRICE.DATE_TO
     */
    private Date dateTo;

    /**
     *  能力标志 - T_PROCESS_PRICE.CAPA_FLAG
     */
    private Short capaFlag;

    /**
     *  锁定人ID - T_PROCESS_PRICE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PROCESS_PRICE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PROCESS_PRICE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PROCESS_PRICE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PROCESS_PRICE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PROCESS_PRICE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PROCESS_PRICE.DATA_VERSION
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

    public Long getAddrNo() {
        return addrNo;
    }

    public void setAddrNo(Long addrNo) {
        this.addrNo = addrNo;
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getPara1() {
        return para1;
    }

    public void setPara1(String para1) {
        this.para1 = para1;
    }

    public String getPara2() {
        return para2;
    }

    public void setPara2(String para2) {
        this.para2 = para2;
    }

    public String getPara3() {
        return para3;
    }

    public void setPara3(String para3) {
        this.para3 = para3;
    }

    public String getPara4() {
        return para4;
    }

    public void setPara4(String para4) {
        this.para4 = para4;
    }

    public String getPara5() {
        return para5;
    }

    public void setPara5(String para5) {
        this.para5 = para5;
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

    public BigDecimal getStartupAmt() {
        return startupAmt;
    }

    public void setStartupAmt(BigDecimal startupAmt) {
        this.startupAmt = startupAmt;
    }

    public BigDecimal getBreakpointQty() {
        return breakpointQty;
    }

    public void setBreakpointQty(BigDecimal breakpointQty) {
        this.breakpointQty = breakpointQty;
    }

    public Long getQtyMulti() {
        return qtyMulti;
    }

    public void setQtyMulti(Long qtyMulti) {
        this.qtyMulti = qtyMulti;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Short getCapaFlag() {
        return capaFlag;
    }

    public void setCapaFlag(Short capaFlag) {
        this.capaFlag = capaFlag;
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
        sb.append(", addrNo=").append(addrNo);
        sb.append(", processId=").append(processId);
        sb.append(", processCode=").append(processCode);
        sb.append(", priceType=").append(priceType);
        sb.append(", para1=").append(para1);
        sb.append(", para2=").append(para2);
        sb.append(", para3=").append(para3);
        sb.append(", para4=").append(para4);
        sb.append(", para5=").append(para5);
        sb.append(", price=").append(price);
        sb.append(", priceUom=").append(priceUom);
        sb.append(", startupAmt=").append(startupAmt);
        sb.append(", breakpointQty=").append(breakpointQty);
        sb.append(", qtyMulti=").append(qtyMulti);
        sb.append(", dateFrom=").append(dateFrom);
        sb.append(", dateTo=").append(dateTo);
        sb.append(", capaFlag=").append(capaFlag);
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