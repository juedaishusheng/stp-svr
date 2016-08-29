package com.el.cfg.mapper;

import com.el.cfg.domain.TCustsettleInv;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TCustsettleInvMapper {
    @Delete({
        "delete from T_CUSTSETTLE_INV",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_CUSTSETTLE_INV (ID, OU_ID, ",
        "SETTLE_ID, LINE_NO, ",
        "INV_NO, GT_INV_NO, INV_AMT, ",
        "NET_AMT, TAX_AMT, ",
        "OPEN_AMT, DUE_DATE, ",
        "HOME_CURR, CURR_AMT, ",
        "CURR_OPEN_AMT, SO_NO, ",
        "PROD_CODE, INV_DATE, ",
        "CUST_ID, OVERDUE_AMT, ",
        "OVERDUE_DAYS, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{settleId,jdbcType=DECIMAL}, #{lineNo,jdbcType=DECIMAL}, ",
        "#{invNo,jdbcType=NCHAR}, #{gtInvNo,jdbcType=NCHAR}, #{invAmt,jdbcType=DECIMAL}, ",
        "#{netAmt,jdbcType=DECIMAL}, #{taxAmt,jdbcType=DECIMAL}, ",
        "#{openAmt,jdbcType=DECIMAL}, #{dueDate,jdbcType=TIMESTAMP}, ",
        "#{homeCurr,jdbcType=NCHAR}, #{currAmt,jdbcType=DECIMAL}, ",
        "#{currOpenAmt,jdbcType=DECIMAL}, #{soNo,jdbcType=NCHAR}, ",
        "#{prodCode,jdbcType=NCHAR}, #{invDate,jdbcType=TIMESTAMP}, ",
        "#{custId,jdbcType=DECIMAL}, #{overdueAmt,jdbcType=DECIMAL}, ",
        "#{overdueDays,jdbcType=DECIMAL}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_CUSTSETTLE_INV.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TCustsettleInv record);

    @Select({
        "select",
        "ID, OU_ID, SETTLE_ID, LINE_NO, INV_NO, GT_INV_NO, INV_AMT, NET_AMT, TAX_AMT, ",
        "OPEN_AMT, DUE_DATE, HOME_CURR, CURR_AMT, CURR_OPEN_AMT, SO_NO, PROD_CODE, INV_DATE, ",
        "CUST_ID, OVERDUE_AMT, OVERDUE_DAYS, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_CUSTSETTLE_INV",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SETTLE_ID", property="settleId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="INV_NO", property="invNo", jdbcType=JdbcType.NCHAR),
        @Result(column="GT_INV_NO", property="gtInvNo", jdbcType=JdbcType.NCHAR),
        @Result(column="INV_AMT", property="invAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="NET_AMT", property="netAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_AMT", property="taxAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="OPEN_AMT", property="openAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="DUE_DATE", property="dueDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="HOME_CURR", property="homeCurr", jdbcType=JdbcType.NCHAR),
        @Result(column="CURR_AMT", property="currAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_OPEN_AMT", property="currOpenAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_NO", property="soNo", jdbcType=JdbcType.NCHAR),
        @Result(column="PROD_CODE", property="prodCode", jdbcType=JdbcType.NCHAR),
        @Result(column="INV_DATE", property="invDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CUST_ID", property="custId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OVERDUE_AMT", property="overdueAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="OVERDUE_DAYS", property="overdueDays", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TCustsettleInv selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, SETTLE_ID, LINE_NO, INV_NO, GT_INV_NO, INV_AMT, NET_AMT, TAX_AMT, ",
        "OPEN_AMT, DUE_DATE, HOME_CURR, CURR_AMT, CURR_OPEN_AMT, SO_NO, PROD_CODE, INV_DATE, ",
        "CUST_ID, OVERDUE_AMT, OVERDUE_DAYS, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_CUSTSETTLE_INV"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SETTLE_ID", property="settleId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="INV_NO", property="invNo", jdbcType=JdbcType.NCHAR),
        @Result(column="GT_INV_NO", property="gtInvNo", jdbcType=JdbcType.NCHAR),
        @Result(column="INV_AMT", property="invAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="NET_AMT", property="netAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="TAX_AMT", property="taxAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="OPEN_AMT", property="openAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="DUE_DATE", property="dueDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="HOME_CURR", property="homeCurr", jdbcType=JdbcType.NCHAR),
        @Result(column="CURR_AMT", property="currAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_OPEN_AMT", property="currOpenAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_NO", property="soNo", jdbcType=JdbcType.NCHAR),
        @Result(column="PROD_CODE", property="prodCode", jdbcType=JdbcType.NCHAR),
        @Result(column="INV_DATE", property="invDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CUST_ID", property="custId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OVERDUE_AMT", property="overdueAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="OVERDUE_DAYS", property="overdueDays", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TCustsettleInv> selectAll();

    @Update({
        "update T_CUSTSETTLE_INV",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "SETTLE_ID = #{settleId,jdbcType=DECIMAL},",
          "LINE_NO = #{lineNo,jdbcType=DECIMAL},",
          "INV_NO = #{invNo,jdbcType=NCHAR},",
          "GT_INV_NO = #{gtInvNo,jdbcType=NCHAR},",
          "INV_AMT = #{invAmt,jdbcType=DECIMAL},",
          "NET_AMT = #{netAmt,jdbcType=DECIMAL},",
          "TAX_AMT = #{taxAmt,jdbcType=DECIMAL},",
          "OPEN_AMT = #{openAmt,jdbcType=DECIMAL},",
          "DUE_DATE = #{dueDate,jdbcType=TIMESTAMP},",
          "HOME_CURR = #{homeCurr,jdbcType=NCHAR},",
          "CURR_AMT = #{currAmt,jdbcType=DECIMAL},",
          "CURR_OPEN_AMT = #{currOpenAmt,jdbcType=DECIMAL},",
          "SO_NO = #{soNo,jdbcType=NCHAR},",
          "PROD_CODE = #{prodCode,jdbcType=NCHAR},",
          "INV_DATE = #{invDate,jdbcType=TIMESTAMP},",
          "CUST_ID = #{custId,jdbcType=DECIMAL},",
          "OVERDUE_AMT = #{overdueAmt,jdbcType=DECIMAL},",
          "OVERDUE_DAYS = #{overdueDays,jdbcType=DECIMAL},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TCustsettleInv record);
}