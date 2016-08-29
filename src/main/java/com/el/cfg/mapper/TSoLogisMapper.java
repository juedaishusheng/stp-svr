package com.el.cfg.mapper;

import com.el.cfg.domain.TSoLogis;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TSoLogisMapper {
    @Delete({
        "delete from T_SO_LOGIS",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_SO_LOGIS (ID, T_SO_PROD_ID, ",
        "LINE_NO, TRANS_TYPE, ",
        "FROM_ADDRESS_DESC, TO_ADDRESS_DESC, ",
        "TRANS_QTY, TRANS_WEIGHT, ",
        "TRANS_VOLUMN, DISTANCE_DESC, ",
        "TRANS_CAPACITY, QUOTE_UOM, ",
        "QUOTE_QTY, HOME_CURR_CODE, ",
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
        "values (#{id,jdbcType=DECIMAL}, #{tSoProdId,jdbcType=DECIMAL}, ",
        "#{lineNo,jdbcType=DECIMAL}, #{transType,jdbcType=NCHAR}, ",
        "#{fromAddressDesc,jdbcType=NCHAR}, #{toAddressDesc,jdbcType=NCHAR}, ",
        "#{transQty,jdbcType=DECIMAL}, #{transWeight,jdbcType=DECIMAL}, ",
        "#{transVolumn,jdbcType=DECIMAL}, #{distanceDesc,jdbcType=NCHAR}, ",
        "#{transCapacity,jdbcType=DECIMAL}, #{quoteUom,jdbcType=NCHAR}, ",
        "#{quoteQty,jdbcType=DECIMAL}, #{homeCurrCode,jdbcType=NCHAR}, ",
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
    @SelectKey(statement="SELECT SEQ_T_SO_LOGIS.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TSoLogis record);

    @Select({
        "select",
        "ID, T_SO_PROD_ID, LINE_NO, TRANS_TYPE, FROM_ADDRESS_DESC, TO_ADDRESS_DESC, TRANS_QTY, ",
        "TRANS_WEIGHT, TRANS_VOLUMN, DISTANCE_DESC, TRANS_CAPACITY, QUOTE_UOM, QUOTE_QTY, ",
        "HOME_CURR_CODE, FORE_CURR_CODE, CURR_RATE, CALC_PRICE, CURR_CALC_PRICE, QUOTE_PRICE, ",
        "CURR_QUOTE_PRICE, CALC_AMT, CURR_CALC_AMT, QUOTE_AMT, CURR_QUOTE_AMT, PRICE_TYPE, ",
        "PRICE_CONFIRM_DESC, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_SO_LOGIS",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="T_SO_PROD_ID", property="tSoProdId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="TRANS_TYPE", property="transType", jdbcType=JdbcType.NCHAR),
        @Result(column="FROM_ADDRESS_DESC", property="fromAddressDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="TO_ADDRESS_DESC", property="toAddressDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="TRANS_QTY", property="transQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="TRANS_WEIGHT", property="transWeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="TRANS_VOLUMN", property="transVolumn", jdbcType=JdbcType.DECIMAL),
        @Result(column="DISTANCE_DESC", property="distanceDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="TRANS_CAPACITY", property="transCapacity", jdbcType=JdbcType.DECIMAL),
        @Result(column="QUOTE_UOM", property="quoteUom", jdbcType=JdbcType.NCHAR),
        @Result(column="QUOTE_QTY", property="quoteQty", jdbcType=JdbcType.DECIMAL),
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
    TSoLogis selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, T_SO_PROD_ID, LINE_NO, TRANS_TYPE, FROM_ADDRESS_DESC, TO_ADDRESS_DESC, TRANS_QTY, ",
        "TRANS_WEIGHT, TRANS_VOLUMN, DISTANCE_DESC, TRANS_CAPACITY, QUOTE_UOM, QUOTE_QTY, ",
        "HOME_CURR_CODE, FORE_CURR_CODE, CURR_RATE, CALC_PRICE, CURR_CALC_PRICE, QUOTE_PRICE, ",
        "CURR_QUOTE_PRICE, CALC_AMT, CURR_CALC_AMT, QUOTE_AMT, CURR_QUOTE_AMT, PRICE_TYPE, ",
        "PRICE_CONFIRM_DESC, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_SO_LOGIS"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="T_SO_PROD_ID", property="tSoProdId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="TRANS_TYPE", property="transType", jdbcType=JdbcType.NCHAR),
        @Result(column="FROM_ADDRESS_DESC", property="fromAddressDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="TO_ADDRESS_DESC", property="toAddressDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="TRANS_QTY", property="transQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="TRANS_WEIGHT", property="transWeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="TRANS_VOLUMN", property="transVolumn", jdbcType=JdbcType.DECIMAL),
        @Result(column="DISTANCE_DESC", property="distanceDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="TRANS_CAPACITY", property="transCapacity", jdbcType=JdbcType.DECIMAL),
        @Result(column="QUOTE_UOM", property="quoteUom", jdbcType=JdbcType.NCHAR),
        @Result(column="QUOTE_QTY", property="quoteQty", jdbcType=JdbcType.DECIMAL),
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
    List<TSoLogis> selectAll();

    @Update({
        "update T_SO_LOGIS",
        "set T_SO_PROD_ID = #{tSoProdId,jdbcType=DECIMAL},",
          "LINE_NO = #{lineNo,jdbcType=DECIMAL},",
          "TRANS_TYPE = #{transType,jdbcType=NCHAR},",
          "FROM_ADDRESS_DESC = #{fromAddressDesc,jdbcType=NCHAR},",
          "TO_ADDRESS_DESC = #{toAddressDesc,jdbcType=NCHAR},",
          "TRANS_QTY = #{transQty,jdbcType=DECIMAL},",
          "TRANS_WEIGHT = #{transWeight,jdbcType=DECIMAL},",
          "TRANS_VOLUMN = #{transVolumn,jdbcType=DECIMAL},",
          "DISTANCE_DESC = #{distanceDesc,jdbcType=NCHAR},",
          "TRANS_CAPACITY = #{transCapacity,jdbcType=DECIMAL},",
          "QUOTE_UOM = #{quoteUom,jdbcType=NCHAR},",
          "QUOTE_QTY = #{quoteQty,jdbcType=DECIMAL},",
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
    int updateByPrimaryKey(TSoLogis record);
}