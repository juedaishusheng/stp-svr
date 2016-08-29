package com.el.cfg.mapper;

import com.el.cfg.domain.TPapertrans;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TPapertransMapper {
    @Delete({
        "delete from T_PAPERTRANS",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_PAPERTRANS (ID, OU_ID, ",
        "MCU_ID, FACT_ID, DOC_NO, ",
        "DOC_TYPE, DOC_DATE, ",
        "DOC_STATUS, SO_ID, SOPROD_ID, ",
        "PROD_ID, OUTWH_ID, ",
        "INWH_ID, OUTWH_PIC, ",
        "INWH_PIC, ITEM_ID, BATCH_DESC, ",
        "PLAN_OUT_QTY, ACTU_OUT_QTY, ",
        "RECVED_QTY, UOM, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{mcuId,jdbcType=DECIMAL}, #{factId,jdbcType=DECIMAL}, #{docNo,jdbcType=NCHAR}, ",
        "#{docType,jdbcType=NCHAR}, #{docDate,jdbcType=TIMESTAMP}, ",
        "#{docStatus,jdbcType=NCHAR}, #{soId,jdbcType=DECIMAL}, #{soprodId,jdbcType=DECIMAL}, ",
        "#{prodId,jdbcType=DECIMAL}, #{outwhId,jdbcType=DECIMAL}, ",
        "#{inwhId,jdbcType=DECIMAL}, #{outwhPic,jdbcType=NCHAR}, ",
        "#{inwhPic,jdbcType=NCHAR}, #{itemId,jdbcType=DECIMAL}, #{batchDesc,jdbcType=NCHAR}, ",
        "#{planOutQty,jdbcType=DECIMAL}, #{actuOutQty,jdbcType=DECIMAL}, ",
        "#{recvedQty,jdbcType=DECIMAL}, #{uom,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_PAPERTRANS.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TPapertrans record);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, FACT_ID, DOC_NO, DOC_TYPE, DOC_DATE, DOC_STATUS, SO_ID, SOPROD_ID, ",
        "PROD_ID, OUTWH_ID, INWH_ID, OUTWH_PIC, INWH_PIC, ITEM_ID, BATCH_DESC, PLAN_OUT_QTY, ",
        "ACTU_OUT_QTY, RECVED_QTY, UOM, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_PAPERTRANS",
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
        @Result(column="DOC_STATUS", property="docStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOPROD_ID", property="soprodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OUTWH_ID", property="outwhId", jdbcType=JdbcType.DECIMAL),
        @Result(column="INWH_ID", property="inwhId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OUTWH_PIC", property="outwhPic", jdbcType=JdbcType.NCHAR),
        @Result(column="INWH_PIC", property="inwhPic", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_ID", property="itemId", jdbcType=JdbcType.DECIMAL),
        @Result(column="BATCH_DESC", property="batchDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="PLAN_OUT_QTY", property="planOutQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="ACTU_OUT_QTY", property="actuOutQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="RECVED_QTY", property="recvedQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TPapertrans selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, FACT_ID, DOC_NO, DOC_TYPE, DOC_DATE, DOC_STATUS, SO_ID, SOPROD_ID, ",
        "PROD_ID, OUTWH_ID, INWH_ID, OUTWH_PIC, INWH_PIC, ITEM_ID, BATCH_DESC, PLAN_OUT_QTY, ",
        "ACTU_OUT_QTY, RECVED_QTY, UOM, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_PAPERTRANS"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.NCHAR),
        @Result(column="DOC_TYPE", property="docType", jdbcType=JdbcType.NCHAR),
        @Result(column="DOC_DATE", property="docDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DOC_STATUS", property="docStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOPROD_ID", property="soprodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OUTWH_ID", property="outwhId", jdbcType=JdbcType.DECIMAL),
        @Result(column="INWH_ID", property="inwhId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OUTWH_PIC", property="outwhPic", jdbcType=JdbcType.NCHAR),
        @Result(column="INWH_PIC", property="inwhPic", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_ID", property="itemId", jdbcType=JdbcType.DECIMAL),
        @Result(column="BATCH_DESC", property="batchDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="PLAN_OUT_QTY", property="planOutQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="ACTU_OUT_QTY", property="actuOutQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="RECVED_QTY", property="recvedQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TPapertrans> selectAll();

    @Update({
        "update T_PAPERTRANS",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "MCU_ID = #{mcuId,jdbcType=DECIMAL},",
          "FACT_ID = #{factId,jdbcType=DECIMAL},",
          "DOC_NO = #{docNo,jdbcType=NCHAR},",
          "DOC_TYPE = #{docType,jdbcType=NCHAR},",
          "DOC_DATE = #{docDate,jdbcType=TIMESTAMP},",
          "DOC_STATUS = #{docStatus,jdbcType=NCHAR},",
          "SO_ID = #{soId,jdbcType=DECIMAL},",
          "SOPROD_ID = #{soprodId,jdbcType=DECIMAL},",
          "PROD_ID = #{prodId,jdbcType=DECIMAL},",
          "OUTWH_ID = #{outwhId,jdbcType=DECIMAL},",
          "INWH_ID = #{inwhId,jdbcType=DECIMAL},",
          "OUTWH_PIC = #{outwhPic,jdbcType=NCHAR},",
          "INWH_PIC = #{inwhPic,jdbcType=NCHAR},",
          "ITEM_ID = #{itemId,jdbcType=DECIMAL},",
          "BATCH_DESC = #{batchDesc,jdbcType=NCHAR},",
          "PLAN_OUT_QTY = #{planOutQty,jdbcType=DECIMAL},",
          "ACTU_OUT_QTY = #{actuOutQty,jdbcType=DECIMAL},",
          "RECVED_QTY = #{recvedQty,jdbcType=DECIMAL},",
          "UOM = #{uom,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TPapertrans record);
}