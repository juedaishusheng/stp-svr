package com.el.cfg.mapper;

import com.el.cfg.domain.TSoCalc;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TSoCalcMapper {
    @Delete({
        "delete from T_SO_CALC",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_SO_CALC (ID, OU_ID, ",
        "SO_ID, PUTIN_TIME, ",
        "CALC_START_TIME, CALC_END_TIME, ",
        "FACT_MIDDLE_AMT, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{soId,jdbcType=DECIMAL}, #{putinTime,jdbcType=TIMESTAMP}, ",
        "#{calcStartTime,jdbcType=TIMESTAMP}, #{calcEndTime,jdbcType=TIMESTAMP}, ",
        "#{factMiddleAmt,jdbcType=DECIMAL}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_SO_CALC.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TSoCalc record);

    @Select({
        "select",
        "ID, OU_ID, SO_ID, PUTIN_TIME, CALC_START_TIME, CALC_END_TIME, FACT_MIDDLE_AMT, ",
        "LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_SO_CALC",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PUTIN_TIME", property="putinTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALC_START_TIME", property="calcStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALC_END_TIME", property="calcEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FACT_MIDDLE_AMT", property="factMiddleAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TSoCalc selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, SO_ID, PUTIN_TIME, CALC_START_TIME, CALC_END_TIME, FACT_MIDDLE_AMT, ",
        "LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_SO_CALC"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PUTIN_TIME", property="putinTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALC_START_TIME", property="calcStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CALC_END_TIME", property="calcEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FACT_MIDDLE_AMT", property="factMiddleAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TSoCalc> selectAll();

    @Update({
        "update T_SO_CALC",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "SO_ID = #{soId,jdbcType=DECIMAL},",
          "PUTIN_TIME = #{putinTime,jdbcType=TIMESTAMP},",
          "CALC_START_TIME = #{calcStartTime,jdbcType=TIMESTAMP},",
          "CALC_END_TIME = #{calcEndTime,jdbcType=TIMESTAMP},",
          "FACT_MIDDLE_AMT = #{factMiddleAmt,jdbcType=DECIMAL},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TSoCalc record);
}