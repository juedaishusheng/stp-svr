package com.el.cfg.mapper;

import com.el.cfg.domain.TFactRelate;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TFactRelateMapper {
    @Delete({
        "delete from T_FACT_RELATE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_FACT_RELATE (ID, FACT_ID, ",
        "OU_ID, OU_CODE, QUALIFY_LEVEL, ",
        "PRINT_DIFF_LEVEL, BIND_DIFF_LEVEL, ",
        "FACT_STATUS, SCHEDULER_LINE_NO, ",
        "ONTIME_RATE, VALID_FROM, ",
        "VALID_TO, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{factId,jdbcType=DECIMAL}, ",
        "#{ouId,jdbcType=DECIMAL}, #{ouCode,jdbcType=NCHAR}, #{qualifyLevel,jdbcType=NCHAR}, ",
        "#{printDiffLevel,jdbcType=NCHAR}, #{bindDiffLevel,jdbcType=NCHAR}, ",
        "#{factStatus,jdbcType=NCHAR}, #{schedulerLineNo,jdbcType=DECIMAL}, ",
        "#{ontimeRate,jdbcType=DECIMAL}, #{validFrom,jdbcType=TIMESTAMP}, ",
        "#{validTo,jdbcType=TIMESTAMP}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_FACT_RELATE.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TFactRelate record);

    @Select({
        "select",
        "ID, FACT_ID, OU_ID, OU_CODE, QUALIFY_LEVEL, PRINT_DIFF_LEVEL, BIND_DIFF_LEVEL, ",
        "FACT_STATUS, SCHEDULER_LINE_NO, ONTIME_RATE, VALID_FROM, VALID_TO, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_FACT_RELATE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OU_CODE", property="ouCode", jdbcType=JdbcType.NCHAR),
        @Result(column="QUALIFY_LEVEL", property="qualifyLevel", jdbcType=JdbcType.NCHAR),
        @Result(column="PRINT_DIFF_LEVEL", property="printDiffLevel", jdbcType=JdbcType.NCHAR),
        @Result(column="BIND_DIFF_LEVEL", property="bindDiffLevel", jdbcType=JdbcType.NCHAR),
        @Result(column="FACT_STATUS", property="factStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="SCHEDULER_LINE_NO", property="schedulerLineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="ONTIME_RATE", property="ontimeRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="VALID_FROM", property="validFrom", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="VALID_TO", property="validTo", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TFactRelate selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, FACT_ID, OU_ID, OU_CODE, QUALIFY_LEVEL, PRINT_DIFF_LEVEL, BIND_DIFF_LEVEL, ",
        "FACT_STATUS, SCHEDULER_LINE_NO, ONTIME_RATE, VALID_FROM, VALID_TO, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_FACT_RELATE"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OU_CODE", property="ouCode", jdbcType=JdbcType.NCHAR),
        @Result(column="QUALIFY_LEVEL", property="qualifyLevel", jdbcType=JdbcType.NCHAR),
        @Result(column="PRINT_DIFF_LEVEL", property="printDiffLevel", jdbcType=JdbcType.NCHAR),
        @Result(column="BIND_DIFF_LEVEL", property="bindDiffLevel", jdbcType=JdbcType.NCHAR),
        @Result(column="FACT_STATUS", property="factStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="SCHEDULER_LINE_NO", property="schedulerLineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="ONTIME_RATE", property="ontimeRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="VALID_FROM", property="validFrom", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="VALID_TO", property="validTo", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TFactRelate> selectAll();

    @Update({
        "update T_FACT_RELATE",
        "set FACT_ID = #{factId,jdbcType=DECIMAL},",
          "OU_ID = #{ouId,jdbcType=DECIMAL},",
          "OU_CODE = #{ouCode,jdbcType=NCHAR},",
          "QUALIFY_LEVEL = #{qualifyLevel,jdbcType=NCHAR},",
          "PRINT_DIFF_LEVEL = #{printDiffLevel,jdbcType=NCHAR},",
          "BIND_DIFF_LEVEL = #{bindDiffLevel,jdbcType=NCHAR},",
          "FACT_STATUS = #{factStatus,jdbcType=NCHAR},",
          "SCHEDULER_LINE_NO = #{schedulerLineNo,jdbcType=DECIMAL},",
          "ONTIME_RATE = #{ontimeRate,jdbcType=DECIMAL},",
          "VALID_FROM = #{validFrom,jdbcType=TIMESTAMP},",
          "VALID_TO = #{validTo,jdbcType=TIMESTAMP},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TFactRelate record);
}