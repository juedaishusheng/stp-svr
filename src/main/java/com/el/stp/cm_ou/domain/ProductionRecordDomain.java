package com.el.stp.cm_ou.domain;

import com.el.util.DateUtil;
import lombok.Data;

import java.util.Date;

/**
 * Created by Spring on 2016/8/8.
 */
@Data
public class ProductionRecordDomain {
    /**
     * 时间
     */
    private Date  itemDt;
    public String getItemDtYmd() {
        return DateUtil.toYmd(getItemDt());
    }
    /**
     * 记录人员
     */
    private String  contName;
    /**
     * 描述
     */
    private String  itemDesc;
    /**
     * 造成的影响
     */
    private String itemImpact;

    /**
     * 解决方案
     */
    private String itemSolution;

}
