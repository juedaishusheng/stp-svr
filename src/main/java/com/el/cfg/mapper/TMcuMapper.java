package com.el.cfg.mapper;

import com.el.cfg.domain.TMcu;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TMcuMapper {
    @Delete({
        "delete from T_MCU",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_MCU (ID, OU_ID, ",
        "MCU_CODE, MCU_NAME, MCU_ABBR, ",
        "MCU_TYPE, MCU_LEVEL, ADDR_NO, ",
        "RELATED_MCU_ID, DESC1, ",
        "DESC2, DESC3, DESC4, ",
        "CAT1, CAT2, CAT3, ",
        "CAT4, CAT5, CAT6, ",
        "CAT7, CAT8, CAT9, ",
        "CAT10, REL_ADDR_NO1, ",
        "REL_ADDR_NO2, REL_ADDR_NO3, ",
        "REL_ADDR_NO4, REL_ADDR_NO5, ",
        "URC_C1, URC_C2, URC_C3, ",
        "URC_C4, URC_C5, URC_D1, ",
        "URC_D2, URC_D3, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION, PY, PY_ABBR)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{mcuCode,jdbcType=NCHAR}, #{mcuName,jdbcType=NCHAR}, #{mcuAbbr,jdbcType=NCHAR}, ",
        "#{mcuType,jdbcType=NCHAR}, #{mcuLevel,jdbcType=NCHAR}, #{addrNo,jdbcType=DECIMAL}, ",
        "#{relatedMcuId,jdbcType=DECIMAL}, #{desc1,jdbcType=NCHAR}, ",
        "#{desc2,jdbcType=NCHAR}, #{desc3,jdbcType=NCHAR}, #{desc4,jdbcType=NCHAR}, ",
        "#{cat1,jdbcType=NCHAR}, #{cat2,jdbcType=NCHAR}, #{cat3,jdbcType=NCHAR}, ",
        "#{cat4,jdbcType=NCHAR}, #{cat5,jdbcType=NCHAR}, #{cat6,jdbcType=NCHAR}, ",
        "#{cat7,jdbcType=NCHAR}, #{cat8,jdbcType=NCHAR}, #{cat9,jdbcType=NCHAR}, ",
        "#{cat10,jdbcType=NCHAR}, #{relAddrNo1,jdbcType=DECIMAL}, ",
        "#{relAddrNo2,jdbcType=DECIMAL}, #{relAddrNo3,jdbcType=DECIMAL}, ",
        "#{relAddrNo4,jdbcType=DECIMAL}, #{relAddrNo5,jdbcType=DECIMAL}, ",
        "#{urcC1,jdbcType=NCHAR}, #{urcC2,jdbcType=NCHAR}, #{urcC3,jdbcType=NCHAR}, ",
        "#{urcC4,jdbcType=NCHAR}, #{urcC5,jdbcType=NCHAR}, #{urcD1,jdbcType=TIMESTAMP}, ",
        "#{urcD2,jdbcType=TIMESTAMP}, #{urcD3,jdbcType=TIMESTAMP}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL}, #{py,jdbcType=NCHAR}, #{pyAbbr,jdbcType=NCHAR})"
    })
    @SelectKey(statement="SELECT SEQ_T_MCU.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TMcu record);

    @Select({
        "select",
        "ID, OU_ID, MCU_CODE, MCU_NAME, MCU_ABBR, MCU_TYPE, MCU_LEVEL, ADDR_NO, RELATED_MCU_ID, ",
        "DESC1, DESC2, DESC3, DESC4, CAT1, CAT2, CAT3, CAT4, CAT5, CAT6, CAT7, CAT8, ",
        "CAT9, CAT10, REL_ADDR_NO1, REL_ADDR_NO2, REL_ADDR_NO3, REL_ADDR_NO4, REL_ADDR_NO5, ",
        "URC_C1, URC_C2, URC_C3, URC_C4, URC_C5, URC_D1, URC_D2, URC_D3, LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION, PY, PY_ABBR",
        "from T_MCU",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_CODE", property="mcuCode", jdbcType=JdbcType.NCHAR),
        @Result(column="MCU_NAME", property="mcuName", jdbcType=JdbcType.NCHAR),
        @Result(column="MCU_ABBR", property="mcuAbbr", jdbcType=JdbcType.NCHAR),
        @Result(column="MCU_TYPE", property="mcuType", jdbcType=JdbcType.NCHAR),
        @Result(column="MCU_LEVEL", property="mcuLevel", jdbcType=JdbcType.NCHAR),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="RELATED_MCU_ID", property="relatedMcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DESC1", property="desc1", jdbcType=JdbcType.NCHAR),
        @Result(column="DESC2", property="desc2", jdbcType=JdbcType.NCHAR),
        @Result(column="DESC3", property="desc3", jdbcType=JdbcType.NCHAR),
        @Result(column="DESC4", property="desc4", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT1", property="cat1", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT2", property="cat2", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT3", property="cat3", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT4", property="cat4", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT5", property="cat5", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT6", property="cat6", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT7", property="cat7", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT8", property="cat8", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT9", property="cat9", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT10", property="cat10", jdbcType=JdbcType.NCHAR),
        @Result(column="REL_ADDR_NO1", property="relAddrNo1", jdbcType=JdbcType.DECIMAL),
        @Result(column="REL_ADDR_NO2", property="relAddrNo2", jdbcType=JdbcType.DECIMAL),
        @Result(column="REL_ADDR_NO3", property="relAddrNo3", jdbcType=JdbcType.DECIMAL),
        @Result(column="REL_ADDR_NO4", property="relAddrNo4", jdbcType=JdbcType.DECIMAL),
        @Result(column="REL_ADDR_NO5", property="relAddrNo5", jdbcType=JdbcType.DECIMAL),
        @Result(column="URC_C1", property="urcC1", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C2", property="urcC2", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C3", property="urcC3", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C4", property="urcC4", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C5", property="urcC5", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_D1", property="urcD1", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="URC_D2", property="urcD2", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="URC_D3", property="urcD3", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL),
        @Result(column="PY", property="py", jdbcType=JdbcType.NCHAR),
        @Result(column="PY_ABBR", property="pyAbbr", jdbcType=JdbcType.NCHAR)
    })
    TMcu selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, MCU_CODE, MCU_NAME, MCU_ABBR, MCU_TYPE, MCU_LEVEL, ADDR_NO, RELATED_MCU_ID, ",
        "DESC1, DESC2, DESC3, DESC4, CAT1, CAT2, CAT3, CAT4, CAT5, CAT6, CAT7, CAT8, ",
        "CAT9, CAT10, REL_ADDR_NO1, REL_ADDR_NO2, REL_ADDR_NO3, REL_ADDR_NO4, REL_ADDR_NO5, ",
        "URC_C1, URC_C2, URC_C3, URC_C4, URC_C5, URC_D1, URC_D2, URC_D3, LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION, PY, PY_ABBR",
        "from T_MCU"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_CODE", property="mcuCode", jdbcType=JdbcType.NCHAR),
        @Result(column="MCU_NAME", property="mcuName", jdbcType=JdbcType.NCHAR),
        @Result(column="MCU_ABBR", property="mcuAbbr", jdbcType=JdbcType.NCHAR),
        @Result(column="MCU_TYPE", property="mcuType", jdbcType=JdbcType.NCHAR),
        @Result(column="MCU_LEVEL", property="mcuLevel", jdbcType=JdbcType.NCHAR),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="RELATED_MCU_ID", property="relatedMcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DESC1", property="desc1", jdbcType=JdbcType.NCHAR),
        @Result(column="DESC2", property="desc2", jdbcType=JdbcType.NCHAR),
        @Result(column="DESC3", property="desc3", jdbcType=JdbcType.NCHAR),
        @Result(column="DESC4", property="desc4", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT1", property="cat1", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT2", property="cat2", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT3", property="cat3", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT4", property="cat4", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT5", property="cat5", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT6", property="cat6", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT7", property="cat7", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT8", property="cat8", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT9", property="cat9", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT10", property="cat10", jdbcType=JdbcType.NCHAR),
        @Result(column="REL_ADDR_NO1", property="relAddrNo1", jdbcType=JdbcType.DECIMAL),
        @Result(column="REL_ADDR_NO2", property="relAddrNo2", jdbcType=JdbcType.DECIMAL),
        @Result(column="REL_ADDR_NO3", property="relAddrNo3", jdbcType=JdbcType.DECIMAL),
        @Result(column="REL_ADDR_NO4", property="relAddrNo4", jdbcType=JdbcType.DECIMAL),
        @Result(column="REL_ADDR_NO5", property="relAddrNo5", jdbcType=JdbcType.DECIMAL),
        @Result(column="URC_C1", property="urcC1", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C2", property="urcC2", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C3", property="urcC3", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C4", property="urcC4", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C5", property="urcC5", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_D1", property="urcD1", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="URC_D2", property="urcD2", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="URC_D3", property="urcD3", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL),
        @Result(column="PY", property="py", jdbcType=JdbcType.NCHAR),
        @Result(column="PY_ABBR", property="pyAbbr", jdbcType=JdbcType.NCHAR)
    })
    List<TMcu> selectAll();

    @Update({
        "update T_MCU",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "MCU_CODE = #{mcuCode,jdbcType=NCHAR},",
          "MCU_NAME = #{mcuName,jdbcType=NCHAR},",
          "MCU_ABBR = #{mcuAbbr,jdbcType=NCHAR},",
          "MCU_TYPE = #{mcuType,jdbcType=NCHAR},",
          "MCU_LEVEL = #{mcuLevel,jdbcType=NCHAR},",
          "ADDR_NO = #{addrNo,jdbcType=DECIMAL},",
          "RELATED_MCU_ID = #{relatedMcuId,jdbcType=DECIMAL},",
          "DESC1 = #{desc1,jdbcType=NCHAR},",
          "DESC2 = #{desc2,jdbcType=NCHAR},",
          "DESC3 = #{desc3,jdbcType=NCHAR},",
          "DESC4 = #{desc4,jdbcType=NCHAR},",
          "CAT1 = #{cat1,jdbcType=NCHAR},",
          "CAT2 = #{cat2,jdbcType=NCHAR},",
          "CAT3 = #{cat3,jdbcType=NCHAR},",
          "CAT4 = #{cat4,jdbcType=NCHAR},",
          "CAT5 = #{cat5,jdbcType=NCHAR},",
          "CAT6 = #{cat6,jdbcType=NCHAR},",
          "CAT7 = #{cat7,jdbcType=NCHAR},",
          "CAT8 = #{cat8,jdbcType=NCHAR},",
          "CAT9 = #{cat9,jdbcType=NCHAR},",
          "CAT10 = #{cat10,jdbcType=NCHAR},",
          "REL_ADDR_NO1 = #{relAddrNo1,jdbcType=DECIMAL},",
          "REL_ADDR_NO2 = #{relAddrNo2,jdbcType=DECIMAL},",
          "REL_ADDR_NO3 = #{relAddrNo3,jdbcType=DECIMAL},",
          "REL_ADDR_NO4 = #{relAddrNo4,jdbcType=DECIMAL},",
          "REL_ADDR_NO5 = #{relAddrNo5,jdbcType=DECIMAL},",
          "URC_C1 = #{urcC1,jdbcType=NCHAR},",
          "URC_C2 = #{urcC2,jdbcType=NCHAR},",
          "URC_C3 = #{urcC3,jdbcType=NCHAR},",
          "URC_C4 = #{urcC4,jdbcType=NCHAR},",
          "URC_C5 = #{urcC5,jdbcType=NCHAR},",
          "URC_D1 = #{urcD1,jdbcType=TIMESTAMP},",
          "URC_D2 = #{urcD2,jdbcType=TIMESTAMP},",
          "URC_D3 = #{urcD3,jdbcType=TIMESTAMP},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL},",
          "PY = #{py,jdbcType=NCHAR},",
          "PY_ABBR = #{pyAbbr,jdbcType=NCHAR}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TMcu record);
}