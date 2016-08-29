package com.el.cfg.mapper;

import com.el.cfg.domain.TAddrnoStructure;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TAddrnoStructureMapper {
    @Delete({
        "delete from T_ADDRNO_STRUCTURE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_ADDRNO_STRUCTURE (ID, STRU_TYPE, ",
        "PARENT_ADDRNO, CHILD_ADDRNO, ",
        "DISP_SEQUENCE, FROM_DATE, ",
        "TO_DATE, REMARK, ",
        "LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, ",
        "MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{struType,jdbcType=NCHAR}, ",
        "#{parentAddrno,jdbcType=DECIMAL}, #{childAddrno,jdbcType=DECIMAL}, ",
        "#{dispSequence,jdbcType=DECIMAL}, #{fromDate,jdbcType=TIMESTAMP}, ",
        "#{toDate,jdbcType=TIMESTAMP}, #{remark,jdbcType=NCHAR}, ",
        "#{lockerId,jdbcType=DECIMAL}, #{lockTs,jdbcType=TIMESTAMP}, ",
        "#{modifyerId,jdbcType=DECIMAL}, #{modifyTs,jdbcType=TIMESTAMP}, ",
        "#{modifyAppsvr,jdbcType=NCHAR}, #{modifyModule,jdbcType=NCHAR}, ",
        "#{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_ADDRNO_STRUCTURE.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TAddrnoStructure record);

    @Select({
        "select",
        "ID, STRU_TYPE, PARENT_ADDRNO, CHILD_ADDRNO, DISP_SEQUENCE, FROM_DATE, TO_DATE, ",
        "REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION",
        "from T_ADDRNO_STRUCTURE",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="STRU_TYPE", property="struType", jdbcType=JdbcType.NCHAR),
        @Result(column="PARENT_ADDRNO", property="parentAddrno", jdbcType=JdbcType.DECIMAL),
        @Result(column="CHILD_ADDRNO", property="childAddrno", jdbcType=JdbcType.DECIMAL),
        @Result(column="DISP_SEQUENCE", property="dispSequence", jdbcType=JdbcType.DECIMAL),
        @Result(column="FROM_DATE", property="fromDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TO_DATE", property="toDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TAddrnoStructure selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, STRU_TYPE, PARENT_ADDRNO, CHILD_ADDRNO, DISP_SEQUENCE, FROM_DATE, TO_DATE, ",
        "REMARK, LOCKER_ID, LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, ",
        "DATA_VERSION",
        "from T_ADDRNO_STRUCTURE"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="STRU_TYPE", property="struType", jdbcType=JdbcType.NCHAR),
        @Result(column="PARENT_ADDRNO", property="parentAddrno", jdbcType=JdbcType.DECIMAL),
        @Result(column="CHILD_ADDRNO", property="childAddrno", jdbcType=JdbcType.DECIMAL),
        @Result(column="DISP_SEQUENCE", property="dispSequence", jdbcType=JdbcType.DECIMAL),
        @Result(column="FROM_DATE", property="fromDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TO_DATE", property="toDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TAddrnoStructure> selectAll();

    @Update({
        "update T_ADDRNO_STRUCTURE",
        "set STRU_TYPE = #{struType,jdbcType=NCHAR},",
          "PARENT_ADDRNO = #{parentAddrno,jdbcType=DECIMAL},",
          "CHILD_ADDRNO = #{childAddrno,jdbcType=DECIMAL},",
          "DISP_SEQUENCE = #{dispSequence,jdbcType=DECIMAL},",
          "FROM_DATE = #{fromDate,jdbcType=TIMESTAMP},",
          "TO_DATE = #{toDate,jdbcType=TIMESTAMP},",
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
    int updateByPrimaryKey(TAddrnoStructure record);
}