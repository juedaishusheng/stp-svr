package com.el.cfg.mapper;

import com.el.cfg.domain.TSonoteItem;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TSonoteItemMapper {
    @Delete({
        "delete from T_SONOTE_ITEM",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_SONOTE_ITEM (ID, OU_ID, ",
        "FACT_ID, SO_ID, SO_MANU_ID, ",
        "PROD_ID, PART_ID, ",
        "ITEM_DT, RPTER_ID, ",
        "RPTER_NAME, ITEM_NO, ITEM_DESC, ",
        "ITEM_IMPACT, ITEM_SOLUTION, ",
        "VALID_FLAG, REMARK, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{factId,jdbcType=DECIMAL}, #{soId,jdbcType=DECIMAL}, #{soManuId,jdbcType=DECIMAL}, ",
        "#{prodId,jdbcType=DECIMAL}, #{partId,jdbcType=DECIMAL}, ",
        "#{itemDt,jdbcType=TIMESTAMP}, #{rpterId,jdbcType=DECIMAL}, ",
        "#{rpterName,jdbcType=NCHAR}, #{itemNo,jdbcType=NCHAR}, #{itemDesc,jdbcType=NCHAR}, ",
        "#{itemImpact,jdbcType=NCHAR}, #{itemSolution,jdbcType=NCHAR}, ",
        "#{validFlag,jdbcType=DECIMAL}, #{remark,jdbcType=NCHAR}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_SONOTE_ITEM.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TSonoteItem record);

    @Select({
        "select",
        "ID, OU_ID, FACT_ID, SO_ID, SO_MANU_ID, PROD_ID, PART_ID, ITEM_DT, RPTER_ID, ",
        "RPTER_NAME, ITEM_NO, ITEM_DESC, ITEM_IMPACT, ITEM_SOLUTION, VALID_FLAG, REMARK, ",
        "LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_SONOTE_ITEM",
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
        @Result(column="ITEM_DT", property="itemDt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RPTER_ID", property="rpterId", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPTER_NAME", property="rpterName", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_NO", property="itemNo", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_DESC", property="itemDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_IMPACT", property="itemImpact", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_SOLUTION", property="itemSolution", jdbcType=JdbcType.NCHAR),
        @Result(column="VALID_FLAG", property="validFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TSonoteItem selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, FACT_ID, SO_ID, SO_MANU_ID, PROD_ID, PART_ID, ITEM_DT, RPTER_ID, ",
        "RPTER_NAME, ITEM_NO, ITEM_DESC, ITEM_IMPACT, ITEM_SOLUTION, VALID_FLAG, REMARK, ",
        "LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_SONOTE_ITEM"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_ID", property="partId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEM_DT", property="itemDt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RPTER_ID", property="rpterId", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPTER_NAME", property="rpterName", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_NO", property="itemNo", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_DESC", property="itemDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_IMPACT", property="itemImpact", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_SOLUTION", property="itemSolution", jdbcType=JdbcType.NCHAR),
        @Result(column="VALID_FLAG", property="validFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TSonoteItem> selectAll();

    @Update({
        "update T_SONOTE_ITEM",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "FACT_ID = #{factId,jdbcType=DECIMAL},",
          "SO_ID = #{soId,jdbcType=DECIMAL},",
          "SO_MANU_ID = #{soManuId,jdbcType=DECIMAL},",
          "PROD_ID = #{prodId,jdbcType=DECIMAL},",
          "PART_ID = #{partId,jdbcType=DECIMAL},",
          "ITEM_DT = #{itemDt,jdbcType=TIMESTAMP},",
          "RPTER_ID = #{rpterId,jdbcType=DECIMAL},",
          "RPTER_NAME = #{rpterName,jdbcType=NCHAR},",
          "ITEM_NO = #{itemNo,jdbcType=NCHAR},",
          "ITEM_DESC = #{itemDesc,jdbcType=NCHAR},",
          "ITEM_IMPACT = #{itemImpact,jdbcType=NCHAR},",
          "ITEM_SOLUTION = #{itemSolution,jdbcType=NCHAR},",
          "VALID_FLAG = #{validFlag,jdbcType=DECIMAL},",
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
    int updateByPrimaryKey(TSonoteItem record);
}