package com.el.cfg.mapper;

import com.el.cfg.domain.TQuotePaper;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TQuotePaperMapper {
    @Delete({
        "delete from T_QUOTE_PAPER",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_QUOTE_PAPER (ID, QUOTE_ID, ",
        "LINE_NO, PAPER_ITEM_ID, ",
        "PAPER_TYPE, ROUTE_ID, ",
        "PROCESS_ID, PROD_ID, ",
        "PROD_PART_ID, ITEM_QTY, ",
        "ITEM_UOM, HOME_CURR_CODE, ",
        "FORE_CURR_CODE, CURR_RATE, ",
        "CALC_PRICE, CURR_CALC_PRICE, ",
        "QUOTE_PRICE, CURR_QUOTE_PRICE, ",
        "CALC_AMT, CURR_CALC_AMT, ",
        "QUOTE_AMT, CURR_QUOTE_AMT, ",
        "PRICE_TYPE, PRICE_CONFIRM_DESC, ",
        "REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{quoteId,jdbcType=DECIMAL}, ",
        "#{lineNo,jdbcType=DECIMAL}, #{paperItemId,jdbcType=DECIMAL}, ",
        "#{paperType,jdbcType=DECIMAL}, #{routeId,jdbcType=DECIMAL}, ",
        "#{processId,jdbcType=DECIMAL}, #{prodId,jdbcType=DECIMAL}, ",
        "#{prodPartId,jdbcType=DECIMAL}, #{itemQty,jdbcType=DECIMAL}, ",
        "#{itemUom,jdbcType=NCHAR}, #{homeCurrCode,jdbcType=NCHAR}, ",
        "#{foreCurrCode,jdbcType=NCHAR}, #{currRate,jdbcType=DECIMAL}, ",
        "#{calcPrice,jdbcType=DECIMAL}, #{currCalcPrice,jdbcType=DECIMAL}, ",
        "#{quotePrice,jdbcType=DECIMAL}, #{currQuotePrice,jdbcType=DECIMAL}, ",
        "#{calcAmt,jdbcType=DECIMAL}, #{currCalcAmt,jdbcType=DECIMAL}, ",
        "#{quoteAmt,jdbcType=DECIMAL}, #{currQuoteAmt,jdbcType=DECIMAL}, ",
        "#{priceType,jdbcType=NCHAR}, #{priceConfirmDesc,jdbcType=NCHAR}, ",
        "#{remark,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_QUOTE_PAPER.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TQuotePaper record);

    @Select({
        "select",
        "ID, QUOTE_ID, LINE_NO, PAPER_ITEM_ID, PAPER_TYPE, ROUTE_ID, PROCESS_ID, PROD_ID, ",
        "PROD_PART_ID, ITEM_QTY, ITEM_UOM, HOME_CURR_CODE, FORE_CURR_CODE, CURR_RATE, ",
        "CALC_PRICE, CURR_CALC_PRICE, QUOTE_PRICE, CURR_QUOTE_PRICE, CALC_AMT, CURR_CALC_AMT, ",
        "QUOTE_AMT, CURR_QUOTE_AMT, PRICE_TYPE, PRICE_CONFIRM_DESC, REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_QUOTE_PAPER",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QUOTE_ID", property="quoteId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_ITEM_ID", property="paperItemId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_TYPE", property="paperType", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROUTE_ID", property="routeId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_ID", property="processId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_PART_ID", property="prodPartId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEM_QTY", property="itemQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEM_UOM", property="itemUom", jdbcType=JdbcType.NCHAR),
        @Result(column="HOME_CURR_CODE", property="homeCurrCode", jdbcType=JdbcType.NCHAR),
        @Result(column="FORE_CURR_CODE", property="foreCurrCode", jdbcType=JdbcType.NCHAR),
        @Result(column="CURR_RATE", property="currRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="CALC_PRICE", property="calcPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_CALC_PRICE", property="currCalcPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="QUOTE_PRICE", property="quotePrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_QUOTE_PRICE", property="currQuotePrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CALC_AMT", property="calcAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_CALC_AMT", property="currCalcAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="QUOTE_AMT", property="quoteAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_QUOTE_AMT", property="currQuoteAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_TYPE", property="priceType", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_CONFIRM_DESC", property="priceConfirmDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TQuotePaper selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, QUOTE_ID, LINE_NO, PAPER_ITEM_ID, PAPER_TYPE, ROUTE_ID, PROCESS_ID, PROD_ID, ",
        "PROD_PART_ID, ITEM_QTY, ITEM_UOM, HOME_CURR_CODE, FORE_CURR_CODE, CURR_RATE, ",
        "CALC_PRICE, CURR_CALC_PRICE, QUOTE_PRICE, CURR_QUOTE_PRICE, CALC_AMT, CURR_CALC_AMT, ",
        "QUOTE_AMT, CURR_QUOTE_AMT, PRICE_TYPE, PRICE_CONFIRM_DESC, REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_QUOTE_PAPER"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QUOTE_ID", property="quoteId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_ITEM_ID", property="paperItemId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_TYPE", property="paperType", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROUTE_ID", property="routeId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_ID", property="processId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_PART_ID", property="prodPartId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEM_QTY", property="itemQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEM_UOM", property="itemUom", jdbcType=JdbcType.NCHAR),
        @Result(column="HOME_CURR_CODE", property="homeCurrCode", jdbcType=JdbcType.NCHAR),
        @Result(column="FORE_CURR_CODE", property="foreCurrCode", jdbcType=JdbcType.NCHAR),
        @Result(column="CURR_RATE", property="currRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="CALC_PRICE", property="calcPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_CALC_PRICE", property="currCalcPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="QUOTE_PRICE", property="quotePrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_QUOTE_PRICE", property="currQuotePrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CALC_AMT", property="calcAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_CALC_AMT", property="currCalcAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="QUOTE_AMT", property="quoteAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_QUOTE_AMT", property="currQuoteAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_TYPE", property="priceType", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_CONFIRM_DESC", property="priceConfirmDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TQuotePaper> selectAll();

    @Update({
        "update T_QUOTE_PAPER",
        "set QUOTE_ID = #{quoteId,jdbcType=DECIMAL},",
          "LINE_NO = #{lineNo,jdbcType=DECIMAL},",
          "PAPER_ITEM_ID = #{paperItemId,jdbcType=DECIMAL},",
          "PAPER_TYPE = #{paperType,jdbcType=DECIMAL},",
          "ROUTE_ID = #{routeId,jdbcType=DECIMAL},",
          "PROCESS_ID = #{processId,jdbcType=DECIMAL},",
          "PROD_ID = #{prodId,jdbcType=DECIMAL},",
          "PROD_PART_ID = #{prodPartId,jdbcType=DECIMAL},",
          "ITEM_QTY = #{itemQty,jdbcType=DECIMAL},",
          "ITEM_UOM = #{itemUom,jdbcType=NCHAR},",
          "HOME_CURR_CODE = #{homeCurrCode,jdbcType=NCHAR},",
          "FORE_CURR_CODE = #{foreCurrCode,jdbcType=NCHAR},",
          "CURR_RATE = #{currRate,jdbcType=DECIMAL},",
          "CALC_PRICE = #{calcPrice,jdbcType=DECIMAL},",
          "CURR_CALC_PRICE = #{currCalcPrice,jdbcType=DECIMAL},",
          "QUOTE_PRICE = #{quotePrice,jdbcType=DECIMAL},",
          "CURR_QUOTE_PRICE = #{currQuotePrice,jdbcType=DECIMAL},",
          "CALC_AMT = #{calcAmt,jdbcType=DECIMAL},",
          "CURR_CALC_AMT = #{currCalcAmt,jdbcType=DECIMAL},",
          "QUOTE_AMT = #{quoteAmt,jdbcType=DECIMAL},",
          "CURR_QUOTE_AMT = #{currQuoteAmt,jdbcType=DECIMAL},",
          "PRICE_TYPE = #{priceType,jdbcType=NCHAR},",
          "PRICE_CONFIRM_DESC = #{priceConfirmDesc,jdbcType=NCHAR},",
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
    int updateByPrimaryKey(TQuotePaper record);
}