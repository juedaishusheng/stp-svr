package com.el.cfg.mapper;

import com.el.cfg.domain.TManudistProd;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TManudistProdMapper {
    @Delete({
        "delete from T_MANUDIST_PROD",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_MANUDIST_PROD (ID, MANU_DIST_ID, ",
        "SO_ID, FACT_ID, SOPROD_ID, ",
        "PROD_ID, DIST_QTY, ",
        "CALC_PRICE, COST_PRICE, ",
        "CALC_AMT, REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{manuDistId,jdbcType=DECIMAL}, ",
        "#{soId,jdbcType=DECIMAL}, #{factId,jdbcType=DECIMAL}, #{soprodId,jdbcType=DECIMAL}, ",
        "#{prodId,jdbcType=DECIMAL}, #{distQty,jdbcType=DECIMAL}, ",
        "#{calcPrice,jdbcType=DECIMAL}, #{costPrice,jdbcType=DECIMAL}, ",
        "#{calcAmt,jdbcType=DECIMAL}, #{remark,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_MANUDIST_PROD.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TManudistProd record);

    @Select({
        "select",
        "ID, MANU_DIST_ID, SO_ID, FACT_ID, SOPROD_ID, PROD_ID, DIST_QTY, CALC_PRICE, ",
        "COST_PRICE, CALC_AMT, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_MANUDIST_PROD",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="MANU_DIST_ID", property="manuDistId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOPROD_ID", property="soprodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DIST_QTY", property="distQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="CALC_PRICE", property="calcPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="COST_PRICE", property="costPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CALC_AMT", property="calcAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TManudistProd selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, MANU_DIST_ID, SO_ID, FACT_ID, SOPROD_ID, PROD_ID, DIST_QTY, CALC_PRICE, ",
        "COST_PRICE, CALC_AMT, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_MANUDIST_PROD"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="MANU_DIST_ID", property="manuDistId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SOPROD_ID", property="soprodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DIST_QTY", property="distQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="CALC_PRICE", property="calcPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="COST_PRICE", property="costPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CALC_AMT", property="calcAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TManudistProd> selectAll();

    @Update({
        "update T_MANUDIST_PROD",
        "set MANU_DIST_ID = #{manuDistId,jdbcType=DECIMAL},",
          "SO_ID = #{soId,jdbcType=DECIMAL},",
          "FACT_ID = #{factId,jdbcType=DECIMAL},",
          "SOPROD_ID = #{soprodId,jdbcType=DECIMAL},",
          "PROD_ID = #{prodId,jdbcType=DECIMAL},",
          "DIST_QTY = #{distQty,jdbcType=DECIMAL},",
          "CALC_PRICE = #{calcPrice,jdbcType=DECIMAL},",
          "COST_PRICE = #{costPrice,jdbcType=DECIMAL},",
          "CALC_AMT = #{calcAmt,jdbcType=DECIMAL},",
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
    int updateByPrimaryKey(TManudistProd record);
}