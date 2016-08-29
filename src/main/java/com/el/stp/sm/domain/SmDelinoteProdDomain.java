package com.el.stp.sm.domain;

import com.el.cfg.domain.TDelinoteProd;
import com.el.sys.domain.PagingBean;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by xuzhe on 2016/8/3.
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class SmDelinoteProdDomain extends PagingBean {
    private TDelinoteProd delinote;
    private String docNo;
    private String soNo;
    private String ouName;
    private String custCode;
    private String custName;
    private String prodName;
    private String prodCode;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date demandDeliDate;
    public  String getDemandDeliDateYmd() {
        return DateUtil.toYmd(getDemandDeliDate());
    }
    @Override
    public String toString() {
        return "SmDelinoteProdDomain{" +
            "demandDeliDate='" + demandDeliDate + '\'' +
            '}';
    }
}
