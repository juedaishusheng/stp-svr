package com.el.stp.fc.domian;

import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by xuzhe on 2016/8/12.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
public class ProdInCondition extends PagingBean {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date docDateFrom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date docDateTo;
    /**
     * 印刷订单号
     */
    private String soNo;
    /**
     * 产品名称
     */
    private String prodName;

    private String prodCode;
    private String addrName;

}
