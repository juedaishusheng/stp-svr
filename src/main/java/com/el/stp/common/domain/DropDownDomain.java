package com.el.stp.common.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 预先输入框查询结果封装
 * Created by xueyu on 2016/8/16.
 */
@Data
public class DropDownDomain {
    /**
     * 查询结果code
     */
    private String code;
    /**
     * 查询结果name
     */
    private String name;
    /**
     * 用户输入值
     */
    private String key;

    private Integer ouId;
}
