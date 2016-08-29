package com.el.stp.fm.domain;

import com.el.sys.domain.PagingBean;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Johnny on 2016/8/12.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PrintPoCondition extends PagingBean{
    /**
     * 结算公司名称
     */
    private String ouName;

    /**
     * 日期
     * @return
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date poDateFrom;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date poDateTo;

    /**
     * 供应商名称
     */
    private String suppName;

    /**
     * 采购单编号
     */
    private String poNo;

    /**
     * 产品名称
     */
    private String prodName;

}
