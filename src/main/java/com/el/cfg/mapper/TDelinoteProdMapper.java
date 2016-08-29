package com.el.cfg.mapper;

import com.el.cfg.domain.TDelinoteProd;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TDelinoteProdMapper {
    @Delete({
        "delete from T_DELINOTE_PROD",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_DELINOTE_PROD (ID, DELINOTE_ID, ",
        "LINE_STATUS, SO_ID, ",
        "SOPROD_ID, SOMANU_ID, ",
        "CUST_ID, PROD_ID, ",
        "SOPROD_QTY, WH_ID, ",
        "DEMAND_DELI_DATE, DEMAND_DELI_QTY, ",
        "DEMAND_GIFT_QTY, SUM_DELI_QTY, ",
        "SUM_GIFT_QTY, UOM, UOM_WEIGHT, ",
        "WEIGHT, PACKAGE_METHOD, ",
        "QTY_PERPACKAGE, PACKAGE_QTY, ",
        "SPARE_QTY, DELI_ADDR_NO, ",
        "DELI_ADDR_DESC, CONT_PERSON, ",
        "CONT_TEL, REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{delinoteId,jdbcType=DECIMAL}, ",
        "#{lineStatus,jdbcType=NCHAR}, #{soId,jdbcType=DECIMAL}, ",
        "#{soprodId,jdbcType=DECIMAL}, #{somanuId,jdbcType=DECIMAL}, ",
        "#{custId,jdbcType=DECIMAL}, #{prodId,jdbcType=DECIMAL}, ",
        "#{soprodQty,jdbcType=DECIMAL}, #{whId,jdbcType=DECIMAL}, ",
        "#{demandDeliDate,jdbcType=TIMESTAMP}, #{demandDeliQty,jdbcType=DECIMAL}, ",
        "#{demandGiftQty,jdbcType=DECIMAL}, #{sumDeliQty,jdbcType=DECIMAL}, ",
        "#{sumGiftQty,jdbcType=DECIMAL}, #{uom,jdbcType=NCHAR}, #{uomWeight,jdbcType=DECIMAL}, ",
        "#{weight,jdbcType=DECIMAL}, #{packageMethod,jdbcType=NCHAR}, ",
        "#{qtyPerpackage,jdbcType=DECIMAL}, #{packageQty,jdbcType=DECIMAL}, ",
        "#{spareQty,jdbcType=DECIMAL}, #{deliAddrNo,jdbcType=DECIMAL}, ",
        "#{deliAddrDesc,jdbcType=NCHAR}, #{contPerson,jdbcType=NCHAR}, ",
        "#{contTel,jdbcType=NCHAR}, #{remark,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_DELINOTE_PROD.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TDelinoteProd record);

    @Select({
        "select",
        "ID, DELINOTE_ID, LINE_STATUS, SO_ID, SOPROD_ID, SOMANU_ID, CUST_ID, PROD_ID, ",
        "SOPROD_QTY, WH_ID, DEMAND_DELI_DATE, DEMAND_DELI_QTY, DEMAND_GIFT_QTY, SUM_DELI_QTY, ",
        "SUM_GIFT_QTY, UOM, UOM_WEIGHT, WEIGHT, PACKAGE_METHOD, QTY_PERPACKAGE, PACKAGE_QTY, ",
        "SPARE_QTY, DELI_ADDR_NO, DELI_ADDR_DESC, CONT_PERSON, CONT_TEL, REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_DELINOTE_PROD",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="DELINOTE_ID", property="delinoteId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_STATUS", property="lineStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOPROD_ID", property="soprodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOMANU_ID", property="somanuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUST_ID", property="custId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOPROD_QTY", property="soprodQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="WH_ID", property="whId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DEMAND_DELI_DATE", property="demandDeliDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DEMAND_DELI_QTY", property="demandDeliQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="DEMAND_GIFT_QTY", property="demandGiftQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="SUM_DELI_QTY", property="sumDeliQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="SUM_GIFT_QTY", property="sumGiftQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM_WEIGHT", property="uomWeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="WEIGHT", property="weight", jdbcType=JdbcType.DECIMAL),
        @Result(column="PACKAGE_METHOD", property="packageMethod", jdbcType=JdbcType.NCHAR),
        @Result(column="QTY_PERPACKAGE", property="qtyPerpackage", jdbcType=JdbcType.DECIMAL),
        @Result(column="PACKAGE_QTY", property="packageQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPARE_QTY", property="spareQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="DELI_ADDR_NO", property="deliAddrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="DELI_ADDR_DESC", property="deliAddrDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="CONT_PERSON", property="contPerson", jdbcType=JdbcType.NCHAR),
        @Result(column="CONT_TEL", property="contTel", jdbcType=JdbcType.NCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TDelinoteProd selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, DELINOTE_ID, LINE_STATUS, SO_ID, SOPROD_ID, SOMANU_ID, CUST_ID, PROD_ID, ",
        "SOPROD_QTY, WH_ID, DEMAND_DELI_DATE, DEMAND_DELI_QTY, DEMAND_GIFT_QTY, SUM_DELI_QTY, ",
        "SUM_GIFT_QTY, UOM, UOM_WEIGHT, WEIGHT, PACKAGE_METHOD, QTY_PERPACKAGE, PACKAGE_QTY, ",
        "SPARE_QTY, DELI_ADDR_NO, DELI_ADDR_DESC, CONT_PERSON, CONT_TEL, REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_DELINOTE_PROD"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="DELINOTE_ID", property="delinoteId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_STATUS", property="lineStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOPROD_ID", property="soprodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOMANU_ID", property="somanuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUST_ID", property="custId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOPROD_QTY", property="soprodQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="WH_ID", property="whId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DEMAND_DELI_DATE", property="demandDeliDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DEMAND_DELI_QTY", property="demandDeliQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="DEMAND_GIFT_QTY", property="demandGiftQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="SUM_DELI_QTY", property="sumDeliQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="SUM_GIFT_QTY", property="sumGiftQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM_WEIGHT", property="uomWeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="WEIGHT", property="weight", jdbcType=JdbcType.DECIMAL),
        @Result(column="PACKAGE_METHOD", property="packageMethod", jdbcType=JdbcType.NCHAR),
        @Result(column="QTY_PERPACKAGE", property="qtyPerpackage", jdbcType=JdbcType.DECIMAL),
        @Result(column="PACKAGE_QTY", property="packageQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPARE_QTY", property="spareQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="DELI_ADDR_NO", property="deliAddrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="DELI_ADDR_DESC", property="deliAddrDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="CONT_PERSON", property="contPerson", jdbcType=JdbcType.NCHAR),
        @Result(column="CONT_TEL", property="contTel", jdbcType=JdbcType.NCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TDelinoteProd> selectAll();

    @Update({
        "update T_DELINOTE_PROD",
        "set DELINOTE_ID = #{delinoteId,jdbcType=DECIMAL},",
          "LINE_STATUS = #{lineStatus,jdbcType=NCHAR},",
          "SO_ID = #{soId,jdbcType=DECIMAL},",
          "SOPROD_ID = #{soprodId,jdbcType=DECIMAL},",
          "SOMANU_ID = #{somanuId,jdbcType=DECIMAL},",
          "CUST_ID = #{custId,jdbcType=DECIMAL},",
          "PROD_ID = #{prodId,jdbcType=DECIMAL},",
          "SOPROD_QTY = #{soprodQty,jdbcType=DECIMAL},",
          "WH_ID = #{whId,jdbcType=DECIMAL},",
          "DEMAND_DELI_DATE = #{demandDeliDate,jdbcType=TIMESTAMP},",
          "DEMAND_DELI_QTY = #{demandDeliQty,jdbcType=DECIMAL},",
          "DEMAND_GIFT_QTY = #{demandGiftQty,jdbcType=DECIMAL},",
          "SUM_DELI_QTY = #{sumDeliQty,jdbcType=DECIMAL},",
          "SUM_GIFT_QTY = #{sumGiftQty,jdbcType=DECIMAL},",
          "UOM = #{uom,jdbcType=NCHAR},",
          "UOM_WEIGHT = #{uomWeight,jdbcType=DECIMAL},",
          "WEIGHT = #{weight,jdbcType=DECIMAL},",
          "PACKAGE_METHOD = #{packageMethod,jdbcType=NCHAR},",
          "QTY_PERPACKAGE = #{qtyPerpackage,jdbcType=DECIMAL},",
          "PACKAGE_QTY = #{packageQty,jdbcType=DECIMAL},",
          "SPARE_QTY = #{spareQty,jdbcType=DECIMAL},",
          "DELI_ADDR_NO = #{deliAddrNo,jdbcType=DECIMAL},",
          "DELI_ADDR_DESC = #{deliAddrDesc,jdbcType=NCHAR},",
          "CONT_PERSON = #{contPerson,jdbcType=NCHAR},",
          "CONT_TEL = #{contTel,jdbcType=NCHAR},",
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
    int updateByPrimaryKey(TDelinoteProd record);
}