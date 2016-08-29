package com.el.cfg.mapper;

import com.el.cfg.domain.TUdc;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TUdcMapper {
    @Delete({
        "delete from T_UDC",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_UDC (ID, OU_ID, ",
        "MCU_ID, DOMAIN_CODE, ",
        "UDC_TYPE, UDC_CODE, VAL_ENABLED, ",
        "VAL_SPHD, VAL_DESC1, VAL_DESC2, ",
        "SORT_NO, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{mcuId,jdbcType=DECIMAL}, #{domainCode,jdbcType=NCHAR}, ",
        "#{udcType,jdbcType=NCHAR}, #{udcCode,jdbcType=NCHAR}, #{valEnabled,jdbcType=DECIMAL}, ",
        "#{valSphd,jdbcType=NCHAR}, #{valDesc1,jdbcType=NCHAR}, #{valDesc2,jdbcType=NCHAR}, ",
        "#{sortNo,jdbcType=DECIMAL}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_UDC.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TUdc record);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, DOMAIN_CODE, UDC_TYPE, UDC_CODE, VAL_ENABLED, VAL_SPHD, VAL_DESC1, ",
        "VAL_DESC2, SORT_NO, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_UDC",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DOMAIN_CODE", property="domainCode", jdbcType=JdbcType.NCHAR),
        @Result(column="UDC_TYPE", property="udcType", jdbcType=JdbcType.NCHAR),
        @Result(column="UDC_CODE", property="udcCode", jdbcType=JdbcType.NCHAR),
        @Result(column="VAL_ENABLED", property="valEnabled", jdbcType=JdbcType.DECIMAL),
        @Result(column="VAL_SPHD", property="valSphd", jdbcType=JdbcType.NCHAR),
        @Result(column="VAL_DESC1", property="valDesc1", jdbcType=JdbcType.NCHAR),
        @Result(column="VAL_DESC2", property="valDesc2", jdbcType=JdbcType.NCHAR),
        @Result(column="SORT_NO", property="sortNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TUdc selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, DOMAIN_CODE, UDC_TYPE, UDC_CODE, VAL_ENABLED, VAL_SPHD, VAL_DESC1, ",
        "VAL_DESC2, SORT_NO, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_UDC"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DOMAIN_CODE", property="domainCode", jdbcType=JdbcType.NCHAR),
        @Result(column="UDC_TYPE", property="udcType", jdbcType=JdbcType.NCHAR),
        @Result(column="UDC_CODE", property="udcCode", jdbcType=JdbcType.NCHAR),
        @Result(column="VAL_ENABLED", property="valEnabled", jdbcType=JdbcType.DECIMAL),
        @Result(column="VAL_SPHD", property="valSphd", jdbcType=JdbcType.NCHAR),
        @Result(column="VAL_DESC1", property="valDesc1", jdbcType=JdbcType.NCHAR),
        @Result(column="VAL_DESC2", property="valDesc2", jdbcType=JdbcType.NCHAR),
        @Result(column="SORT_NO", property="sortNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TUdc> selectAll();

    @Update({
        "update T_UDC",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "MCU_ID = #{mcuId,jdbcType=DECIMAL},",
          "DOMAIN_CODE = #{domainCode,jdbcType=NCHAR},",
          "UDC_TYPE = #{udcType,jdbcType=NCHAR},",
          "UDC_CODE = #{udcCode,jdbcType=NCHAR},",
          "VAL_ENABLED = #{valEnabled,jdbcType=DECIMAL},",
          "VAL_SPHD = #{valSphd,jdbcType=NCHAR},",
          "VAL_DESC1 = #{valDesc1,jdbcType=NCHAR},",
          "VAL_DESC2 = #{valDesc2,jdbcType=NCHAR},",
          "SORT_NO = #{sortNo,jdbcType=DECIMAL},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TUdc record);
}