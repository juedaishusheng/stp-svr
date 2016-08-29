package com.el.cfg.mapper;

import com.el.cfg.domain.TSoRoute;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TSoRouteMapper {
    @Delete({
        "delete from T_SO_ROUTE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_SO_ROUTE (ID, SO_ID, ",
        "SO_PROD_ID, SO_MANU_ID, ",
        "PROD_ID, ROUTE_SORTNO, ",
        "ROUTE_ID, ROUTE_DESC, ",
        "NEXT_SORTNO, PART_ID, ",
        "REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{soId,jdbcType=DECIMAL}, ",
        "#{soProdId,jdbcType=DECIMAL}, #{soManuId,jdbcType=DECIMAL}, ",
        "#{prodId,jdbcType=DECIMAL}, #{routeSortno,jdbcType=DECIMAL}, ",
        "#{routeId,jdbcType=DECIMAL}, #{routeDesc,jdbcType=NCHAR}, ",
        "#{nextSortno,jdbcType=DECIMAL}, #{partId,jdbcType=DECIMAL}, ",
        "#{remark,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_SO_ROUTE.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TSoRoute record);

    @Select({
        "select",
        "ID, SO_ID, SO_PROD_ID, SO_MANU_ID, PROD_ID, ROUTE_SORTNO, ROUTE_ID, ROUTE_DESC, ",
        "NEXT_SORTNO, PART_ID, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_SO_ROUTE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_PROD_ID", property="soProdId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROUTE_SORTNO", property="routeSortno", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROUTE_ID", property="routeId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROUTE_DESC", property="routeDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="NEXT_SORTNO", property="nextSortno", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_ID", property="partId", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TSoRoute selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, SO_ID, SO_PROD_ID, SO_MANU_ID, PROD_ID, ROUTE_SORTNO, ROUTE_ID, ROUTE_DESC, ",
        "NEXT_SORTNO, PART_ID, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_SO_ROUTE"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_PROD_ID", property="soProdId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROUTE_SORTNO", property="routeSortno", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROUTE_ID", property="routeId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROUTE_DESC", property="routeDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="NEXT_SORTNO", property="nextSortno", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_ID", property="partId", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TSoRoute> selectAll();

    @Update({
        "update T_SO_ROUTE",
        "set SO_ID = #{soId,jdbcType=DECIMAL},",
          "SO_PROD_ID = #{soProdId,jdbcType=DECIMAL},",
          "SO_MANU_ID = #{soManuId,jdbcType=DECIMAL},",
          "PROD_ID = #{prodId,jdbcType=DECIMAL},",
          "ROUTE_SORTNO = #{routeSortno,jdbcType=DECIMAL},",
          "ROUTE_ID = #{routeId,jdbcType=DECIMAL},",
          "ROUTE_DESC = #{routeDesc,jdbcType=NCHAR},",
          "NEXT_SORTNO = #{nextSortno,jdbcType=DECIMAL},",
          "PART_ID = #{partId,jdbcType=DECIMAL},",
          "REMARK = #{remark,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TSoRoute record);
}