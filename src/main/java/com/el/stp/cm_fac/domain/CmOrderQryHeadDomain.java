package com.el.stp.cm_fac.domain;

import com.el.sys.domain.PagingBean;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Vincent on 2016/8/12.
 * CM209子页面的数据domain Head
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CmOrderQryHeadDomain extends PagingBean{
    private String ouCode;
    private String ouName;
    private String soNo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date manuDueDate;
    private String acptUser;//接单员
    private Date acptTime;//接单时间
    private String acptStatus;//接单状态
    private String manuStatus;//接单状态
    private String finish;
    private Integer paperReadyStatus;//纸张确认
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date manuDueDateStart;//查询用 交期截止日期起
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date manuDueDateEnd;//查询用 交期截止日期止
}
