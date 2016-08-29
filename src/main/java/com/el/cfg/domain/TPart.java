package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TPart implements Serializable {
    /**
     *  null - T_PART.ID
     */
    private Long id;

    /**
     *  产品ID 对应T_PROD.ID - T_PART.PROD_ID
     */
    private Long prodId;

    /**
     *  行号 - T_PART.LINE_NO
     */
    private Long lineNo;

    /**
     *  部件类型 - T_PART.PART_TYPE
     */
    private String partType;

    /**
     *  部件号 - T_PART.PART_CODE
     */
    private String partCode;

    /**
     *  部件名称 - T_PART.PART_NAME
     */
    private String partName;

    /**
     *  展开高度 - T_PART.FULL_HEIGHT
     */
    private Short fullHeight;

    /**
     *  展开宽度 - T_PART.FULL_WIDTH
     */
    private Short fullWidth;

    /**
     *  正面色数 - T_PART.COLORCNT_FRONT
     */
    private Short colorcntFront;

    /**
     *  背面色数 - T_PART.COLORCNT_BACK
     */
    private Short colorcntBack;

    /**
     *  正面专色数 - T_PART.SCOLORCNT_FRONT
     */
    private Short scolorcntFront;

    /**
     *  背面专色数 - T_PART.SCOLORCNT_BACK
     */
    private Short scolorcntBack;

    /**
     *  原色说明 - T_PART.COLOR_DESC
     */
    private String colorDesc;

    /**
     *  专色说明 - T_PART.SCOLOR_DESC
     */
    private String scolorDesc;

    /**
     *  加工难度等级 - T_PART.DIFF_LEVEL
     */
    private String diffLevel;

    /**
     *  工艺要求 - T_PART.PROCESS_DEMAND
     */
    private String processDemand;

    /**
     *  P数 - T_PART.PAGE_CNT
     */
    private Long pageCnt;

    /**
     *  表面处理要求 - T_PART.SURFACE_DEMAND
     */
    private String surfaceDemand;

    /**
     *  部件高度 - T_PART.PART_HEIGHT
     */
    private Short partHeight;

    /**
     *  部件宽度 - T_PART.PART_WIDTH
     */
    private Short partWidth;

    /**
     *  部件深度 - T_PART.PART_DEPTH
     */
    private Short partDepth;

    /**
     *  印刷类型 平张/轮转 - T_PART.PRINT_TYPE
     */
    private String printType;

    /**
     *  是否装订 - T_PART.BIND_INCLUDE_FLAG
     */
    private Short bindIncludeFlag;

    /**
     *  是否客来 - T_PART.CUST_SUPPLY_FLAG
     */
    private Short custSupplyFlag;

    /**
     *  纸张来源 - T_PART.PAPER_SOURCE
     */
    private String paperSource;

    /**
     *  纸张种类 - T_PART.PAPER_TYPE
     */
    private String paperType;

    /**
     *  纸张规格ID - T_PART.PAPER_SPEC_ID
     */
    private Long paperSpecId;

    /**
     *  纸张高度 - T_PART.PAPER_HEIGHT
     */
    private Short paperHeight;

    /**
     *  纸张宽度 - T_PART.PAPER_WIDTH
     */
    private Short paperWidth;

    /**
     *  纸张克重 - T_PART.PAPER_WEIGHT
     */
    private String paperWeight;

    /**
     *  纸张厂家 - T_PART.PAPER_VENDOR
     */
    private String paperVendor;

    /**
     *  纸张品牌 - T_PART.PAPER_BRAND
     */
    private String paperBrand;

    /**
     *  纸张等级 - T_PART.PAPER_GRADE
     */
    private String paperGrade;

    /**
     *  纸张料号ID - T_PART.PAPER_ITEM_ID
     */
    private Long paperItemId;

    /**
     *  核算用量 - T_PART.CALC_PAPERUSAGE
     */
    private BigDecimal calcPaperusage;

    /**
     *  客户要求用量 - T_PART.CUSTAGREE_PAPERUSAGE
     */
    private BigDecimal custagreePaperusage;

    /**
     *  备注 - T_PART.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_PART.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PART.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PART.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PART.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PART.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PART.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PART.DATA_VERSION
     */
    private Long dataVersion;

    /**
     *  专色号 - T_PART.SCOLORCNT_CODE
     */
    private Short scolorcntCode;

    /**
     *  联数 - T_PART.JOIN_CNT
     */
    private Long joinCnt;

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

    public Long getLineNo() {
        return lineNo;
    }

    public void setLineNo(Long lineNo) {
        this.lineNo = lineNo;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public String getPartCode() {
        return partCode;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Short getFullHeight() {
        return fullHeight;
    }

    public void setFullHeight(Short fullHeight) {
        this.fullHeight = fullHeight;
    }

    public Short getFullWidth() {
        return fullWidth;
    }

    public void setFullWidth(Short fullWidth) {
        this.fullWidth = fullWidth;
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

    public String getColorDesc() {
        return colorDesc;
    }

    public void setColorDesc(String colorDesc) {
        this.colorDesc = colorDesc;
    }

    public String getScolorDesc() {
        return scolorDesc;
    }

    public void setScolorDesc(String scolorDesc) {
        this.scolorDesc = scolorDesc;
    }

    public String getDiffLevel() {
        return diffLevel;
    }

    public void setDiffLevel(String diffLevel) {
        this.diffLevel = diffLevel;
    }

    public String getProcessDemand() {
        return processDemand;
    }

    public void setProcessDemand(String processDemand) {
        this.processDemand = processDemand;
    }

    public Long getPageCnt() {
        return pageCnt;
    }

    public void setPageCnt(Long pageCnt) {
        this.pageCnt = pageCnt;
    }

    public String getSurfaceDemand() {
        return surfaceDemand;
    }

    public void setSurfaceDemand(String surfaceDemand) {
        this.surfaceDemand = surfaceDemand;
    }

    public Short getPartHeight() {
        return partHeight;
    }

    public void setPartHeight(Short partHeight) {
        this.partHeight = partHeight;
    }

    public Short getPartWidth() {
        return partWidth;
    }

    public void setPartWidth(Short partWidth) {
        this.partWidth = partWidth;
    }

    public Short getPartDepth() {
        return partDepth;
    }

    public void setPartDepth(Short partDepth) {
        this.partDepth = partDepth;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public Short getBindIncludeFlag() {
        return bindIncludeFlag;
    }

    public void setBindIncludeFlag(Short bindIncludeFlag) {
        this.bindIncludeFlag = bindIncludeFlag;
    }

    public Short getCustSupplyFlag() {
        return custSupplyFlag;
    }

    public void setCustSupplyFlag(Short custSupplyFlag) {
        this.custSupplyFlag = custSupplyFlag;
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

    public BigDecimal getCalcPaperusage() {
        return calcPaperusage;
    }

    public void setCalcPaperusage(BigDecimal calcPaperusage) {
        this.calcPaperusage = calcPaperusage;
    }

    public BigDecimal getCustagreePaperusage() {
        return custagreePaperusage;
    }

    public void setCustagreePaperusage(BigDecimal custagreePaperusage) {
        this.custagreePaperusage = custagreePaperusage;
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

    public Short getScolorcntCode() {
        return scolorcntCode;
    }

    public void setScolorcntCode(Short scolorcntCode) {
        this.scolorcntCode = scolorcntCode;
    }

    public Long getJoinCnt() {
        return joinCnt;
    }

    public void setJoinCnt(Long joinCnt) {
        this.joinCnt = joinCnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prodId=").append(prodId);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", partType=").append(partType);
        sb.append(", partCode=").append(partCode);
        sb.append(", partName=").append(partName);
        sb.append(", fullHeight=").append(fullHeight);
        sb.append(", fullWidth=").append(fullWidth);
        sb.append(", colorcntFront=").append(colorcntFront);
        sb.append(", colorcntBack=").append(colorcntBack);
        sb.append(", scolorcntFront=").append(scolorcntFront);
        sb.append(", scolorcntBack=").append(scolorcntBack);
        sb.append(", colorDesc=").append(colorDesc);
        sb.append(", scolorDesc=").append(scolorDesc);
        sb.append(", diffLevel=").append(diffLevel);
        sb.append(", processDemand=").append(processDemand);
        sb.append(", pageCnt=").append(pageCnt);
        sb.append(", surfaceDemand=").append(surfaceDemand);
        sb.append(", partHeight=").append(partHeight);
        sb.append(", partWidth=").append(partWidth);
        sb.append(", partDepth=").append(partDepth);
        sb.append(", printType=").append(printType);
        sb.append(", bindIncludeFlag=").append(bindIncludeFlag);
        sb.append(", custSupplyFlag=").append(custSupplyFlag);
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
        sb.append(", calcPaperusage=").append(calcPaperusage);
        sb.append(", custagreePaperusage=").append(custagreePaperusage);
        sb.append(", remark=").append(remark);
        sb.append(", lockerId=").append(lockerId);
        sb.append(", lockTs=").append(lockTs);
        sb.append(", modifyerId=").append(modifyerId);
        sb.append(", modifyTs=").append(modifyTs);
        sb.append(", modifyAppsvr=").append(modifyAppsvr);
        sb.append(", modifyModule=").append(modifyModule);
        sb.append(", dataVersion=").append(dataVersion);
        sb.append(", scolorcntCode=").append(scolorcntCode);
        sb.append(", joinCnt=").append(joinCnt);
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