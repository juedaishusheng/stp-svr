package com.el.sys.mapper;

import com.el.sys.domain.Lock;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created on 16/6/15.
 *
 * @author panlw
 */
public interface LockMapper {

    final class SqlProvider extends SQL {

        private static final String TBL_LOCK = "s_locks";

        private static final String LOCK_SQL = "lockSql";

        public String lockSql() {
            INSERT_INTO(TBL_LOCK);
            VALUES("lock_code", "#{lockCode}");
            VALUES("lock_desc", "#{lockDesc}");
            VALUES("lock_data", "#{lockData}");
            VALUES("lock_id", "#{lockId}");
            VALUES("sess_id", "#{sessId}");
            VALUES("node_id", "#{nodeId}");
            VALUES("lock_by", "#{lockBy}");
            VALUES("lock_at", "SYSTIMESTAMP");
            return toString();
        }

        private static final String UNLOCK_SQL = "unlockSql";

        public String unlockSql() {
            DELETE_FROM(TBL_LOCK);
            WHERE("lock_code = #{lockCode}");
            WHERE("lock_data = #{lockData}");
            WHERE("lock_id = #{lockId}");
            return toString();
        }

        private static final String GET_LOCK_SQL = "getLockSql";

        public String getLockSql() {
            FROM(TBL_LOCK);
            WHERE("lock_code = #{lockCode}");
            WHERE("lock_data = #{lockData}");
            SELECT("lock_code as lockCode, lock_data as lockData");
            SELECT("lock_id as lockId, sess_id as sessId, node_id as nodeId");
            SELECT("lock_by as lockBy, lock_at as lockAt");
            return toString();
        }
    }

    /**
     * 获取同步锁
     *
     * @return 有/无(null)
     */
    @Select("SELECT 1 FROM s_locks WHERE lock_code = 'LOCK' AND lock_data = '*' FOR UPDATE")
    Integer getSyncLock();

    /**
     * 取锁
     *
     * @param lockCode 锁类型编码
     * @param lockData 目标数据
     * @return 锁
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.GET_LOCK_SQL)
    Lock getLock(@Param("lockCode") String lockCode, @Param("lockData") String lockData);

    /**
     * 加锁
     *
     * @param lock 锁信息
     * @return 更新件数
     */
    @InsertProvider(type = SqlProvider.class, method = SqlProvider.LOCK_SQL)
    int lock(Lock lock);

    /**
     * 解锁
     *
     * @param lock 锁
     * @return 更新件数
     */
    @DeleteProvider(type = SqlProvider.class, method = SqlProvider.UNLOCK_SQL)
    int unlock(Lock lock);

    /**
     * 释放会话创建的所有锁(会话结束时执行)
     *
     * @param nodeId 节点ID
     * @param sessId 会话ID
     * @return 更新件数
     */
    @Delete("DELETE FROM s_locks WHERE node_id = #{nodeId} AND sess_id = #{sessId}")
    int unlockSession(@Param("nodeId") String nodeId, @Param("sessId") String sessId);

    /**
     * 释放节点创建的所有锁(节点启动时执行)
     *
     * @param nodeId 节点ID
     * @return 更新件数
     */
    @Delete("DELETE FROM s_locks WHERE node_id = #{nodeId}")
    int unlockNode(String nodeId);
}
