package com.el.cfg.mapper;

import com.el.cfg.domain.TRouteProcess;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TRouteProcessMapper {
    @Delete({
        "delete from T_ROUTE_PROCESS",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_ROUTE_PROCESS (ID, ROUTE_ID, ",
        "SORT_NO, PROCESS_ID, ",
        "NEXT_NO, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{routeId,jdbcType=DECIMAL}, ",
        "#{sortNo,jdbcType=DECIMAL}, #{processId,jdbcType=DECIMAL}, ",
        "#{nextNo,jdbcType=DECIMAL}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_ROUTE_PROCESS.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TRouteProcess record);

    @Select({
        "select",
        "ID, ROUTE_ID, SORT_NO, PROCESS_ID, NEXT_NO, LOCKER_ID, LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_ROUTE_PROCESS",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ROUTE_ID", property="routeId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SORT_NO", property="sortNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_ID", property="processId", jdbcType=JdbcType.DECIMAL),
        @Result(column="NEXT_NO", property="nextNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TRouteProcess selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, ROUTE_ID, SORT_NO, PROCESS_ID, NEXT_NO, LOCKER_ID, LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_ROUTE_PROCESS"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="ROUTE_ID", property="routeId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SORT_NO", property="sortNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_ID", property="processId", jdbcType=JdbcType.DECIMAL),
        @Result(column="NEXT_NO", property="nextNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TRouteProcess> selectAll();

    @Update({
        "update T_ROUTE_PROCESS",
        "set ROUTE_ID = #{routeId,jdbcType=DECIMAL},",
          "SORT_NO = #{sortNo,jdbcType=DECIMAL},",
          "PROCESS_ID = #{processId,jdbcType=DECIMAL},",
          "NEXT_NO = #{nextNo,jdbcType=DECIMAL},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TRouteProcess record);
}