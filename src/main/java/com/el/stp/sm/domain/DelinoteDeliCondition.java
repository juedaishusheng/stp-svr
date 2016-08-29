package com.el.stp.sm.domain;

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
public class DelinoteDeliCondition extends PagingBean{
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date demandDeliDateFrom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date demandDeliDateTo;
    /**
     * 司机
     */
    private String cargoPic;
    /**
     * 车牌号
     */
    private String cargoNo;
    /**
     * 物流公司
     */
    private String transCompanyAddrno;

    /**
     *客户名称
     */
    private String custName;

    /**
     *产品名称
     */
    private String prodName;

    /**
     * 印刷订单号
     */
    private String soNo;

    @Override
    public String toString(){
        return "DelinoteDeliCondition{"+
            "cargoPic='" + cargoPic + '\'' +
            ", cargoNo='" + cargoNo + '\'' +
            ", transCompanyAddrno='" + transCompanyAddrno + '\'' +
            ", demandDeliDateFrom='" + demandDeliDateFrom + '\'' +
            ", demandDeliDateTo='" + demandDeliDateTo + '\'' +
            ", soNo='" + soNo + '\'' +
            ", custName='" + custName + '\'' +
            ", prodName='" + prodName + '\'' +
            '}';
    }
}
