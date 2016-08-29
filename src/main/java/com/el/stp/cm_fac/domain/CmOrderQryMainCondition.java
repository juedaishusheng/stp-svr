package com.el.stp.cm_fac.domain;

import com.el.sys.domain.PagingBean;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Vincent on 2016/8/15.
 * cm209主页面的查询条件
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CmOrderQryMainCondition extends PagingBean {
    private Integer soId;
    private String ouCode;
    private String ouName;
    private String soNo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date manuDueDate;
    private String prodCode;//产品编号
    private String prodName;//产品名称
    private String manuStatus;//接单状态
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date manuDueDateStart;//查询用 交期截止日期起
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date manuDueDateEnd;//查询用 交期截止日期止

    @Override
    public String toString() {
        return "CmOrderQryMainCondition{" +
            "soId=" + soId +
            ", ouCode='" + ouCode + '\'' +
            ", ouName='" + ouName + '\'' +
            ", soNo='" + soNo + '\'' +
            ", manuDueDate=" + manuDueDate +
            ", prodCode='" + prodCode + '\'' +
            ", prodName='" + prodName + '\'' +
            ", manuStatus='" + manuStatus + '\'' +
            ", manuDueDateStart=" + manuDueDateStart +
            ", manuDueDateEnd=" + manuDueDateEnd +
            '}';
    }
}
