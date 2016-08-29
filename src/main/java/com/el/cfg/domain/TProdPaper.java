package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TProdPaper implements Serializable {
    /**
     *  null - T_PROD_PAPER.ID
     */
    private Long id;

    /**
     *  产品ID - T_PROD_PAPER.PROD_ID
     */
    private Long prodId;

    /**
     *  部件ID - T_PROD_PAPER.PART_ID
     */
    private Long partId;

    /**
     *  部件名称 - T_PROD_PAPER.PART_NAME
     */
    private String partName;

    /**
     *  产品工艺段ID - T_PROD_PAPER.PRODROUTE_ID
     */
    private Long prodrouteId;

    /**
     *  工艺段说明 - T_PROD_PAPER.ROUTE_DESC
     */
    private String routeDesc;

    /**
     *  方案名称 - T_PROD_PAPER.SET_NAME
     */
    private String setName;

    /**
     *  纸张利用率 - T_PROD_PAPER.USAGE_RATE
     */
    private BigDecimal usageRate;

    /**
     *  是否选用 - T_PROD_PAPER.SELECT_FLAG
     */
    private Short selectFlag;

    /**
     *  印刷类型列表 - T_PROD_PAPER.PRINT_TYPE
     */
    private String printType;

    /**
     *  印刷方式列表 - T_PROD_PAPER.PRINT_METHOD
     */
    private String printMethod;

    /**
     *  原色正 - T_PROD_PAPER.COLORCNT_FRONT
     */
    private Short colorcntFront;

    /**
     *  原色反 - T_PROD_PAPER.COLORCNT_BACK
     */
    private Short colorcntBack;

    /**
     *  专色正 - T_PROD_PAPER.SCOLORCNT_FRONT
     */
    private Short scolorcntFront;

    /**
     *  专色反 - T_PROD_PAPER.SCOLORCNT_BACK
     */
    private Short scolorcntBack;

    /**
     *  开纸尺寸高 - T_PROD_PAPER.PRINTPAPER_HEIGHT
     */
    private Short printpaperHeight;

    /**
     *  开纸尺寸宽 - T_PROD_PAPER.PRINTPAPER_WIDTH
     */
    private Short printpaperWidth;

    /**
     *  纸张来源 - T_PROD_PAPER.PAPER_SOURCE
     */
    private String paperSource;

    /**
     *  纸张种类 - T_PROD_PAPER.PAPER_TYPE
     */
    private String paperType;

    /**
     *  纸张规格ID - T_PROD_PAPER.PAPER_SPEC_ID
     */
    private Long paperSpecId;

    /**
     *  纸张高度 - T_PROD_PAPER.PAPER_HEIGHT
     */
    private Short paperHeight;

    /**
     *  纸张宽度 - T_PROD_PAPER.PAPER_WIDTH
     */
    private Short paperWidth;

    /**
     *  纸张克重 - T_PROD_PAPER.PAPER_WEIGHT
     */
    private String paperWeight;

    /**
     *  纸张厂家 - T_PROD_PAPER.PAPER_VENDOR
     */
    private String paperVendor;

    /**
     *  纸张品牌 - T_PROD_PAPER.PAPER_BRAND
     */
    private String paperBrand;

    /**
     *  纸张等级 - T_PROD_PAPER.PAPER_GRADE
     */
    private String paperGrade;

    /**
     *  纸张料号ID - T_PROD_PAPER.PAPER_ITEM_ID
     */
    private Long paperItemId;

    /**
     *  备注 - T_PROD_PAPER.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_PROD_PAPER.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PROD_PAPER.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PROD_PAPER.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PROD_PAPER.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PROD_PAPER.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PROD_PAPER.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PROD_PAPER.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Long getProdrouteId() {
        return prodrouteId;
    }

    public void setProdrouteId(Long prodrouteId) {
        this.prodrouteId = prodrouteId;
    }

    public String getRouteDesc() {
        return routeDesc;
    }

    public void setRouteDesc(String routeDesc) {
        this.routeDesc = routeDesc;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public BigDecimal getUsageRate() {
        return usageRate;
    }

    public void setUsageRate(BigDecimal usageRate) {
        this.usageRate = usageRate;
    }

    public Short getSelectFlag() {
        return selectFlag;
    }

    public void setSelectFlag(Short selectFlag) {
        this.selectFlag = selectFlag;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getPrintMethod() {
        return printMethod;
    }

    public void setPrintMethod(String printMethod) {
        this.printMethod = printMethod;
    }

    public Short getColorcntFront() {
        return colorcntFront;
    }

    public void setColorcntFront(Short colorcntFront) {
        this.colorcntFront = colorcntFront;
    }

    public Short getColorcntBack() {
        return colorcntBack;
    }

    public void setColorcntBack(Short colorcntBack) {
        this.colorcntBack = colorcntBack;
    }

    public Short getScolorcntFront() {
        return scolorcntFront;
    }

    public void setScolorcntFront(Short scolorcntFront) {
        this.scolorcntFront = scolorcntFront;
    }

    public Short getScolorcntBack() {
        return scolorcntBack;
    }

    public void setScolorcntBack(Short scolorcntBack) {
        this.scolorcntBack = scolorcntBack;
    }

    public Short getPrintpaperHeight() {
        return printpaperHeight;
    }

    public void setPrintpaperHeight(Short printpaperHeight) {
        this.printpaperHeight = printpaperHeight;
    }

    public Short getPrintpaperWidth() {
        return printpaperWidth;
    }

    public void setPrintpaperWidth(Short printpaperWidth) {
        this.printpaperWidth = printpaperWidth;
    }

    public String getPaperSource() {
        return paperSource;
    }

    public void setPaperSource(String paperSource) {
        this.paperSource = paperSource;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public Long getPaperSpecId() {
        return paperSpecId;
    }

    public void setPaperSpecId(Long paperSpecId) {
        this.paperSpecId = paperSpecId;
    }

    public Short getPaperHeight() {
        return paperHeight;
    }

    public void setPaperHeight(Short paperHeight) {
        this.paperHeight = paperHeight;
    }

    public Short getPaperWidth() {
        return paperWidth;
    }

    public void setPaperWidth(Short paperWidth) {
        this.paperWidth = paperWidth;
    }

    public String getPaperWeight() {
        return paperWeight;
    }

    public void setPaperWeight(String paperWeight) {
        this.paperWeight = paperWeight;
    }

    public String getPaperVendor() {
        return paperVendor;
    }

    public void setPaperVendor(String paperVendor) {
        this.paperVendor = paperVendor;
    }

    public String getPaperBrand() {
        return paperBrand;
    }

    public void setPaperBrand(String paperBrand) {
        this.paperBrand = paperBrand;
    }

    public String getPaperGrade() {
        return paperGrade;
    }

    public void setPaperGrade(String paperGrade) {
        this.paperGrade = paperGrade;
    }

    public Long getPaperItemId() {
        return paperItemId;
    }

    public void setPaperItemId(Long paperItemId) {
        this.paperItemId = paperItemId;
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
        sb.append(", prodId=").append(prodId);
        sb.append(", partId=").append(partId);
        sb.append(", partName=").append(partName);
        sb.append(", prodrouteId=").append(prodrouteId);
        sb.append(", routeDesc=").append(routeDesc);
        sb.append(", setName=").append(setName);
        sb.append(", usageRate=").append(usageRate);
        sb.append(", selectFlag=").append(selectFlag);
        sb.append(", printType=").append(printType);
        sb.append(", printMethod=").append(printMethod);
        sb.append(", colorcntFront=").append(colorcntFront);
        sb.append(", colorcntBack=").append(colorcntBack);
        sb.append(", scolorcntFront=").append(scolorcntFront);
        sb.append(", scolorcntBack=").append(scolorcntBack);
        sb.append(", printpaperHeight=").append(printpaperHeight);
        sb.append(", printpaperWidth=").append(printpaperWidth);
        sb.append(", paperSource=").append(paperSource);
        sb.append(", paperType=").append(paperType);
        sb.append(", paperSpecId=").append(paperSpecId);
        sb.append(", paperHeight=").append(paperHeight);
        sb.append(", paperWidth=").append(paperWidth);
        sb.append(", paperWeight=").append(paperWeight);
        sb.append(", paperVendor=").append(paperVendor);
        sb.append(", paperBrand=").append(paperBrand);
        sb.append(", paperGrade=").append(paperGrade);
        sb.append(", paperItemId=").append(paperItemId);
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