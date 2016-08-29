package com.el.util;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 16/4/19.
 *
 * @author panlw
 */
public class SqlDialectOracle implements SqlDialect {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public String paging(String selectSql, Paging paging) {
        log.info("[sms] paging rowIndex=" + paging.getRowIndex());
        int idx = paging.getRowIndex(),
            from = idx + 1, to = idx + paging.getPageSize();
        return "SELECT * FROM (SELECT ROWNUM rn_, all_.* FROM (" +
            selectSql + ") all_) WHERE rn_ BETWEEN " + from + " AND " + to;
    }

    @Override
    public String like(String columnName, String propertyName) {
        return "lower(" + columnName + ") like lower('%' || #{" + propertyName + "} || '%')";
    }

    /**
     * Oracle 转义字符集
     */
    private static final HashMap<Character, String> SQL_ESC = new HashMap<>();

    static {
        SQL_ESC.put('\'', "''");
        SQL_ESC.put('%', "\\%");
        SQL_ESC.put('_', "\\_");
        SQL_ESC.put('&', "\\&");
    }

    @Override
    public Map<Character, String> escapeMappng() {
        return SQL_ESC;
    }
}
