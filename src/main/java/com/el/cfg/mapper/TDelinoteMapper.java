package com.el.cfg.mapper;

import com.el.cfg.domain.TDelinote;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TDelinoteMapper {
    @Delete({
        "delete from T_DELINOTE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_DELINOTE (ID, OU_ID, ",
        "MCU_ID, FACT_ID, DOC_NO, ",
        "DOC_TYPE, DOC_DATE, ",
        "REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{mcuId,jdbcType=DECIMAL}, #{factId,jdbcType=DECIMAL}, #{docNo,jdbcType=NCHAR}, ",
        "#{docType,jdbcType=NCHAR}, #{docDate,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_DELINOTE.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TDelinote record);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, FACT_ID, DOC_NO, DOC_TYPE, DOC_DATE, REMARK, LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_DELINOTE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.NCHAR),
        @Result(column="DOC_TYPE", property="docType", jdbcType=JdbcType.NCHAR),
        @Result(column="DOC_DATE", property="docDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TDelinote selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, FACT_ID, DOC_NO, DOC_TYPE, DOC_DATE, REMARK, LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_DELINOTE"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.NCHAR),
        @Result(column="DOC_TYPE", property="docType", jdbcType=JdbcType.NCHAR),
        @Result(column="DOC_DATE", property="docDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TDelinote> selectAll();

    @Update({
        "update T_DELINOTE",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "MCU_ID = #{mcuId,jdbcType=DECIMAL},",
          "FACT_ID = #{factId,jdbcType=DECIMAL},",
          "DOC_NO = #{docNo,jdbcType=NCHAR},",
          "DOC_TYPE = #{docType,jdbcType=NCHAR},",
          "DOC_DATE = #{docDate,jdbcType=TIMESTAMP},",
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
    int updateByPrimaryKey(TDelinote record);
}