package com.el.cfg.mapper;

import com.el.cfg.domain.TSoManupaper;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TSoManupaperMapper {
    @Delete({
        "delete from T_SO_MANUPAPER",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_SO_MANUPAPER (ID, SO_PROD_ID, ",
        "SO_MANU_ID, PART_ID, ",
        "PAPER_ITEM_ID, PAPER_SOURCE, ",
        "QTY, UOM, PAPER_READY_STATUS, ",
        "REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{soProdId,jdbcType=DECIMAL}, ",
        "#{soManuId,jdbcType=DECIMAL}, #{partId,jdbcType=DECIMAL}, ",
        "#{paperItemId,jdbcType=DECIMAL}, #{paperSource,jdbcType=NCHAR}, ",
        "#{qty,jdbcType=DECIMAL}, #{uom,jdbcType=NCHAR}, #{paperReadyStatus,jdbcType=NCHAR}, ",
        "#{remark,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_SO_MANUPAPER.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TSoManupaper record);

    @Select({
        "select",
        "ID, SO_PROD_ID, SO_MANU_ID, PART_ID, PAPER_ITEM_ID, PAPER_SOURCE, QTY, UOM, ",
        "PAPER_READY_STATUS, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_SO_MANUPAPER",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="SO_PROD_ID", property="soProdId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_ID", property="partId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_ITEM_ID", property="paperItemId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_SOURCE", property="paperSource", jdbcType=JdbcType.NCHAR),
        @Result(column="QTY", property="qty", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_READY_STATUS", property="paperReadyStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TSoManupaper selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, SO_PROD_ID, SO_MANU_ID, PART_ID, PAPER_ITEM_ID, PAPER_SOURCE, QTY, UOM, ",
        "PAPER_READY_STATUS, REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION",
        "from T_SO_MANUPAPER"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="SO_PROD_ID", property="soProdId", jdbcType=JdbcType.DECIMAL),
        @Result(column="SO_MANU_ID", property="soManuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PART_ID", property="partId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_ITEM_ID", property="paperItemId", jdbcType=JdbcType.DECIMAL),
        @Result(column="PAPER_SOURCE", property="paperSource", jdbcType=JdbcType.NCHAR),
        @Result(column="QTY", property="qty", jdbcType=JdbcType.DECIMAL),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="PAPER_READY_STATUS", property="paperReadyStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TSoManupaper> selectAll();

    @Update({
        "update T_SO_MANUPAPER",
        "set SO_PROD_ID = #{soProdId,jdbcType=DECIMAL},",
          "SO_MANU_ID = #{soManuId,jdbcType=DECIMAL},",
          "PART_ID = #{partId,jdbcType=DECIMAL},",
          "PAPER_ITEM_ID = #{paperItemId,jdbcType=DECIMAL},",
          "PAPER_SOURCE = #{paperSource,jdbcType=NCHAR},",
          "QTY = #{qty,jdbcType=DECIMAL},",
          "UOM = #{uom,jdbcType=NCHAR},",
          "PAPER_READY_STATUS = #{paperReadyStatus,jdbcType=NCHAR},",
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
    int updateByPrimaryKey(TSoManupaper record);
}