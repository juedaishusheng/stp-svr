package com.el.util;

import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

import static com.el.util.SqlUtil.SqlLikeOption.*;

/**
 * Created on 16/4/19.
 *
 * @author panlw
 */
public final class SqlUtil {

    public static final SqlDialect SQL_DIALECT = new SqlDialectOracle(); // new SqlDialectMySQL();

    private static final String PAGING_PARAM = "paging";

    private static final String SQL_EMPTY_SET = "()";

    /**
     * 模糊查询选项
     */
    public enum SqlLikeOption {
        BOTH_SIDES, LEFT_SIDE, RIGHT_SIDE
    }

    /**
     * Paging used by SqlProvider
     *
     * @param sql    select sql statement without paging
     * @param params parameters of mapper method
     * @return select sql statement with paging
     */
    public static String paging(String sql, Map<String, Object> params) {
        if (params != null && params.containsKey(PAGING_PARAM)) {
            Paging paging = (Paging) params.get(PAGING_PARAM);
            if (paging != null) {
                sql = SQL_DIALECT.paging(sql, (Paging) params.get(PAGING_PARAM));
            }
        }
        return sql;
    }

    public static String paging(String sql, Paging paging) {
        if (paging != null) {
            sql = SQL_DIALECT.paging(sql, paging);
        }
        return sql;
    }

    private static void escape(StringBuilder sb, String val) {
        final Map<Character, String> escapeMappng = SQL_DIALECT.escapeMappng();
        final char[] chs = val.toCharArray();
        for (char ch : chs) {
            String escaped = escapeMappng.get(ch);
            if (escaped == null) {
                sb.append(ch);
            } else {
                sb.append(escaped);
            }
        }
    }

    /**
     * 对用于构成SQL文的值文本进行转义处理, 以防止SQL注入攻击。
     */
    public static String toSqlString(String val) {
        if (val == null) {
            throw new NullPointerException("Parameter(val) is null");
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        escape(sb, val);
        sb.append('\'');
        return sb.toString();
    }

    /**
     * 模糊查询
     *
     * @param val 关键字文本
     * @param opt 匹配选项
     * @return SQL文的文本值
     */
    public static String toSqlLikeString(String val, SqlLikeOption opt) {
        if (val == null) {
            throw new NullPointerException("Parameter(val) is null");
        }
        if (StringUtils.isEmpty(val)) {
            throw new IllegalArgumentException("Parameter(val) is null or empty");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(opt != RIGHT_SIDE ? "'%" : "'");
        escape(sb, val);
        sb.append(opt != LEFT_SIDE ? "%'" : "'");
        return sb.toString();
    }

    /**
     * 用得最多的全匹配模糊查询
     *
     * @param val 关键字文本
     * @return SQL文的文本值
     */
    public static String toSqlLikeString(String val) {
        return toSqlLikeString(val, BOTH_SIDES);
    }

    /**
     * 构建SQL文的文本集合用于`IN`操作
     *
     * @param vals 文本集
     * @return SQL文的文本集合
     */
    public static String toSqlStringSet(List<String> vals) {
        if (vals == null) {
            throw new NullPointerException("Parameter(vals) is null");
        }
        if (vals.isEmpty()) {
            return SQL_EMPTY_SET;
        }
        StringBuilder sb = new StringBuilder();
        vals.stream().filter(val -> val != null).forEach(val -> {
            if (sb.length() == 0) {
                sb.append("('");
            } else {
                sb.append("','");
            }
            escape(sb, val);
        });
        if (sb.length() == 0) {
            sb.append("()");
        } else {
            sb.append("')");
        }
        return sb.toString();
    }

    /**
     * 构建SQL文的数值集合用于`IN`操作
     *
     * @param vals 数值集
     * @return SQL文的数值集合
     */
    public static String toSqlNumberSet(List<? extends Number> vals) {
        if (vals == null) {
            throw new NullPointerException("Parameter(vals) is null");
        }
        if (vals.isEmpty()) {
            return SQL_EMPTY_SET;
        }
        StringBuilder sb = new StringBuilder();
        vals.stream().filter(val -> val != null).forEach(val -> {
            if (sb.length() == 0) {
                sb.append('(');
            } else {
                sb.append(',');
            }
            sb.append(val);
        });
        if (sb.length() == 0) {
            sb.append("()");
        } else {
            sb.append(')');
        }
        return sb.toString();
    }

    private SqlUtil() {
    }
}
