package com.el.util;

import java.util.Map;

/**
 * Created on 16/4/19.
 *
 * @author panlw
 */
public interface SqlDialect {

    /**
     * 对查询的SQL进行分页包装.
     * @param selectSql 查询的SQL文
     * @param paging 分页信息
     * @return 分页用SQL文
     */
    String paging(String selectSql, Paging paging);

    /**
     * 构建模糊查询条件.
     * @param columnName 字段名
     * @param propertyName 数据模型属性名
     * @return 模糊查询条件
     */
    String like(String columnName, String propertyName);

    /**
     * 取得SQL文中特殊字符的转义映射
     */
    Map<Character,String> escapeMappng();
}
