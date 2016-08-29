package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TOu implements Serializable {
    /**
     *  null - T_OU.ID
     */
    private Long id;

    /**
     *  编号 - T_OU.OU_CODE
     */
    private String ouCode;

    /**
     *  名称 - T_OU.OU_NAME
     */
    private String ouName;

    /**
     *  简称 - T_OU.OU_ABBR
     */
    private String ouAbbr;

    /**
     *  类型 - T_OU.OU_TYPE
     */
    private String ouType;

    /**
     *  本位币 - T_OU.OU_CURR
     */
    private String ouCurr;

    /**
     *  状态 正常/停用/删除 - T_OU.OU_STATUS
     */
    private String ouStatus;

    /**
     *  相关公司1 接单中心ID - T_OU.RELATED_OU_ID1
     */
    private Long relatedOuId1;

    /**
     *  相关公司2 - T_OU.RELATED_OU_ID2
     */
    private Long relatedOuId2;

    /**
     *  地址号 - T_OU.ADDR_NO
     */
    private Long addrNo;

    /**
     *  预留地址号 - T_OU.URC_ADDR_NO
     */
    private Long urcAddrNo;

    /**
     *  预留字符串1 - T_OU.URC_C1
     */
    private String urcC1;

    /**
     *  预留字符串2 - T_OU.URC_C2
     */
    private String urcC2;

    /**
     *  预留字符串3 - T_OU.URC_C3
     */
    private String urcC3;

    /**
     *  预留字符串4 - T_OU.URC_C4
     */
    private String urcC4;

    /**
     *  预留字符串5 - T_OU.URC_C5
     */
    private String urcC5;

    /**
     *  预留日期1 - T_OU.URC_D1
     */
    private Date urcD1;

    /**
     *  预留日期2 - T_OU.URC_D2
     */
    private Date urcD2;

    /**
     *  预留日期3 - T_OU.URC_D3
     */
    private Date urcD3;

    /**
     *  锁定人ID - T_OU.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_OU.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_OU.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_OU.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_OU.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_OU.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_OU.DATA_VERSION
     */
    private Long dataVersion;

    /**
     *  拼音 - T_OU.PY
     */
    private String py;

    /**
     *  拼音简称 - T_OU.PY_ABBR
     */
    private String pyAbbr;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOuCode() {
        return ouCode;
    }

    public void setOuCode(String ouCode) {
        this.ouCode = ouCode;
    }

    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public String getOuAbbr() {
        return ouAbbr;
    }

    public void setOuAbbr(String ouAbbr) {
        this.ouAbbr = ouAbbr;
    }

    public String getOuType() {
        return ouType;
    }

    public void setOuType(String ouType) {
        this.ouType = ouType;
    }

    public String getOuCurr() {
        return ouCurr;
    }

    public void setOuCurr(String ouCurr) {
        this.ouCurr = ouCurr;
    }

    public String getOuStatus() {
        return ouStatus;
    }

    public void setOuStatus(String ouStatus) {
        this.ouStatus = ouStatus;
    }

    public Long getRelatedOuId1() {
        return relatedOuId1;
    }

    public void setRelatedOuId1(Long relatedOuId1) {
        this.relatedOuId1 = relatedOuId1;
    }

    public Long getRelatedOuId2() {
        return relatedOuId2;
    }

    public void setRelatedOuId2(Long relatedOuId2) {
        this.relatedOuId2 = relatedOuId2;
    }

    public Long getAddrNo() {
        return addrNo;
    }

    public void setAddrNo(Long addrNo) {
        this.addrNo = addrNo;
    }

    public Long getUrcAddrNo() {
        return urcAddrNo;
    }

    public void setUrcAddrNo(Long urcAddrNo) {
        this.urcAddrNo = urcAddrNo;
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
        sb.append(", ouCode=").append(ouCode);
        sb.append(", ouName=").append(ouName);
        sb.append(", ouAbbr=").append(ouAbbr);
        sb.append(", ouType=").append(ouType);
        sb.append(", ouCurr=").append(ouCurr);
        sb.append(", ouStatus=").append(ouStatus);
        sb.append(", relatedOuId1=").append(relatedOuId1);
        sb.append(", relatedOuId2=").append(relatedOuId2);
        sb.append(", addrNo=").append(addrNo);
        sb.append(", urcAddrNo=").append(urcAddrNo);
        sb.append(", urcC1=").append(urcC1);
        sb.append(", urcC2=").append(urcC2);
        sb.append(", urcC3=").append(urcC3);
        sb.append(", urcC4=").append(urcC4);
        sb.append(", urcC5=").append(urcC5);
        sb.append(", urcD1=").append(urcD1);
        sb.append(", urcD2=").append(urcD2);
        sb.append(", urcD3=").append(urcD3);
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