package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TUdc implements Serializable {
    /**
     *  null - T_UDC.ID
     */
    private Long id;

    /**
     *  对应T_OU.ID - T_UDC.OU_ID
     */
    private Long ouId;

    /**
     *  null - T_UDC.MCU_ID
     */
    private Long mcuId;

    /**
     *  所在模块 平台自己的以字母开头，以与JDE区分 - T_UDC.DOMAIN_CODE
     */
    private String domainCode;

    /**
     *  类型 - T_UDC.UDC_TYPE
     */
    private String udcType;

    /**
     *  代码 - T_UDC.UDC_CODE
     */
    private String udcCode;

    /**
     *  是否使用 JDE传过来的有的值在平台不适用，所以要过滤掉 - T_UDC.VAL_ENABLED
     */
    private Short valEnabled;

    /**
     *  特殊处理码 - T_UDC.VAL_SPHD
     */
    private String valSphd;

    /**
     *  描述1 - T_UDC.VAL_DESC1
     */
    private String valDesc1;

    /**
     *  描述2 - T_UDC.VAL_DESC2
     */
    private String valDesc2;

    /**
     *  排序号 - T_UDC.SORT_NO
     */
    private BigDecimal sortNo;

    /**
     *  锁定人ID - T_UDC.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_UDC.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_UDC.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_UDC.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_UDC.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_UDC.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_UDC.DATA_VERSION
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

    public String getDomainCode() {
        return domainCode;
    }

    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }

    public String getUdcType() {
        return udcType;
    }

    public void setUdcType(String udcType) {
        this.udcType = udcType;
    }

    public String getUdcCode() {
        return udcCode;
    }

    public void setUdcCode(String udcCode) {
        this.udcCode = udcCode;
    }

    public Short getValEnabled() {
        return valEnabled;
    }

    public void setValEnabled(Short valEnabled) {
        this.valEnabled = valEnabled;
    }

    public String getValSphd() {
        return valSphd;
    }

    public void setValSphd(String valSphd) {
        this.valSphd = valSphd;
    }

    public String getValDesc1() {
        return valDesc1;
    }

    public void setValDesc1(String valDesc1) {
        this.valDesc1 = valDesc1;
    }

    public String getValDesc2() {
        return valDesc2;
    }

    public void setValDesc2(String valDesc2) {
        this.valDesc2 = valDesc2;
    }

    public BigDecimal getSortNo() {
        return sortNo;
    }

    public void setSortNo(BigDecimal sortNo) {
        this.sortNo = sortNo;
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
        sb.append(", domainCode=").append(domainCode);
        sb.append(", udcType=").append(udcType);
        sb.append(", udcCode=").append(udcCode);
        sb.append(", valEnabled=").append(valEnabled);
        sb.append(", valSphd=").append(valSphd);
        sb.append(", valDesc1=").append(valDesc1);
        sb.append(", valDesc2=").append(valDesc2);
        sb.append(", sortNo=").append(sortNo);
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