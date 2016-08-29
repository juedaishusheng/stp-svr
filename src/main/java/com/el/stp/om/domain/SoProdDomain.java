package com.el.stp.om.domain;

import com.el.cfg.domain.*;
import com.el.stp.common.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 销售单自定义domain
 * Created by xueyu on 2016/8/24.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SoProdDomain extends TSoProd {
    private TSo so;
    private TAddressBook agent;
    private TMcu mcu;
    private TCust cust;
    private TProd prod;
    private TUdc cat1;
    private TUdc cat2;
    public String getSoDateYmd(){
        return DateUtil.toYmd(so.getSoDate());
    }
    public String getDueDateYmd(){
        return DateUtil.toYmd(so.getDueDate());
    }
}
