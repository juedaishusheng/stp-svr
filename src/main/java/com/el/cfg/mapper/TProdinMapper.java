package com.el.cfg.mapper;

import com.el.cfg.domain.TProdin;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TProdinMapper {
    @Delete({
        "delete from T_PRODIN",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_PRODIN (ID, OU_ID, ",
        "MCU_ID, FACT_ID, DOC_NO, ",
        "DOC_TYPE, DOC_DATE, ",
        "DOC_STATUS, WH_ID, WHIN_PIC, ",
        "SO_ID, SOPROD_ID, ",
        "SOMANU_ID, CUST_ID, ",
        "PROD_ID, WHIN_QTY, ",
        "SOPROD_QTY, BOTTOM, ",
        "HEIGHT, QTY_PERPACKAG, ",
        "SPARE_QTY, REMARK, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{mcuId,jdbcType=DECIMAL}, #{factId,jdbcType=DECIMAL}, #{docNo,jdbcType=NCHAR}, ",
        "#{docType,jdbcType=NCHAR}, #{docDate,jdbcType=TIMESTAMP}, ",
        "#{docStatus,jdbcType=NCHAR}, #{whId,jdbcType=DECIMAL}, #{whinPic,jdbcType=NCHAR}, ",
        "#{soId,jdbcType=DECIMAL}, #{soprodId,jdbcType=DECIMAL}, ",
        "#{somanuId,jdbcType=DECIMAL}, #{custId,jdbcType=DECIMAL}, ",
        "#{prodId,jdbcType=DECIMAL}, #{whinQty,jdbcType=DECIMAL}, ",
        "#{soprodQty,jdbcType=DECIMAL}, #{bottom,jdbcType=DECIMAL}, ",
        "#{height,jdbcType=DECIMAL}, #{qtyPerpackag,jdbcType=DECIMAL}, ",
        "#{spareQty,jdbcType=DECIMAL}, #{remark,jdbcType=NCHAR}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_PRODIN.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TProdin record);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, FACT_ID, DOC_NO, DOC_TYPE, DOC_DATE, DOC_STATUS, WH_ID, WHIN_PIC, ",
        "SO_ID, SOPROD_ID, SOMANU_ID, CUST_ID, PROD_ID, WHIN_QTY, SOPROD_QTY, BOTTOM, ",
        "HEIGHT, QTY_PERPACKAG, SPARE_QTY, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PRODIN",
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
        @Result(column="WH_ID", property="whId", jdbcType=JdbcType.DECIMAL),
        @Result(column="WHIN_PIC", property="whinPic", jdbcType=JdbcType.NCHAR),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOPROD_ID", property="soprodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOMANU_ID", property="somanuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUST_ID", property="custId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="WHIN_QTY", property="whinQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOPROD_QTY", property="soprodQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="BOTTOM", property="bottom", jdbcType=JdbcType.DECIMAL),
        @Result(column="HEIGHT", property="height", jdbcType=JdbcType.DECIMAL),
        @Result(column="QTY_PERPACKAG", property="qtyPerpackag", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPARE_QTY", property="spareQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TProdin selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, FACT_ID, DOC_NO, DOC_TYPE, DOC_DATE, DOC_STATUS, WH_ID, WHIN_PIC, ",
        "SO_ID, SOPROD_ID, SOMANU_ID, CUST_ID, PROD_ID, WHIN_QTY, SOPROD_QTY, BOTTOM, ",
        "HEIGHT, QTY_PERPACKAG, SPARE_QTY, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PRODIN"
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
        @Result(column="WH_ID", property="whId", jdbcType=JdbcType.DECIMAL),
        @Result(column="WHIN_PIC", property="whinPic", jdbcType=JdbcType.NCHAR),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOPROD_ID", property="soprodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOMANU_ID", property="somanuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUST_ID", property="custId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="WHIN_QTY", property="whinQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOPROD_QTY", property="soprodQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="BOTTOM", property="bottom", jdbcType=JdbcType.DECIMAL),
        @Result(column="HEIGHT", property="height", jdbcType=JdbcType.DECIMAL),
        @Result(column="QTY_PERPACKAG", property="qtyPerpackag", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPARE_QTY", property="spareQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TProdin> selectAll();

    @Update({
        "update T_PRODIN",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "MCU_ID = #{mcuId,jdbcType=DECIMAL},",
          "FACT_ID = #{factId,jdbcType=DECIMAL},",
          "DOC_NO = #{docNo,jdbcType=NCHAR},",
          "DOC_TYPE = #{docType,jdbcType=NCHAR},",
          "DOC_DATE = #{docDate,jdbcType=TIMESTAMP},",
          "DOC_STATUS = #{docStatus,jdbcType=NCHAR},",
          "WH_ID = #{whId,jdbcType=DECIMAL},",
          "WHIN_PIC = #{whinPic,jdbcType=NCHAR},",
          "SO_ID = #{soId,jdbcType=DECIMAL},",
          "SOPROD_ID = #{soprodId,jdbcType=DECIMAL},",
          "SOMANU_ID = #{somanuId,jdbcType=DECIMAL},",
          "CUST_ID = #{custId,jdbcType=DECIMAL},",
          "PROD_ID = #{prodId,jdbcType=DECIMAL},",
          "WHIN_QTY = #{whinQty,jdbcType=DECIMAL},",
          "SOPROD_QTY = #{soprodQty,jdbcType=DECIMAL},",
          "BOTTOM = #{bottom,jdbcType=DECIMAL},",
          "HEIGHT = #{height,jdbcType=DECIMAL},",
          "QTY_PERPACKAG = #{qtyPerpackag,jdbcType=DECIMAL},",
          "SPARE_QTY = #{spareQty,jdbcType=DECIMAL},",
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
    int updateByPrimaryKey(TProdin record);
}