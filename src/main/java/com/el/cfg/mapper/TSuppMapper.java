package com.el.cfg.mapper;

import com.el.cfg.domain.TSupp;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TSuppMapper {
    @Delete({
        "delete from T_SUPP",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_SUPP (ID, OU_ID, ",
        "MCU_ID, SUPP_CODE, SUPP_NAME, ",
        "SUPP_ABBR, ADDR_NO, ",
        "ACC_CLASS, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION, ",
        "PY, PY_ABBR)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{mcuId,jdbcType=DECIMAL}, #{suppCode,jdbcType=NCHAR}, #{suppName,jdbcType=NCHAR}, ",
        "#{suppAbbr,jdbcType=NCHAR}, #{addrNo,jdbcType=DECIMAL}, ",
        "#{accClass,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL}, ",
        "#{py,jdbcType=NCHAR}, #{pyAbbr,jdbcType=NCHAR})"
    })
    @SelectKey(statement="SELECT SEQ_T_SUPP.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TSupp record);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, SUPP_CODE, SUPP_NAME, SUPP_ABBR, ADDR_NO, ACC_CLASS, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION, ",
        "PY, PY_ABBR",
        "from T_SUPP",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SUPP_CODE", property="suppCode", jdbcType=JdbcType.NCHAR),
        @Result(column="SUPP_NAME", property="suppName", jdbcType=JdbcType.NCHAR),
        @Result(column="SUPP_ABBR", property="suppAbbr", jdbcType=JdbcType.NCHAR),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="ACC_CLASS", property="accClass", jdbcType=JdbcType.NCHAR),
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
    TSupp selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, SUPP_CODE, SUPP_NAME, SUPP_ABBR, ADDR_NO, ACC_CLASS, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION, ",
        "PY, PY_ABBR",
        "from T_SUPP"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SUPP_CODE", property="suppCode", jdbcType=JdbcType.NCHAR),
        @Result(column="SUPP_NAME", property="suppName", jdbcType=JdbcType.NCHAR),
        @Result(column="SUPP_ABBR", property="suppAbbr", jdbcType=JdbcType.NCHAR),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="ACC_CLASS", property="accClass", jdbcType=JdbcType.NCHAR),
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
    List<TSupp> selectAll();

    @Update({
        "update T_SUPP",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "MCU_ID = #{mcuId,jdbcType=DECIMAL},",
          "SUPP_CODE = #{suppCode,jdbcType=NCHAR},",
          "SUPP_NAME = #{suppName,jdbcType=NCHAR},",
          "SUPP_ABBR = #{suppAbbr,jdbcType=NCHAR},",
          "ADDR_NO = #{addrNo,jdbcType=DECIMAL},",
          "ACC_CLASS = #{accClass,jdbcType=NCHAR},",
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
    int updateByPrimaryKey(TSupp record);
}