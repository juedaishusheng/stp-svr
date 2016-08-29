package com.el.cfg.mapper;

import com.el.cfg.domain.FSorpt;
import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface FSorptMapper {
    @Select({
        "select",
        "ID, OU_ID, FACT_ID, SO_ID, SO_MANU_ID, PROD_ID, PART_ID, RPT_DT, RPTER_ID, RPTER_NAME, ",
        "RPT_TYPE, RPT_QTY, RPT_UOM, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from F_SORPT",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_ID", property="partId", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPT_DT", property="rptDt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RPTER_ID", property="rpterId", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPTER_NAME", property="rpterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPT_TYPE", property="rptType", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPT_QTY", property="rptQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPT_UOM", property="rptUom", jdbcType=JdbcType.VARCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    FSorpt selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, FACT_ID, SO_ID, SO_MANU_ID, PROD_ID, PART_ID, RPT_DT, RPTER_ID, RPTER_NAME, ",
        "RPT_TYPE, RPT_QTY, RPT_UOM, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from F_SORPT"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="FACT_ID", property="factId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_ID", property="soId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PROD_ID", property="prodId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_ID", property="partId", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPT_DT", property="rptDt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RPTER_ID", property="rpterId", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPTER_NAME", property="rpterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPT_TYPE", property="rptType", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPT_QTY", property="rptQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="RPT_UOM", property="rptUom", jdbcType=JdbcType.VARCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<FSorpt> selectAll();
}