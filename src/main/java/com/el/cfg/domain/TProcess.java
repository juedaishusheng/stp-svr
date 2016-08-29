package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TProcess implements Serializable {
    /**
     *  null - T_PROCESS.ID
     */
    private Long id;

    /**
     *  公司ID 对应T_OU.ID - T_PROCESS.OU_ID
     */
    private Long ouId;

    /**
     *  工序编号 - T_PROCESS.PROCESS_CODE
     */
    private String processCode;

    /**
     *  工序名称 - T_PROCESS.PROCESS_NAME
     */
    private String processName;

    /**
     *  分类码1 工艺段大类 - T_PROCESS.CAT1
     */
    private String cat1;

    /**
     *  分类码2 工艺段小类 - T_PROCESS.CAT2
     */
    private String cat2;

    /**
     *  分类码3 分单类（工序类型） - T_PROCESS.CAT3
     */
    private String cat3;

    /**
     *  分类码4 - T_PROCESS.CAT4
     */
    private String cat4;

    /**
     *  分类码5 - T_PROCESS.CAT5
     */
    private String cat5;

    /**
     *  层级 - T_PROCESS.PROCESS_LEVEL
     */
    private String processLevel;

    /**
     *  计价单位 - T_PROCESS.PRICE_UOM
     */
    private String priceUom;

    /**
     *  报工单位 - T_PROCESS.RPT_UOM
     */
    private String rptUom;

    /**
     *  是否有难度系数 - T_PROCESS.DIFFICULTY_FLAG
     */
    private Short difficultyFlag;

    /**
     *  报价参数1 - T_PROCESS.PRICE_PARA1
     */
    private String pricePara1;

    /**
     *  报价参数2 - T_PROCESS.PRICE_PARA2
     */
    private String pricePara2;

    /**
     *  报价参数3 - T_PROCESS.PRICE_PARA3
     */
    private String pricePara3;

    /**
     *  报价参数4 - T_PROCESS.PRICE_PARA4
     */
    private String pricePara4;

    /**
     *  报价参数5 - T_PROCESS.PRICE_PARA5
     */
    private String pricePara5;

    /**
     *  锁定人ID - T_PROCESS.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PROCESS.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PROCESS.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PROCESS.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PROCESS.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PROCESS.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PROCESS.DATA_VERSION
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

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
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

    public String getProcessLevel() {
        return processLevel;
    }

    public void setProcessLevel(String processLevel) {
        this.processLevel = processLevel;
    }

    public String getPriceUom() {
        return priceUom;
    }

    public void setPriceUom(String priceUom) {
        this.priceUom = priceUom;
    }

    public String getRptUom() {
        return rptUom;
    }

    public void setRptUom(String rptUom) {
        this.rptUom = rptUom;
    }

    public Short getDifficultyFlag() {
        return difficultyFlag;
    }

    public void setDifficultyFlag(Short difficultyFlag) {
        this.difficultyFlag = difficultyFlag;
    }

    public String getPricePara1() {
        return pricePara1;
    }

    public void setPricePara1(String pricePara1) {
        this.pricePara1 = pricePara1;
    }

    public String getPricePara2() {
        return pricePara2;
    }

    public void setPricePara2(String pricePara2) {
        this.pricePara2 = pricePara2;
    }

    public String getPricePara3() {
        return pricePara3;
    }

    public void setPricePara3(String pricePara3) {
        this.pricePara3 = pricePara3;
    }

    public String getPricePara4() {
        return pricePara4;
    }

    public void setPricePara4(String pricePara4) {
        this.pricePara4 = pricePara4;
    }

    public String getPricePara5() {
        return pricePara5;
    }

    public void setPricePara5(String pricePara5) {
        this.pricePara5 = pricePara5;
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
        sb.append(", processCode=").append(processCode);
        sb.append(", processName=").append(processName);
        sb.append(", cat1=").append(cat1);
        sb.append(", cat2=").append(cat2);
        sb.append(", cat3=").append(cat3);
        sb.append(", cat4=").append(cat4);
        sb.append(", cat5=").append(cat5);
        sb.append(", processLevel=").append(processLevel);
        sb.append(", priceUom=").append(priceUom);
        sb.append(", rptUom=").append(rptUom);
        sb.append(", difficultyFlag=").append(difficultyFlag);
        sb.append(", pricePara1=").append(pricePara1);
        sb.append(", pricePara2=").append(pricePara2);
        sb.append(", pricePara3=").append(pricePara3);
        sb.append(", pricePara4=").append(pricePara4);
        sb.append(", pricePara5=").append(pricePara5);
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