package com.el.sys.mapper;

import com.el.sys.domain.StpDbKey;
import com.el.sys.domain.StpUser;
import com.el.util.SqlUtil;
import com.el.util.SysSqlUtil;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.mapping.StatementType;

import java.util.List;

/**
 * Created on 16/7/28.
 *
 * @author panlw
 */
public interface StpUserMapper {

    class SqlProvider extends SQL {

        private static final String TABLE_NAME = "s_users";

        private void selectFields() {
            SELECT("id, enabled");
            SELECT("username");
            SELECT("password");
            SELECT("role");
            SELECT("profile");
            SELECT("audit_version");
        }

        private static final String SELECT_BY_ID_SQL = "selectByIdSql";

        public String selectByIdSql() {
            FROM(TABLE_NAME);
            WHERE("id = #{id}");
            selectFields();
            return toString();
        }

        private static final String SELECT_BY_USERNAME_LIKE_SQL = "selectByUsernameLikeSql";

        public String selectByUsernameLikeSql(@Param("usernameLike") String usernameLike) {
            FROM(TABLE_NAME);
            WHERE("username like" + SqlUtil.toSqlLikeString(usernameLike));
            selectFields();
            return toString();
        }

        private static final String INSERT_USER_SQL = "insertUserSql";

        public String insertUserSql() {
            INSERT_INTO(TABLE_NAME);
            VALUES("id", "#{id}");
            VALUES("username", "#{username}");
            VALUES("password", "#{password}");
            VALUES("role", "#{role}");
            VALUES("profile", "#{profile,jdbcType=NVARCHAR}");
            SysSqlUtil.insertAudit(this);
            return toString();
        }

        private static final String UPDATE_USER_SQL = "updateUserSql";

        public String updateUserSql() {
            UPDATE(TABLE_NAME);
            WHERE("id = #{id}");
            SET("username = #{username}");
            SET("password = #{password}");
            SET("role = #{role}");
            SET("profile = #{profile,jdbcType=NVARCHAR}");
            SysSqlUtil.updateAudit(this);
            return toString();
        }

        private static final String ENABLE_USER_SQL = "enableUserSql";

        public String enableUserSql() {
            UPDATE(TABLE_NAME);
            WHERE("id = #{id}");
            SET("enabled = 1");
            SysSqlUtil.updateAudit(this);
            return toString();
        }

        private static final String DISABLE_USER_SQL = "disableUserSql";

        public String disableUserSql() {
            UPDATE(TABLE_NAME);
            WHERE("id = #{id}");
            SET("enabled = 0");
            SysSqlUtil.updateAudit(this);
            return toString();
        }
    }

    /**
     * 检索用户数据
     *
     * @param id ID
     * @return 用户数据
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_BY_ID_SQL)
    List<StpUser> selectById(@Param("id") Long id);

    /**
     * 检索用户数据
     *
     * @param usernameLike 用户名模糊查询
     * @return 用户数据
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_BY_USERNAME_LIKE_SQL)
    List<StpUser> selectByUsernameLike(@Param("usernameLike") String usernameLike);

    /**
     * 新增用户数据
     *
     * @param user 用户数据
     * @return 更新记录数
     */
    @InsertProvider(type = SqlProvider.class, method = SqlProvider.INSERT_USER_SQL)
    @SelectKey(
        before = true,
        statementType = StatementType.STATEMENT,
        statement = "SELECT seq_s_users.NEXTVAL FROM DUAL",
        resultType = Long.class,
        keyProperty = "id")
    int insertUser(StpUser user);

    /**
     * 更新用户数据
     *
     * @param user 用户数据
     * @return 更新记录数
     */
    @UpdateProvider(type = SqlProvider.class, method = SqlProvider.UPDATE_USER_SQL)
    int updateUser(StpUser user);

    /**
     * 使指定用户有效
     *
     * @param user 用户数据
     * @return 更新记录数
     */
    @UpdateProvider(type = SqlProvider.class, method = SqlProvider.ENABLE_USER_SQL)
    int enableUser(StpDbKey user);

    /**
     * 使指定用户无效
     *
     * @param user 用户数据
     * @return 更新记录数
     */
    @UpdateProvider(type = SqlProvider.class, method = SqlProvider.DISABLE_USER_SQL)
    int disableUser(StpDbKey user);

}
