package com.el.stp.cm_fac.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Vincent on 2016/8/8.
 * CM029 子页面生产记录
 */
@Data
public class CmOrderQrySnoteItemDomain {
    private Integer ouId;
    private Integer factId;
    private Integer soId;
    private Integer prodId;

    private Integer partId;
    private Date itemDt;
    private Integer soManuId;
    private String itemDesc;
    private String itemImpact;
    private String itemSolution;
    private String contName;

}
