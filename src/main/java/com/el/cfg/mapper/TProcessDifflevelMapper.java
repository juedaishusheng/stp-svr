package com.el.cfg.mapper;

import com.el.cfg.domain.TProcessDifflevel;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TProcessDifflevelMapper {
    @Delete({
        "delete from T_PROCESS_DIFFLEVEL",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_PROCESS_DIFFLEVEL (ID, OU_ID, ",
        "PROCESS_ID, PROCESS_CODE, ",
        "DIFF_LEVEL, ALTER_RATIO, ",
        "REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{processId,jdbcType=DECIMAL}, #{processCode,jdbcType=NCHAR}, ",
        "#{diffLevel,jdbcType=NCHAR}, #{alterRatio,jdbcType=DECIMAL}, ",
        "#{remark,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_PROCESS_DIFFLEVEL.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TProcessDifflevel record);

    @Select({
        "select",
        "ID, OU_ID, PROCESS_ID, PROCESS_CODE, DIFF_LEVEL, ALTER_RATIO, REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PROCESS_DIFFLEVEL",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_ID", property="processId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_CODE", property="processCode", jdbcType=JdbcType.NCHAR),
        @Result(column="DIFF_LEVEL", property="diffLevel", jdbcType=JdbcType.NCHAR),
        @Result(column="ALTER_RATIO", property="alterRatio", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TProcessDifflevel selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, PROCESS_ID, PROCESS_CODE, DIFF_LEVEL, ALTER_RATIO, REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PROCESS_DIFFLEVEL"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_ID", property="processId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_CODE", property="processCode", jdbcType=JdbcType.NCHAR),
        @Result(column="DIFF_LEVEL", property="diffLevel", jdbcType=JdbcType.NCHAR),
        @Result(column="ALTER_RATIO", property="alterRatio", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TProcessDifflevel> selectAll();

    @Update({
        "update T_PROCESS_DIFFLEVEL",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "PROCESS_ID = #{processId,jdbcType=DECIMAL},",
          "PROCESS_CODE = #{processCode,jdbcType=NCHAR},",
          "DIFF_LEVEL = #{diffLevel,jdbcType=NCHAR},",
          "ALTER_RATIO = #{alterRatio,jdbcType=DECIMAL},",
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
    int updateByPrimaryKey(TProcessDifflevel record);
}