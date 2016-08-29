package com.el.stp.cm_fac.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Vincent on 2016/8/8.
 * CM209子页面的完工入库
 */
@Data
public class CmOrderQryProdInDomain {
    private Integer prodInId;
    private String prodCode;//产品编码
    private String prodName;//产品名称
    private Integer prodId;//产品ID
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date docDate;//入库日期
    private Integer soProdId;
    private Integer whinQty;//入库数量
    /*
    入库需求总数
    累计已入库数
    未入库数量
     */

    private String remark;//备注
    private String contName;//联系人


}
