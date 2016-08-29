package com.el.cfg.mapper;

import com.el.cfg.domain.TTaxRate;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TTaxRateMapper {
    @Delete({
        "delete from T_TAX_RATE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_TAX_RATE (ID, OU_ID, ",
        "MCU_ID, TAX_AREA, AREA_DESC, ",
        "TAX_AUTH1, TAX_RATE1, ",
        "TAX_AUTH2, TAX_RATE2, ",
        "TAX_AUTH3, TAX_RATE3, ",
        "TAX_AUTH4, TAX_RATE4, ",
        "TAX_AUTH5, TAX_RATE5, ",
        "ITEM_ID, ITEM_CODE, ",
        "ITEM_CODE2, ITEM_CODE3, ",
        "UOM, LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{mcuId,jdbcType=DECIMAL}, #{taxArea,jdbcType=NCHAR}, #{areaDesc,jdbcType=NCHAR}, ",
        "#{taxAuth1,jdbcType=DECIMAL}, #{taxRate1,jdbcType=DECIMAL}, ",
        "#{taxAuth2,jdbcType=DECIMAL}, #{taxRate2,jdbcType=DECIMAL}, ",
        "#{taxAuth3,jdbcType=DECIMAL}, #{taxRate3,jdbcType=DECIMAL}, ",
        "#{taxAuth4,jdbcType=DECIMAL}, #{taxRate4,jdbcType=DECIMAL}, ",
        "#{taxAuth5,jdbcType=DECIMAL}, #{taxRate5,jdbcType=DECIMAL}, ",
        "#{itemId,jdbcType=DECIMAL}, #{itemCode,jdbcType=DECIMAL}, ",
        "#{itemCode2,jdbcType=NCHAR}, #{itemCode3,jdbcType=NCHAR}, ",
        "#{uom,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_TAX_RATE.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TTaxRate record);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, TAX_AREA, AREA_DESC, TAX_AUTH1, TAX_RATE1, TAX_AUTH2, TAX_RATE2, ",
        "TAX_AUTH3, TAX_RATE3, TAX_AUTH4, TAX_RATE4, TAX_AUTH5, TAX_RATE5, ITEM_ID, ITEM_CODE, ",
        "ITEM_CODE2, ITEM_CODE3, UOM, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_TAX_RATE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_AREA", property="taxArea", jdbcType=JdbcType.NCHAR),
        @Result(column="AREA_DESC", property="areaDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="TAX_AUTH1", property="taxAuth1", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_RATE1", property="taxRate1", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_AUTH2", property="taxAuth2", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_RATE2", property="taxRate2", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_AUTH3", property="taxAuth3", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_RATE3", property="taxRate3", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_AUTH4", property="taxAuth4", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_RATE4", property="taxRate4", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_AUTH5", property="taxAuth5", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_RATE5", property="taxRate5", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEM_ID", property="itemId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEM_CODE", property="itemCode", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEM_CODE2", property="itemCode2", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_CODE3", property="itemCode3", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TTaxRate selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, TAX_AREA, AREA_DESC, TAX_AUTH1, TAX_RATE1, TAX_AUTH2, TAX_RATE2, ",
        "TAX_AUTH3, TAX_RATE3, TAX_AUTH4, TAX_RATE4, TAX_AUTH5, TAX_RATE5, ITEM_ID, ITEM_CODE, ",
        "ITEM_CODE2, ITEM_CODE3, UOM, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_TAX_RATE"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_AREA", property="taxArea", jdbcType=JdbcType.NCHAR),
        @Result(column="AREA_DESC", property="areaDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="TAX_AUTH1", property="taxAuth1", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_RATE1", property="taxRate1", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_AUTH2", property="taxAuth2", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_RATE2", property="taxRate2", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_AUTH3", property="taxAuth3", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_RATE3", property="taxRate3", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_AUTH4", property="taxAuth4", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_RATE4", property="taxRate4", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_AUTH5", property="taxAuth5", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_RATE5", property="taxRate5", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEM_ID", property="itemId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEM_CODE", property="itemCode", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEM_CODE2", property="itemCode2", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_CODE3", property="itemCode3", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TTaxRate> selectAll();

    @Update({
        "update T_TAX_RATE",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "MCU_ID = #{mcuId,jdbcType=DECIMAL},",
          "TAX_AREA = #{taxArea,jdbcType=NCHAR},",
          "AREA_DESC = #{areaDesc,jdbcType=NCHAR},",
          "TAX_AUTH1 = #{taxAuth1,jdbcType=DECIMAL},",
          "TAX_RATE1 = #{taxRate1,jdbcType=DECIMAL},",
          "TAX_AUTH2 = #{taxAuth2,jdbcType=DECIMAL},",
          "TAX_RATE2 = #{taxRate2,jdbcType=DECIMAL},",
          "TAX_AUTH3 = #{taxAuth3,jdbcType=DECIMAL},",
          "TAX_RATE3 = #{taxRate3,jdbcType=DECIMAL},",
          "TAX_AUTH4 = #{taxAuth4,jdbcType=DECIMAL},",
          "TAX_RATE4 = #{taxRate4,jdbcType=DECIMAL},",
          "TAX_AUTH5 = #{taxAuth5,jdbcType=DECIMAL},",
          "TAX_RATE5 = #{taxRate5,jdbcType=DECIMAL},",
          "ITEM_ID = #{itemId,jdbcType=DECIMAL},",
          "ITEM_CODE = #{itemCode,jdbcType=DECIMAL},",
          "ITEM_CODE2 = #{itemCode2,jdbcType=NCHAR},",
          "ITEM_CODE3 = #{itemCode3,jdbcType=NCHAR},",
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
    int updateByPrimaryKey(TTaxRate record);
}