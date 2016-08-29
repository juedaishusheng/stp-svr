package com.el.util;

import org.apache.ibatis.jdbc.SQL;

/**
 * 系统表的审计相关SQL操作
 * <p>
 * Created on 16/5/21.
 *
 * @author panlw
 */
public final class SysSqlUtil {

    private static final String INSERT_SQL_AUDIT_COLUMNS =
        "audit_version, audit_user_id, audit_time_at, audit_prog_id, audit_node_id";
    private static final String INSERT_SQL_AUDIT_VALUES =
        "1, #{audit.userId}, SYSTIMESTAMP, #{audit.progId}, #{audit.nodeId}";

    private static final String UPDATE_SQL_AUDIT_VALUES =
        "audit_version = audit_version + 1" +
            ", audit_user_id = #{audit.userId}, audit_time_at = SYSTIMESTAMP" +
            ", audit_prog_id = #{audit.progId}, audit_node_id = #{audit.nodeId}";
    private static final String UPDATE_SQL_CHECK_VERSION = "audit_version = #{version}";

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

    private SysSqlUtil() {
    }
}
