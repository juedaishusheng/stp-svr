package com.el.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 16/4/19.
 *
 * @author panlw
 */
public class SqlDialectMySQL implements SqlDialect {

    @Override
    public String paging(String selectSql, Paging paging) {
        return selectSql + " LIMIT " + paging.getRowIndex() + "," + paging.getPageSize();
    }

    @Override
    public String like(String columnName, String propertyName) {
        return "lower(" + columnName + ") like lower(concat('%', #{" + propertyName + "}, '%'))";
    }

    /**
     * MySQL 转义字符集
     */
    private static final HashMap<Character, String> SQL_ESC = new HashMap<>();

    static {
        SQL_ESC.put('\'', "''");
        SQL_ESC.put('%', "\\%");
        SQL_ESC.put('_', "\\_");
    }

    @Override
    public Map<Character, String> escapeMappng() {
        return SQL_ESC;
    }
}
