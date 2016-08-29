package com.el.stp.sm.domain;

import com.el.cfg.domain.TCust;
import com.el.cfg.domain.TSo;
import com.el.cfg.domain.TWh;
import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 纸张调拨单查询条件
 * Created by xueyu on 2016/8/12.
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper = true)
public class SmPapertransCondition extends PagingBean {

    private TSo so;
    private TCust cust;
    private TWh outWh;
    private TWh inWh;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date docDateFrom;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date docDateTo;
}
