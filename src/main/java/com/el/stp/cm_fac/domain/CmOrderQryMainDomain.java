package com.el.stp.cm_fac.domain;

import com.el.sys.domain.PagingBean;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Vincent on 2016/8/9.
 * CM209 订单查询主界面domain
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CmOrderQryMainDomain extends PagingBean {
    private Integer soId;
    private String ouCode;
    private String ouName;
    private String soNo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date manuDueDate;
    private String acptUser;//接单员
    private Date acptTime;//接单时间
    private String prodCode;//产品编号
    private String prodName;//产品名称
    private String prodType;//产品类型
    private String qualityLevel;//质量等级
    private String printDiffLevel;//印刷难度等级
    private String bindDiffLevel;//装订难度等级
    private String bindType;//装订方式
    private Integer distQty;//产品数量
    private String acptStatus;//接单状态
    private String manuStatus;//接单状态
    private String finish;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date manuDueDateStart;//查询用 交期截止日期起
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date manuDueDateEnd;//查询用 交期截止日期止
}
