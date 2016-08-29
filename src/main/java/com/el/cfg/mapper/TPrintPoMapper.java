package com.el.cfg.mapper;

import com.el.cfg.domain.TPrintPo;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TPrintPoMapper {
    @Delete({
        "delete from T_PRINT_PO",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_PRINT_PO (ID, OU_ID, ",
        "FACT_ID, SO_ID, SO_NO, ",
        "SO_MANU_ID, SUPP_CODE, ",
        "SUPP_NAME, PO_NO, LINE_NO, ",
        "PROD_CODE, PROD_NAME, ",
        "QTY, UOM, PRICE, ",
        "AMT, PO_DATE, WHIN_QTY, ",
        "WHIN_PRICE, WHIN_AMT, ",
        "INV_AMT, NOINV_AMT, ",
        "PAY_AMT, NOPAY_AMT, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{factId,jdbcType=DECIMAL}, #{soId,jdbcType=DECIMAL}, #{soNo,jdbcType=NCHAR}, ",
        "#{soManuId,jdbcType=DECIMAL}, #{suppCode,jdbcType=NCHAR}, ",
        "#{suppName,jdbcType=NCHAR}, #{poNo,jdbcType=NCHAR}, #{lineNo,jdbcType=DECIMAL}, ",
        "#{prodCode,jdbcType=NCHAR}, #{prodName,jdbcType=NCHAR}, ",
        "#{qty,jdbcType=DECIMAL}, #{uom,jdbcType=NCHAR}, #{price,jdbcType=DECIMAL}, ",
        "#{amt,jdbcType=DECIMAL}, #{poDate,jdbcType=TIMESTAMP}, #{whinQty,jdbcType=DECIMAL}, ",
        "#{whinPrice,jdbcType=DECIMAL}, #{whinAmt,jdbcType=DECIMAL}, ",
        "#{invAmt,jdbcType=DECIMAL}, #{noinvAmt,jdbcType=DECIMAL}, ",
        "#{payAmt,jdbcType=DECIMAL}, #{nopayAmt,jdbcType=DECIMAL}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_PRINT_PO.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TPrintPo record);

    @Select({
        "select",
        "ID, OU_ID, FACT_ID, SO_ID, SO_NO, SO_MANU_ID, SUPP_CODE, SUPP_NAME, PO_NO, LINE_NO, ",
        "PROD_CODE, PROD_NAME, QTY, UOM, PRICE, AMT, PO_DATE, WHIN_QTY, WHIN_PRICE, WHIN_AMT, ",
        "INV_AMT, NOINV_AMT, PAY_AMT, NOPAY_AMT, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PRINT_PO",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_NO", property="soNo", jdbcType=JdbcType.NCHAR),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SUPP_CODE", property="suppCode", jdbcType=JdbcType.NCHAR),
        @Result(column="SUPP_NAME", property="suppName", jdbcType=JdbcType.NCHAR),
        @Result(column="PO_NO", property="poNo", jdbcType=JdbcType.NCHAR),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_CODE", property="prodCode", jdbcType=JdbcType.NCHAR),
        @Result(column="PROD_NAME", property="prodName", jdbcType=JdbcType.NCHAR),
        @Result(column="QTY", property="qty", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="AMT", property="amt", jdbcType=JdbcType.DECIMAL),
        @Result(column="PO_DATE", property="poDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="WHIN_QTY", property="whinQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="WHIN_PRICE", property="whinPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="WHIN_AMT", property="whinAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="INV_AMT", property="invAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="NOINV_AMT", property="noinvAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAY_AMT", property="payAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="NOPAY_AMT", property="nopayAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TPrintPo selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, FACT_ID, SO_ID, SO_NO, SO_MANU_ID, SUPP_CODE, SUPP_NAME, PO_NO, LINE_NO, ",
        "PROD_CODE, PROD_NAME, QTY, UOM, PRICE, AMT, PO_DATE, WHIN_QTY, WHIN_PRICE, WHIN_AMT, ",
        "INV_AMT, NOINV_AMT, PAY_AMT, NOPAY_AMT, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PRINT_PO"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_NO", property="soNo", jdbcType=JdbcType.NCHAR),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SUPP_CODE", property="suppCode", jdbcType=JdbcType.NCHAR),
        @Result(column="SUPP_NAME", property="suppName", jdbcType=JdbcType.NCHAR),
        @Result(column="PO_NO", property="poNo", jdbcType=JdbcType.NCHAR),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_CODE", property="prodCode", jdbcType=JdbcType.NCHAR),
        @Result(column="PROD_NAME", property="prodName", jdbcType=JdbcType.NCHAR),
        @Result(column="QTY", property="qty", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="AMT", property="amt", jdbcType=JdbcType.DECIMAL),
        @Result(column="PO_DATE", property="poDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="WHIN_QTY", property="whinQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="WHIN_PRICE", property="whinPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="WHIN_AMT", property="whinAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="INV_AMT", property="invAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="NOINV_AMT", property="noinvAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAY_AMT", property="payAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="NOPAY_AMT", property="nopayAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TPrintPo> selectAll();

    @Update({
        "update T_PRINT_PO",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "FACT_ID = #{factId,jdbcType=DECIMAL},",
          "SO_ID = #{soId,jdbcType=DECIMAL},",
          "SO_NO = #{soNo,jdbcType=NCHAR},",
          "SO_MANU_ID = #{soManuId,jdbcType=DECIMAL},",
          "SUPP_CODE = #{suppCode,jdbcType=NCHAR},",
          "SUPP_NAME = #{suppName,jdbcType=NCHAR},",
          "PO_NO = #{poNo,jdbcType=NCHAR},",
          "LINE_NO = #{lineNo,jdbcType=DECIMAL},",
          "PROD_CODE = #{prodCode,jdbcType=NCHAR},",
          "PROD_NAME = #{prodName,jdbcType=NCHAR},",
          "QTY = #{qty,jdbcType=DECIMAL},",
          "UOM = #{uom,jdbcType=NCHAR},",
          "PRICE = #{price,jdbcType=DECIMAL},",
          "AMT = #{amt,jdbcType=DECIMAL},",
          "PO_DATE = #{poDate,jdbcType=TIMESTAMP},",
          "WHIN_QTY = #{whinQty,jdbcType=DECIMAL},",
          "WHIN_PRICE = #{whinPrice,jdbcType=DECIMAL},",
          "WHIN_AMT = #{whinAmt,jdbcType=DECIMAL},",
          "INV_AMT = #{invAmt,jdbcType=DECIMAL},",
          "NOINV_AMT = #{noinvAmt,jdbcType=DECIMAL},",
          "PAY_AMT = #{payAmt,jdbcType=DECIMAL},",
          "NOPAY_AMT = #{nopayAmt,jdbcType=DECIMAL},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TPrintPo record);
}