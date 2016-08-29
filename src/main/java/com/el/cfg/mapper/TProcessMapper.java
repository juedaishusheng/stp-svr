package com.el.cfg.mapper;

import com.el.cfg.domain.TProcess;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TProcessMapper {
    @Delete({
        "delete from T_PROCESS",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_PROCESS (ID, OU_ID, ",
        "PROCESS_CODE, PROCESS_NAME, ",
        "CAT1, CAT2, CAT3, ",
        "CAT4, CAT5, PROCESS_LEVEL, ",
        "PRICE_UOM, RPT_UOM, DIFFICULTY_FLAG, ",
        "PRICE_PARA1, PRICE_PARA2, ",
        "PRICE_PARA3, PRICE_PARA4, ",
        "PRICE_PARA5, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{processCode,jdbcType=NCHAR}, #{processName,jdbcType=NCHAR}, ",
        "#{cat1,jdbcType=NCHAR}, #{cat2,jdbcType=NCHAR}, #{cat3,jdbcType=NCHAR}, ",
        "#{cat4,jdbcType=NCHAR}, #{cat5,jdbcType=NCHAR}, #{processLevel,jdbcType=NCHAR}, ",
        "#{priceUom,jdbcType=NCHAR}, #{rptUom,jdbcType=NCHAR}, #{difficultyFlag,jdbcType=DECIMAL}, ",
        "#{pricePara1,jdbcType=NCHAR}, #{pricePara2,jdbcType=NCHAR}, ",
        "#{pricePara3,jdbcType=NCHAR}, #{pricePara4,jdbcType=NCHAR}, ",
        "#{pricePara5,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_PROCESS.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TProcess record);

    @Select({
        "select",
        "ID, OU_ID, PROCESS_CODE, PROCESS_NAME, CAT1, CAT2, CAT3, CAT4, CAT5, PROCESS_LEVEL, ",
        "PRICE_UOM, RPT_UOM, DIFFICULTY_FLAG, PRICE_PARA1, PRICE_PARA2, PRICE_PARA3, ",
        "PRICE_PARA4, PRICE_PARA5, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_PROCESS",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_CODE", property="processCode", jdbcType=JdbcType.NCHAR),
        @Result(column="PROCESS_NAME", property="processName", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT1", property="cat1", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT2", property="cat2", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT3", property="cat3", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT4", property="cat4", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT5", property="cat5", jdbcType=JdbcType.NCHAR),
        @Result(column="PROCESS_LEVEL", property="processLevel", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_UOM", property="priceUom", jdbcType=JdbcType.NCHAR),
        @Result(column="RPT_UOM", property="rptUom", jdbcType=JdbcType.NCHAR),
        @Result(column="DIFFICULTY_FLAG", property="difficultyFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_PARA1", property="pricePara1", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_PARA2", property="pricePara2", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_PARA3", property="pricePara3", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_PARA4", property="pricePara4", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_PARA5", property="pricePara5", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TProcess selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, PROCESS_CODE, PROCESS_NAME, CAT1, CAT2, CAT3, CAT4, CAT5, PROCESS_LEVEL, ",
        "PRICE_UOM, RPT_UOM, DIFFICULTY_FLAG, PRICE_PARA1, PRICE_PARA2, PRICE_PARA3, ",
        "PRICE_PARA4, PRICE_PARA5, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_PROCESS"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROCESS_CODE", property="processCode", jdbcType=JdbcType.NCHAR),
        @Result(column="PROCESS_NAME", property="processName", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT1", property="cat1", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT2", property="cat2", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT3", property="cat3", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT4", property="cat4", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT5", property="cat5", jdbcType=JdbcType.NCHAR),
        @Result(column="PROCESS_LEVEL", property="processLevel", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_UOM", property="priceUom", jdbcType=JdbcType.NCHAR),
        @Result(column="RPT_UOM", property="rptUom", jdbcType=JdbcType.NCHAR),
        @Result(column="DIFFICULTY_FLAG", property="difficultyFlag", jdbcType=JdbcType.DECIMAL),
        @Result(column="PRICE_PARA1", property="pricePara1", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_PARA2", property="pricePara2", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_PARA3", property="pricePara3", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_PARA4", property="pricePara4", jdbcType=JdbcType.NCHAR),
        @Result(column="PRICE_PARA5", property="pricePara5", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TProcess> selectAll();

    @Update({
        "update T_PROCESS",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "PROCESS_CODE = #{processCode,jdbcType=NCHAR},",
          "PROCESS_NAME = #{processName,jdbcType=NCHAR},",
          "CAT1 = #{cat1,jdbcType=NCHAR},",
          "CAT2 = #{cat2,jdbcType=NCHAR},",
          "CAT3 = #{cat3,jdbcType=NCHAR},",
          "CAT4 = #{cat4,jdbcType=NCHAR},",
          "CAT5 = #{cat5,jdbcType=NCHAR},",
          "PROCESS_LEVEL = #{processLevel,jdbcType=NCHAR},",
          "PRICE_UOM = #{priceUom,jdbcType=NCHAR},",
          "RPT_UOM = #{rptUom,jdbcType=NCHAR},",
          "DIFFICULTY_FLAG = #{difficultyFlag,jdbcType=DECIMAL},",
          "PRICE_PARA1 = #{pricePara1,jdbcType=NCHAR},",
          "PRICE_PARA2 = #{pricePara2,jdbcType=NCHAR},",
          "PRICE_PARA3 = #{pricePara3,jdbcType=NCHAR},",
          "PRICE_PARA4 = #{pricePara4,jdbcType=NCHAR},",
          "PRICE_PARA5 = #{pricePara5,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TProcess record);
}