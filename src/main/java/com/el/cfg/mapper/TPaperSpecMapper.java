package com.el.cfg.mapper;

import com.el.cfg.domain.TPaperSpec;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TPaperSpecMapper {
    @Delete({
        "delete from T_PAPER_SPEC",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_PAPER_SPEC (ID, OU_ID, ",
        "SPEC_CODE, PAPER_HEIGHT, ",
        "PAPER_WIDTH, GRAIN_ORIENT, ",
        "PAPER_FORMAT, PRINT_TYPE, ",
        "CNT_PER_REAM, MAX_THICK, ",
        "MIN_THICK, COLOR_TYPES, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{specCode,jdbcType=NCHAR}, #{paperHeight,jdbcType=DECIMAL}, ",
        "#{paperWidth,jdbcType=DECIMAL}, #{grainOrient,jdbcType=NCHAR}, ",
        "#{paperFormat,jdbcType=NCHAR}, #{printType,jdbcType=NCHAR}, ",
        "#{cntPerReam,jdbcType=DECIMAL}, #{maxThick,jdbcType=NCHAR}, ",
        "#{minThick,jdbcType=NCHAR}, #{colorTypes,jdbcType=NCHAR}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_PAPER_SPEC.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TPaperSpec record);

    @Select({
        "select",
        "ID, OU_ID, SPEC_CODE, PAPER_HEIGHT, PAPER_WIDTH, GRAIN_ORIENT, PAPER_FORMAT, ",
        "PRINT_TYPE, CNT_PER_REAM, MAX_THICK, MIN_THICK, COLOR_TYPES, LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PAPER_SPEC",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPEC_CODE", property="specCode", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_HEIGHT", property="paperHeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_WIDTH", property="paperWidth", jdbcType=JdbcType.DECIMAL),
        @Result(column="GRAIN_ORIENT", property="grainOrient", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_FORMAT", property="paperFormat", jdbcType=JdbcType.NCHAR),
        @Result(column="PRINT_TYPE", property="printType", jdbcType=JdbcType.NCHAR),
        @Result(column="CNT_PER_REAM", property="cntPerReam", jdbcType=JdbcType.DECIMAL),
        @Result(column="MAX_THICK", property="maxThick", jdbcType=JdbcType.NCHAR),
        @Result(column="MIN_THICK", property="minThick", jdbcType=JdbcType.NCHAR),
        @Result(column="COLOR_TYPES", property="colorTypes", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TPaperSpec selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, SPEC_CODE, PAPER_HEIGHT, PAPER_WIDTH, GRAIN_ORIENT, PAPER_FORMAT, ",
        "PRINT_TYPE, CNT_PER_REAM, MAX_THICK, MIN_THICK, COLOR_TYPES, LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PAPER_SPEC"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPEC_CODE", property="specCode", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_HEIGHT", property="paperHeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_WIDTH", property="paperWidth", jdbcType=JdbcType.DECIMAL),
        @Result(column="GRAIN_ORIENT", property="grainOrient", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_FORMAT", property="paperFormat", jdbcType=JdbcType.NCHAR),
        @Result(column="PRINT_TYPE", property="printType", jdbcType=JdbcType.NCHAR),
        @Result(column="CNT_PER_REAM", property="cntPerReam", jdbcType=JdbcType.DECIMAL),
        @Result(column="MAX_THICK", property="maxThick", jdbcType=JdbcType.NCHAR),
        @Result(column="MIN_THICK", property="minThick", jdbcType=JdbcType.NCHAR),
        @Result(column="COLOR_TYPES", property="colorTypes", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TPaperSpec> selectAll();

    @Update({
        "update T_PAPER_SPEC",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "SPEC_CODE = #{specCode,jdbcType=NCHAR},",
          "PAPER_HEIGHT = #{paperHeight,jdbcType=DECIMAL},",
          "PAPER_WIDTH = #{paperWidth,jdbcType=DECIMAL},",
          "GRAIN_ORIENT = #{grainOrient,jdbcType=NCHAR},",
          "PAPER_FORMAT = #{paperFormat,jdbcType=NCHAR},",
          "PRINT_TYPE = #{printType,jdbcType=NCHAR},",
          "CNT_PER_REAM = #{cntPerReam,jdbcType=DECIMAL},",
          "MAX_THICK = #{maxThick,jdbcType=NCHAR},",
          "MIN_THICK = #{minThick,jdbcType=NCHAR},",
          "COLOR_TYPES = #{colorTypes,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TPaperSpec record);
}