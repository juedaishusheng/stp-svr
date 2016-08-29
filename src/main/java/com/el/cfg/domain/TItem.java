package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TItem implements Serializable {
    /**
     *  null - T_ITEM.ID
     */
    private Long id;

    /**
     *  外部编号 - T_ITEM.OUTER_ID
     */
    private Long outerId;

    /**
     *  外部编号2 - T_ITEM.OUTER_ID2
     */
    private String outerId2;

    /**
     *  外部编号3 - T_ITEM.OUTER_ID3
     */
    private String outerId3;

    /**
     *  物料编号 - T_ITEM.ITEM_CODE
     */
    private String itemCode;

    /**
     *  品名 - T_ITEM.ITEM_NAME
     */
    private String itemName;

    /**
     *  全称 - T_ITEM.FULL_NAME
     */
    private String fullName;

    /**
     *  存储类型 UDC - T_ITEM.STORE_TYPE
     */
    private String storeType;

    /**
     *  行类型 - T_ITEM.LINE_TYPE
     */
    private String lineType;

    /**
     *  简短描述 - T_ITEM.BRIEF
     */
    private String brief;

    /**
     *  规格 - T_ITEM.SPEC
     */
    private String spec;

    /**
     *  分类码1 - T_ITEM.CAT1
     */
    private String cat1;

    /**
     *  分类码2 - T_ITEM.CAT2
     */
    private String cat2;

    /**
     *  分类码3 - T_ITEM.CAT3
     */
    private String cat3;

    /**
     *  分类码4 - T_ITEM.CAT4
     */
    private String cat4;

    /**
     *  分类码5 - T_ITEM.CAT5
     */
    private String cat5;

    /**
     *  分类码6 - T_ITEM.CAT6
     */
    private String cat6;

    /**
     *  分类码7 - T_ITEM.CAT7
     */
    private String cat7;

    /**
     *  分类码8 - T_ITEM.CAT8
     */
    private String cat8;

    /**
     *  分类码9 - T_ITEM.CAT9
     */
    private String cat9;

    /**
     *  分类码10 - T_ITEM.CAT10
     */
    private String cat10;

    /**
     *  属性码1 - T_ITEM.PRP1
     */
    private String prp1;

    /**
     *  属性码2 - T_ITEM.PRP2
     */
    private String prp2;

    /**
     *  属性码3 - T_ITEM.PRP3
     */
    private String prp3;

    /**
     *  属性码4 - T_ITEM.PRP4
     */
    private String prp4;

    /**
     *  属性码5 - T_ITEM.PRP5
     */
    private String prp5;

    /**
     *  属性码6 - T_ITEM.PRP6
     */
    private String prp6;

    /**
     *  属性码7 - T_ITEM.PRP7
     */
    private String prp7;

    /**
     *  属性码8 - T_ITEM.PRP8
     */
    private String prp8;

    /**
     *  属性码9 - T_ITEM.PRP9
     */
    private String prp9;

    /**
     *  属性码10 - T_ITEM.PRP10
     */
    private String prp10;

    /**
     *  主单位 - T_ITEM.UOM
     */
    private String uom;

    /**
     *  单位2 - T_ITEM.UOM2
     */
    private String uom2;

    /**
     *  单位3 - T_ITEM.UOM3
     */
    private String uom3;

    /**
     *  单位4 - T_ITEM.UOM4
     */
    private String uom4;

    /**
     *  单位4 - T_ITEM.UOM5
     */
    private String uom5;

    /**
     *  单位6 - T_ITEM.UOM6
     */
    private String uom6;

    /**
     *  单位7 - T_ITEM.UOM7
     */
    private String uom7;

    /**
     *  重量 - T_ITEM.WEIGHT
     */
    private BigDecimal weight;

    /**
     *  体积 - T_ITEM.VOLUME
     */
    private BigDecimal volume;

    /**
     *  预留字符串1 - T_ITEM.URC_C1
     */
    private String urcC1;

    /**
     *  预留字符串2 - T_ITEM.URC_C2
     */
    private String urcC2;

    /**
     *  预留字符串3 - T_ITEM.URC_C3
     */
    private String urcC3;

    /**
     *  预留字符串4 - T_ITEM.URC_C4
     */
    private String urcC4;

    /**
     *  预留字符串5 - T_ITEM.URC_C5
     */
    private String urcC5;

    /**
     *  预留日期1 - T_ITEM.URC_D1
     */
    private Date urcD1;

    /**
     *  预留日期2 - T_ITEM.URC_D2
     */
    private Date urcD2;

    /**
     *  预留日期3 - T_ITEM.URC_D3
     */
    private Date urcD3;

    /**
     *  预留数字1 - T_ITEM.URC_N1
     */
    private BigDecimal urcN1;

    /**
     *  预留数字2 - T_ITEM.URC_N2
     */
    private BigDecimal urcN2;

    /**
     *  预留数字3 - T_ITEM.URC_N3
     */
    private BigDecimal urcN3;

    /**
     *  预留数字4 - T_ITEM.URC_N4
     */
    private BigDecimal urcN4;

    /**
     *  预留数字5 - T_ITEM.URC_N5
     */
    private BigDecimal urcN5;

    /**
     *  锁定人ID - T_ITEM.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_ITEM.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_ITEM.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_ITEM.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_ITEM.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_ITEM.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_ITEM.DATA_VERSION
     */
    private Long dataVersion;

    /**
     *  拼音 - T_ITEM.PY
     */
    private String py;

    /**
     *  拼音简称 - T_ITEM.PY_ABBR
     */
    private String pyAbbr;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOuterId() {
        return outerId;
    }

    public void setOuterId(Long outerId) {
        this.outerId = outerId;
    }

    public String getOuterId2() {
        return outerId2;
    }

    public void setOuterId2(String outerId2) {
        this.outerId2 = outerId2;
    }

    public String getOuterId3() {
        return outerId3;
    }

    public void setOuterId3(String outerId3) {
        this.outerId3 = outerId3;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
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

    public String getPrp1() {
        return prp1;
    }

    public void setPrp1(String prp1) {
        this.prp1 = prp1;
    }

    public String getPrp2() {
        return prp2;
    }

    public void setPrp2(String prp2) {
        this.prp2 = prp2;
    }

    public String getPrp3() {
        return prp3;
    }

    public void setPrp3(String prp3) {
        this.prp3 = prp3;
    }

    public String getPrp4() {
        return prp4;
    }

    public void setPrp4(String prp4) {
        this.prp4 = prp4;
    }

    public String getPrp5() {
        return prp5;
    }

    public void setPrp5(String prp5) {
        this.prp5 = prp5;
    }

    public String getPrp6() {
        return prp6;
    }

    public void setPrp6(String prp6) {
        this.prp6 = prp6;
    }

    public String getPrp7() {
        return prp7;
    }

    public void setPrp7(String prp7) {
        this.prp7 = prp7;
    }

    public String getPrp8() {
        return prp8;
    }

    public void setPrp8(String prp8) {
        this.prp8 = prp8;
    }

    public String getPrp9() {
        return prp9;
    }

    public void setPrp9(String prp9) {
        this.prp9 = prp9;
    }

    public String getPrp10() {
        return prp10;
    }

    public void setPrp10(String prp10) {
        this.prp10 = prp10;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getUom2() {
        return uom2;
    }

    public void setUom2(String uom2) {
        this.uom2 = uom2;
    }

    public String getUom3() {
        return uom3;
    }

    public void setUom3(String uom3) {
        this.uom3 = uom3;
    }

    public String getUom4() {
        return uom4;
    }

    public void setUom4(String uom4) {
        this.uom4 = uom4;
    }

    public String getUom5() {
        return uom5;
    }

    public void setUom5(String uom5) {
        this.uom5 = uom5;
    }

    public String getUom6() {
        return uom6;
    }

    public void setUom6(String uom6) {
        this.uom6 = uom6;
    }

    public String getUom7() {
        return uom7;
    }

    public void setUom7(String uom7) {
        this.uom7 = uom7;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
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

    public BigDecimal getUrcN1() {
        return urcN1;
    }

    public void setUrcN1(BigDecimal urcN1) {
        this.urcN1 = urcN1;
    }

    public BigDecimal getUrcN2() {
        return urcN2;
    }

    public void setUrcN2(BigDecimal urcN2) {
        this.urcN2 = urcN2;
    }

    public BigDecimal getUrcN3() {
        return urcN3;
    }

    public void setUrcN3(BigDecimal urcN3) {
        this.urcN3 = urcN3;
    }

    public BigDecimal getUrcN4() {
        return urcN4;
    }

    public void setUrcN4(BigDecimal urcN4) {
        this.urcN4 = urcN4;
    }

    public BigDecimal getUrcN5() {
        return urcN5;
    }

    public void setUrcN5(BigDecimal urcN5) {
        this.urcN5 = urcN5;
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
        sb.append(", outerId=").append(outerId);
        sb.append(", outerId2=").append(outerId2);
        sb.append(", outerId3=").append(outerId3);
        sb.append(", itemCode=").append(itemCode);
        sb.append(", itemName=").append(itemName);
        sb.append(", fullName=").append(fullName);
        sb.append(", storeType=").append(storeType);
        sb.append(", lineType=").append(lineType);
        sb.append(", brief=").append(brief);
        sb.append(", spec=").append(spec);
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
        sb.append(", prp1=").append(prp1);
        sb.append(", prp2=").append(prp2);
        sb.append(", prp3=").append(prp3);
        sb.append(", prp4=").append(prp4);
        sb.append(", prp5=").append(prp5);
        sb.append(", prp6=").append(prp6);
        sb.append(", prp7=").append(prp7);
        sb.append(", prp8=").append(prp8);
        sb.append(", prp9=").append(prp9);
        sb.append(", prp10=").append(prp10);
        sb.append(", uom=").append(uom);
        sb.append(", uom2=").append(uom2);
        sb.append(", uom3=").append(uom3);
        sb.append(", uom4=").append(uom4);
        sb.append(", uom5=").append(uom5);
        sb.append(", uom6=").append(uom6);
        sb.append(", uom7=").append(uom7);
        sb.append(", weight=").append(weight);
        sb.append(", volume=").append(volume);
        sb.append(", urcC1=").append(urcC1);
        sb.append(", urcC2=").append(urcC2);
        sb.append(", urcC3=").append(urcC3);
        sb.append(", urcC4=").append(urcC4);
        sb.append(", urcC5=").append(urcC5);
        sb.append(", urcD1=").append(urcD1);
        sb.append(", urcD2=").append(urcD2);
        sb.append(", urcD3=").append(urcD3);
        sb.append(", urcN1=").append(urcN1);
        sb.append(", urcN2=").append(urcN2);
        sb.append(", urcN3=").append(urcN3);
        sb.append(", urcN4=").append(urcN4);
        sb.append(", urcN5=").append(urcN5);
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