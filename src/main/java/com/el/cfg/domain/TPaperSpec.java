package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.util.Date;

public class TPaperSpec implements Serializable {
    /**
     *  null - T_PAPER_SPEC.ID
     */
    private Long id;

    /**
     *  公司ID - T_PAPER_SPEC.OU_ID
     */
    private Long ouId;

    /**
     *  编号 - T_PAPER_SPEC.SPEC_CODE
     */
    private String specCode;

    /**
     *  高 - T_PAPER_SPEC.PAPER_HEIGHT
     */
    private Short paperHeight;

    /**
     *  宽 - T_PAPER_SPEC.PAPER_WIDTH
     */
    private Short paperWidth;

    /**
     *  纹理方向 - T_PAPER_SPEC.GRAIN_ORIENT
     */
    private String grainOrient;

    /**
     *  开本 - T_PAPER_SPEC.PAPER_FORMAT
     */
    private String paperFormat;

    /**
     *  印刷类型 - T_PAPER_SPEC.PRINT_TYPE
     */
    private String printType;

    /**
     *  令张数 - T_PAPER_SPEC.CNT_PER_REAM
     */
    private Long cntPerReam;

    /**
     *  最大厚度 - T_PAPER_SPEC.MAX_THICK
     */
    private String maxThick;

    /**
     *  最小厚度 - T_PAPER_SPEC.MIN_THICK
     */
    private String minThick;

    /**
     *  印刷色数 - T_PAPER_SPEC.COLOR_TYPES
     */
    private String colorTypes;

    /**
     *  锁定人ID - T_PAPER_SPEC.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_PAPER_SPEC.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_PAPER_SPEC.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_PAPER_SPEC.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_PAPER_SPEC.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_PAPER_SPEC.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_PAPER_SPEC.DATA_VERSION
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

    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
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

    public String getGrainOrient() {
        return grainOrient;
    }

    public void setGrainOrient(String grainOrient) {
        this.grainOrient = grainOrient;
    }

    public String getPaperFormat() {
        return paperFormat;
    }

    public void setPaperFormat(String paperFormat) {
        this.paperFormat = paperFormat;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public Long getCntPerReam() {
        return cntPerReam;
    }

    public void setCntPerReam(Long cntPerReam) {
        this.cntPerReam = cntPerReam;
    }

    public String getMaxThick() {
        return maxThick;
    }

    public void setMaxThick(String maxThick) {
        this.maxThick = maxThick;
    }

    public String getMinThick() {
        return minThick;
    }

    public void setMinThick(String minThick) {
        this.minThick = minThick;
    }

    public String getColorTypes() {
        return colorTypes;
    }

    public void setColorTypes(String colorTypes) {
        this.colorTypes = colorTypes;
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
        sb.append(", specCode=").append(specCode);
        sb.append(", paperHeight=").append(paperHeight);
        sb.append(", paperWidth=").append(paperWidth);
        sb.append(", grainOrient=").append(grainOrient);
        sb.append(", paperFormat=").append(paperFormat);
        sb.append(", printType=").append(printType);
        sb.append(", cntPerReam=").append(cntPerReam);
        sb.append(", maxThick=").append(maxThick);
        sb.append(", minThick=").append(minThick);
        sb.append(", colorTypes=").append(colorTypes);
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