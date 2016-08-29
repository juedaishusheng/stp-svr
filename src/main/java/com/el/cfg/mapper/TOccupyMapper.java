package com.el.cfg.mapper;

import com.el.cfg.domain.TOccupy;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TOccupyMapper {
    @Delete({
        "delete from T_OCCUPY",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_OCCUPY (ID, OU_ID, ",
        "DISTOU_ID, FACT_ID, ",
        "SO_ID, SO_MANU_ID, ",
        "PROD_ID, DT, CAPA_TYPE, ",
        "CAPA, REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION, ",
        "UOM)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{distouId,jdbcType=DECIMAL}, #{factId,jdbcType=DECIMAL}, ",
        "#{soId,jdbcType=DECIMAL}, #{soManuId,jdbcType=DECIMAL}, ",
        "#{prodId,jdbcType=DECIMAL}, #{dt,jdbcType=TIMESTAMP}, #{capaType,jdbcType=NCHAR}, ",
        "#{capa,jdbcType=DECIMAL}, #{remark,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL}, ",
        "#{uom,jdbcType=NCHAR})"
    })
    @SelectKey(statement="SELECT SEQ_T_OCCUPY.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TOccupy record);

    @Select({
        "select",
        "ID, OU_ID, DISTOU_ID, FACT_ID, SO_ID, SO_MANU_ID, PROD_ID, DT, CAPA_TYPE, CAPA, ",
        "REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION, UOM",
        "from T_OCCUPY",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DISTOU_ID", property="distouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DT", property="dt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CAPA_TYPE", property="capaType", jdbcType=JdbcType.NCHAR),
        @Result(column="CAPA", property="capa", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR)
    })
    TOccupy selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, DISTOU_ID, FACT_ID, SO_ID, SO_MANU_ID, PROD_ID, DT, CAPA_TYPE, CAPA, ",
        "REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION, UOM",
        "from T_OCCUPY"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DISTOU_ID", property="distouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DT", property="dt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CAPA_TYPE", property="capaType", jdbcType=JdbcType.NCHAR),
        @Result(column="CAPA", property="capa", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR)
    })
    List<TOccupy> selectAll();

    @Update({
        "update T_OCCUPY",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "DISTOU_ID = #{distouId,jdbcType=DECIMAL},",
          "FACT_ID = #{factId,jdbcType=DECIMAL},",
          "SO_ID = #{soId,jdbcType=DECIMAL},",
          "SO_MANU_ID = #{soManuId,jdbcType=DECIMAL},",
          "PROD_ID = #{prodId,jdbcType=DECIMAL},",
          "DT = #{dt,jdbcType=TIMESTAMP},",
          "CAPA_TYPE = #{capaType,jdbcType=NCHAR},",
          "CAPA = #{capa,jdbcType=DECIMAL},",
          "REMARK = #{remark,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL},",
          "UOM = #{uom,jdbcType=NCHAR}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TOccupy record);
}