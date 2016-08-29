package com.el.stp.cm_fac.domain;

import com.el.util.DateUtil;
import lombok.Data;

import java.util.Date;

/**
 * Created by Spring on 2016/8/22.
 */
@Data
public class RecordReportDomain {

    //记录时间
    private Date itemDt;
    private String getItemDtYmd(){
        return DateUtil.toYmd(getItemDt());
    }

    //记录人员
    private String rpterName;

    //描述
    private String itemDesc;

    //造成的影响
    private String itemImpact;

    //解决方案
    private String itemSolution;

}
