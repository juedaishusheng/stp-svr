package com.el.cfg.mapper;

import com.el.cfg.domain.TFactory;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TFactoryMapper {
    @Delete({
        "delete from T_FACTORY",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_FACTORY (ID, OU_ID, ",
        "MCU_ID, ADDR_NO, FACT_TYPE, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{mcuId,jdbcType=DECIMAL}, #{addrNo,jdbcType=DECIMAL}, #{factType,jdbcType=NCHAR}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_FACTORY.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TFactory record);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, ADDR_NO, FACT_TYPE, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_FACTORY",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_TYPE", property="factType", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TFactory selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, ADDR_NO, FACT_TYPE, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_FACTORY"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_TYPE", property="factType", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TFactory> selectAll();

    @Update({
        "update T_FACTORY",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "MCU_ID = #{mcuId,jdbcType=DECIMAL},",
          "ADDR_NO = #{addrNo,jdbcType=DECIMAL},",
          "FACT_TYPE = #{factType,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TFactory record);
}