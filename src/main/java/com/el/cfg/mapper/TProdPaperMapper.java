package com.el.cfg.mapper;

import com.el.cfg.domain.TProdPaper;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TProdPaperMapper {
    @Delete({
        "delete from T_PROD_PAPER",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_PROD_PAPER (ID, PROD_ID, ",
        "PART_ID, PART_NAME, ",
        "PRODROUTE_ID, ROUTE_DESC, ",
        "SET_NAME, USAGE_RATE, ",
        "SELECT_FLAG, PRINT_TYPE, ",
        "PRINT_METHOD, COLORCNT_FRONT, ",
        "COLORCNT_BACK, SCOLORCNT_FRONT, ",
        "SCOLORCNT_BACK, PRINTPAPER_HEIGHT, ",
        "PRINTPAPER_WIDTH, PAPER_SOURCE, ",
        "PAPER_TYPE, PAPER_SPEC_ID, ",
        "PAPER_HEIGHT, PAPER_WIDTH, ",
        "PAPER_WEIGHT, PAPER_VENDOR, ",
        "PAPER_BRAND, PAPER_GRADE, ",
        "PAPER_ITEM_ID, REMARK, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{prodId,jdbcType=DECIMAL}, ",
        "#{partId,jdbcType=DECIMAL}, #{partName,jdbcType=NCHAR}, ",
        "#{prodrouteId,jdbcType=DECIMAL}, #{routeDesc,jdbcType=NCHAR}, ",
        "#{setName,jdbcType=NCHAR}, #{usageRate,jdbcType=DECIMAL}, ",
        "#{selectFlag,jdbcType=DECIMAL}, #{printType,jdbcType=NCHAR}, ",
        "#{printMethod,jdbcType=NCHAR}, #{colorcntFront,jdbcType=DECIMAL}, ",
        "#{colorcntBack,jdbcType=DECIMAL}, #{scolorcntFront,jdbcType=DECIMAL}, ",
        "#{scolorcntBack,jdbcType=DECIMAL}, #{printpaperHeight,jdbcType=DECIMAL}, ",
        "#{printpaperWidth,jdbcType=DECIMAL}, #{paperSource,jdbcType=NCHAR}, ",
        "#{paperType,jdbcType=NCHAR}, #{paperSpecId,jdbcType=DECIMAL}, ",
        "#{paperHeight,jdbcType=DECIMAL}, #{paperWidth,jdbcType=DECIMAL}, ",
        "#{paperWeight,jdbcType=NCHAR}, #{paperVendor,jdbcType=NCHAR}, ",
        "#{paperBrand,jdbcType=NCHAR}, #{paperGrade,jdbcType=NCHAR}, ",
        "#{paperItemId,jdbcType=DECIMAL}, #{remark,jdbcType=NCHAR}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_PROD_PAPER.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TProdPaper record);

    @Select({
        "select",
        "ID, PROD_ID, PART_ID, PART_NAME, PRODROUTE_ID, ROUTE_DESC, SET_NAME, USAGE_RATE, ",
        "SELECT_FLAG, PRINT_TYPE, PRINT_METHOD, COLORCNT_FRONT, COLORCNT_BACK, SCOLORCNT_FRONT, ",
        "SCOLORCNT_BACK, PRINTPAPER_HEIGHT, PRINTPAPER_WIDTH, PAPER_SOURCE, PAPER_TYPE, ",
        "PAPER_SPEC_ID, PAPER_HEIGHT, PAPER_WIDTH, PAPER_WEIGHT, PAPER_VENDOR, PAPER_BRAND, ",
        "PAPER_GRADE, PAPER_ITEM_ID, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PROD_PAPER",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_ID", property="partId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_NAME", property="partName", jdbcType=JdbcType.NCHAR),
        @Result(column="PRODROUTE_ID", property="prodrouteId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROUTE_DESC", property="routeDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="SET_NAME", property="setName", jdbcType=JdbcType.NCHAR),
        @Result(column="USAGE_RATE", property="usageRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="SELECT_FLAG", property="selectFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRINT_TYPE", property="printType", jdbcType=JdbcType.NCHAR),
        @Result(column="PRINT_METHOD", property="printMethod", jdbcType=JdbcType.NCHAR),
        @Result(column="COLORCNT_FRONT", property="colorcntFront", jdbcType=JdbcType.DECIMAL),
        @Result(column="COLORCNT_BACK", property="colorcntBack", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCOLORCNT_FRONT", property="scolorcntFront", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCOLORCNT_BACK", property="scolorcntBack", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRINTPAPER_HEIGHT", property="printpaperHeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRINTPAPER_WIDTH", property="printpaperWidth", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_SOURCE", property="paperSource", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_TYPE", property="paperType", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_SPEC_ID", property="paperSpecId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_HEIGHT", property="paperHeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_WIDTH", property="paperWidth", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_WEIGHT", property="paperWeight", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_VENDOR", property="paperVendor", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_BRAND", property="paperBrand", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_GRADE", property="paperGrade", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_ITEM_ID", property="paperItemId", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TProdPaper selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, PROD_ID, PART_ID, PART_NAME, PRODROUTE_ID, ROUTE_DESC, SET_NAME, USAGE_RATE, ",
        "SELECT_FLAG, PRINT_TYPE, PRINT_METHOD, COLORCNT_FRONT, COLORCNT_BACK, SCOLORCNT_FRONT, ",
        "SCOLORCNT_BACK, PRINTPAPER_HEIGHT, PRINTPAPER_WIDTH, PAPER_SOURCE, PAPER_TYPE, ",
        "PAPER_SPEC_ID, PAPER_HEIGHT, PAPER_WIDTH, PAPER_WEIGHT, PAPER_VENDOR, PAPER_BRAND, ",
        "PAPER_GRADE, PAPER_ITEM_ID, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_PROD_PAPER"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_ID", property="partId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_NAME", property="partName", jdbcType=JdbcType.NCHAR),
        @Result(column="PRODROUTE_ID", property="prodrouteId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ROUTE_DESC", property="routeDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="SET_NAME", property="setName", jdbcType=JdbcType.NCHAR),
        @Result(column="USAGE_RATE", property="usageRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="SELECT_FLAG", property="selectFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRINT_TYPE", property="printType", jdbcType=JdbcType.NCHAR),
        @Result(column="PRINT_METHOD", property="printMethod", jdbcType=JdbcType.NCHAR),
        @Result(column="COLORCNT_FRONT", property="colorcntFront", jdbcType=JdbcType.DECIMAL),
        @Result(column="COLORCNT_BACK", property="colorcntBack", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCOLORCNT_FRONT", property="scolorcntFront", jdbcType=JdbcType.DECIMAL),
        @Result(column="SCOLORCNT_BACK", property="scolorcntBack", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRINTPAPER_HEIGHT", property="printpaperHeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRINTPAPER_WIDTH", property="printpaperWidth", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_SOURCE", property="paperSource", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_TYPE", property="paperType", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_SPEC_ID", property="paperSpecId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_HEIGHT", property="paperHeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_WIDTH", property="paperWidth", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_WEIGHT", property="paperWeight", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_VENDOR", property="paperVendor", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_BRAND", property="paperBrand", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_GRADE", property="paperGrade", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_ITEM_ID", property="paperItemId", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TProdPaper> selectAll();

    @Update({
        "update T_PROD_PAPER",
        "set PROD_ID = #{prodId,jdbcType=DECIMAL},",
          "PART_ID = #{partId,jdbcType=DECIMAL},",
          "PART_NAME = #{partName,jdbcType=NCHAR},",
          "PRODROUTE_ID = #{prodrouteId,jdbcType=DECIMAL},",
          "ROUTE_DESC = #{routeDesc,jdbcType=NCHAR},",
          "SET_NAME = #{setName,jdbcType=NCHAR},",
          "USAGE_RATE = #{usageRate,jdbcType=DECIMAL},",
          "SELECT_FLAG = #{selectFlag,jdbcType=DECIMAL},",
          "PRINT_TYPE = #{printType,jdbcType=NCHAR},",
          "PRINT_METHOD = #{printMethod,jdbcType=NCHAR},",
          "COLORCNT_FRONT = #{colorcntFront,jdbcType=DECIMAL},",
          "COLORCNT_BACK = #{colorcntBack,jdbcType=DECIMAL},",
          "SCOLORCNT_FRONT = #{scolorcntFront,jdbcType=DECIMAL},",
          "SCOLORCNT_BACK = #{scolorcntBack,jdbcType=DECIMAL},",
          "PRINTPAPER_HEIGHT = #{printpaperHeight,jdbcType=DECIMAL},",
          "PRINTPAPER_WIDTH = #{printpaperWidth,jdbcType=DECIMAL},",
          "PAPER_SOURCE = #{paperSource,jdbcType=NCHAR},",
          "PAPER_TYPE = #{paperType,jdbcType=NCHAR},",
          "PAPER_SPEC_ID = #{paperSpecId,jdbcType=DECIMAL},",
          "PAPER_HEIGHT = #{paperHeight,jdbcType=DECIMAL},",
          "PAPER_WIDTH = #{paperWidth,jdbcType=DECIMAL},",
          "PAPER_WEIGHT = #{paperWeight,jdbcType=NCHAR},",
          "PAPER_VENDOR = #{paperVendor,jdbcType=NCHAR},",
          "PAPER_BRAND = #{paperBrand,jdbcType=NCHAR},",
          "PAPER_GRADE = #{paperGrade,jdbcType=NCHAR},",
          "PAPER_ITEM_ID = #{paperItemId,jdbcType=DECIMAL},",
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
    int updateByPrimaryKey(TProdPaper record);
}