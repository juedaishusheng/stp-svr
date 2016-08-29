package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TAddressBook implements Serializable {
    /**
     *  null - T_ADDRESS_BOOK.ID
     */
    private Long id;

    /**
     *  对应T_OU.ID - T_ADDRESS_BOOK.OU_ID
     */
    private Long ouId;

    /**
     *  null - T_ADDRESS_BOOK.MCU_ID
     */
    private Long mcuId;

    /**
     *  地址号 工厂编号/公司地址号/客户地址号/？/？ - T_ADDRESS_BOOK.ADDR_NO
     */
    private Long addrNo;

    /**
     *  长地址号 - T_ADDRESS_BOOK.LADDR_NO
     */
    private String laddrNo;

    /**
     *  地址名 工厂名称/？/？/？ - T_ADDRESS_BOOK.ADDR_NAME
     */
    private String addrName;

    /**
     *  简称 - T_ADDRESS_BOOK.ADDR_ABBR
     */
    private String addrAbbr;

    /**
     *  地址类别 MCU/客户/供应商等 - T_ADDRESS_BOOK.ADDR_CLASS
     */
    private String addrClass;

    /**
     *  关联地址号1 - T_ADDRESS_BOOK.REL_ADDR_NO1
     */
    private Long relAddrNo1;

    /**
     *  关联地址号2 - T_ADDRESS_BOOK.REL_ADDR_NO2
     */
    private Long relAddrNo2;

    /**
     *  关联地址号3 - T_ADDRESS_BOOK.REL_ADDR_NO3
     */
    private Long relAddrNo3;

    /**
     *  关联地址号4 - T_ADDRESS_BOOK.REL_ADDR_NO4
     */
    private Long relAddrNo4;

    /**
     *  关联地址号5 - T_ADDRESS_BOOK.REL_ADDR_NO5
     */
    private Long relAddrNo5;

    /**
     *  关联地址号6 - T_ADDRESS_BOOK.REL_ADDR_NO6
     */
    private Long relAddrNo6;

    /**
     *  分类码1 - T_ADDRESS_BOOK.CAT1
     */
    private String cat1;

    /**
     *  分类码2 - T_ADDRESS_BOOK.CAT2
     */
    private String cat2;

    /**
     *  分类码3 - T_ADDRESS_BOOK.CAT3
     */
    private String cat3;

    /**
     *  分类码4 - T_ADDRESS_BOOK.CAT4
     */
    private String cat4;

    /**
     *  分类码5 - T_ADDRESS_BOOK.CAT5
     */
    private String cat5;

    /**
     *  分类码6 - T_ADDRESS_BOOK.CAT6
     */
    private String cat6;

    /**
     *  分类码7 - T_ADDRESS_BOOK.CAT7
     */
    private String cat7;

    /**
     *  分类码8 - T_ADDRESS_BOOK.CAT8
     */
    private String cat8;

    /**
     *  分类码9 - T_ADDRESS_BOOK.CAT9
     */
    private String cat9;

    /**
     *  分类码10 - T_ADDRESS_BOOK.CAT10
     */
    private String cat10;

    /**
     *  分类码11 - T_ADDRESS_BOOK.CAT11
     */
    private String cat11;

    /**
     *  分类码12 - T_ADDRESS_BOOK.CAT12
     */
    private String cat12;

    /**
     *  分类码13 - T_ADDRESS_BOOK.CAT13
     */
    private String cat13;

    /**
     *  分类码14 - T_ADDRESS_BOOK.CAT14
     */
    private String cat14;

    /**
     *  分类码15 - T_ADDRESS_BOOK.CAT15
     */
    private String cat15;

    /**
     *  分类码16 - T_ADDRESS_BOOK.CAT16
     */
    private String cat16;

    /**
     *  分类码17 - T_ADDRESS_BOOK.CAT17
     */
    private String cat17;

    /**
     *  分类码18 - T_ADDRESS_BOOK.CAT18
     */
    private String cat18;

    /**
     *  分类码19 - T_ADDRESS_BOOK.CAT19
     */
    private String cat19;

    /**
     *  分类码20 - T_ADDRESS_BOOK.CAT20
     */
    private String cat20;

    /**
     *  分类码21 - T_ADDRESS_BOOK.CAT21
     */
    private String cat21;

    /**
     *  分类码22 - T_ADDRESS_BOOK.CAT22
     */
    private String cat22;

    /**
     *  分类码23 - T_ADDRESS_BOOK.CAT23
     */
    private String cat23;

    /**
     *  分类码24 - T_ADDRESS_BOOK.CAT24
     */
    private String cat24;

    /**
     *  分类码25 - T_ADDRESS_BOOK.CAT25
     */
    private String cat25;

    /**
     *  分类码26 - T_ADDRESS_BOOK.CAT26
     */
    private String cat26;

    /**
     *  分类码27 - T_ADDRESS_BOOK.CAT27
     */
    private String cat27;

    /**
     *  分类码28 - T_ADDRESS_BOOK.CAT28
     */
    private String cat28;

    /**
     *  分类码29 - T_ADDRESS_BOOK.CAT29
     */
    private String cat29;

    /**
     *  分类码30 - T_ADDRESS_BOOK.CAT30
     */
    private String cat30;

    /**
     *  锁定人ID - T_ADDRESS_BOOK.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_ADDRESS_BOOK.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_ADDRESS_BOOK.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_ADDRESS_BOOK.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_ADDRESS_BOOK.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_ADDRESS_BOOK.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_ADDRESS_BOOK.DATA_VERSION
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

    public Long getAddrNo() {
        return addrNo;
    }

    public void setAddrNo(Long addrNo) {
        this.addrNo = addrNo;
    }

    public String getLaddrNo() {
        return laddrNo;
    }

    public void setLaddrNo(String laddrNo) {
        this.laddrNo = laddrNo;
    }

    public String getAddrName() {
        return addrName;
    }

    public void setAddrName(String addrName) {
        this.addrName = addrName;
    }

    public String getAddrAbbr() {
        return addrAbbr;
    }

    public void setAddrAbbr(String addrAbbr) {
        this.addrAbbr = addrAbbr;
    }

    public String getAddrClass() {
        return addrClass;
    }

    public void setAddrClass(String addrClass) {
        this.addrClass = addrClass;
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

    public Long getRelAddrNo6() {
        return relAddrNo6;
    }

    public void setRelAddrNo6(Long relAddrNo6) {
        this.relAddrNo6 = relAddrNo6;
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

    public String getCat11() {
        return cat11;
    }

    public void setCat11(String cat11) {
        this.cat11 = cat11;
    }

    public String getCat12() {
        return cat12;
    }

    public void setCat12(String cat12) {
        this.cat12 = cat12;
    }

    public String getCat13() {
        return cat13;
    }

    public void setCat13(String cat13) {
        this.cat13 = cat13;
    }

    public String getCat14() {
        return cat14;
    }

    public void setCat14(String cat14) {
        this.cat14 = cat14;
    }

    public String getCat15() {
        return cat15;
    }

    public void setCat15(String cat15) {
        this.cat15 = cat15;
    }

    public String getCat16() {
        return cat16;
    }

    public void setCat16(String cat16) {
        this.cat16 = cat16;
    }

    public String getCat17() {
        return cat17;
    }

    public void setCat17(String cat17) {
        this.cat17 = cat17;
    }

    public String getCat18() {
        return cat18;
    }

    public void setCat18(String cat18) {
        this.cat18 = cat18;
    }

    public String getCat19() {
        return cat19;
    }

    public void setCat19(String cat19) {
        this.cat19 = cat19;
    }

    public String getCat20() {
        return cat20;
    }

    public void setCat20(String cat20) {
        this.cat20 = cat20;
    }

    public String getCat21() {
        return cat21;
    }

    public void setCat21(String cat21) {
        this.cat21 = cat21;
    }

    public String getCat22() {
        return cat22;
    }

    public void setCat22(String cat22) {
        this.cat22 = cat22;
    }

    public String getCat23() {
        return cat23;
    }

    public void setCat23(String cat23) {
        this.cat23 = cat23;
    }

    public String getCat24() {
        return cat24;
    }

    public void setCat24(String cat24) {
        this.cat24 = cat24;
    }

    public String getCat25() {
        return cat25;
    }

    public void setCat25(String cat25) {
        this.cat25 = cat25;
    }

    public String getCat26() {
        return cat26;
    }

    public void setCat26(String cat26) {
        this.cat26 = cat26;
    }

    public String getCat27() {
        return cat27;
    }

    public void setCat27(String cat27) {
        this.cat27 = cat27;
    }

    public String getCat28() {
        return cat28;
    }

    public void setCat28(String cat28) {
        this.cat28 = cat28;
    }

    public String getCat29() {
        return cat29;
    }

    public void setCat29(String cat29) {
        this.cat29 = cat29;
    }

    public String getCat30() {
        return cat30;
    }

    public void setCat30(String cat30) {
        this.cat30 = cat30;
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
        sb.append(", addrNo=").append(addrNo);
        sb.append(", laddrNo=").append(laddrNo);
        sb.append(", addrName=").append(addrName);
        sb.append(", addrAbbr=").append(addrAbbr);
        sb.append(", addrClass=").append(addrClass);
        sb.append(", relAddrNo1=").append(relAddrNo1);
        sb.append(", relAddrNo2=").append(relAddrNo2);
        sb.append(", relAddrNo3=").append(relAddrNo3);
        sb.append(", relAddrNo4=").append(relAddrNo4);
        sb.append(", relAddrNo5=").append(relAddrNo5);
        sb.append(", relAddrNo6=").append(relAddrNo6);
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
        sb.append(", cat11=").append(cat11);
        sb.append(", cat12=").append(cat12);
        sb.append(", cat13=").append(cat13);
        sb.append(", cat14=").append(cat14);
        sb.append(", cat15=").append(cat15);
        sb.append(", cat16=").append(cat16);
        sb.append(", cat17=").append(cat17);
        sb.append(", cat18=").append(cat18);
        sb.append(", cat19=").append(cat19);
        sb.append(", cat20=").append(cat20);
        sb.append(", cat21=").append(cat21);
        sb.append(", cat22=").append(cat22);
        sb.append(", cat23=").append(cat23);
        sb.append(", cat24=").append(cat24);
        sb.append(", cat25=").append(cat25);
        sb.append(", cat26=").append(cat26);
        sb.append(", cat27=").append(cat27);
        sb.append(", cat28=").append(cat28);
        sb.append(", cat29=").append(cat29);
        sb.append(", cat30=").append(cat30);
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