package com.el.cfg.mapper;

import com.el.cfg.domain.TSoFactgroup;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TSoFactgroupMapper {
    @Delete({
        "delete from T_SO_FACTGROUP",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_SO_FACTGROUP (ID, CALC_ID, ",
        "LINE_NO, GROUP_NO, ",
        "FACT_ID, CAN_ACPT_FLAG, ",
        "CANNOT_REASON_CODE, SEIZE_START_TIME, ",
        "ACPT_STATUS, ACPT_COMMENT, ",
        "ACPT_TIME, ACPT_USER, ",
        "FACT_AMT, LAST_MANU_FLAG, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{calcId,jdbcType=DECIMAL}, ",
        "#{lineNo,jdbcType=DECIMAL}, #{groupNo,jdbcType=DECIMAL}, ",
        "#{factId,jdbcType=DECIMAL}, #{canAcptFlag,jdbcType=DECIMAL}, ",
        "#{cannotReasonCode,jdbcType=NCHAR}, #{seizeStartTime,jdbcType=TIMESTAMP}, ",
        "#{acptStatus,jdbcType=NCHAR}, #{acptComment,jdbcType=NCHAR}, ",
        "#{acptTime,jdbcType=TIMESTAMP}, #{acptUser,jdbcType=NCHAR}, ",
        "#{factAmt,jdbcType=DECIMAL}, #{lastManuFlag,jdbcType=DECIMAL}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_SO_FACTGROUP.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TSoFactgroup record);

    @Select({
        "select",
        "ID, CALC_ID, LINE_NO, GROUP_NO, FACT_ID, CAN_ACPT_FLAG, CANNOT_REASON_CODE, ",
        "SEIZE_START_TIME, ACPT_STATUS, ACPT_COMMENT, ACPT_TIME, ACPT_USER, FACT_AMT, ",
        "LAST_MANU_FLAG, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION",
        "from T_SO_FACTGROUP",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="CALC_ID", property="calcId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="GROUP_NO", property="groupNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CAN_ACPT_FLAG", property="canAcptFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="CANNOT_REASON_CODE", property="cannotReasonCode", jdbcType=JdbcType.NCHAR),
        @Result(column="SEIZE_START_TIME", property="seizeStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACPT_STATUS", property="acptStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="ACPT_COMMENT", property="acptComment", jdbcType=JdbcType.NCHAR),
        @Result(column="ACPT_TIME", property="acptTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACPT_USER", property="acptUser", jdbcType=JdbcType.NCHAR),
        @Result(column="FACT_AMT", property="factAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="LAST_MANU_FLAG", property="lastManuFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TSoFactgroup selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, CALC_ID, LINE_NO, GROUP_NO, FACT_ID, CAN_ACPT_FLAG, CANNOT_REASON_CODE, ",
        "SEIZE_START_TIME, ACPT_STATUS, ACPT_COMMENT, ACPT_TIME, ACPT_USER, FACT_AMT, ",
        "LAST_MANU_FLAG, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION",
        "from T_SO_FACTGROUP"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="CALC_ID", property="calcId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="GROUP_NO", property="groupNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CAN_ACPT_FLAG", property="canAcptFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="CANNOT_REASON_CODE", property="cannotReasonCode", jdbcType=JdbcType.NCHAR),
        @Result(column="SEIZE_START_TIME", property="seizeStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACPT_STATUS", property="acptStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="ACPT_COMMENT", property="acptComment", jdbcType=JdbcType.NCHAR),
        @Result(column="ACPT_TIME", property="acptTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACPT_USER", property="acptUser", jdbcType=JdbcType.NCHAR),
        @Result(column="FACT_AMT", property="factAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="LAST_MANU_FLAG", property="lastManuFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TSoFactgroup> selectAll();

    @Update({
        "update T_SO_FACTGROUP",
        "set CALC_ID = #{calcId,jdbcType=DECIMAL},",
          "LINE_NO = #{lineNo,jdbcType=DECIMAL},",
          "GROUP_NO = #{groupNo,jdbcType=DECIMAL},",
          "FACT_ID = #{factId,jdbcType=DECIMAL},",
          "CAN_ACPT_FLAG = #{canAcptFlag,jdbcType=DECIMAL},",
          "CANNOT_REASON_CODE = #{cannotReasonCode,jdbcType=NCHAR},",
          "SEIZE_START_TIME = #{seizeStartTime,jdbcType=TIMESTAMP},",
          "ACPT_STATUS = #{acptStatus,jdbcType=NCHAR},",
          "ACPT_COMMENT = #{acptComment,jdbcType=NCHAR},",
          "ACPT_TIME = #{acptTime,jdbcType=TIMESTAMP},",
          "ACPT_USER = #{acptUser,jdbcType=NCHAR},",
          "FACT_AMT = #{factAmt,jdbcType=DECIMAL},",
          "LAST_MANU_FLAG = #{lastManuFlag,jdbcType=DECIMAL},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TSoFactgroup record);
}