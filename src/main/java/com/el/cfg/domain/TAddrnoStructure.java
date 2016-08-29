package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TAddrnoStructure implements Serializable {
    /**
     *  null - T_ADDRNO_STRUCTURE.ID
     */
    private Long id;

    /**
     *  结构类型 - T_ADDRNO_STRUCTURE.STRU_TYPE
     */
    private String struType;

    /**
     *  父地址号 - T_ADDRNO_STRUCTURE.PARENT_ADDRNO
     */
    private Long parentAddrno;

    /**
     *  子地址号 - T_ADDRNO_STRUCTURE.CHILD_ADDRNO
     */
    private Long childAddrno;

    /**
     *  显示顺序 - T_ADDRNO_STRUCTURE.DISP_SEQUENCE
     */
    private BigDecimal dispSequence;

    /**
     *  日期从 - T_ADDRNO_STRUCTURE.FROM_DATE
     */
    private Date fromDate;

    /**
     *  日期到 - T_ADDRNO_STRUCTURE.TO_DATE
     */
    private Date toDate;

    /**
     *  备注 - T_ADDRNO_STRUCTURE.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_ADDRNO_STRUCTURE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_ADDRNO_STRUCTURE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_ADDRNO_STRUCTURE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_ADDRNO_STRUCTURE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_ADDRNO_STRUCTURE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_ADDRNO_STRUCTURE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_ADDRNO_STRUCTURE.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStruType() {
        return struType;
    }

    public void setStruType(String struType) {
        this.struType = struType;
    }

    public Long getParentAddrno() {
        return parentAddrno;
    }

    public void setParentAddrno(Long parentAddrno) {
        this.parentAddrno = parentAddrno;
    }

    public Long getChildAddrno() {
        return childAddrno;
    }

    public void setChildAddrno(Long childAddrno) {
        this.childAddrno = childAddrno;
    }

    public BigDecimal getDispSequence() {
        return dispSequence;
    }

    public void setDispSequence(BigDecimal dispSequence) {
        this.dispSequence = dispSequence;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
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
        sb.append(", struType=").append(struType);
        sb.append(", parentAddrno=").append(parentAddrno);
        sb.append(", childAddrno=").append(childAddrno);
        sb.append(", dispSequence=").append(dispSequence);
        sb.append(", fromDate=").append(fromDate);
        sb.append(", toDate=").append(toDate);
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