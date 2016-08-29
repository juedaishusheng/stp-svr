package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TConttel implements Serializable {
    /**
     *  null - T_CONTTEL.ID
     */
    private Long id;

    /**
     *  对应T_OU.ID - T_CONTTEL.OU_ID
     */
    private Long ouId;

    /**
     *  地址号 工厂编号/公司地址号/客户地址号/？ - T_CONTTEL.ADDR_NO
     */
    private Long addrNo;

    /**
     *  联系人行号 - T_CONTTEL.LINE_NO
     */
    private BigDecimal lineNo;

    /**
     *  联系人类型 - T_CONTTEL.CONT_TYPE
     */
    private String contType;

    /**
     *  姓名 - T_CONTTEL.CONT_NAME
     */
    private String contName;

    /**
     *  简称 - T_CONTTEL.CONT_ABBR
     */
    private String contAbbr;

    /**
     *  称呼 - T_CONTTEL.CONT_TITLE
     */
    private String contTitle;

    /**
     *  电话1 工厂总机/公司总机/联系人电话/？ - T_CONTTEL.TEL1
     */
    private String tel1;

    /**
     *  电话2 联系人电话2/？/？ - T_CONTTEL.TEL2
     */
    private String tel2;

    /**
     *  手机1 联系人手机1/？/？ - T_CONTTEL.MOBILE1
     */
    private String mobile1;

    /**
     *  手机2 联系人手机2/？/？ - T_CONTTEL.MOBILE2
     */
    private String mobile2;

    /**
     *  传真 - T_CONTTEL.FAX
     */
    private String fax;

    /**
     *  邮箱1 - T_CONTTEL.EMAIL1
     */
    private String email1;

    /**
     *  邮箱2 - T_CONTTEL.EMAIL2
     */
    private String email2;

    /**
     *  锁定人ID - T_CONTTEL.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_CONTTEL.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_CONTTEL.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_CONTTEL.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_CONTTEL.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_CONTTEL.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_CONTTEL.DATA_VERSION
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

    public BigDecimal getLineNo() {
        return lineNo;
    }

    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    public String getContType() {
        return contType;
    }

    public void setContType(String contType) {
        this.contType = contType;
    }

    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName;
    }

    public String getContAbbr() {
        return contAbbr;
    }

    public void setContAbbr(String contAbbr) {
        this.contAbbr = contAbbr;
    }

    public String getContTitle() {
        return contTitle;
    }

    public void setContTitle(String contTitle) {
        this.contTitle = contTitle;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
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
        sb.append(", lineNo=").append(lineNo);
        sb.append(", contType=").append(contType);
        sb.append(", contName=").append(contName);
        sb.append(", contAbbr=").append(contAbbr);
        sb.append(", contTitle=").append(contTitle);
        sb.append(", tel1=").append(tel1);
        sb.append(", tel2=").append(tel2);
        sb.append(", mobile1=").append(mobile1);
        sb.append(", mobile2=").append(mobile2);
        sb.append(", fax=").append(fax);
        sb.append(", email1=").append(email1);
        sb.append(", email2=").append(email2);
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