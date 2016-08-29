package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TProdProcess implements Serializable {
    /**
     *  null - T_PROD_PROCESS.ID
     */
    private Long id;

    /**
     *  产品ID - T_PROD_PROCESS.PROD_ID
     */
    private Long prodId;

    /**
     *  部件ID - T_PROD_PROCESS.PART_ID
     */
    private Long partId;

    /**
     *  部件名称 - T_PROD_PROCESS.PART_NAME
     */
    private String partName;

    /**
     *  产品工艺段ID - T_PROD_PROCESS.PRODROUTE_ID
     */
    private Long prodrouteId;

    /**
     *  工艺段说明 - T_PROD_PROCESS.ROUTE_DESC
     */
    private String routeDesc;

    /**
     *  工序ID - T_PROD_PROCESS.PROCESS_ID
     */
    private Long processId;

    /**
     *  工序顺序号 - T_PROD_PROCESS.PROCESS_SORTNO
     */
    private Long processSortno;

    /**
     *  工序编号 - T_PROD_PROCESS.PROCESS_CODE
     */
    private String processCode;

    /**
     *  下道工序顺序号 - T_PROD_PROCESS.NEXT_SORT_NO
     */
    private Long nextSortNo;

    /**
     *  作业机型 - T_PROD_PROCESS.MACHINE_TYPE
     */
    private String machineType;

    /**
     *  生产编号 - T_PROD_PROCESS.MANU_NO
     */
    private String manuNo;

    /**
     *  P数 - T_PROD_PROCESS.PAGE_CNT
     */
    private Long pageCnt;

    /**
     *  贴数 - T_PROD_PROCESS.SIGN_CNT
     */
    private Long signCnt;

    /**
     *  页数说明 - T_PROD_PROCESS.PAGE_DESC
     */
    private String pageDesc;

    /**
     *  每贴P数 - T_PROD_PROCESS.PAGECNT_PER_SIGN
     */
    private Short pagecntPerSign;

    /**
     *  拼数 - T_PROD_PROCESS.SETS_CNT
     */
    private Short setsCnt;

    /**
     *  拼式 - T_PROD_PROCESS.SETS_METHOD
     */
    private String setsMethod;

    /**
     *  印刷方式 - T_PROD_PROCESS.PRINT_METHOD
     */
    private String printMethod;

    /**
     *  原色正 - T_PROD_PROCESS.COLORCNT_FRONT
     */
    private Short colorcntFront;

    /**
     *  原色反 - T_PROD_PROCESS.COLORCNT_BACK
     */
    private Short colorcntBack;

    /**
     *  专色正 - T_PROD_PROCESS.SCOLORCNT_FRONT
     */
    private Short scolorcntFront;

    /**
     *  专色反 - T_PROD_PROCESS.SCOLORCNT_BACK
     */
    private Short scolorcntBack;

    /**
     *  原色说明 - T_PROD_PROCESS.COLOR_DESC
     */
    private String colorDesc;

    /**
     *  专色说明 - T_PROD_PROCESS.SCOLOR_DESC
     */
    private String scolorDesc;

    /**
     *  联机上光 - T_PROD_PROCESS.UNIONVANISH
     */
    private String unionvanish;

    /**
     *  上光面数 共用：加工面数 - T_PROD_PROCESS.UNIONVANISH_FACES
     */
    private String unionvanishFaces;

    /**
     *  上光版数 - T_PROD_PROCESS.UNIONVANISH_PLATECNT
     */
    private Short unionvanishPlatecnt;

    /**
     *  开纸方式 即上机规格 - T_PROD_PROCESS.PAPER_FORMAT
     */
    private String paperFormat;

    /**
     *  开纸高度 - T_PROD_PROCESS.PRINTPAPER_HEIGHT
     */
    private Short printpaperHeight;

    /**
     *  开纸宽度 - T_PROD_PROCESS.PRINTPAPER_WIDTH
     */
    private Short printpaperWidth;

    /**
     *  料源 - T_PROD_PROCESS.MATERIAL_SOURCE
     */
    private String materialSource;

    /**
     *  物料ID - T_PROD_PROCESS.MATERIAL_ID
     */
    private Long materialId;

    /**
     *  用料数量 - T_PROD_PROCESS.MATERIAL_QTY
     */
    private BigDecimal materialQty;

    /**
     *  用料单位 - T_PROD_PROCESS.MATERIAL_UOM
     */
    private String materialUom;

    /**
     *  版型 - T_PROD_PROCESS.PLATE_TYPE
     */
    private String plateType;

    /**
     *  每贴版数 - T_PROD_PROCESS.PLATECNT_PER_SIGN
     */
    private Short platecntPerSign;

    /**
     *  总版数 - T_PROD_PROCESS.PLATE_CNT
     */
    private Short plateCnt;

    /**
     *  制版套数 - T_PROD_PROCESS.PLATE_SETCNT
     */
    private Short plateSetcnt;

    /**
     *  网型 - T_PROD_PROCESS.SCREEN_TYPE
     */
    private String screenType;

    /**
     *  线数 - T_PROD_PROCESS.SCREEN_DPI
     */
    private String screenDpi;

    /**
     *  正数 - T_PROD_PROCESS.MANU_QTY
     */
    private Long manuQty;

    /**
     *  印刷加放 - T_PROD_PROCESS.PRINT_ADDUP
     */
    private BigDecimal printAddup;

    /**
     *  装订加放 - T_PROD_PROCESS.BIND_ADDUP
     */
    private BigDecimal bindAddup;

    /**
     *  每贴用纸令数 - T_PROD_PROCESS.REAM_PER_SIGN
     */
    private BigDecimal reamPerSign;

    /**
     *  总用纸令数 - T_PROD_PROCESS.REAM_CNT
     */
    private BigDecimal reamCnt;

    /**
     *  纸张核算用量 - T_PROD_PROCESS.PAPER_USAGE
     */
    private BigDecimal paperUsage;

    /**
     *  客户要求用量 - T_PROD_PROCESS.CUSTAGREE_USAGE
     */
    private BigDecimal custagreeUsage;

    /**
     *  纸张利用率 - T_PROD_PROCESS.PAPER_UTILIZE_RATIO
     */
    private BigDecimal paperUtilizeRatio;

    /**
     *  加工难度等级 - T_PROD_PROCESS.DIFF_LEVEL
     */
    private String diffLevel;

    /**
     *  墨量大小 - T_PROD_PROCESS.INKQTY_DESC
     */
    private String inkqtyDesc;

    /**
     *  加工面积 - T_PROD_PROCESS.PROCESS_AREA
     */
    private BigDecimal processArea;

    /**
     *  加工单位 - T_PROD_PROCESS.PROCESS_UOM
     */
    private String processUom;

    /**
     *  加工数量 - T_PROD_PROCESS.PROCESS_QTY
     */
    private Long processQty;

    /**
     *  加工开数 - T_PROD_PROCESS.PROCESS_FORMAT
     */
    private String processFormat;

    /**
     *  工艺要求 - T_PROD_PROCESS.PROCESS_DEMAND
     */
    private String processDemand;

    /**
     *  加工说明 - T_PROD_PROCESS.PROCESS_DESC
     */
    private String processDesc;

    /**
     *  加工后每贴P数 - T_PROD_PROCESS.AFTERPROCESS_PAGEPERSIGN
     */
    private Short afterprocessPagepersign;

    /**
     *  勒口尺寸 - T_PROD_PROCESS.FLAP_SIZE
     */
    private Short flapSize;

    /**
     *  模具版数 - T_PROD_PROCESS.MOLD_CNT
     */
    private Short moldCnt;

    /**
     *  模具费用 - T_PROD_PROCESS.MOLD_AMT
     */
    private BigDecimal moldAmt;

    /**
     *  参考样 - T_PROD_PROCESS.SAMPLE
     */
    private String sample;

    /**
     *  备注 - T_PROD_PROCESS.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_PROD_PROCESS.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PROD_PROCESS.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PROD_PROCESS.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PROD_PROCESS.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PROD_PROCESS.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PROD_PROCESS.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PROD_PROCESS.DATA_VERSION
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

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public Long getProcessSortno() {
        return processSortno;
    }

    public void setProcessSortno(Long processSortno) {
        this.processSortno = processSortno;
    }

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public Long getNextSortNo() {
        return nextSortNo;
    }

    public void setNextSortNo(Long nextSortNo) {
        this.nextSortNo = nextSortNo;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getManuNo() {
        return manuNo;
    }

    public void setManuNo(String manuNo) {
        this.manuNo = manuNo;
    }

    public Long getPageCnt() {
        return pageCnt;
    }

    public void setPageCnt(Long pageCnt) {
        this.pageCnt = pageCnt;
    }

    public Long getSignCnt() {
        return signCnt;
    }

    public void setSignCnt(Long signCnt) {
        this.signCnt = signCnt;
    }

    public String getPageDesc() {
        return pageDesc;
    }

    public void setPageDesc(String pageDesc) {
        this.pageDesc = pageDesc;
    }

    public Short getPagecntPerSign() {
        return pagecntPerSign;
    }

    public void setPagecntPerSign(Short pagecntPerSign) {
        this.pagecntPerSign = pagecntPerSign;
    }

    public Short getSetsCnt() {
        return setsCnt;
    }

    public void setSetsCnt(Short setsCnt) {
        this.setsCnt = setsCnt;
    }

    public String getSetsMethod() {
        return setsMethod;
    }

    public void setSetsMethod(String setsMethod) {
        this.setsMethod = setsMethod;
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

    public String getUnionvanish() {
        return unionvanish;
    }

    public void setUnionvanish(String unionvanish) {
        this.unionvanish = unionvanish;
    }

    public String getUnionvanishFaces() {
        return unionvanishFaces;
    }

    public void setUnionvanishFaces(String unionvanishFaces) {
        this.unionvanishFaces = unionvanishFaces;
    }

    public Short getUnionvanishPlatecnt() {
        return unionvanishPlatecnt;
    }

    public void setUnionvanishPlatecnt(Short unionvanishPlatecnt) {
        this.unionvanishPlatecnt = unionvanishPlatecnt;
    }

    public String getPaperFormat() {
        return paperFormat;
    }

    public void setPaperFormat(String paperFormat) {
        this.paperFormat = paperFormat;
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

    public String getMaterialSource() {
        return materialSource;
    }

    public void setMaterialSource(String materialSource) {
        this.materialSource = materialSource;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public BigDecimal getMaterialQty() {
        return materialQty;
    }

    public void setMaterialQty(BigDecimal materialQty) {
        this.materialQty = materialQty;
    }

    public String getMaterialUom() {
        return materialUom;
    }

    public void setMaterialUom(String materialUom) {
        this.materialUom = materialUom;
    }

    public String getPlateType() {
        return plateType;
    }

    public void setPlateType(String plateType) {
        this.plateType = plateType;
    }

    public Short getPlatecntPerSign() {
        return platecntPerSign;
    }

    public void setPlatecntPerSign(Short platecntPerSign) {
        this.platecntPerSign = platecntPerSign;
    }

    public Short getPlateCnt() {
        return plateCnt;
    }

    public void setPlateCnt(Short plateCnt) {
        this.plateCnt = plateCnt;
    }

    public Short getPlateSetcnt() {
        return plateSetcnt;
    }

    public void setPlateSetcnt(Short plateSetcnt) {
        this.plateSetcnt = plateSetcnt;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getScreenDpi() {
        return screenDpi;
    }

    public void setScreenDpi(String screenDpi) {
        this.screenDpi = screenDpi;
    }

    public Long getManuQty() {
        return manuQty;
    }

    public void setManuQty(Long manuQty) {
        this.manuQty = manuQty;
    }

    public BigDecimal getPrintAddup() {
        return printAddup;
    }

    public void setPrintAddup(BigDecimal printAddup) {
        this.printAddup = printAddup;
    }

    public BigDecimal getBindAddup() {
        return bindAddup;
    }

    public void setBindAddup(BigDecimal bindAddup) {
        this.bindAddup = bindAddup;
    }

    public BigDecimal getReamPerSign() {
        return reamPerSign;
    }

    public void setReamPerSign(BigDecimal reamPerSign) {
        this.reamPerSign = reamPerSign;
    }

    public BigDecimal getReamCnt() {
        return reamCnt;
    }

    public void setReamCnt(BigDecimal reamCnt) {
        this.reamCnt = reamCnt;
    }

    public BigDecimal getPaperUsage() {
        return paperUsage;
    }

    public void setPaperUsage(BigDecimal paperUsage) {
        this.paperUsage = paperUsage;
    }

    public BigDecimal getCustagreeUsage() {
        return custagreeUsage;
    }

    public void setCustagreeUsage(BigDecimal custagreeUsage) {
        this.custagreeUsage = custagreeUsage;
    }

    public BigDecimal getPaperUtilizeRatio() {
        return paperUtilizeRatio;
    }

    public void setPaperUtilizeRatio(BigDecimal paperUtilizeRatio) {
        this.paperUtilizeRatio = paperUtilizeRatio;
    }

    public String getDiffLevel() {
        return diffLevel;
    }

    public void setDiffLevel(String diffLevel) {
        this.diffLevel = diffLevel;
    }

    public String getInkqtyDesc() {
        return inkqtyDesc;
    }

    public void setInkqtyDesc(String inkqtyDesc) {
        this.inkqtyDesc = inkqtyDesc;
    }

    public BigDecimal getProcessArea() {
        return processArea;
    }

    public void setProcessArea(BigDecimal processArea) {
        this.processArea = processArea;
    }

    public String getProcessUom() {
        return processUom;
    }

    public void setProcessUom(String processUom) {
        this.processUom = processUom;
    }

    public Long getProcessQty() {
        return processQty;
    }

    public void setProcessQty(Long processQty) {
        this.processQty = processQty;
    }

    public String getProcessFormat() {
        return processFormat;
    }

    public void setProcessFormat(String processFormat) {
        this.processFormat = processFormat;
    }

    public String getProcessDemand() {
        return processDemand;
    }

    public void setProcessDemand(String processDemand) {
        this.processDemand = processDemand;
    }

    public String getProcessDesc() {
        return processDesc;
    }

    public void setProcessDesc(String processDesc) {
        this.processDesc = processDesc;
    }

    public Short getAfterprocessPagepersign() {
        return afterprocessPagepersign;
    }

    public void setAfterprocessPagepersign(Short afterprocessPagepersign) {
        this.afterprocessPagepersign = afterprocessPagepersign;
    }

    public Short getFlapSize() {
        return flapSize;
    }

    public void setFlapSize(Short flapSize) {
        this.flapSize = flapSize;
    }

    public Short getMoldCnt() {
        return moldCnt;
    }

    public void setMoldCnt(Short moldCnt) {
        this.moldCnt = moldCnt;
    }

    public BigDecimal getMoldAmt() {
        return moldAmt;
    }

    public void setMoldAmt(BigDecimal moldAmt) {
        this.moldAmt = moldAmt;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
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
        sb.append(", processId=").append(processId);
        sb.append(", processSortno=").append(processSortno);
        sb.append(", processCode=").append(processCode);
        sb.append(", nextSortNo=").append(nextSortNo);
        sb.append(", machineType=").append(machineType);
        sb.append(", manuNo=").append(manuNo);
        sb.append(", pageCnt=").append(pageCnt);
        sb.append(", signCnt=").append(signCnt);
        sb.append(", pageDesc=").append(pageDesc);
        sb.append(", pagecntPerSign=").append(pagecntPerSign);
        sb.append(", setsCnt=").append(setsCnt);
        sb.append(", setsMethod=").append(setsMethod);
        sb.append(", printMethod=").append(printMethod);
        sb.append(", colorcntFront=").append(colorcntFront);
        sb.append(", colorcntBack=").append(colorcntBack);
        sb.append(", scolorcntFront=").append(scolorcntFront);
        sb.append(", scolorcntBack=").append(scolorcntBack);
        sb.append(", colorDesc=").append(colorDesc);
        sb.append(", scolorDesc=").append(scolorDesc);
        sb.append(", unionvanish=").append(unionvanish);
        sb.append(", unionvanishFaces=").append(unionvanishFaces);
        sb.append(", unionvanishPlatecnt=").append(unionvanishPlatecnt);
        sb.append(", paperFormat=").append(paperFormat);
        sb.append(", printpaperHeight=").append(printpaperHeight);
        sb.append(", printpaperWidth=").append(printpaperWidth);
        sb.append(", materialSource=").append(materialSource);
        sb.append(", materialId=").append(materialId);
        sb.append(", materialQty=").append(materialQty);
        sb.append(", materialUom=").append(materialUom);
        sb.append(", plateType=").append(plateType);
        sb.append(", platecntPerSign=").append(platecntPerSign);
        sb.append(", plateCnt=").append(plateCnt);
        sb.append(", plateSetcnt=").append(plateSetcnt);
        sb.append(", screenType=").append(screenType);
        sb.append(", screenDpi=").append(screenDpi);
        sb.append(", manuQty=").append(manuQty);
        sb.append(", printAddup=").append(printAddup);
        sb.append(", bindAddup=").append(bindAddup);
        sb.append(", reamPerSign=").append(reamPerSign);
        sb.append(", reamCnt=").append(reamCnt);
        sb.append(", paperUsage=").append(paperUsage);
        sb.append(", custagreeUsage=").append(custagreeUsage);
        sb.append(", paperUtilizeRatio=").append(paperUtilizeRatio);
        sb.append(", diffLevel=").append(diffLevel);
        sb.append(", inkqtyDesc=").append(inkqtyDesc);
        sb.append(", processArea=").append(processArea);
        sb.append(", processUom=").append(processUom);
        sb.append(", processQty=").append(processQty);
        sb.append(", processFormat=").append(processFormat);
        sb.append(", processDemand=").append(processDemand);
        sb.append(", processDesc=").append(processDesc);
        sb.append(", afterprocessPagepersign=").append(afterprocessPagepersign);
        sb.append(", flapSize=").append(flapSize);
        sb.append(", moldCnt=").append(moldCnt);
        sb.append(", moldAmt=").append(moldAmt);
        sb.append(", sample=").append(sample);
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