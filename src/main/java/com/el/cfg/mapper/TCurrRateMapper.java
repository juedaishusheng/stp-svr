package com.el.cfg.mapper;

import com.el.cfg.domain.TCurrRate;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TCurrRateMapper {
    @Delete({
        "delete from T_CURR_RATE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_CURR_RATE (ID, OU_ID, ",
        "MCU_ID, CURR_FROM, CURR_TO, ",
        "RATE_TYPE, DATE_FROM, ",
        "DATE_TO, CALC_METHOD, ",
        "CONV_METHOD, RATE_FORWARD, ",
        "RATE_REVERSE, SPOT_RATE, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{mcuId,jdbcType=DECIMAL}, #{currFrom,jdbcType=NCHAR}, #{currTo,jdbcType=NCHAR}, ",
        "#{rateType,jdbcType=NCHAR}, #{dateFrom,jdbcType=TIMESTAMP}, ",
        "#{dateTo,jdbcType=TIMESTAMP}, #{calcMethod,jdbcType=CHAR}, ",
        "#{convMethod,jdbcType=CHAR}, #{rateForward,jdbcType=DECIMAL}, ",
        "#{rateReverse,jdbcType=DECIMAL}, #{spotRate,jdbcType=CHAR}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_CURR_RATE.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TCurrRate record);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, CURR_FROM, CURR_TO, RATE_TYPE, DATE_FROM, DATE_TO, CALC_METHOD, ",
        "CONV_METHOD, RATE_FORWARD, RATE_REVERSE, SPOT_RATE, LOCKER_ID, LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_CURR_RATE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_FROM", property="currFrom", jdbcType=JdbcType.NCHAR),
        @Result(column="CURR_TO", property="currTo", jdbcType=JdbcType.NCHAR),
        @Result(column="RATE_TYPE", property="rateType", jdbcType=JdbcType.NCHAR),
        @Result(column="DATE_FROM", property="dateFrom", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DATE_TO", property="dateTo", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALC_METHOD", property="calcMethod", jdbcType=JdbcType.CHAR),
        @Result(column="CONV_METHOD", property="convMethod", jdbcType=JdbcType.CHAR),
        @Result(column="RATE_FORWARD", property="rateForward", jdbcType=JdbcType.DECIMAL),
        @Result(column="RATE_REVERSE", property="rateReverse", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPOT_RATE", property="spotRate", jdbcType=JdbcType.CHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TCurrRate selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, CURR_FROM, CURR_TO, RATE_TYPE, DATE_FROM, DATE_TO, CALC_METHOD, ",
        "CONV_METHOD, RATE_FORWARD, RATE_REVERSE, SPOT_RATE, LOCKER_ID, LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_CURR_RATE"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_FROM", property="currFrom", jdbcType=JdbcType.NCHAR),
        @Result(column="CURR_TO", property="currTo", jdbcType=JdbcType.NCHAR),
        @Result(column="RATE_TYPE", property="rateType", jdbcType=JdbcType.NCHAR),
        @Result(column="DATE_FROM", property="dateFrom", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DATE_TO", property="dateTo", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALC_METHOD", property="calcMethod", jdbcType=JdbcType.CHAR),
        @Result(column="CONV_METHOD", property="convMethod", jdbcType=JdbcType.CHAR),
        @Result(column="RATE_FORWARD", property="rateForward", jdbcType=JdbcType.DECIMAL),
        @Result(column="RATE_REVERSE", property="rateReverse", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPOT_RATE", property="spotRate", jdbcType=JdbcType.CHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TCurrRate> selectAll();

    @Update({
        "update T_CURR_RATE",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "MCU_ID = #{mcuId,jdbcType=DECIMAL},",
          "CURR_FROM = #{currFrom,jdbcType=NCHAR},",
          "CURR_TO = #{currTo,jdbcType=NCHAR},",
          "RATE_TYPE = #{rateType,jdbcType=NCHAR},",
          "DATE_FROM = #{dateFrom,jdbcType=TIMESTAMP},",
          "DATE_TO = #{dateTo,jdbcType=TIMESTAMP},",
          "CALC_METHOD = #{calcMethod,jdbcType=CHAR},",
          "CONV_METHOD = #{convMethod,jdbcType=CHAR},",
          "RATE_FORWARD = #{rateForward,jdbcType=DECIMAL},",
          "RATE_REVERSE = #{rateReverse,jdbcType=DECIMAL},",
          "SPOT_RATE = #{spotRate,jdbcType=CHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TCurrRate record);
}