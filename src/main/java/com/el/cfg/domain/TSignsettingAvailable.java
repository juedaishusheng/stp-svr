package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TSignsettingAvailable implements Serializable {
    /**
     *  null - T_SIGNSETTING_AVAILABLE.ID
     */
    private Long id;

    /**
     *  名称 - T_SIGNSETTING_AVAILABLE.SET_NAME
     */
    private String setName;

    /**
     *  页数 - T_SIGNSETTING_AVAILABLE.PAGE_CNT
     */
    private Short pageCnt;

    /**
     *  装订方式列表 - T_SIGNSETTING_AVAILABLE.BIND_METHODS
     */
    private String bindMethods;

    /**
     *  最高纸张厚度 - T_SIGNSETTING_AVAILABLE.MAX_PAPER_THICK
     */
    private Short maxPaperThick;

    /**
     *  横向摆放 - T_SIGNSETTING_AVAILABLE.HORI_DESC
     */
    private String horiDesc;

    /**
     *  竖向摆放 - T_SIGNSETTING_AVAILABLE.VERT_DESC
     */
    private String vertDesc;

    /**
     *  印刷方式列表 - T_SIGNSETTING_AVAILABLE.PRINT_METHOD
     */
    private String printMethod;

    /**
     *  版数 - T_SIGNSETTING_AVAILABLE.PLATE_CNT
     */
    private Short plateCnt;

    /**
     *  印刷类型列表 - T_SIGNSETTING_AVAILABLE.PRINT_TYPE
     */
    private String printType;

    /**
     *  横向出血位 - T_SIGNSETTING_AVAILABLE.HORI_BLEED_DESC
     */
    private String horiBleedDesc;

    /**
     *  竖向出血位 - T_SIGNSETTING_AVAILABLE.VERT_BLEED_DESC
     */
    private String vertBleedDesc;

    /**
     *  出贴率 - T_SIGNSETTING_AVAILABLE.SIGN_RATE
     */
    private Short signRate;

    /**
     *  是否掏页 - T_SIGNSETTING_AVAILABLE.SPLIT_FLAG
     */
    private Short splitFlag;

    /**
     *  掏页率 - T_SIGNSETTING_AVAILABLE.SPLIT_RATE
     */
    private Short splitRate;

    /**
     *  备注 - T_SIGNSETTING_AVAILABLE.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_SIGNSETTING_AVAILABLE.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_SIGNSETTING_AVAILABLE.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_SIGNSETTING_AVAILABLE.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_SIGNSETTING_AVAILABLE.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_SIGNSETTING_AVAILABLE.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_SIGNSETTING_AVAILABLE.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_SIGNSETTING_AVAILABLE.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public Short getPageCnt() {
        return pageCnt;
    }

    public void setPageCnt(Short pageCnt) {
        this.pageCnt = pageCnt;
    }

    public String getBindMethods() {
        return bindMethods;
    }

    public void setBindMethods(String bindMethods) {
        this.bindMethods = bindMethods;
    }

    public Short getMaxPaperThick() {
        return maxPaperThick;
    }

    public void setMaxPaperThick(Short maxPaperThick) {
        this.maxPaperThick = maxPaperThick;
    }

    public String getHoriDesc() {
        return horiDesc;
    }

    public void setHoriDesc(String horiDesc) {
        this.horiDesc = horiDesc;
    }

    public String getVertDesc() {
        return vertDesc;
    }

    public void setVertDesc(String vertDesc) {
        this.vertDesc = vertDesc;
    }

    public String getPrintMethod() {
        return printMethod;
    }

    public void setPrintMethod(String printMethod) {
        this.printMethod = printMethod;
    }

    public Short getPlateCnt() {
        return plateCnt;
    }

    public void setPlateCnt(Short plateCnt) {
        this.plateCnt = plateCnt;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getHoriBleedDesc() {
        return horiBleedDesc;
    }

    public void setHoriBleedDesc(String horiBleedDesc) {
        this.horiBleedDesc = horiBleedDesc;
    }

    public String getVertBleedDesc() {
        return vertBleedDesc;
    }

    public void setVertBleedDesc(String vertBleedDesc) {
        this.vertBleedDesc = vertBleedDesc;
    }

    public Short getSignRate() {
        return signRate;
    }

    public void setSignRate(Short signRate) {
        this.signRate = signRate;
    }

    public Short getSplitFlag() {
        return splitFlag;
    }

    public void setSplitFlag(Short splitFlag) {
        this.splitFlag = splitFlag;
    }

    public Short getSplitRate() {
        return splitRate;
    }

    public void setSplitRate(Short splitRate) {
        this.splitRate = splitRate;
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
        sb.append(", setName=").append(setName);
        sb.append(", pageCnt=").append(pageCnt);
        sb.append(", bindMethods=").append(bindMethods);
        sb.append(", maxPaperThick=").append(maxPaperThick);
        sb.append(", horiDesc=").append(horiDesc);
        sb.append(", vertDesc=").append(vertDesc);
        sb.append(", printMethod=").append(printMethod);
        sb.append(", plateCnt=").append(plateCnt);
        sb.append(", printType=").append(printType);
        sb.append(", horiBleedDesc=").append(horiBleedDesc);
        sb.append(", vertBleedDesc=").append(vertBleedDesc);
        sb.append(", signRate=").append(signRate);
        sb.append(", splitFlag=").append(splitFlag);
        sb.append(", splitRate=").append(splitRate);
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