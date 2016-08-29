package com.el.util;

import org.apache.ibatis.jdbc.SQL;

/**
 * 业务表的审计相关SQL操作
 * <p>
 * Created on 16/7/27.
 *
 * @author panlw
 */
public final class StpSqlUtil {

    private static final String INSERT_SQL_AUDIT_COLUMNS =
        "DATA_VERSION, MODIFYER_ID, MODIFY_TS, MODIFY_MODULE, MODIFY_APPSVR";
    private static final String INSERT_SQL_AUDIT_VALUES =
        "1, #{audit.userId}, SYSTIMESTAMP, #{audit.progId}, #{audit.nodeId}";

    private static final String UPDATE_SQL_AUDIT_VALUES =
        "DATA_VERSION = DATA_VERSION + 1" +
            ", MODIFYER_ID = #{audit.userId}, MODIFY_TS = SYSTIMESTAMP" +
            ", MODIFY_MODULE = #{audit.progId}, MODIFY_APPSVR = #{audit.nodeId}";
    private static final String UPDATE_SQL_CHECK_VERSION = "DATA_VERSION = #{version}";

    /**
     * 插入审计信息
     *
     * @param sql SQL
     * @return SQL
     */
    public static SQL insertAudit(SQL sql) {
        return sql.VALUES(INSERT_SQL_AUDIT_COLUMNS, INSERT_SQL_AUDIT_VALUES);
    }

    /**
     * 更新审计信息
     *
     * @param sql SQL
     * @return SQL
     */
    public static SQL updateAudit(SQL sql) {
        return sql.SET(UPDATE_SQL_AUDIT_VALUES).WHERE(UPDATE_SQL_CHECK_VERSION);
    }

    /**
     * 更新审计信息(批量更新用, 通过业务规则进行版本控制)
     *
     * @param sql SQL
     * @return SQL
     */
    public static SQL updateAuditForBatch(SQL sql) {
        return sql.SET(UPDATE_SQL_AUDIT_VALUES);
    }

    private StpSqlUtil() {
    }
}
