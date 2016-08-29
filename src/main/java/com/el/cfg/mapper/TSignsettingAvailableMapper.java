package com.el.cfg.mapper;

import com.el.cfg.domain.TSignsettingAvailable;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TSignsettingAvailableMapper {
    @Delete({
        "delete from T_SIGNSETTING_AVAILABLE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_SIGNSETTING_AVAILABLE (ID, SET_NAME, ",
        "PAGE_CNT, BIND_METHODS, ",
        "MAX_PAPER_THICK, HORI_DESC, ",
        "VERT_DESC, PRINT_METHOD, ",
        "PLATE_CNT, PRINT_TYPE, ",
        "HORI_BLEED_DESC, VERT_BLEED_DESC, ",
        "SIGN_RATE, SPLIT_FLAG, ",
        "SPLIT_RATE, REMARK, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{setName,jdbcType=NCHAR}, ",
        "#{pageCnt,jdbcType=DECIMAL}, #{bindMethods,jdbcType=NCHAR}, ",
        "#{maxPaperThick,jdbcType=DECIMAL}, #{horiDesc,jdbcType=NCHAR}, ",
        "#{vertDesc,jdbcType=NCHAR}, #{printMethod,jdbcType=NCHAR}, ",
        "#{plateCnt,jdbcType=DECIMAL}, #{printType,jdbcType=NCHAR}, ",
        "#{horiBleedDesc,jdbcType=NCHAR}, #{vertBleedDesc,jdbcType=NCHAR}, ",
        "#{signRate,jdbcType=DECIMAL}, #{splitFlag,jdbcType=DECIMAL}, ",
        "#{splitRate,jdbcType=DECIMAL}, #{remark,jdbcType=NCHAR}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_SIGNSETTING_AVAILABLE.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TSignsettingAvailable record);

    @Select({
        "select",
        "ID, SET_NAME, PAGE_CNT, BIND_METHODS, MAX_PAPER_THICK, HORI_DESC, VERT_DESC, ",
        "PRINT_METHOD, PLATE_CNT, PRINT_TYPE, HORI_BLEED_DESC, VERT_BLEED_DESC, SIGN_RATE, ",
        "SPLIT_FLAG, SPLIT_RATE, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_SIGNSETTING_AVAILABLE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="SET_NAME", property="setName", jdbcType=JdbcType.NCHAR),
        @Result(column="PAGE_CNT", property="pageCnt", jdbcType=JdbcType.DECIMAL),
        @Result(column="BIND_METHODS", property="bindMethods", jdbcType=JdbcType.NCHAR),
        @Result(column="MAX_PAPER_THICK", property="maxPaperThick", jdbcType=JdbcType.DECIMAL),
        @Result(column="HORI_DESC", property="horiDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="VERT_DESC", property="vertDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="PRINT_METHOD", property="printMethod", jdbcType=JdbcType.NCHAR),
        @Result(column="PLATE_CNT", property="plateCnt", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRINT_TYPE", property="printType", jdbcType=JdbcType.NCHAR),
        @Result(column="HORI_BLEED_DESC", property="horiBleedDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="VERT_BLEED_DESC", property="vertBleedDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="SIGN_RATE", property="signRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPLIT_FLAG", property="splitFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPLIT_RATE", property="splitRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TSignsettingAvailable selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, SET_NAME, PAGE_CNT, BIND_METHODS, MAX_PAPER_THICK, HORI_DESC, VERT_DESC, ",
        "PRINT_METHOD, PLATE_CNT, PRINT_TYPE, HORI_BLEED_DESC, VERT_BLEED_DESC, SIGN_RATE, ",
        "SPLIT_FLAG, SPLIT_RATE, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_SIGNSETTING_AVAILABLE"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="SET_NAME", property="setName", jdbcType=JdbcType.NCHAR),
        @Result(column="PAGE_CNT", property="pageCnt", jdbcType=JdbcType.DECIMAL),
        @Result(column="BIND_METHODS", property="bindMethods", jdbcType=JdbcType.NCHAR),
        @Result(column="MAX_PAPER_THICK", property="maxPaperThick", jdbcType=JdbcType.DECIMAL),
        @Result(column="HORI_DESC", property="horiDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="VERT_DESC", property="vertDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="PRINT_METHOD", property="printMethod", jdbcType=JdbcType.NCHAR),
        @Result(column="PLATE_CNT", property="plateCnt", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRINT_TYPE", property="printType", jdbcType=JdbcType.NCHAR),
        @Result(column="HORI_BLEED_DESC", property="horiBleedDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="VERT_BLEED_DESC", property="vertBleedDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="SIGN_RATE", property="signRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPLIT_FLAG", property="splitFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPLIT_RATE", property="splitRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TSignsettingAvailable> selectAll();

    @Update({
        "update T_SIGNSETTING_AVAILABLE",
        "set SET_NAME = #{setName,jdbcType=NCHAR},",
          "PAGE_CNT = #{pageCnt,jdbcType=DECIMAL},",
          "BIND_METHODS = #{bindMethods,jdbcType=NCHAR},",
          "MAX_PAPER_THICK = #{maxPaperThick,jdbcType=DECIMAL},",
          "HORI_DESC = #{horiDesc,jdbcType=NCHAR},",
          "VERT_DESC = #{vertDesc,jdbcType=NCHAR},",
          "PRINT_METHOD = #{printMethod,jdbcType=NCHAR},",
          "PLATE_CNT = #{plateCnt,jdbcType=DECIMAL},",
          "PRINT_TYPE = #{printType,jdbcType=NCHAR},",
          "HORI_BLEED_DESC = #{horiBleedDesc,jdbcType=NCHAR},",
          "VERT_BLEED_DESC = #{vertBleedDesc,jdbcType=NCHAR},",
          "SIGN_RATE = #{signRate,jdbcType=DECIMAL},",
          "SPLIT_FLAG = #{splitFlag,jdbcType=DECIMAL},",
          "SPLIT_RATE = #{splitRate,jdbcType=DECIMAL},",
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
    int updateByPrimaryKey(TSignsettingAvailable record);
}