package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TMcu implements Serializable {
    /**
     *  null - T_MCU.ID
     */
    private Long id;

    /**
     *  公司ID - T_MCU.OU_ID
     */
    private Long ouId;

    /**
     *  编号 - T_MCU.MCU_CODE
     */
    private String mcuCode;

    /**
     *  名称 - T_MCU.MCU_NAME
     */
    private String mcuName;

    /**
     *  简称 - T_MCU.MCU_ABBR
     */
    private String mcuAbbr;

    /**
     *  类型 - T_MCU.MCU_TYPE
     */
    private String mcuType;

    /**
     *  层级 - T_MCU.MCU_LEVEL
     */
    private String mcuLevel;

    /**
     *  地址号 - T_MCU.ADDR_NO
     */
    private Long addrNo;

    /**
     *  相关部门 - T_MCU.RELATED_MCU_ID
     */
    private Long relatedMcuId;

    /**
     *  描述1 - T_MCU.DESC1
     */
    private String desc1;

    /**
     *  描述2 - T_MCU.DESC2
     */
    private String desc2;

    /**
     *  描述3 - T_MCU.DESC3
     */
    private String desc3;

    /**
     *  描述4 - T_MCU.DESC4
     */
    private String desc4;

    /**
     *  分类码1 - T_MCU.CAT1
     */
    private String cat1;

    /**
     *  分类码2 - T_MCU.CAT2
     */
    private String cat2;

    /**
     *  分类码3 - T_MCU.CAT3
     */
    private String cat3;

    /**
     *  分类码4 - T_MCU.CAT4
     */
    private String cat4;

    /**
     *  分类码5 - T_MCU.CAT5
     */
    private String cat5;

    /**
     *  分类码6 - T_MCU.CAT6
     */
    private String cat6;

    /**
     *  分类码7 - T_MCU.CAT7
     */
    private String cat7;

    /**
     *  分类码8 - T_MCU.CAT8
     */
    private String cat8;

    /**
     *  分类码9 - T_MCU.CAT9
     */
    private String cat9;

    /**
     *  分类码10 - T_MCU.CAT10
     */
    private String cat10;

    /**
     *  关联地址号1 - T_MCU.REL_ADDR_NO1
     */
    private Long relAddrNo1;

    /**
     *  关联地址号2 - T_MCU.REL_ADDR_NO2
     */
    private Long relAddrNo2;

    /**
     *  关联地址号3 - T_MCU.REL_ADDR_NO3
     */
    private Long relAddrNo3;

    /**
     *  关联地址号4 - T_MCU.REL_ADDR_NO4
     */
    private Long relAddrNo4;

    /**
     *  关联地址号5 - T_MCU.REL_ADDR_NO5
     */
    private Long relAddrNo5;

    /**
     *  预留字符串1 - T_MCU.URC_C1
     */
    private String urcC1;

    /**
     *  预留字符串2 - T_MCU.URC_C2
     */
    private String urcC2;

    /**
     *  预留字符串3 - T_MCU.URC_C3
     */
    private String urcC3;

    /**
     *  预留字符串4 - T_MCU.URC_C4
     */
    private String urcC4;

    /**
     *  预留字符串5 - T_MCU.URC_C5
     */
    private String urcC5;

    /**
     *  预留日期1 - T_MCU.URC_D1
     */
    private Date urcD1;

    /**
     *  预留日期2 - T_MCU.URC_D2
     */
    private Date urcD2;

    /**
     *  预留日期3 - T_MCU.URC_D3
     */
    private Date urcD3;

    /**
     *  锁定人ID - T_MCU.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_MCU.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_MCU.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_MCU.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_MCU.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_MCU.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_MCU.DATA_VERSION
     */
    private Long dataVersion;

    /**
     *  拼音 - T_MCU.PY
     */
    private String py;

    /**
     *  拼音简称 - T_MCU.PY_ABBR
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

    public String getMcuCode() {
        return mcuCode;
    }

    public void setMcuCode(String mcuCode) {
        this.mcuCode = mcuCode;
    }

    public String getMcuName() {
        return mcuName;
    }

    public void setMcuName(String mcuName) {
        this.mcuName = mcuName;
    }

    public String getMcuAbbr() {
        return mcuAbbr;
    }

    public void setMcuAbbr(String mcuAbbr) {
        this.mcuAbbr = mcuAbbr;
    }

    public String getMcuType() {
        return mcuType;
    }

    public void setMcuType(String mcuType) {
        this.mcuType = mcuType;
    }

    public String getMcuLevel() {
        return mcuLevel;
    }

    public void setMcuLevel(String mcuLevel) {
        this.mcuLevel = mcuLevel;
    }

    public Long getAddrNo() {
        return addrNo;
    }

    public void setAddrNo(Long addrNo) {
        this.addrNo = addrNo;
    }

    public Long getRelatedMcuId() {
        return relatedMcuId;
    }

    public void setRelatedMcuId(Long relatedMcuId) {
        this.relatedMcuId = relatedMcuId;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public String getDesc3() {
        return desc3;
    }

    public void setDesc3(String desc3) {
        this.desc3 = desc3;
    }

    public String getDesc4() {
        return desc4;
    }

    public void setDesc4(String desc4) {
        this.desc4 = desc4;
    }

    public String getCat1() {
        return cat1;
    }

    public void setCat1(String cat1) {
        this.cat1 = cat1;
    }

    public String getCat2() {
        return cat2;
    }

    public void setCat2(String cat2) {
        this.cat2 = cat2;
    }

    public String getCat3() {
        return cat3;
    }

    public void setCat3(String cat3) {
        this.cat3 = cat3;
    }

    public String getCat4() {
        return cat4;
    }

    public void setCat4(String cat4) {
        this.cat4 = cat4;
    }

    public String getCat5() {
        return cat5;
    }

    public void setCat5(String cat5) {
        this.cat5 = cat5;
    }

    public String getCat6() {
        return cat6;
    }

    public void setCat6(String cat6) {
        this.cat6 = cat6;
    }

    public String getCat7() {
        return cat7;
    }

    public void setCat7(String cat7) {
        this.cat7 = cat7;
    }

    public String getCat8() {
        return cat8;
    }

    public void setCat8(String cat8) {
        this.cat8 = cat8;
    }

    public String getCat9() {
        return cat9;
    }

    public void setCat9(String cat9) {
        this.cat9 = cat9;
    }

    public String getCat10() {
        return cat10;
    }

    public void setCat10(String cat10) {
        this.cat10 = cat10;
    }

    public Long getRelAddrNo1() {
        return relAddrNo1;
    }

    public void setRelAddrNo1(Long relAddrNo1) {
        this.relAddrNo1 = relAddrNo1;
    }

    public Long getRelAddrNo2() {
        return relAddrNo2;
    }

    public void setRelAddrNo2(Long relAddrNo2) {
        this.relAddrNo2 = relAddrNo2;
    }

    public Long getRelAddrNo3() {
        return relAddrNo3;
    }

    public void setRelAddrNo3(Long relAddrNo3) {
        this.relAddrNo3 = relAddrNo3;
    }

    public Long getRelAddrNo4() {
        return relAddrNo4;
    }

    public void setRelAddrNo4(Long relAddrNo4) {
        this.relAddrNo4 = relAddrNo4;
    }

    public Long getRelAddrNo5() {
        return relAddrNo5;
    }

    public void setRelAddrNo5(Long relAddrNo5) {
        this.relAddrNo5 = relAddrNo5;
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
        sb.append(", ouId=").append(ouId);
        sb.append(", mcuCode=").append(mcuCode);
        sb.append(", mcuName=").append(mcuName);
        sb.append(", mcuAbbr=").append(mcuAbbr);
        sb.append(", mcuType=").append(mcuType);
        sb.append(", mcuLevel=").append(mcuLevel);
        sb.append(", addrNo=").append(addrNo);
        sb.append(", relatedMcuId=").append(relatedMcuId);
        sb.append(", desc1=").append(desc1);
        sb.append(", desc2=").append(desc2);
        sb.append(", desc3=").append(desc3);
        sb.append(", desc4=").append(desc4);
        sb.append(", cat1=").append(cat1);
        sb.append(", cat2=").append(cat2);
        sb.append(", cat3=").append(cat3);
        sb.append(", cat4=").append(cat4);
        sb.append(", cat5=").append(cat5);
        sb.append(", cat6=").append(cat6);
        sb.append(", cat7=").append(cat7);
        sb.append(", cat8=").append(cat8);
        sb.append(", cat9=").append(cat9);
        sb.append(", cat10=").append(cat10);
        sb.append(", relAddrNo1=").append(relAddrNo1);
        sb.append(", relAddrNo2=").append(relAddrNo2);
        sb.append(", relAddrNo3=").append(relAddrNo3);
        sb.append(", relAddrNo4=").append(relAddrNo4);
        sb.append(", relAddrNo5=").append(relAddrNo5);
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