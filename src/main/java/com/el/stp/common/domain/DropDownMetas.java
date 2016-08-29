package com.el.stp.common.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *预先输入框查询辅助类：元数据
 */
@ToString
public enum DropDownMetas {
    /**
     * 支持同一个查询值在多个字段匹配，只需要在column中以逗号隔开写字段名称即可
     * eg:
     * 搜索"测试",即：（CUST_NAME like '%测试%' or CUST_CODE like '%测试%'）
     */
    DEMO("T_CUST", "CUST_NAME,CUST_CODE", "客户"),

    CUST("T_CUST", "CUST_NAME", "客户"),
    PROD("T_PROD", "PROD_NAME", "产品"),
    SO("T_SO","SO_NO","销售订单")
    ;

    /**
     * 要查询的表
     */
    @Getter
    private final String table;
    /**
     * 要查询的字段
     */
    @Getter
    private final String column;
    /**
     * 描述，可为空
     */
    @Getter
    private final String desc;

    DropDownMetas(String table, String column, String desc) {
        this.table = table;
        this.column = column;
        this.desc = desc;
    }
}
