package com.el.cfg.mapper;

import com.el.cfg.domain.TPaymentTerms;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TPaymentTermsMapper {
    @Delete({
        "delete from T_PAYMENT_TERMS",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_PAYMENT_TERMS (ID, OU_ID, ",
        "MCU_ID, TERM_CODE, TERM_DESC, ",
        "DISC_PERCENT, DISC_DAYS, ",
        "NET_DAYS, DUE_DATE, ",
        "SPLIT_NUM, AGING_DAYS, ",
        "INTEREST_RATE, PROX_DATE_MONTH, ",
        "PROX_DATE_DAY, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{mcuId,jdbcType=DECIMAL}, #{termCode,jdbcType=NCHAR}, #{termDesc,jdbcType=NCHAR}, ",
        "#{discPercent,jdbcType=DECIMAL}, #{discDays,jdbcType=DECIMAL}, ",
        "#{netDays,jdbcType=DECIMAL}, #{dueDate,jdbcType=TIMESTAMP}, ",
        "#{splitNum,jdbcType=DECIMAL}, #{agingDays,jdbcType=DECIMAL}, ",
        "#{interestRate,jdbcType=DECIMAL}, #{proxDateMonth,jdbcType=DECIMAL}, ",
        "#{proxDateDay,jdbcType=DECIMAL}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_PAYMENT_TERMS.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TPaymentTerms record);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, TERM_CODE, TERM_DESC, DISC_PERCENT, DISC_DAYS, NET_DAYS, ",
        "DUE_DATE, SPLIT_NUM, AGING_DAYS, INTEREST_RATE, PROX_DATE_MONTH, PROX_DATE_DAY, ",
        "LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PAYMENT_TERMS",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="TERM_CODE", property="termCode", jdbcType=JdbcType.NCHAR),
        @Result(column="TERM_DESC", property="termDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="DISC_PERCENT", property="discPercent", jdbcType=JdbcType.DECIMAL),
        @Result(column="DISC_DAYS", property="discDays", jdbcType=JdbcType.DECIMAL),
        @Result(column="NET_DAYS", property="netDays", jdbcType=JdbcType.DECIMAL),
        @Result(column="DUE_DATE", property="dueDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SPLIT_NUM", property="splitNum", jdbcType=JdbcType.DECIMAL),
        @Result(column="AGING_DAYS", property="agingDays", jdbcType=JdbcType.DECIMAL),
        @Result(column="INTEREST_RATE", property="interestRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROX_DATE_MONTH", property="proxDateMonth", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROX_DATE_DAY", property="proxDateDay", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TPaymentTerms selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, TERM_CODE, TERM_DESC, DISC_PERCENT, DISC_DAYS, NET_DAYS, ",
        "DUE_DATE, SPLIT_NUM, AGING_DAYS, INTEREST_RATE, PROX_DATE_MONTH, PROX_DATE_DAY, ",
        "LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PAYMENT_TERMS"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="TERM_CODE", property="termCode", jdbcType=JdbcType.NCHAR),
        @Result(column="TERM_DESC", property="termDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="DISC_PERCENT", property="discPercent", jdbcType=JdbcType.DECIMAL),
        @Result(column="DISC_DAYS", property="discDays", jdbcType=JdbcType.DECIMAL),
        @Result(column="NET_DAYS", property="netDays", jdbcType=JdbcType.DECIMAL),
        @Result(column="DUE_DATE", property="dueDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SPLIT_NUM", property="splitNum", jdbcType=JdbcType.DECIMAL),
        @Result(column="AGING_DAYS", property="agingDays", jdbcType=JdbcType.DECIMAL),
        @Result(column="INTEREST_RATE", property="interestRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROX_DATE_MONTH", property="proxDateMonth", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROX_DATE_DAY", property="proxDateDay", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TPaymentTerms> selectAll();

    @Update({
        "update T_PAYMENT_TERMS",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "MCU_ID = #{mcuId,jdbcType=DECIMAL},",
          "TERM_CODE = #{termCode,jdbcType=NCHAR},",
          "TERM_DESC = #{termDesc,jdbcType=NCHAR},",
          "DISC_PERCENT = #{discPercent,jdbcType=DECIMAL},",
          "DISC_DAYS = #{discDays,jdbcType=DECIMAL},",
          "NET_DAYS = #{netDays,jdbcType=DECIMAL},",
          "DUE_DATE = #{dueDate,jdbcType=TIMESTAMP},",
          "SPLIT_NUM = #{splitNum,jdbcType=DECIMAL},",
          "AGING_DAYS = #{agingDays,jdbcType=DECIMAL},",
          "INTEREST_RATE = #{interestRate,jdbcType=DECIMAL},",
          "PROX_DATE_MONTH = #{proxDateMonth,jdbcType=DECIMAL},",
          "PROX_DATE_DAY = #{proxDateDay,jdbcType=DECIMAL},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TPaymentTerms record);
}