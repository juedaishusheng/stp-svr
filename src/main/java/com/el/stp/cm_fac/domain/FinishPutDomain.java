package com.el.stp.cm_fac.domain;

import com.el.util.DateUtil;
import lombok.Data;

import java.util.Date;

/**
 * Created by Spring on 2016/8/19.
 */
@Data
public class FinishPutDomain {

    //T_SO_MANU.SO_ID
    private  Integer soId;

    //产品编号
    private String prodCode;

    //产品名称
    private String prodName;

    //入库人员
    private String whinPic;

    //入库时间
    private Date docDate;
    private String getDocDateYmd(){
        return DateUtil.toYmd(getDocDate());
    }

    //需求总数
    private Integer distQty;

    //累计已入库数量
    private Integer sumDistQty;

    //本次入库数量
    private Integer whinQty;

    //未入库数量
    private Integer unWhinQty;

    //备注
    private String remark;

}
