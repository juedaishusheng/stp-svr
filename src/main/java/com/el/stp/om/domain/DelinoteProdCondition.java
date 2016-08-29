package com.el.stp.om.domain;

import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by xuzhe on 2016/8/12.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DelinoteProdCondition extends PagingBean {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date demandDeliDateFrom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date demandDeliDateTo;
    /**
     * 客户名称
     */
    private String custName;

    /**
     * 产品名称
     */
    private String prodName;

    /**
     * 印刷订单号
     */
    private String soNo;
    private String lineStatus;

    @Override
    public String toString() {
        return "DelinoteDeliCondition{" +
            "demandDeliDateFrom='" + demandDeliDateFrom + '\'' +
            ", demandDeliDateTo='" + demandDeliDateTo + '\'' +
            ", soNo='" + soNo + '\'' +
            ", custName='" + custName + '\'' +
            ", prodName='" + prodName + '\'' +
            ", lineStatus='" + lineStatus + '\'' +
            '}';
    }
}
