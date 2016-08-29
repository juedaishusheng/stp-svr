package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TOrgProd implements Serializable {
    /**
     *  null - T_ORG_PROD.ID
     */
    private Long id;

    /**
     *  公司ID 对应T_OU.ID - T_ORG_PROD.OU_ID
     */
    private Long ouId;

    /**
     *  MCUID - T_ORG_PROD.MCU_ID
     */
    private Long mcuId;

    /**
     *  产品编号 - T_ORG_PROD.PROD_CODE
     */
    private String prodCode;

    /**
     *  产品名称 - T_ORG_PROD.PROD_NAME
     */
    private String prodName;

    /**
     *  拼音 - T_ORG_PROD.PY
     */
    private String py;

    /**
     *  拼音简称 - T_ORG_PROD.PY_ABBR
     */
    private String pyAbbr;

    /**
     *  产品大类 - T_ORG_PROD.PROD_CAT1
     */
    private String prodCat1;

    /**
     *  产品小类 - T_ORG_PROD.PROD_CAT2
     */
    private String prodCat2;

    /**
     *  成品单位 - T_ORG_PROD.PROD_UOM
     */
    private String prodUom;

    /**
     *  开本 - T_ORG_PROD.PROD_FORMAT
     */
    private String prodFormat;

    /**
     *  成品高度 - T_ORG_PROD.PROD_HEIGHT
     */
    private BigDecimal prodHeight;

    /**
     *  成品宽度 - T_ORG_PROD.PROD_WIDTH
     */
    private BigDecimal prodWidth;

    /**
     *  成品厚度 - T_ORG_PROD.PROD_THICK
     */
    private BigDecimal prodThick;

    /**
     *  成品重量 - T_ORG_PROD.PROD_WEIGHT
     */
    private BigDecimal prodWeight;

    /**
     *  前勒口宽度 - T_ORG_PROD.FRONT_FLAP_WIDTH
     */
    private BigDecimal frontFlapWidth;

    /**
     *  后勒口宽度 - T_ORG_PROD.BACK_FLAP_WIDTH
     */
    private BigDecimal backFlapWidth;

    /**
     *  装订方式1 - T_ORG_PROD.BIND_TYPE1
     */
    private String bindType1;

    /**
     *  装订方式2 - T_ORG_PROD.BIND_TYPE2
     */
    private String bindType2;

    /**
     *  定价 - T_ORG_PROD.SALE_PRICE
     */
    private BigDecimal salePrice;

    /**
     *  色彩标准 - T_ORG_PROD.COLOR_STANDARD
     */
    private String colorStandard;

    /**
     *  追色标准 - T_ORG_PROD.COLORMATCH_STANDARD
     */
    private String colormatchStandard;

    /**
     *  是否套装 0:否 1:是 - T_ORG_PROD.SET_FLAG
     */
    private String setFlag;

    /**
     *  是否FSC 0-否，1-是 - T_ORG_PROD.FSC_FLAG
     */
    private Short fscFlag;

    /**
     *  是否绿色 0-否，1-是 - T_ORG_PROD.GREEN_FLAG
     */
    private Short greenFlag;

    /**
     *  是否保密 0-否，1-是 - T_ORG_PROD.SECRET_FLAG
     */
    private Short secretFlag;

    /**
     *  特殊要求 - T_ORG_PROD.SPECIAL_DEMAND
     */
    private String specialDemand;

    /**
     *  ISBN/ISSN - T_ORG_PROD.PROD_ISBN
     */
    private String prodIsbn;

    /**
     *  本型 - T_ORG_PROD.OPEN_TYPE
     */
    private String openType;

    /**
     *  版数 - T_ORG_PROD.VERSION_NUM
     */
    private Short versionNum;

    /**
     *  次数 - T_ORG_PROD.REPEAT_NUM
     */
    private Short repeatNum;

    /**
     *  期数 - T_ORG_PROD.PROD_PERIOD
     */
    private String prodPeriod;

    /**
     *  批次 - T_ORG_PROD.PROD_BATCH
     */
    private String prodBatch;

    /**
     *  预估印量 - T_ORG_PROD.ESTI_PRINT_QTY
     */
    private Long estiPrintQty;

    /**
     *  书芯厚度 - T_ORG_PROD.WITHIN_THICK
     */
    private BigDecimal withinThick;

    /**
     *  书号 - T_ORG_PROD.BOOK_NO
     */
    private String bookNo;

    /**
     *  印前单产品编号 - T_ORG_PROD.PREPRESS_DOC_NO
     */
    private String prepressDocNo;

    /**
     *  生产质量等级 A/B/C - T_ORG_PROD.QUALITY_LEVEL
     */
    private String qualityLevel;

    /**
     *  印刷难度等级 A/B/C - T_ORG_PROD.PRINT_DIFF_LEVEL
     */
    private String printDiffLevel;

    /**
     *  装订难度等级 A/B/C - T_ORG_PROD.BIND_DIFF_LEVEL
     */
    private String bindDiffLevel;

    /**
     *  最后生产工厂ID - T_ORG_PROD.LAST_FACT_ID
     */
    private Long lastFactId;

    /**
     *  总页数 - T_ORG_PROD.PAGE_CNT
     */
    private Long pageCnt;

    /**
     *  印张数 - T_ORG_PROD.IMPRESSION_CNT
     */
    private Long impressionCnt;

    /**
     *  贴数 - T_ORG_PROD.SIGN_CNT
     */
    private Long signCnt;

    /**
     *  客户方编码 - T_ORG_PROD.CUST_PROD_NO
     */
    private String custProdNo;

    /**
     *  装订备注 - T_ORG_PROD.BIND_DESC
     */
    private String bindDesc;

    /**
     *  删除标记 - T_ORG_PROD.DELETE_FLAG
     */
    private Short deleteFlag;

    /**
     *  版本号描述 - T_ORG_PROD.VERSION_DESC
     */
    private String versionDesc;

    /**
     *  备注 - T_ORG_PROD.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_ORG_PROD.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_ORG_PROD.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_ORG_PROD.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_ORG_PROD.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_ORG_PROD.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_ORG_PROD.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_ORG_PROD.DATA_VERSION
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

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
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

    public String getProdCat1() {
        return prodCat1;
    }

    public void setProdCat1(String prodCat1) {
        this.prodCat1 = prodCat1;
    }

    public String getProdCat2() {
        return prodCat2;
    }

    public void setProdCat2(String prodCat2) {
        this.prodCat2 = prodCat2;
    }

    public String getProdUom() {
        return prodUom;
    }

    public void setProdUom(String prodUom) {
        this.prodUom = prodUom;
    }

    public String getProdFormat() {
        return prodFormat;
    }

    public void setProdFormat(String prodFormat) {
        this.prodFormat = prodFormat;
    }

    public BigDecimal getProdHeight() {
        return prodHeight;
    }

    public void setProdHeight(BigDecimal prodHeight) {
        this.prodHeight = prodHeight;
    }

    public BigDecimal getProdWidth() {
        return prodWidth;
    }

    public void setProdWidth(BigDecimal prodWidth) {
        this.prodWidth = prodWidth;
    }

    public BigDecimal getProdThick() {
        return prodThick;
    }

    public void setProdThick(BigDecimal prodThick) {
        this.prodThick = prodThick;
    }

    public BigDecimal getProdWeight() {
        return prodWeight;
    }

    public void setProdWeight(BigDecimal prodWeight) {
        this.prodWeight = prodWeight;
    }

    public BigDecimal getFrontFlapWidth() {
        return frontFlapWidth;
    }

    public void setFrontFlapWidth(BigDecimal frontFlapWidth) {
        this.frontFlapWidth = frontFlapWidth;
    }

    public BigDecimal getBackFlapWidth() {
        return backFlapWidth;
    }

    public void setBackFlapWidth(BigDecimal backFlapWidth) {
        this.backFlapWidth = backFlapWidth;
    }

    public String getBindType1() {
        return bindType1;
    }

    public void setBindType1(String bindType1) {
        this.bindType1 = bindType1;
    }

    public String getBindType2() {
        return bindType2;
    }

    public void setBindType2(String bindType2) {
        this.bindType2 = bindType2;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public String getColorStandard() {
        return colorStandard;
    }

    public void setColorStandard(String colorStandard) {
        this.colorStandard = colorStandard;
    }

    public String getColormatchStandard() {
        return colormatchStandard;
    }

    public void setColormatchStandard(String colormatchStandard) {
        this.colormatchStandard = colormatchStandard;
    }

    public String getSetFlag() {
        return setFlag;
    }

    public void setSetFlag(String setFlag) {
        this.setFlag = setFlag;
    }

    public Short getFscFlag() {
        return fscFlag;
    }

    public void setFscFlag(Short fscFlag) {
        this.fscFlag = fscFlag;
    }

    public Short getGreenFlag() {
        return greenFlag;
    }

    public void setGreenFlag(Short greenFlag) {
        this.greenFlag = greenFlag;
    }

    public Short getSecretFlag() {
        return secretFlag;
    }

    public void setSecretFlag(Short secretFlag) {
        this.secretFlag = secretFlag;
    }

    public String getSpecialDemand() {
        return specialDemand;
    }

    public void setSpecialDemand(String specialDemand) {
        this.specialDemand = specialDemand;
    }

    public String getProdIsbn() {
        return prodIsbn;
    }

    public void setProdIsbn(String prodIsbn) {
        this.prodIsbn = prodIsbn;
    }

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }

    public Short getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(Short versionNum) {
        this.versionNum = versionNum;
    }

    public Short getRepeatNum() {
        return repeatNum;
    }

    public void setRepeatNum(Short repeatNum) {
        this.repeatNum = repeatNum;
    }

    public String getProdPeriod() {
        return prodPeriod;
    }

    public void setProdPeriod(String prodPeriod) {
        this.prodPeriod = prodPeriod;
    }

    public String getProdBatch() {
        return prodBatch;
    }

    public void setProdBatch(String prodBatch) {
        this.prodBatch = prodBatch;
    }

    public Long getEstiPrintQty() {
        return estiPrintQty;
    }

    public void setEstiPrintQty(Long estiPrintQty) {
        this.estiPrintQty = estiPrintQty;
    }

    public BigDecimal getWithinThick() {
        return withinThick;
    }

    public void setWithinThick(BigDecimal withinThick) {
        this.withinThick = withinThick;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getPrepressDocNo() {
        return prepressDocNo;
    }

    public void setPrepressDocNo(String prepressDocNo) {
        this.prepressDocNo = prepressDocNo;
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public String getPrintDiffLevel() {
        return printDiffLevel;
    }

    public void setPrintDiffLevel(String printDiffLevel) {
        this.printDiffLevel = printDiffLevel;
    }

    public String getBindDiffLevel() {
        return bindDiffLevel;
    }

    public void setBindDiffLevel(String bindDiffLevel) {
        this.bindDiffLevel = bindDiffLevel;
    }

    public Long getLastFactId() {
        return lastFactId;
    }

    public void setLastFactId(Long lastFactId) {
        this.lastFactId = lastFactId;
    }

    public Long getPageCnt() {
        return pageCnt;
    }

    public void setPageCnt(Long pageCnt) {
        this.pageCnt = pageCnt;
    }

    public Long getImpressionCnt() {
        return impressionCnt;
    }

    public void setImpressionCnt(Long impressionCnt) {
        this.impressionCnt = impressionCnt;
    }

    public Long getSignCnt() {
        return signCnt;
    }

    public void setSignCnt(Long signCnt) {
        this.signCnt = signCnt;
    }

    public String getCustProdNo() {
        return custProdNo;
    }

    public void setCustProdNo(String custProdNo) {
        this.custProdNo = custProdNo;
    }

    public String getBindDesc() {
        return bindDesc;
    }

    public void setBindDesc(String bindDesc) {
        this.bindDesc = bindDesc;
    }

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getVersionDesc() {
        return versionDesc;
    }

    public void setVersionDesc(String versionDesc) {
        this.versionDesc = versionDesc;
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
        sb.append(", ouId=").append(ouId);
        sb.append(", mcuId=").append(mcuId);
        sb.append(", prodCode=").append(prodCode);
        sb.append(", prodName=").append(prodName);
        sb.append(", py=").append(py);
        sb.append(", pyAbbr=").append(pyAbbr);
        sb.append(", prodCat1=").append(prodCat1);
        sb.append(", prodCat2=").append(prodCat2);
        sb.append(", prodUom=").append(prodUom);
        sb.append(", prodFormat=").append(prodFormat);
        sb.append(", prodHeight=").append(prodHeight);
        sb.append(", prodWidth=").append(prodWidth);
        sb.append(", prodThick=").append(prodThick);
        sb.append(", prodWeight=").append(prodWeight);
        sb.append(", frontFlapWidth=").append(frontFlapWidth);
        sb.append(", backFlapWidth=").append(backFlapWidth);
        sb.append(", bindType1=").append(bindType1);
        sb.append(", bindType2=").append(bindType2);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", colorStandard=").append(colorStandard);
        sb.append(", colormatchStandard=").append(colormatchStandard);
        sb.append(", setFlag=").append(setFlag);
        sb.append(", fscFlag=").append(fscFlag);
        sb.append(", greenFlag=").append(greenFlag);
        sb.append(", secretFlag=").append(secretFlag);
        sb.append(", specialDemand=").append(specialDemand);
        sb.append(", prodIsbn=").append(prodIsbn);
        sb.append(", openType=").append(openType);
        sb.append(", versionNum=").append(versionNum);
        sb.append(", repeatNum=").append(repeatNum);
        sb.append(", prodPeriod=").append(prodPeriod);
        sb.append(", prodBatch=").append(prodBatch);
        sb.append(", estiPrintQty=").append(estiPrintQty);
        sb.append(", withinThick=").append(withinThick);
        sb.append(", bookNo=").append(bookNo);
        sb.append(", prepressDocNo=").append(prepressDocNo);
        sb.append(", qualityLevel=").append(qualityLevel);
        sb.append(", printDiffLevel=").append(printDiffLevel);
        sb.append(", bindDiffLevel=").append(bindDiffLevel);
        sb.append(", lastFactId=").append(lastFactId);
        sb.append(", pageCnt=").append(pageCnt);
        sb.append(", impressionCnt=").append(impressionCnt);
        sb.append(", signCnt=").append(signCnt);
        sb.append(", custProdNo=").append(custProdNo);
        sb.append(", bindDesc=").append(bindDesc);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", versionDesc=").append(versionDesc);
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