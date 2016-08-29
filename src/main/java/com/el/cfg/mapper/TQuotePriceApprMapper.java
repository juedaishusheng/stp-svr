package com.el.cfg.mapper;

import com.el.cfg.domain.TQuotePriceAppr;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TQuotePriceApprMapper {
    @Delete({
        "delete from T_QUOTE_PRICE_APPR",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_QUOTE_PRICE_APPR (ID, QUOTE_ID, ",
        "PRICE_APPRER_ID, PRICE_APPR_DATE, ",
        "PRICE_APPR_COMMENT, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{quoteId,jdbcType=DECIMAL}, ",
        "#{priceApprerId,jdbcType=DECIMAL}, #{priceApprDate,jdbcType=TIMESTAMP}, ",
        "#{priceApprComment,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_QUOTE_PRICE_APPR.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TQuotePriceAppr record);

    @Select({
        "select",
        "ID, QUOTE_ID, PRICE_APPRER_ID, PRICE_APPR_DATE, PRICE_APPR_COMMENT, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_QUOTE_PRICE_APPR",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QUOTE_ID", property="quoteId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_APPRER_ID", property="priceApprerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_APPR_DATE", property="priceApprDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PRICE_APPR_COMMENT", property="priceApprComment", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TQuotePriceAppr selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, QUOTE_ID, PRICE_APPRER_ID, PRICE_APPR_DATE, PRICE_APPR_COMMENT, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_QUOTE_PRICE_APPR"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="QUOTE_ID", property="quoteId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_APPRER_ID", property="priceApprerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_APPR_DATE", property="priceApprDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PRICE_APPR_COMMENT", property="priceApprComment", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TQuotePriceAppr> selectAll();

    @Update({
        "update T_QUOTE_PRICE_APPR",
        "set QUOTE_ID = #{quoteId,jdbcType=DECIMAL},",
          "PRICE_APPRER_ID = #{priceApprerId,jdbcType=DECIMAL},",
          "PRICE_APPR_DATE = #{priceApprDate,jdbcType=TIMESTAMP},",
          "PRICE_APPR_COMMENT = #{priceApprComment,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TQuotePriceAppr record);
}