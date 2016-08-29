package com.el.cfg.mapper;

import com.el.cfg.domain.TPoPay;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TPoPayMapper {
    @Delete({
        "delete from T_PO_PAY",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_PO_PAY (ID, OU_ID, ",
        "PPO_ID, SUPP_CODE, SUPP_NAME, ",
        "PAY_NO, LINE_NO, PO_NO, ",
        "PAY_AMT, PAY_DATE, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{ppoId,jdbcType=DECIMAL}, #{suppCode,jdbcType=NCHAR}, #{suppName,jdbcType=NCHAR}, ",
        "#{payNo,jdbcType=NCHAR}, #{lineNo,jdbcType=DECIMAL}, #{poNo,jdbcType=NCHAR}, ",
        "#{payAmt,jdbcType=DECIMAL}, #{payDate,jdbcType=TIMESTAMP}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_PO_PAY.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TPoPay record);

    @Select({
        "select",
        "ID, OU_ID, PPO_ID, SUPP_CODE, SUPP_NAME, PAY_NO, LINE_NO, PO_NO, PAY_AMT, PAY_DATE, ",
        "LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PO_PAY",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PPO_ID", property="ppoId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SUPP_CODE", property="suppCode", jdbcType=JdbcType.NCHAR),
        @Result(column="SUPP_NAME", property="suppName", jdbcType=JdbcType.NCHAR),
        @Result(column="PAY_NO", property="payNo", jdbcType=JdbcType.NCHAR),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PO_NO", property="poNo", jdbcType=JdbcType.NCHAR),
        @Result(column="PAY_AMT", property="payAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAY_DATE", property="payDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TPoPay selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, PPO_ID, SUPP_CODE, SUPP_NAME, PAY_NO, LINE_NO, PO_NO, PAY_AMT, PAY_DATE, ",
        "LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PO_PAY"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PPO_ID", property="ppoId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SUPP_CODE", property="suppCode", jdbcType=JdbcType.NCHAR),
        @Result(column="SUPP_NAME", property="suppName", jdbcType=JdbcType.NCHAR),
        @Result(column="PAY_NO", property="payNo", jdbcType=JdbcType.NCHAR),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PO_NO", property="poNo", jdbcType=JdbcType.NCHAR),
        @Result(column="PAY_AMT", property="payAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAY_DATE", property="payDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TPoPay> selectAll();

    @Update({
        "update T_PO_PAY",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "PPO_ID = #{ppoId,jdbcType=DECIMAL},",
          "SUPP_CODE = #{suppCode,jdbcType=NCHAR},",
          "SUPP_NAME = #{suppName,jdbcType=NCHAR},",
          "PAY_NO = #{payNo,jdbcType=NCHAR},",
          "LINE_NO = #{lineNo,jdbcType=DECIMAL},",
          "PO_NO = #{poNo,jdbcType=NCHAR},",
          "PAY_AMT = #{payAmt,jdbcType=DECIMAL},",
          "PAY_DATE = #{payDate,jdbcType=TIMESTAMP},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TPoPay record);
}