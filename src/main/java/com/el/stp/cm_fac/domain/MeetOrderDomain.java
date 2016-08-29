package com.el.stp.cm_fac.domain;

import com.el.sys.domain.PagingBean;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

import static com.el.stp.common.util.DateUtil.toYmd;

/**
 * @author spring
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MeetOrderDomain extends PagingBean {

    /**
     *T_SO_FACTGROUP主键id
     */
    private  Integer id;
    /**
     * 公司名称
     */
    private String ouName;

    /**
     * 订单编号
     */
    private String soNo;

    /**
     * 生产交期
     */
    private Date manuDueDate;
    public String getManuDueDateYmd() {
        return DateUtil.toYmd(getManuDueDate());
    }

    /**
     * 工厂总价&变更后总价
     */
    private Double factAmt;

    /**
     * 产品编号
     */
    private String prodCode;

    /**
     * 产品名称
     */
    private String prodName;

    /**
     * 产品类型
     */
    private String prodType;

    /**
     * 质量等级
     */
    private String qualityLevel;

    /**
     * 印刷难度等级
     */
    private String printDiffLevel;

    /**
     * 装订难度等级
     */
    private String bindDiffLevel;

    /**
     * 装订方式
     */
    private String bindType;

    /**
     * 产品数量
     */
    private Integer manuQty;

    /**
     * 下发时间
     */
    private Date seizeStartTime;
    private String getSeizeStartTimeYmd(){
        return DateUtil.toYmd(getManuDueDate());
    }

    /**
     * 产品ID
     */
    private String prodId;
}
