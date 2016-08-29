package com.el.cfg.mapper;

import com.el.cfg.domain.TSorpt;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TSorptMapper {
    @Delete({
        "delete from T_SORPT",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_SORPT (ID, OU_ID, ",
        "FACT_ID, SO_ID, SO_MANU_ID, ",
        "PROD_ID, PART_ID, ",
        "RPT_DT, RPTER_ID, ",
        "RPTER_NAME, RPT_TYPE, ",
        "RPT_QTY, RPT_UOM, REMARK, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{factId,jdbcType=DECIMAL}, #{soId,jdbcType=DECIMAL}, #{soManuId,jdbcType=DECIMAL}, ",
        "#{prodId,jdbcType=DECIMAL}, #{partId,jdbcType=DECIMAL}, ",
        "#{rptDt,jdbcType=TIMESTAMP}, #{rpterId,jdbcType=DECIMAL}, ",
        "#{rpterName,jdbcType=NCHAR}, #{rptType,jdbcType=NCHAR}, ",
        "#{rptQty,jdbcType=DECIMAL}, #{rptUom,jdbcType=NCHAR}, #{remark,jdbcType=NCHAR}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_SORPT.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TSorpt record);

    @Select({
        "select",
        "ID, OU_ID, FACT_ID, SO_ID, SO_MANU_ID, PROD_ID, PART_ID, RPT_DT, RPTER_ID, RPTER_NAME, ",
        "RPT_TYPE, RPT_QTY, RPT_UOM, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_SORPT",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_ID", property="partId", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPT_DT", property="rptDt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RPTER_ID", property="rpterId", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPTER_NAME", property="rpterName", jdbcType=JdbcType.NCHAR),
        @Result(column="RPT_TYPE", property="rptType", jdbcType=JdbcType.NCHAR),
        @Result(column="RPT_QTY", property="rptQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPT_UOM", property="rptUom", jdbcType=JdbcType.NCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TSorpt selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, FACT_ID, SO_ID, SO_MANU_ID, PROD_ID, PART_ID, RPT_DT, RPTER_ID, RPTER_NAME, ",
        "RPT_TYPE, RPT_QTY, RPT_UOM, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_SORPT"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_ID", property="partId", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPT_DT", property="rptDt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RPTER_ID", property="rpterId", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPTER_NAME", property="rpterName", jdbcType=JdbcType.NCHAR),
        @Result(column="RPT_TYPE", property="rptType", jdbcType=JdbcType.NCHAR),
        @Result(column="RPT_QTY", property="rptQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPT_UOM", property="rptUom", jdbcType=JdbcType.NCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TSorpt> selectAll();

    @Update({
        "update T_SORPT",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "FACT_ID = #{factId,jdbcType=DECIMAL},",
          "SO_ID = #{soId,jdbcType=DECIMAL},",
          "SO_MANU_ID = #{soManuId,jdbcType=DECIMAL},",
          "PROD_ID = #{prodId,jdbcType=DECIMAL},",
          "PART_ID = #{partId,jdbcType=DECIMAL},",
          "RPT_DT = #{rptDt,jdbcType=TIMESTAMP},",
          "RPTER_ID = #{rpterId,jdbcType=DECIMAL},",
          "RPTER_NAME = #{rpterName,jdbcType=NCHAR},",
          "RPT_TYPE = #{rptType,jdbcType=NCHAR},",
          "RPT_QTY = #{rptQty,jdbcType=DECIMAL},",
          "RPT_UOM = #{rptUom,jdbcType=NCHAR},",
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
    int updateByPrimaryKey(TSorpt record);
}