package com.el.stp.cm_fac.domain;

import com.el.sys.domain.PagingBean;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Created by max on 2016/8/17 0017.
 */
@EqualsAndHashCode(callSuper = true)
public class CapaCondition extends PagingBean {

    /**
     * 公司ID
     */
    private Integer ouId;

    /**
     *开始日期
     */
    private String dateFrom;
    private Date dateFromYmd;

    /**
     *结束日期
     */
    private String dateTo;
    private Date dateToYmd;

    /**
     * 印度订单-生产状态
     */
    private String manuStatus;

    public Integer getOuId() {
        return ouId;
    }

    public void setOuId(Integer ouId) {
        this.ouId = ouId;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateFromYmd() {
        return  DateUtil.fromYmd(dateFrom);
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public Date getDateToYmd() {
        return DateUtil.fromYmd(dateTo);
    }

    public String getManuStatus() { return manuStatus; }

    public void setManuStatus(String manuStatus) { this.manuStatus = manuStatus; }
}
