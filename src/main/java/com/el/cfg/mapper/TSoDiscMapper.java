package com.el.cfg.mapper;

import com.el.cfg.domain.TSoDisc;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TSoDiscMapper {
    @Delete({
        "delete from T_SO_DISC",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_SO_DISC (ID, T_SO_PROD_ID, ",
        "LINE_NO, DISC_TYPE, ",
        "DISC_DESC, DISC_AMT, ",
        "PRICE_TYPE, PRICE_CONFIRM_DESC, ",
        "REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{tSoProdId,jdbcType=DECIMAL}, ",
        "#{lineNo,jdbcType=DECIMAL}, #{discType,jdbcType=NCHAR}, ",
        "#{discDesc,jdbcType=NCHAR}, #{discAmt,jdbcType=DECIMAL}, ",
        "#{priceType,jdbcType=NCHAR}, #{priceConfirmDesc,jdbcType=NCHAR}, ",
        "#{remark,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_SO_DISC.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TSoDisc record);

    @Select({
        "select",
        "ID, T_SO_PROD_ID, LINE_NO, DISC_TYPE, DISC_DESC, DISC_AMT, PRICE_TYPE, PRICE_CONFIRM_DESC, ",
        "REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION",
        "from T_SO_DISC",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="T_SO_PROD_ID", property="tSoProdId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="DISC_TYPE", property="discType", jdbcType=JdbcType.NCHAR),
        @Result(column="DISC_DESC", property="discDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="DISC_AMT", property="discAmt", jdbcType=JdbcType.DECIMAL),
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
    TSoDisc selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, T_SO_PROD_ID, LINE_NO, DISC_TYPE, DISC_DESC, DISC_AMT, PRICE_TYPE, PRICE_CONFIRM_DESC, ",
        "REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION",
        "from T_SO_DISC"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="T_SO_PROD_ID", property="tSoProdId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="DISC_TYPE", property="discType", jdbcType=JdbcType.NCHAR),
        @Result(column="DISC_DESC", property="discDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="DISC_AMT", property="discAmt", jdbcType=JdbcType.DECIMAL),
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
    List<TSoDisc> selectAll();

    @Update({
        "update T_SO_DISC",
        "set T_SO_PROD_ID = #{tSoProdId,jdbcType=DECIMAL},",
          "LINE_NO = #{lineNo,jdbcType=DECIMAL},",
          "DISC_TYPE = #{discType,jdbcType=NCHAR},",
          "DISC_DESC = #{discDesc,jdbcType=NCHAR},",
          "DISC_AMT = #{discAmt,jdbcType=DECIMAL},",
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
    int updateByPrimaryKey(TSoDisc record);
}