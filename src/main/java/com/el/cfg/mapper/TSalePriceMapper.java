package com.el.cfg.mapper;

import com.el.cfg.domain.TSalePrice;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.type.JdbcType;

public interface TSalePriceMapper {
    @Insert({
        "insert into T_SALE_PRICE (ID, OU_ID, ",
        "MCU_ID, ITEM_ID, OUTER_ID, ",
        "OUTER_ID2, OUTER_ID3, ",
        "CUST_GROUP, ADDR_NO, ",
        "PRICE, PRICE_UOM, CURR, ",
        "BEGIN_DATE, END_DATE, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{mcuId,jdbcType=DECIMAL}, #{itemId,jdbcType=DECIMAL}, #{outerId,jdbcType=DECIMAL}, ",
        "#{outerId2,jdbcType=NCHAR}, #{outerId3,jdbcType=NCHAR}, ",
        "#{custGroup,jdbcType=DECIMAL}, #{addrNo,jdbcType=DECIMAL}, ",
        "#{price,jdbcType=DECIMAL}, #{priceUom,jdbcType=NCHAR}, #{curr,jdbcType=NCHAR}, ",
        "#{beginDate,jdbcType=TIMESTAMP}, #{endDate,jdbcType=TIMESTAMP}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_SALE_PRICE.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TSalePrice record);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, ITEM_ID, OUTER_ID, OUTER_ID2, OUTER_ID3, CUST_GROUP, ADDR_NO, ",
        "PRICE, PRICE_UOM, CURR, BEGIN_DATE, END_DATE, LOCKER_ID, LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_SALE_PRICE"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEM_ID", property="itemId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OUTER_ID", property="outerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OUTER_ID2", property="outerId2", jdbcType=JdbcType.NCHAR),
        @Result(column="OUTER_ID3", property="outerId3", jdbcType=JdbcType.NCHAR),
        @Result(column="CUST_GROUP", property="custGroup", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_UOM", property="priceUom", jdbcType=JdbcType.NCHAR),
        @Result(column="CURR", property="curr", jdbcType=JdbcType.NCHAR),
        @Result(column="BEGIN_DATE", property="beginDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="END_DATE", property="endDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TSalePrice> selectAll();
}