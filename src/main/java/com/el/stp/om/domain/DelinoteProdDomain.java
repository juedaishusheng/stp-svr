package com.el.stp.om.domain;

import com.el.cfg.domain.TDelinoteProd;
import com.el.sys.domain.PagingBean;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by xuzhe on 2016/7/28.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DelinoteProdDomain extends TDelinoteProd {
    private String docNo;
    private String soNo;
    private String ouName;
    private String custCode;
    private String custName;
    private String prodName;
    private String prodCode;
    private Date demandDeliDate;
    public String getDemandDeliDateYmd() {
        return DateUtil.toYmd(getDemandDeliDate());
    }

}

