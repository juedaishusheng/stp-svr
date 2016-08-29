package com.el.cfg.mapper;

import com.el.cfg.domain.TManudistFact;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TManudistFactMapper {
    @Delete({
        "delete from T_MANUDIST_FACT",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_MANUDIST_FACT (ID, BATCH_ID, ",
        "SO_ID, FACT_ID, DIST_QTY, ",
        "CALC_AMT, COST_AMT, ",
        "ARGUED_AMT, ARGUE_DESC, ",
        "PRICE_APPRER, PRICE_APPR_COMMENT, ",
        "PRICE_APPR_TIME, ACPT_STATUS, ",
        "ACPT_COMMENT, ACPT_TIME, ",
        "ACPT_USER, REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{batchId,jdbcType=DECIMAL}, ",
        "#{soId,jdbcType=DECIMAL}, #{factId,jdbcType=DECIMAL}, #{distQty,jdbcType=NCHAR}, ",
        "#{calcAmt,jdbcType=DECIMAL}, #{costAmt,jdbcType=DECIMAL}, ",
        "#{arguedAmt,jdbcType=DECIMAL}, #{argueDesc,jdbcType=NCHAR}, ",
        "#{priceApprer,jdbcType=NCHAR}, #{priceApprComment,jdbcType=NCHAR}, ",
        "#{priceApprTime,jdbcType=TIMESTAMP}, #{acptStatus,jdbcType=NCHAR}, ",
        "#{acptComment,jdbcType=NCHAR}, #{acptTime,jdbcType=TIMESTAMP}, ",
        "#{acptUser,jdbcType=NCHAR}, #{remark,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_MANUDIST_FACT.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TManudistFact record);

    @Select({
        "select",
        "ID, BATCH_ID, SO_ID, FACT_ID, DIST_QTY, CALC_AMT, COST_AMT, ARGUED_AMT, ARGUE_DESC, ",
        "PRICE_APPRER, PRICE_APPR_COMMENT, PRICE_APPR_TIME, ACPT_STATUS, ACPT_COMMENT, ",
        "ACPT_TIME, ACPT_USER, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_MANUDIST_FACT",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="BATCH_ID", property="batchId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DIST_QTY", property="distQty", jdbcType=JdbcType.NCHAR),
        @Result(column="CALC_AMT", property="calcAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="COST_AMT", property="costAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ARGUED_AMT", property="arguedAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ARGUE_DESC", property="argueDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_APPRER", property="priceApprer", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_APPR_COMMENT", property="priceApprComment", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_APPR_TIME", property="priceApprTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACPT_STATUS", property="acptStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="ACPT_COMMENT", property="acptComment", jdbcType=JdbcType.NCHAR),
        @Result(column="ACPT_TIME", property="acptTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACPT_USER", property="acptUser", jdbcType=JdbcType.NCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TManudistFact selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, BATCH_ID, SO_ID, FACT_ID, DIST_QTY, CALC_AMT, COST_AMT, ARGUED_AMT, ARGUE_DESC, ",
        "PRICE_APPRER, PRICE_APPR_COMMENT, PRICE_APPR_TIME, ACPT_STATUS, ACPT_COMMENT, ",
        "ACPT_TIME, ACPT_USER, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_MANUDIST_FACT"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="BATCH_ID", property="batchId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DIST_QTY", property="distQty", jdbcType=JdbcType.NCHAR),
        @Result(column="CALC_AMT", property="calcAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="COST_AMT", property="costAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ARGUED_AMT", property="arguedAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ARGUE_DESC", property="argueDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_APPRER", property="priceApprer", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_APPR_COMMENT", property="priceApprComment", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_APPR_TIME", property="priceApprTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACPT_STATUS", property="acptStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="ACPT_COMMENT", property="acptComment", jdbcType=JdbcType.NCHAR),
        @Result(column="ACPT_TIME", property="acptTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACPT_USER", property="acptUser", jdbcType=JdbcType.NCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TManudistFact> selectAll();

    @Update({
        "update T_MANUDIST_FACT",
        "set BATCH_ID = #{batchId,jdbcType=DECIMAL},",
          "SO_ID = #{soId,jdbcType=DECIMAL},",
          "FACT_ID = #{factId,jdbcType=DECIMAL},",
          "DIST_QTY = #{distQty,jdbcType=NCHAR},",
          "CALC_AMT = #{calcAmt,jdbcType=DECIMAL},",
          "COST_AMT = #{costAmt,jdbcType=DECIMAL},",
          "ARGUED_AMT = #{arguedAmt,jdbcType=DECIMAL},",
          "ARGUE_DESC = #{argueDesc,jdbcType=NCHAR},",
          "PRICE_APPRER = #{priceApprer,jdbcType=NCHAR},",
          "PRICE_APPR_COMMENT = #{priceApprComment,jdbcType=NCHAR},",
          "PRICE_APPR_TIME = #{priceApprTime,jdbcType=TIMESTAMP},",
          "ACPT_STATUS = #{acptStatus,jdbcType=NCHAR},",
          "ACPT_COMMENT = #{acptComment,jdbcType=NCHAR},",
          "ACPT_TIME = #{acptTime,jdbcType=TIMESTAMP},",
          "ACPT_USER = #{acptUser,jdbcType=NCHAR},",
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
    int updateByPrimaryKey(TManudistFact record);
}