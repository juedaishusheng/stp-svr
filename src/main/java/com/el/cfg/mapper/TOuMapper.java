package com.el.cfg.mapper;

import com.el.cfg.domain.TOu;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TOuMapper {
    @Delete({
        "delete from T_OU",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_OU (ID, OU_CODE, ",
        "OU_NAME, OU_ABBR, OU_TYPE, ",
        "OU_CURR, OU_STATUS, RELATED_OU_ID1, ",
        "RELATED_OU_ID2, ADDR_NO, ",
        "URC_ADDR_NO, URC_C1, ",
        "URC_C2, URC_C3, URC_C4, ",
        "URC_C5, URC_D1, URC_D2, ",
        "URC_D3, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION, ",
        "PY, PY_ABBR)",
        "values (#{id,jdbcType=DECIMAL}, #{ouCode,jdbcType=NCHAR}, ",
        "#{ouName,jdbcType=NCHAR}, #{ouAbbr,jdbcType=NCHAR}, #{ouType,jdbcType=NCHAR}, ",
        "#{ouCurr,jdbcType=NCHAR}, #{ouStatus,jdbcType=NCHAR}, #{relatedOuId1,jdbcType=DECIMAL}, ",
        "#{relatedOuId2,jdbcType=DECIMAL}, #{addrNo,jdbcType=DECIMAL}, ",
        "#{urcAddrNo,jdbcType=DECIMAL}, #{urcC1,jdbcType=NCHAR}, ",
        "#{urcC2,jdbcType=NCHAR}, #{urcC3,jdbcType=NCHAR}, #{urcC4,jdbcType=NCHAR}, ",
        "#{urcC5,jdbcType=NCHAR}, #{urcD1,jdbcType=TIMESTAMP}, #{urcD2,jdbcType=TIMESTAMP}, ",
        "#{urcD3,jdbcType=TIMESTAMP}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL}, ",
        "#{py,jdbcType=NCHAR}, #{pyAbbr,jdbcType=NCHAR})"
    })
    @SelectKey(statement="SELECT SEQ_T_OU.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TOu record);

    @Select({
        "select",
        "ID, OU_CODE, OU_NAME, OU_ABBR, OU_TYPE, OU_CURR, OU_STATUS, RELATED_OU_ID1, ",
        "RELATED_OU_ID2, ADDR_NO, URC_ADDR_NO, URC_C1, URC_C2, URC_C3, URC_C4, URC_C5, ",
        "URC_D1, URC_D2, URC_D3, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION, PY, PY_ABBR",
        "from T_OU",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_CODE", property="ouCode", jdbcType=JdbcType.NCHAR),
        @Result(column="OU_NAME", property="ouName", jdbcType=JdbcType.NCHAR),
        @Result(column="OU_ABBR", property="ouAbbr", jdbcType=JdbcType.NCHAR),
        @Result(column="OU_TYPE", property="ouType", jdbcType=JdbcType.NCHAR),
        @Result(column="OU_CURR", property="ouCurr", jdbcType=JdbcType.NCHAR),
        @Result(column="OU_STATUS", property="ouStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="RELATED_OU_ID1", property="relatedOuId1", jdbcType=JdbcType.DECIMAL),
        @Result(column="RELATED_OU_ID2", property="relatedOuId2", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="URC_ADDR_NO", property="urcAddrNo", jdbcType=JdbcType.DECIMAL),
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
    TOu selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_CODE, OU_NAME, OU_ABBR, OU_TYPE, OU_CURR, OU_STATUS, RELATED_OU_ID1, ",
        "RELATED_OU_ID2, ADDR_NO, URC_ADDR_NO, URC_C1, URC_C2, URC_C3, URC_C4, URC_C5, ",
        "URC_D1, URC_D2, URC_D3, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION, PY, PY_ABBR",
        "from T_OU"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_CODE", property="ouCode", jdbcType=JdbcType.NCHAR),
        @Result(column="OU_NAME", property="ouName", jdbcType=JdbcType.NCHAR),
        @Result(column="OU_ABBR", property="ouAbbr", jdbcType=JdbcType.NCHAR),
        @Result(column="OU_TYPE", property="ouType", jdbcType=JdbcType.NCHAR),
        @Result(column="OU_CURR", property="ouCurr", jdbcType=JdbcType.NCHAR),
        @Result(column="OU_STATUS", property="ouStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="RELATED_OU_ID1", property="relatedOuId1", jdbcType=JdbcType.DECIMAL),
        @Result(column="RELATED_OU_ID2", property="relatedOuId2", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="URC_ADDR_NO", property="urcAddrNo", jdbcType=JdbcType.DECIMAL),
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
    List<TOu> selectAll();

    @Update({
        "update T_OU",
        "set OU_CODE = #{ouCode,jdbcType=NCHAR},",
          "OU_NAME = #{ouName,jdbcType=NCHAR},",
          "OU_ABBR = #{ouAbbr,jdbcType=NCHAR},",
          "OU_TYPE = #{ouType,jdbcType=NCHAR},",
          "OU_CURR = #{ouCurr,jdbcType=NCHAR},",
          "OU_STATUS = #{ouStatus,jdbcType=NCHAR},",
          "RELATED_OU_ID1 = #{relatedOuId1,jdbcType=DECIMAL},",
          "RELATED_OU_ID2 = #{relatedOuId2,jdbcType=DECIMAL},",
          "ADDR_NO = #{addrNo,jdbcType=DECIMAL},",
          "URC_ADDR_NO = #{urcAddrNo,jdbcType=DECIMAL},",
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
    int updateByPrimaryKey(TOu record);
}