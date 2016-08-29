package com.el.cfg.mapper;

import com.el.cfg.domain.TProcessPrice;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TProcessPriceMapper {
    @Delete({
        "delete from T_PROCESS_PRICE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_PROCESS_PRICE (ID, OU_ID, ",
        "ADDR_NO, PROCESS_ID, ",
        "PROCESS_CODE, PRICE_TYPE, ",
        "PARA1, PARA2, PARA3, ",
        "PARA4, PARA5, PRICE, ",
        "PRICE_UOM, STARTUP_AMT, ",
        "BREAKPOINT_QTY, QTY_MULTI, ",
        "DATE_FROM, DATE_TO, ",
        "CAPA_FLAG, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{addrNo,jdbcType=DECIMAL}, #{processId,jdbcType=DECIMAL}, ",
        "#{processCode,jdbcType=NCHAR}, #{priceType,jdbcType=NCHAR}, ",
        "#{para1,jdbcType=NCHAR}, #{para2,jdbcType=NCHAR}, #{para3,jdbcType=NCHAR}, ",
        "#{para4,jdbcType=NCHAR}, #{para5,jdbcType=NCHAR}, #{price,jdbcType=DECIMAL}, ",
        "#{priceUom,jdbcType=NCHAR}, #{startupAmt,jdbcType=DECIMAL}, ",
        "#{breakpointQty,jdbcType=DECIMAL}, #{qtyMulti,jdbcType=DECIMAL}, ",
        "#{dateFrom,jdbcType=TIMESTAMP}, #{dateTo,jdbcType=TIMESTAMP}, ",
        "#{capaFlag,jdbcType=DECIMAL}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_PROCESS_PRICE.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TProcessPrice record);

    @Select({
        "select",
        "ID, OU_ID, ADDR_NO, PROCESS_ID, PROCESS_CODE, PRICE_TYPE, PARA1, PARA2, PARA3, ",
        "PARA4, PARA5, PRICE, PRICE_UOM, STARTUP_AMT, BREAKPOINT_QTY, QTY_MULTI, DATE_FROM, ",
        "DATE_TO, CAPA_FLAG, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_PROCESS_PRICE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_ID", property="processId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_CODE", property="processCode", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_TYPE", property="priceType", jdbcType=JdbcType.NCHAR),
        @Result(column="PARA1", property="para1", jdbcType=JdbcType.NCHAR),
        @Result(column="PARA2", property="para2", jdbcType=JdbcType.NCHAR),
        @Result(column="PARA3", property="para3", jdbcType=JdbcType.NCHAR),
        @Result(column="PARA4", property="para4", jdbcType=JdbcType.NCHAR),
        @Result(column="PARA5", property="para5", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_UOM", property="priceUom", jdbcType=JdbcType.NCHAR),
        @Result(column="STARTUP_AMT", property="startupAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="BREAKPOINT_QTY", property="breakpointQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="QTY_MULTI", property="qtyMulti", jdbcType=JdbcType.DECIMAL),
        @Result(column="DATE_FROM", property="dateFrom", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DATE_TO", property="dateTo", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CAPA_FLAG", property="capaFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TProcessPrice selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, ADDR_NO, PROCESS_ID, PROCESS_CODE, PRICE_TYPE, PARA1, PARA2, PARA3, ",
        "PARA4, PARA5, PRICE, PRICE_UOM, STARTUP_AMT, BREAKPOINT_QTY, QTY_MULTI, DATE_FROM, ",
        "DATE_TO, CAPA_FLAG, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_PROCESS_PRICE"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_ID", property="processId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_CODE", property="processCode", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_TYPE", property="priceType", jdbcType=JdbcType.NCHAR),
        @Result(column="PARA1", property="para1", jdbcType=JdbcType.NCHAR),
        @Result(column="PARA2", property="para2", jdbcType=JdbcType.NCHAR),
        @Result(column="PARA3", property="para3", jdbcType=JdbcType.NCHAR),
        @Result(column="PARA4", property="para4", jdbcType=JdbcType.NCHAR),
        @Result(column="PARA5", property="para5", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_UOM", property="priceUom", jdbcType=JdbcType.NCHAR),
        @Result(column="STARTUP_AMT", property="startupAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="BREAKPOINT_QTY", property="breakpointQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="QTY_MULTI", property="qtyMulti", jdbcType=JdbcType.DECIMAL),
        @Result(column="DATE_FROM", property="dateFrom", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DATE_TO", property="dateTo", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CAPA_FLAG", property="capaFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TProcessPrice> selectAll();

    @Update({
        "update T_PROCESS_PRICE",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "ADDR_NO = #{addrNo,jdbcType=DECIMAL},",
          "PROCESS_ID = #{processId,jdbcType=DECIMAL},",
          "PROCESS_CODE = #{processCode,jdbcType=NCHAR},",
          "PRICE_TYPE = #{priceType,jdbcType=NCHAR},",
          "PARA1 = #{para1,jdbcType=NCHAR},",
          "PARA2 = #{para2,jdbcType=NCHAR},",
          "PARA3 = #{para3,jdbcType=NCHAR},",
          "PARA4 = #{para4,jdbcType=NCHAR},",
          "PARA5 = #{para5,jdbcType=NCHAR},",
          "PRICE = #{price,jdbcType=DECIMAL},",
          "PRICE_UOM = #{priceUom,jdbcType=NCHAR},",
          "STARTUP_AMT = #{startupAmt,jdbcType=DECIMAL},",
          "BREAKPOINT_QTY = #{breakpointQty,jdbcType=DECIMAL},",
          "QTY_MULTI = #{qtyMulti,jdbcType=DECIMAL},",
          "DATE_FROM = #{dateFrom,jdbcType=TIMESTAMP},",
          "DATE_TO = #{dateTo,jdbcType=TIMESTAMP},",
          "CAPA_FLAG = #{capaFlag,jdbcType=DECIMAL},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TProcessPrice record);
}