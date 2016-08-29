package com.el.cfg.mapper;

import com.el.cfg.domain.TCustSettle;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TCustSettleMapper {
    @Delete({
        "delete from T_CUST_SETTLE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_CUST_SETTLE (ID, OU_ID, ",
        "CUST_ID, DOC_NO, SETTLE_DATE, ",
        "DOC_STATUS, SO_ID, SO_PROD_ID, ",
        "PROD_ID, LINE_NO, ",
        "UOM, PRICE, SO_QTY, ",
        "SO_AMT, SETTLE_QTY, ",
        "SETTLE_AMT, ACCOUNT_DATE, ",
        "ACCOUNT_AMT, ACCOUNT_FLAG, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{custId,jdbcType=DECIMAL}, #{docNo,jdbcType=NCHAR}, #{settleDate,jdbcType=TIMESTAMP}, ",
        "#{docStatus,jdbcType=NCHAR}, #{soId,jdbcType=DECIMAL}, #{soProdId,jdbcType=DECIMAL}, ",
        "#{prodId,jdbcType=DECIMAL}, #{lineNo,jdbcType=DECIMAL}, ",
        "#{uom,jdbcType=NCHAR}, #{price,jdbcType=DECIMAL}, #{soQty,jdbcType=DECIMAL}, ",
        "#{soAmt,jdbcType=DECIMAL}, #{settleQty,jdbcType=DECIMAL}, ",
        "#{settleAmt,jdbcType=DECIMAL}, #{accountDate,jdbcType=TIMESTAMP}, ",
        "#{accountAmt,jdbcType=DECIMAL}, #{accountFlag,jdbcType=NCHAR}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_CUST_SETTLE.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TCustSettle record);

    @Select({
        "select",
        "ID, OU_ID, CUST_ID, DOC_NO, SETTLE_DATE, DOC_STATUS, SO_ID, SO_PROD_ID, PROD_ID, ",
        "LINE_NO, UOM, PRICE, SO_QTY, SO_AMT, SETTLE_QTY, SETTLE_AMT, ACCOUNT_DATE, ACCOUNT_AMT, ",
        "ACCOUNT_FLAG, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION",
        "from T_CUST_SETTLE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUST_ID", property="custId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.NCHAR),
        @Result(column="SETTLE_DATE", property="settleDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DOC_STATUS", property="docStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_PROD_ID", property="soProdId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_QTY", property="soQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_AMT", property="soAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SETTLE_QTY", property="settleQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="SETTLE_AMT", property="settleAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ACCOUNT_DATE", property="accountDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACCOUNT_AMT", property="accountAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ACCOUNT_FLAG", property="accountFlag", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TCustSettle selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, CUST_ID, DOC_NO, SETTLE_DATE, DOC_STATUS, SO_ID, SO_PROD_ID, PROD_ID, ",
        "LINE_NO, UOM, PRICE, SO_QTY, SO_AMT, SETTLE_QTY, SETTLE_AMT, ACCOUNT_DATE, ACCOUNT_AMT, ",
        "ACCOUNT_FLAG, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION",
        "from T_CUST_SETTLE"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUST_ID", property="custId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.NCHAR),
        @Result(column="SETTLE_DATE", property="settleDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DOC_STATUS", property="docStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_PROD_ID", property="soProdId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_QTY", property="soQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_AMT", property="soAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SETTLE_QTY", property="settleQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="SETTLE_AMT", property="settleAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ACCOUNT_DATE", property="accountDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACCOUNT_AMT", property="accountAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ACCOUNT_FLAG", property="accountFlag", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TCustSettle> selectAll();

    @Update({
        "update T_CUST_SETTLE",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "CUST_ID = #{custId,jdbcType=DECIMAL},",
          "DOC_NO = #{docNo,jdbcType=NCHAR},",
          "SETTLE_DATE = #{settleDate,jdbcType=TIMESTAMP},",
          "DOC_STATUS = #{docStatus,jdbcType=NCHAR},",
          "SO_ID = #{soId,jdbcType=DECIMAL},",
          "SO_PROD_ID = #{soProdId,jdbcType=DECIMAL},",
          "PROD_ID = #{prodId,jdbcType=DECIMAL},",
          "LINE_NO = #{lineNo,jdbcType=DECIMAL},",
          "UOM = #{uom,jdbcType=NCHAR},",
          "PRICE = #{price,jdbcType=DECIMAL},",
          "SO_QTY = #{soQty,jdbcType=DECIMAL},",
          "SO_AMT = #{soAmt,jdbcType=DECIMAL},",
          "SETTLE_QTY = #{settleQty,jdbcType=DECIMAL},",
          "SETTLE_AMT = #{settleAmt,jdbcType=DECIMAL},",
          "ACCOUNT_DATE = #{accountDate,jdbcType=TIMESTAMP},",
          "ACCOUNT_AMT = #{accountAmt,jdbcType=DECIMAL},",
          "ACCOUNT_FLAG = #{accountFlag,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TCustSettle record);
}