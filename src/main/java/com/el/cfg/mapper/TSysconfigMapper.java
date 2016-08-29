package com.el.cfg.mapper;

import com.el.cfg.domain.TSysconfig;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TSysconfigMapper {
    @Delete({
        "delete from T_SYSCONFIG",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_SYSCONFIG (ID, CONF_CODE, ",
        "CONF_NAME, CONF_TYPE, ",
        "CONF_DESC, CONF_VALUE, ",
        "OU_ID, USER_ID, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{confCode,jdbcType=NCHAR}, ",
        "#{confName,jdbcType=NCHAR}, #{confType,jdbcType=NCHAR}, ",
        "#{confDesc,jdbcType=NCHAR}, #{confValue,jdbcType=NCHAR}, ",
        "#{ouId,jdbcType=DECIMAL}, #{userId,jdbcType=DECIMAL}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_SYSCONFIG.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TSysconfig record);

    @Select({
        "select",
        "ID, CONF_CODE, CONF_NAME, CONF_TYPE, CONF_DESC, CONF_VALUE, OU_ID, USER_ID, ",
        "LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_SYSCONFIG",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="CONF_CODE", property="confCode", jdbcType=JdbcType.NCHAR),
        @Result(column="CONF_NAME", property="confName", jdbcType=JdbcType.NCHAR),
        @Result(column="CONF_TYPE", property="confType", jdbcType=JdbcType.NCHAR),
        @Result(column="CONF_DESC", property="confDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="CONF_VALUE", property="confValue", jdbcType=JdbcType.NCHAR),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TSysconfig selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, CONF_CODE, CONF_NAME, CONF_TYPE, CONF_DESC, CONF_VALUE, OU_ID, USER_ID, ",
        "LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_SYSCONFIG"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="CONF_CODE", property="confCode", jdbcType=JdbcType.NCHAR),
        @Result(column="CONF_NAME", property="confName", jdbcType=JdbcType.NCHAR),
        @Result(column="CONF_TYPE", property="confType", jdbcType=JdbcType.NCHAR),
        @Result(column="CONF_DESC", property="confDesc", jdbcType=JdbcType.NCHAR),
        @Result(column="CONF_VALUE", property="confValue", jdbcType=JdbcType.NCHAR),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TSysconfig> selectAll();

    @Update({
        "update T_SYSCONFIG",
        "set CONF_CODE = #{confCode,jdbcType=NCHAR},",
          "CONF_NAME = #{confName,jdbcType=NCHAR},",
          "CONF_TYPE = #{confType,jdbcType=NCHAR},",
          "CONF_DESC = #{confDesc,jdbcType=NCHAR},",
          "CONF_VALUE = #{confValue,jdbcType=NCHAR},",
          "OU_ID = #{ouId,jdbcType=DECIMAL},",
          "USER_ID = #{userId,jdbcType=DECIMAL},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TSysconfig record);
}