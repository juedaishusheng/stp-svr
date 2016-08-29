package com.el.cfg.mapper;

import com.el.cfg.domain.TCustinvRecv;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TCustinvRecvMapper {
    @Delete({
        "delete from T_CUSTINV_RECV",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_CUSTINV_RECV (ID, OU_ID, ",
        "CUST_ID, CUSTSETT_ID, ",
        "LINE_NO, RECV_DATE, ",
        "RECV_AMT, CURR_CODE, ",
        "CURR_DATE, CURR_AMT, ",
        "SO_NO, PAYER, INV_NO, ",
        "GT_INV_NO, RECV_NO, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{custId,jdbcType=DECIMAL}, #{custsettId,jdbcType=DECIMAL}, ",
        "#{lineNo,jdbcType=DECIMAL}, #{recvDate,jdbcType=TIMESTAMP}, ",
        "#{recvAmt,jdbcType=DECIMAL}, #{currCode,jdbcType=NCHAR}, ",
        "#{currDate,jdbcType=DECIMAL}, #{currAmt,jdbcType=DECIMAL}, ",
        "#{soNo,jdbcType=NCHAR}, #{payer,jdbcType=NCHAR}, #{invNo,jdbcType=NCHAR}, ",
        "#{gtInvNo,jdbcType=NCHAR}, #{recvNo,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_CUSTINV_RECV.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TCustinvRecv record);

    @Select({
        "select",
        "ID, OU_ID, CUST_ID, CUSTSETT_ID, LINE_NO, RECV_DATE, RECV_AMT, CURR_CODE, CURR_DATE, ",
        "CURR_AMT, SO_NO, PAYER, INV_NO, GT_INV_NO, RECV_NO, LOCKER_ID, LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_CUSTINV_RECV",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUST_ID", property="custId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUSTSETT_ID", property="custsettId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="RECV_DATE", property="recvDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RECV_AMT", property="recvAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_CODE", property="currCode", jdbcType=JdbcType.NCHAR),
        @Result(column="CURR_DATE", property="currDate", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_AMT", property="currAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_NO", property="soNo", jdbcType=JdbcType.NCHAR),
        @Result(column="PAYER", property="payer", jdbcType=JdbcType.NCHAR),
        @Result(column="INV_NO", property="invNo", jdbcType=JdbcType.NCHAR),
        @Result(column="GT_INV_NO", property="gtInvNo", jdbcType=JdbcType.NCHAR),
        @Result(column="RECV_NO", property="recvNo", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TCustinvRecv selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, CUST_ID, CUSTSETT_ID, LINE_NO, RECV_DATE, RECV_AMT, CURR_CODE, CURR_DATE, ",
        "CURR_AMT, SO_NO, PAYER, INV_NO, GT_INV_NO, RECV_NO, LOCKER_ID, LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_CUSTINV_RECV"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUST_ID", property="custId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUSTSETT_ID", property="custsettId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="RECV_DATE", property="recvDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RECV_AMT", property="recvAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_CODE", property="currCode", jdbcType=JdbcType.NCHAR),
        @Result(column="CURR_DATE", property="currDate", jdbcType=JdbcType.DECIMAL),
        @Result(column="CURR_AMT", property="currAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_NO", property="soNo", jdbcType=JdbcType.NCHAR),
        @Result(column="PAYER", property="payer", jdbcType=JdbcType.NCHAR),
        @Result(column="INV_NO", property="invNo", jdbcType=JdbcType.NCHAR),
        @Result(column="GT_INV_NO", property="gtInvNo", jdbcType=JdbcType.NCHAR),
        @Result(column="RECV_NO", property="recvNo", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TCustinvRecv> selectAll();

    @Update({
        "update T_CUSTINV_RECV",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "CUST_ID = #{custId,jdbcType=DECIMAL},",
          "CUSTSETT_ID = #{custsettId,jdbcType=DECIMAL},",
          "LINE_NO = #{lineNo,jdbcType=DECIMAL},",
          "RECV_DATE = #{recvDate,jdbcType=TIMESTAMP},",
          "RECV_AMT = #{recvAmt,jdbcType=DECIMAL},",
          "CURR_CODE = #{currCode,jdbcType=NCHAR},",
          "CURR_DATE = #{currDate,jdbcType=DECIMAL},",
          "CURR_AMT = #{currAmt,jdbcType=DECIMAL},",
          "SO_NO = #{soNo,jdbcType=NCHAR},",
          "PAYER = #{payer,jdbcType=NCHAR},",
          "INV_NO = #{invNo,jdbcType=NCHAR},",
          "GT_INV_NO = #{gtInvNo,jdbcType=NCHAR},",
          "RECV_NO = #{recvNo,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TCustinvRecv record);
}