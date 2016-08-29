package com.el.stp.cm_ou.domain;

import com.el.stp.common.util.DateUtil;
import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @author billy
 * @since 16/8/12.
 * 日期检索条件
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class DateCondition extends PagingBean{

    /*公司id*/
    private Integer ouId;

    /*工厂id*/
    private Integer factId;

    /*起始日期*/
    private String dateFrom;
    public Date getDateStart() {
        return DateUtil.fromYmd(getDateFrom());
    }

    /*结束日期*/
    private String dateTo;
    public Date getDateEnd() {
        return DateUtil.fromYmd(getDateTo());
    }
}
