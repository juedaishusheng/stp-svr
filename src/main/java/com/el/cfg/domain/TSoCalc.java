package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSoCalc implements Serializable {
    /**
     *  null - T_SO_CALC.ID
     */
    private Long id;

    /**
     *  公司ID 对应T_OU.ID - T_SO_CALC.OU_ID
     */
    private Long ouId;

    /**
     *  订单ID 对应T_SO.ID - T_SO_CALC.SO_ID
     */
    private Long soId;

    /**
     *  放入时间 - T_SO_CALC.PUTIN_TIME
     */
    private Date putinTime;

    /**
     *  计算开始时间 - T_SO_CALC.CALC_START_TIME
     */
    private Date calcStartTime;

    /**
     *  计算完成时间 - T_SO_CALC.CALC_END_TIME
     */
    private Date calcEndTime;

    /**
     *  工厂中间价 =(工厂计算最高价+工厂计算最低价)/2 - T_SO_CALC.FACT_MIDDLE_AMT
     */
    private BigDecimal factMiddleAmt;

    /**
     *  锁定人ID - T_SO_CALC.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_SO_CALC.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_SO_CALC.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_SO_CALC.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_SO_CALC.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_SO_CALC.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_SO_CALC.DATA_VERSION
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

    public Long getSoId() {
        return soId;
    }

    public void setSoId(Long soId) {
        this.soId = soId;
    }

    public Date getPutinTime() {
        return putinTime;
    }

    public void setPutinTime(Date putinTime) {
        this.putinTime = putinTime;
    }

    public Date getCalcStartTime() {
        return calcStartTime;
    }

    public void setCalcStartTime(Date calcStartTime) {
        this.calcStartTime = calcStartTime;
    }

    public Date getCalcEndTime() {
        return calcEndTime;
    }

    public void setCalcEndTime(Date calcEndTime) {
        this.calcEndTime = calcEndTime;
    }

    public BigDecimal getFactMiddleAmt() {
        return factMiddleAmt;
    }

    public void setFactMiddleAmt(BigDecimal factMiddleAmt) {
        this.factMiddleAmt = factMiddleAmt;
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
        sb.append(", soId=").append(soId);
        sb.append(", putinTime=").append(putinTime);
        sb.append(", calcStartTime=").append(calcStartTime);
        sb.append(", calcEndTime=").append(calcEndTime);
        sb.append(", factMiddleAmt=").append(factMiddleAmt);
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