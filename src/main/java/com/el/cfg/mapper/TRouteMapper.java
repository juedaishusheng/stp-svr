package com.el.cfg.mapper;

import com.el.cfg.domain.TRoute;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TRouteMapper {
    @Delete({
        "delete from T_ROUTE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_ROUTE (ID, OU_ID, ",
        "ROUTE_CODE, ROUTE_NAME, ",
        "CAT1, CAT2, CAT3, ",
        "CAT4, CAT5, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{routeCode,jdbcType=NCHAR}, #{routeName,jdbcType=NCHAR}, ",
        "#{cat1,jdbcType=NCHAR}, #{cat2,jdbcType=NCHAR}, #{cat3,jdbcType=NCHAR}, ",
        "#{cat4,jdbcType=NCHAR}, #{cat5,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_ROUTE.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TRoute record);

    @Select({
        "select",
        "ID, OU_ID, ROUTE_CODE, ROUTE_NAME, CAT1, CAT2, CAT3, CAT4, CAT5, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_ROUTE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROUTE_CODE", property="routeCode", jdbcType=JdbcType.NCHAR),
        @Result(column="ROUTE_NAME", property="routeName", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT1", property="cat1", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT2", property="cat2", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT3", property="cat3", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT4", property="cat4", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT5", property="cat5", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TRoute selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, ROUTE_CODE, ROUTE_NAME, CAT1, CAT2, CAT3, CAT4, CAT5, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_ROUTE"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROUTE_CODE", property="routeCode", jdbcType=JdbcType.NCHAR),
        @Result(column="ROUTE_NAME", property="routeName", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT1", property="cat1", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT2", property="cat2", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT3", property="cat3", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT4", property="cat4", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT5", property="cat5", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TRoute> selectAll();

    @Update({
        "update T_ROUTE",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "ROUTE_CODE = #{routeCode,jdbcType=NCHAR},",
          "ROUTE_NAME = #{routeName,jdbcType=NCHAR},",
          "CAT1 = #{cat1,jdbcType=NCHAR},",
          "CAT2 = #{cat2,jdbcType=NCHAR},",
          "CAT3 = #{cat3,jdbcType=NCHAR},",
          "CAT4 = #{cat4,jdbcType=NCHAR},",
          "CAT5 = #{cat5,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TRoute record);
}