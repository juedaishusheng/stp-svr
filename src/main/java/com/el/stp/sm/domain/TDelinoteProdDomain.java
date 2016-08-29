package com.el.stp.sm.domain;

import com.el.cfg.domain.*;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 自定义发货通知单细表，继承系统自动生成的发货通知单细表
 * Created by xueyu on 2016/8/3.
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper = true)
public class TDelinoteProdDomain extends TDelinoteProd {
    private TDelinoteDomain note;
    private TOu ou;
    private TSo so;
    private TCust cust;
    private TProd prod;
    public  String getDemandDeliDateYmd() {
        return DateUtil.toYmd(getDemandDeliDate());
    }
}
