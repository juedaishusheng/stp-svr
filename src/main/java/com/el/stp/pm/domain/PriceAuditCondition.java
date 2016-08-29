package com.el.stp.pm.domain;

import com.el.sys.domain.PagingBean;
import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Title:待价格审核
 * Description:
 *
 * @Company: Elitesland
 * @project: stp-svr
 * @author: james.zhang
 * @version: 1.0.0
 * @time: 2016/8/24
 */
@Data
public class PriceAuditCondition extends PagingBean {
    private String custName;
    private String prodName;
    private String quoteNo;
}
