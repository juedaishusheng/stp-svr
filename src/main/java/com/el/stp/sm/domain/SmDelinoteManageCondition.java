package com.el.stp.sm.domain;

import com.el.cfg.domain.TCust;
import com.el.cfg.domain.TProd;
import com.el.cfg.domain.TSo;
import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 发货通知单处理查询条件
 * Created by xueyu on 2016/8/12.
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper = true)
public class SmDelinoteManageCondition extends PagingBean {

    private TSo so;
    private TCust cust;
    private TProd prod;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date demandDeliDateFrom;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date demandDeliDateTo;
    private String lineStatus;
}
