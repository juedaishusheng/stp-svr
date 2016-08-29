package com.el.stp.om.domain;

import com.el.cfg.domain.*;
import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 销售单自定义condition
 * Created by xueyu on 2016/8/24.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SoProdCondition extends PagingBean {
    private TSo so;
    private TAddressBook agent;
    private TMcu mcu;
    private TCust cust;
    private TProd prod;
    private TUdc cat1;
    private TUdc cat2;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date om001DateFrom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Om001DateTo;
}
