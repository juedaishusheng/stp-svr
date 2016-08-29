package com.el.stp.cm_ou.domain;

import com.el.util.DateUtil;
import lombok.Data;

import java.util.Date;

/**
 * Created by Spring on 2016/8/8.
 */
@Data
public class CompletionDomain {

    /**
     * 产品编号
     */
    private String  prodCode;
    /**
     * 产品名称
     */
    private String  prodName;
    /**
     * 入库人员
     */
    private String  contName;
    /**
     * 入库时间
     */
    private Date docDate;
    public String getDocDateYmd() {
        return DateUtil.toYmd(getDocDate());
    }

    /**
     * 需求总数
     */
    private Integer manuQty;

    /**
     * 累计已入库数量
     */
    private Integer addInQty;
    /**
     * 本次入库数量
     */
    private Integer inQty;
    /**
     * 未入库数量
     */
    private Integer unInQty;
    /**
     * 备注
     */
    private String remark;
}
