package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSoFactgroup implements Serializable {
    /**
     *  null - T_SO_FACTGROUP.ID
     */
    private Long id;

    /**
     *  计算ID 对应T_SO_CALC.ID - T_SO_FACTGROUP.CALC_ID
     */
    private Long calcId;

    /**
     *  行号 - T_SO_FACTGROUP.LINE_NO
     */
    private Integer lineNo;

    /**
     *  分组号 0/1/2 - T_SO_FACTGROUP.GROUP_NO
     */
    private Short groupNo;

    /**
     *  工厂ID 对应T_FACTORY.ID - T_SO_FACTGROUP.FACT_ID
     */
    private Long factId;

    /**
     *  可接否 0-不可接，1-可接 - T_SO_FACTGROUP.CAN_ACPT_FLAG
     */
    private Short canAcptFlag;

    /**
     *  不可接原因代码 10=工艺不满足，20=产能不满足 - T_SO_FACTGROUP.CANNOT_REASON_CODE
     */
    private String cannotReasonCode;

    /**
     *  抢单开始时间 - T_SO_FACTGROUP.SEIZE_START_TIME
     */
    private Date seizeStartTime;

    /**
     *  接单状态 01-已接单，03-已退单，04-已拒绝 - T_SO_FACTGROUP.ACPT_STATUS
     */
    private String acptStatus;

    /**
     *  接单反馈内容 - T_SO_FACTGROUP.ACPT_COMMENT
     */
    private String acptComment;

    /**
     *  接单时间 - T_SO_FACTGROUP.ACPT_TIME
     */
    private Date acptTime;

    /**
     *  接单人 - T_SO_FACTGROUP.ACPT_USER
     */
    private String acptUser;

    /**
     *  工厂金额 - T_SO_FACTGROUP.FACT_AMT
     */
    private BigDecimal factAmt;

    /**
     *  是否上次印刷 0-否，1-是 - T_SO_FACTGROUP.LAST_MANU_FLAG
     */
    private Short lastManuFlag;

    /**
     *  锁定人ID - T_SO_FACTGROUP.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_SO_FACTGROUP.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_SO_FACTGROUP.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_SO_FACTGROUP.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_SO_FACTGROUP.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_SO_FACTGROUP.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_SO_FACTGROUP.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCalcId() {
        return calcId;
    }

    public void setCalcId(Long calcId) {
        this.calcId = calcId;
    }

    public Integer getLineNo() {
        return lineNo;
    }

    public void setLineNo(Integer lineNo) {
        this.lineNo = lineNo;
    }

    public Short getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(Short groupNo) {
        this.groupNo = groupNo;
    }

    public Long getFactId() {
        return factId;
    }

    public void setFactId(Long factId) {
        this.factId = factId;
    }

    public Short getCanAcptFlag() {
        return canAcptFlag;
    }

    public void setCanAcptFlag(Short canAcptFlag) {
        this.canAcptFlag = canAcptFlag;
    }

    public String getCannotReasonCode() {
        return cannotReasonCode;
    }

    public void setCannotReasonCode(String cannotReasonCode) {
        this.cannotReasonCode = cannotReasonCode;
    }

    public Date getSeizeStartTime() {
        return seizeStartTime;
    }

    public void setSeizeStartTime(Date seizeStartTime) {
        this.seizeStartTime = seizeStartTime;
    }

    public String getAcptStatus() {
        return acptStatus;
    }

    public void setAcptStatus(String acptStatus) {
        this.acptStatus = acptStatus;
    }

    public String getAcptComment() {
        return acptComment;
    }

    public void setAcptComment(String acptComment) {
        this.acptComment = acptComment;
    }

    public Date getAcptTime() {
        return acptTime;
    }

    public void setAcptTime(Date acptTime) {
        this.acptTime = acptTime;
    }

    public String getAcptUser() {
        return acptUser;
    }

    public void setAcptUser(String acptUser) {
        this.acptUser = acptUser;
    }

    public BigDecimal getFactAmt() {
        return factAmt;
    }

    public void setFactAmt(BigDecimal factAmt) {
        this.factAmt = factAmt;
    }

    public Short getLastManuFlag() {
        return lastManuFlag;
    }

    public void setLastManuFlag(Short lastManuFlag) {
        this.lastManuFlag = lastManuFlag;
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
        sb.append(", calcId=").append(calcId);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", groupNo=").append(groupNo);
        sb.append(", factId=").append(factId);
        sb.append(", canAcptFlag=").append(canAcptFlag);
        sb.append(", cannotReasonCode=").append(cannotReasonCode);
        sb.append(", seizeStartTime=").append(seizeStartTime);
        sb.append(", acptStatus=").append(acptStatus);
        sb.append(", acptComment=").append(acptComment);
        sb.append(", acptTime=").append(acptTime);
        sb.append(", acptUser=").append(acptUser);
        sb.append(", factAmt=").append(factAmt);
        sb.append(", lastManuFlag=").append(lastManuFlag);
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