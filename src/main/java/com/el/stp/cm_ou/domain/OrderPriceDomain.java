package com.el.stp.cm_ou.domain;

import com.el.sys.domain.PagingBean;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Created by Spring on 2016/8/2.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderPriceDomain extends PagingBean{

    /**
     * T_MANUDIST_FACT主键id
     */
    private String tid;
    /**
     * 工厂编号
     */
    private String addrNo;

    /**
     * 工厂名称
     */
    private String addrName;

    /**
     * 上月交付准时率
     */
    private Double ontimeRate;
    /**
     * 质量等级
     */
    private String qualifyLevel;

    /**
     * 印刷难度等级
     */
    private String printDiffLevel;

    /**
     * 装订难度等级
     */
    private String bindDiffLevel;

    /**
     * 产品编号
     */
    private String  prodCode;
    /**
     * 产品名称
     */
    private String  prodName;
    /**
     * 产品总数
     */
    private Integer manuQty;

    /**
     * 分单数量
     */
    private Integer distQty;

    /**
     * 产品总价
     */
    private Integer calcAmt;

    /**
     * 分单总价
     */
    private Integer distAmt;

    /**
     * 变更后分单价格
     */
    private Integer arguedAmt;

    /**
     * 变更原因
     */
    private String  argueDesc;

    /**
     * 外发成本价
     */
    private Integer  costAmt;

    /**
     * 调度员
     */
    private String  lockerId;

    /**
     * 分单时间
     */
    private Date lockTs;
    public String getLockTsYmd() {
        return DateUtil.toYmd(getLockTs());
    }

}
