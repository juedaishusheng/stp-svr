package com.el.cfg.mapper;

import com.el.cfg.domain.TFactStdcapa;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TFactStdcapaMapper {
    @Delete({
        "delete from T_FACT_STDCAPA",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_FACT_STDCAPA (ID, RELATE_ID, ",
        "FACT_ID, OU_ID, CAPA_TYPE, ",
        "DAILY_CAPA, UOM, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{relateId,jdbcType=DECIMAL}, ",
        "#{factId,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, #{capaType,jdbcType=NCHAR}, ",
        "#{dailyCapa,jdbcType=DECIMAL}, #{uom,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_FACT_STDCAPA.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TFactStdcapa record);

    @Select({
        "select",
        "ID, RELATE_ID, FACT_ID, OU_ID, CAPA_TYPE, DAILY_CAPA, UOM, LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_FACT_STDCAPA",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="RELATE_ID", property="relateId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CAPA_TYPE", property="capaType", jdbcType=JdbcType.NCHAR),
        @Result(column="DAILY_CAPA", property="dailyCapa", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TFactStdcapa selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, RELATE_ID, FACT_ID, OU_ID, CAPA_TYPE, DAILY_CAPA, UOM, LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_FACT_STDCAPA"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="RELATE_ID", property="relateId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CAPA_TYPE", property="capaType", jdbcType=JdbcType.NCHAR),
        @Result(column="DAILY_CAPA", property="dailyCapa", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TFactStdcapa> selectAll();

    @Update({
        "update T_FACT_STDCAPA",
        "set RELATE_ID = #{relateId,jdbcType=DECIMAL},",
          "FACT_ID = #{factId,jdbcType=DECIMAL},",
          "OU_ID = #{ouId,jdbcType=DECIMAL},",
          "CAPA_TYPE = #{capaType,jdbcType=NCHAR},",
          "DAILY_CAPA = #{dailyCapa,jdbcType=DECIMAL},",
          "UOM = #{uom,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TFactStdcapa record);
}