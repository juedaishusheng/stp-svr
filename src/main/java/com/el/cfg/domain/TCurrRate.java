package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TCurrRate implements Serializable {
    /**
     *  null - T_CURR_RATE.ID
     */
    private Long id;

    /**
     *  null - T_CURR_RATE.OU_ID
     */
    private Long ouId;

    /**
     *  null - T_CURR_RATE.MCU_ID
     */
    private Long mcuId;

    /**
     *  币种从 - T_CURR_RATE.CURR_FROM
     */
    private String currFrom;

    /**
     *  币种到 - T_CURR_RATE.CURR_TO
     */
    private String currTo;

    /**
     *  汇率类型 - T_CURR_RATE.RATE_TYPE
     */
    private String rateType;

    /**
     *  日期从 - T_CURR_RATE.DATE_FROM
     */
    private Date dateFrom;

    /**
     *  日期到 - T_CURR_RATE.DATE_TO
     */
    private Date dateTo;

    /**
     *  计算方法 - T_CURR_RATE.CALC_METHOD
     */
    private String calcMethod;

    /**
     *  转换方法 - T_CURR_RATE.CONV_METHOD
     */
    private String convMethod;

    /**
     *  正算汇率 - T_CURR_RATE.RATE_FORWARD
     */
    private BigDecimal rateForward;

    /**
     *  反算汇率 - T_CURR_RATE.RATE_REVERSE
     */
    private BigDecimal rateReverse;

    /**
     *  现货汇率 - T_CURR_RATE.SPOT_RATE
     */
    private String spotRate;

    /**
     *  锁定人ID - T_CURR_RATE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_CURR_RATE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_CURR_RATE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_CURR_RATE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_CURR_RATE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_CURR_RATE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_CURR_RATE.DATA_VERSION
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

    public String getCurrFrom() {
        return currFrom;
    }

    public void setCurrFrom(String currFrom) {
        this.currFrom = currFrom;
    }

    public String getCurrTo() {
        return currTo;
    }

    public void setCurrTo(String currTo) {
        this.currTo = currTo;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
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

    public String getCalcMethod() {
        return calcMethod;
    }

    public void setCalcMethod(String calcMethod) {
        this.calcMethod = calcMethod;
    }

    public String getConvMethod() {
        return convMethod;
    }

    public void setConvMethod(String convMethod) {
        this.convMethod = convMethod;
    }

    public BigDecimal getRateForward() {
        return rateForward;
    }

    public void setRateForward(BigDecimal rateForward) {
        this.rateForward = rateForward;
    }

    public BigDecimal getRateReverse() {
        return rateReverse;
    }

    public void setRateReverse(BigDecimal rateReverse) {
        this.rateReverse = rateReverse;
    }

    public String getSpotRate() {
        return spotRate;
    }

    public void setSpotRate(String spotRate) {
        this.spotRate = spotRate;
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
        sb.append(", currFrom=").append(currFrom);
        sb.append(", currTo=").append(currTo);
        sb.append(", rateType=").append(rateType);
        sb.append(", dateFrom=").append(dateFrom);
        sb.append(", dateTo=").append(dateTo);
        sb.append(", calcMethod=").append(calcMethod);
        sb.append(", convMethod=").append(convMethod);
        sb.append(", rateForward=").append(rateForward);
        sb.append(", rateReverse=").append(rateReverse);
        sb.append(", spotRate=").append(spotRate);
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