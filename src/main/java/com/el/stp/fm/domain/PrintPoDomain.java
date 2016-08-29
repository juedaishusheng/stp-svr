package com.el.stp.fm.domain;

import com.el.cfg.domain.TPrintPo;
import com.el.sys.domain.PagingBean;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Johnny on 2016/8/1.
 * 印刷采购单结算管理
 **/

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PrintPoDomain extends TPrintPo{
    /**
     * 结算公司名称
     */
    private String ouName;

    /**
     * 日期
     * @return
     */
    private Date poDate;
    public String getPoDateYmd() {
        return DateUtil.toYmd(getPoDate());
    }

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date poDateFrom;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date poDateTo;

    /**
     * 采购金额合计
     */
    private BigDecimal amtTotal;

    /**
     * 已开票金额合计
     */
    private BigDecimal invAmtTotal;

    /**
     * 未开票金额合计
     */
    private BigDecimal noinvAmtTotal;

    /**
     * 未付款金额合计
     */
    private BigDecimal nopayAmtTotal;

}
