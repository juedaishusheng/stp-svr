package com.el.cfg.mapper;

import com.el.cfg.domain.TPaperPrice;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TPaperPriceMapper {
    @Delete({
        "delete from T_PAPER_PRICE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_PAPER_PRICE (ID, OU_ID, ",
        "PRICE_TYPE, ADDR_NO, ",
        "PAPER_CLASS, PAPER_TYPE, ",
        "PAPER_BRAND, PAPER_WEIGHT, ",
        "PRICE_UOM, PRICE, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{priceType,jdbcType=NCHAR}, #{addrNo,jdbcType=DECIMAL}, ",
        "#{paperClass,jdbcType=NCHAR}, #{paperType,jdbcType=NCHAR}, ",
        "#{paperBrand,jdbcType=NCHAR}, #{paperWeight,jdbcType=NCHAR}, ",
        "#{priceUom,jdbcType=NCHAR}, #{price,jdbcType=DECIMAL}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_PAPER_PRICE.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TPaperPrice record);

    @Select({
        "select",
        "ID, OU_ID, PRICE_TYPE, ADDR_NO, PAPER_CLASS, PAPER_TYPE, PAPER_BRAND, PAPER_WEIGHT, ",
        "PRICE_UOM, PRICE, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_PAPER_PRICE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_TYPE", property="priceType", jdbcType=JdbcType.NCHAR),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_CLASS", property="paperClass", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_TYPE", property="paperType", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_BRAND", property="paperBrand", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_WEIGHT", property="paperWeight", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_UOM", property="priceUom", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TPaperPrice selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, PRICE_TYPE, ADDR_NO, PAPER_CLASS, PAPER_TYPE, PAPER_BRAND, PAPER_WEIGHT, ",
        "PRICE_UOM, PRICE, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_PAPER_PRICE"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_TYPE", property="priceType", jdbcType=JdbcType.NCHAR),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_CLASS", property="paperClass", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_TYPE", property="paperType", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_BRAND", property="paperBrand", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_WEIGHT", property="paperWeight", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_UOM", property="priceUom", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TPaperPrice> selectAll();

    @Update({
        "update T_PAPER_PRICE",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "PRICE_TYPE = #{priceType,jdbcType=NCHAR},",
          "ADDR_NO = #{addrNo,jdbcType=DECIMAL},",
          "PAPER_CLASS = #{paperClass,jdbcType=NCHAR},",
          "PAPER_TYPE = #{paperType,jdbcType=NCHAR},",
          "PAPER_BRAND = #{paperBrand,jdbcType=NCHAR},",
          "PAPER_WEIGHT = #{paperWeight,jdbcType=NCHAR},",
          "PRICE_UOM = #{priceUom,jdbcType=NCHAR},",
          "PRICE = #{price,jdbcType=DECIMAL},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TPaperPrice record);
}