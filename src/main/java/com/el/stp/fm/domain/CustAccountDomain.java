package com.el.stp.fm.domain;

import com.el.cfg.domain.TCustSettle;
import com.el.cfg.domain.TSoProd;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * Created by max on 2016/8/2.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CustAccountDomain extends TCustSettle {

    /**
     * 公司编码
     */
    private String ouCode;

    /**
     * 公司名称
     */
    private String ouName;

    /**
     * 客户编码
     */
    private String custCode;

    /**
     * 客户名称
     */
    private String custName;

    /**
     * 订单编号
     */
    private String soNo;
    /**
     * 产品编号
     */
    private String prodCode;

    /**
     * 产品名称
     */
    private String prodName;

    /**
     * 结算日期
     * @return
     */

    public String getsettleDateYmd() {
        return DateUtil.toYmd(getSettleDate());
    }
    /**
     * 立账日期
     * @return
     */
    public String getaccountDateYmd() {
        return DateUtil.toYmd(getAccountDate());
    }

}
