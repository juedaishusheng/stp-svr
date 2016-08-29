package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TSupp implements Serializable {
    /**
     *  null - T_SUPP.ID
     */
    private Long id;

    /**
     *  对应T_OU.ID - T_SUPP.OU_ID
     */
    private Long ouId;

    /**
     *  null - T_SUPP.MCU_ID
     */
    private Long mcuId;

    /**
     *  供应商编号 - T_SUPP.SUPP_CODE
     */
    private String suppCode;

    /**
     *  供应商名称 - T_SUPP.SUPP_NAME
     */
    private String suppName;

    /**
     *  供应商简称 - T_SUPP.SUPP_ABBR
     */
    private String suppAbbr;

    /**
     *  地址号 - T_SUPP.ADDR_NO
     */
    private Long addrNo;

    /**
     *  记账分类 - T_SUPP.ACC_CLASS
     */
    private String accClass;

    /**
     *  锁定人ID - T_SUPP.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_SUPP.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_SUPP.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_SUPP.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_SUPP.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_SUPP.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_SUPP.DATA_VERSION
     */
    private Long dataVersion;

    /**
     *  拼音 - T_SUPP.PY
     */
    private String py;

    /**
     *  拼音简称 - T_SUPP.PY_ABBR
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

    public String getSuppAbbr() {
        return suppAbbr;
    }

    public void setSuppAbbr(String suppAbbr) {
        this.suppAbbr = suppAbbr;
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
        sb.append(", suppCode=").append(suppCode);
        sb.append(", suppName=").append(suppName);
        sb.append(", suppAbbr=").append(suppAbbr);
        sb.append(", addrNo=").append(addrNo);
        sb.append(", accClass=").append(accClass);
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