package com.el.stp.sm.domain;

import com.el.cfg.domain.*;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 自定义发货通知单发货，继承系统自动生成的发货通知单发货
 * Created by xueyu on 2016/8/3.
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper = true)
public class TDelinoteDeliDomain extends TDelinoteDeli {
    private TDelinoteDomain note;
    private TDelinoteProdDomain dNote;
    private TDelinoteDeliDomain deli;
    private TOu ou;
    private TSo so;
    private TCust cust;
    private TProd prod;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date deliDate;
    public String getDeliDateYmd() {
        return DateUtil.toYmd(getDeliDate());
    }
}
