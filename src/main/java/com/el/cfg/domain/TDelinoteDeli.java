package com.el.cfg.domain;

import com.el.sys.domain.DbAudit;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TDelinoteDeli implements Serializable {
    /**
     *  null - T_DELINOTE_DELI.ID
     */
    private Long id;

    /**
     *  发货通知单细表ID - T_DELINOTE_DELI.DELINOTE_PROD_ID
     */
    private Long delinoteProdId;

    /**
     *  发货日期 - T_DELINOTE_DELI.DELI_DATE
     */
    private Date deliDate;

    /**
     *  本次发货数量 - T_DELINOTE_DELI.DELI_QTY
     */
    private Long deliQty;

    /**
     *  本次赠送数量 - T_DELINOTE_DELI.GIFT_QTY
     */
    private Long giftQty;

    /**
     *  物流公司地址号 如果物流公司有地址号 - T_DELINOTE_DELI.TRANS_COMPANY_ADDRNO
     */
    private Long transCompanyAddrno;

    /**
     *  物流公司名称 - T_DELINOTE_DELI.TRNAS_COMPANY
     */
    private String trnasCompany;

    /**
     *  运单号码 - T_DELINOTE_DELI.TRANS_NO
     */
    private String transNo;

    /**
     *  车牌号 - T_DELINOTE_DELI.CARGO_NO
     */
    private String cargoNo;

    /**
     *  司机 - T_DELINOTE_DELI.CARGO_PIC
     */
    private String cargoPic;

    /**
     *  其它人员 - T_DELINOTE_DELI.CARGO_PERSON
     */
    private String cargoPerson;

    /**
     *  物流费用1 - T_DELINOTE_DELI.FEE1
     */
    private BigDecimal fee1;

    /**
     *  物流费用2 - T_DELINOTE_DELI.FEE2
     */
    private BigDecimal fee2;

    /**
     *  物流费用3 - T_DELINOTE_DELI.FEE3
     */
    private BigDecimal fee3;

    /**
     *  备注 - T_DELINOTE_DELI.REMARK
     */
    private String remark;

    /**
     *  锁定人ID - T_DELINOTE_DELI.LOCKER_ID
     */
    private Long lockerId;

    /**
     *  锁定时间戳 - T_DELINOTE_DELI.LOCK_TS
     */
    private Date lockTs;

    /**
     *  修改人ID - T_DELINOTE_DELI.MODIFYER_ID
     */
    private Long modifyerId;

    /**
     *  修改时间戳 - T_DELINOTE_DELI.MODIFY_TS
     */
    private Date modifyTs;

    /**
     *  修改APPSERVER - T_DELINOTE_DELI.MODIFY_APPSVR
     */
    private String modifyAppsvr;

    /**
     *  修改模块 - T_DELINOTE_DELI.MODIFY_MODULE
     */
    private String modifyModule;

    /**
     *  数据版本号 - T_DELINOTE_DELI.DATA_VERSION
     */
    private Long dataVersion;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDelinoteProdId() {
        return delinoteProdId;
    }

    public void setDelinoteProdId(Long delinoteProdId) {
        this.delinoteProdId = delinoteProdId;
    }

    public Date getDeliDate() {
        return deliDate;
    }

    public void setDeliDate(Date deliDate) {
        this.deliDate = deliDate;
    }

    public Long getDeliQty() {
        return deliQty;
    }

    public void setDeliQty(Long deliQty) {
        this.deliQty = deliQty;
    }

    public Long getGiftQty() {
        return giftQty;
    }

    public void setGiftQty(Long giftQty) {
        this.giftQty = giftQty;
    }

    public Long getTransCompanyAddrno() {
        return transCompanyAddrno;
    }

    public void setTransCompanyAddrno(Long transCompanyAddrno) {
        this.transCompanyAddrno = transCompanyAddrno;
    }

    public String getTrnasCompany() {
        return trnasCompany;
    }

    public void setTrnasCompany(String trnasCompany) {
        this.trnasCompany = trnasCompany;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getCargoNo() {
        return cargoNo;
    }

    public void setCargoNo(String cargoNo) {
        this.cargoNo = cargoNo;
    }

    public String getCargoPic() {
        return cargoPic;
    }

    public void setCargoPic(String cargoPic) {
        this.cargoPic = cargoPic;
    }

    public String getCargoPerson() {
        return cargoPerson;
    }

    public void setCargoPerson(String cargoPerson) {
        this.cargoPerson = cargoPerson;
    }

    public BigDecimal getFee1() {
        return fee1;
    }

    public void setFee1(BigDecimal fee1) {
        this.fee1 = fee1;
    }

    public BigDecimal getFee2() {
        return fee2;
    }

    public void setFee2(BigDecimal fee2) {
        this.fee2 = fee2;
    }

    public BigDecimal getFee3() {
        return fee3;
    }

    public void setFee3(BigDecimal fee3) {
        this.fee3 = fee3;
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
        sb.append(", delinoteProdId=").append(delinoteProdId);
        sb.append(", deliDate=").append(deliDate);
        sb.append(", deliQty=").append(deliQty);
        sb.append(", giftQty=").append(giftQty);
        sb.append(", transCompanyAddrno=").append(transCompanyAddrno);
        sb.append(", trnasCompany=").append(trnasCompany);
        sb.append(", transNo=").append(transNo);
        sb.append(", cargoNo=").append(cargoNo);
        sb.append(", cargoPic=").append(cargoPic);
        sb.append(", cargoPerson=").append(cargoPerson);
        sb.append(", fee1=").append(fee1);
        sb.append(", fee2=").append(fee2);
        sb.append(", fee3=").append(fee3);
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