package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TAddress implements Serializable {
    /**
     *  null - T_ADDRESS.ID
     */
    private Long id;

    /**
     *  对应T_OU.ID - T_ADDRESS.OU_ID
     */
    private Long ouId;

    /**
     *  地址号 工厂编号/公司地址号/客户地址号/？ - T_ADDRESS.ADDR_NO
     */
    private Long addrNo;

    /**
     *  地址标记 P表示主地址，每类有一个主地址，来自F0116 - T_ADDRESS.ADDR_FLAG
     */
    private String addrFlag;

    /**
     *  联系人行号 如果这是联系人地址，则指明是哪个联系人的地址 - T_ADDRESS.CONT_LINE_NO
     */
    private BigDecimal contLineNo;

    /**
     *  联系人地址类型 - T_ADDRESS.CONT_ADDR_TYPE
     */
    private String contAddrType;

    /**
     *  地址1 工厂地址1/公司地址1 - T_ADDRESS.ADD1
     */
    private String add1;

    /**
     *  地址2 工厂地址2/公司地址2 - T_ADDRESS.ADD2
     */
    private String add2;

    /**
     *  地址3 - T_ADDRESS.ADD3
     */
    private String add3;

    /**
     *  地址4 - T_ADDRESS.ADD4
     */
    private String add4;

    /**
     *  国家 - T_ADDRESS.COUNTRY
     */
    private String country;

    /**
     *  省 - T_ADDRESS.PROVINCE
     */
    private String province;

    /**
     *  市 工厂所在的城市/公司所在的城市 - T_ADDRESS.CITY
     */
    private String city;

    /**
     *  区县 - T_ADDRESS.COUNTY
     */
    private String county;

    /**
     *  镇 - T_ADDRESS.TOWN
     */
    private String town;

    /**
     *  片区 - T_ADDRESS.AREA
     */
    private String area;

    /**
     *  详细地址 - T_ADDRESS.ADDD
     */
    private String addd;

    /**
     *  邮编 - T_ADDRESS.ZIP
     */
    private String zip;

    /**
     *  锁定人ID - T_ADDRESS.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_ADDRESS.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_ADDRESS.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_ADDRESS.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_ADDRESS.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_ADDRESS.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_ADDRESS.DATA_VERSION
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

    public String getAddrFlag() {
        return addrFlag;
    }

    public void setAddrFlag(String addrFlag) {
        this.addrFlag = addrFlag;
    }

    public BigDecimal getContLineNo() {
        return contLineNo;
    }

    public void setContLineNo(BigDecimal contLineNo) {
        this.contLineNo = contLineNo;
    }

    public String getContAddrType() {
        return contAddrType;
    }

    public void setContAddrType(String contAddrType) {
        this.contAddrType = contAddrType;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getAdd3() {
        return add3;
    }

    public void setAdd3(String add3) {
        this.add3 = add3;
    }

    public String getAdd4() {
        return add4;
    }

    public void setAdd4(String add4) {
        this.add4 = add4;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddd() {
        return addd;
    }

    public void setAddd(String addd) {
        this.addd = addd;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
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
        sb.append(", addrFlag=").append(addrFlag);
        sb.append(", contLineNo=").append(contLineNo);
        sb.append(", contAddrType=").append(contAddrType);
        sb.append(", add1=").append(add1);
        sb.append(", add2=").append(add2);
        sb.append(", add3=").append(add3);
        sb.append(", add4=").append(add4);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", county=").append(county);
        sb.append(", town=").append(town);
        sb.append(", area=").append(area);
        sb.append(", addd=").append(addd);
        sb.append(", zip=").append(zip);
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