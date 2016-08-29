package com.el.cfg.mapper;

import com.el.cfg.domain.TConttel;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TConttelMapper {
    @Delete({
        "delete from T_CONTTEL",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_CONTTEL (ID, OU_ID, ",
        "ADDR_NO, LINE_NO, ",
        "CONT_TYPE, CONT_NAME, ",
        "CONT_ABBR, CONT_TITLE, ",
        "TEL1, TEL2, MOBILE1, ",
        "MOBILE2, FAX, EMAIL1, ",
        "EMAIL2, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{addrNo,jdbcType=DECIMAL}, #{lineNo,jdbcType=DECIMAL}, ",
        "#{contType,jdbcType=NCHAR}, #{contName,jdbcType=NCHAR}, ",
        "#{contAbbr,jdbcType=NCHAR}, #{contTitle,jdbcType=NCHAR}, ",
        "#{tel1,jdbcType=NCHAR}, #{tel2,jdbcType=NCHAR}, #{mobile1,jdbcType=NCHAR}, ",
        "#{mobile2,jdbcType=NCHAR}, #{fax,jdbcType=NCHAR}, #{email1,jdbcType=NCHAR}, ",
        "#{email2,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_CONTTEL.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TConttel record);

    @Select({
        "select",
        "ID, OU_ID, ADDR_NO, LINE_NO, CONT_TYPE, CONT_NAME, CONT_ABBR, CONT_TITLE, TEL1, ",
        "TEL2, MOBILE1, MOBILE2, FAX, EMAIL1, EMAIL2, LOCKER_ID, LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_CONTTEL",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="CONT_TYPE", property="contType", jdbcType=JdbcType.NCHAR),
        @Result(column="CONT_NAME", property="contName", jdbcType=JdbcType.NCHAR),
        @Result(column="CONT_ABBR", property="contAbbr", jdbcType=JdbcType.NCHAR),
        @Result(column="CONT_TITLE", property="contTitle", jdbcType=JdbcType.NCHAR),
        @Result(column="TEL1", property="tel1", jdbcType=JdbcType.NCHAR),
        @Result(column="TEL2", property="tel2", jdbcType=JdbcType.NCHAR),
        @Result(column="MOBILE1", property="mobile1", jdbcType=JdbcType.NCHAR),
        @Result(column="MOBILE2", property="mobile2", jdbcType=JdbcType.NCHAR),
        @Result(column="FAX", property="fax", jdbcType=JdbcType.NCHAR),
        @Result(column="EMAIL1", property="email1", jdbcType=JdbcType.NCHAR),
        @Result(column="EMAIL2", property="email2", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TConttel selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, ADDR_NO, LINE_NO, CONT_TYPE, CONT_NAME, CONT_ABBR, CONT_TITLE, TEL1, ",
        "TEL2, MOBILE1, MOBILE2, FAX, EMAIL1, EMAIL2, LOCKER_ID, LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_CONTTEL"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINE_NO", property="lineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="CONT_TYPE", property="contType", jdbcType=JdbcType.NCHAR),
        @Result(column="CONT_NAME", property="contName", jdbcType=JdbcType.NCHAR),
        @Result(column="CONT_ABBR", property="contAbbr", jdbcType=JdbcType.NCHAR),
        @Result(column="CONT_TITLE", property="contTitle", jdbcType=JdbcType.NCHAR),
        @Result(column="TEL1", property="tel1", jdbcType=JdbcType.NCHAR),
        @Result(column="TEL2", property="tel2", jdbcType=JdbcType.NCHAR),
        @Result(column="MOBILE1", property="mobile1", jdbcType=JdbcType.NCHAR),
        @Result(column="MOBILE2", property="mobile2", jdbcType=JdbcType.NCHAR),
        @Result(column="FAX", property="fax", jdbcType=JdbcType.NCHAR),
        @Result(column="EMAIL1", property="email1", jdbcType=JdbcType.NCHAR),
        @Result(column="EMAIL2", property="email2", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TConttel> selectAll();

    @Update({
        "update T_CONTTEL",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "ADDR_NO = #{addrNo,jdbcType=DECIMAL},",
          "LINE_NO = #{lineNo,jdbcType=DECIMAL},",
          "CONT_TYPE = #{contType,jdbcType=NCHAR},",
          "CONT_NAME = #{contName,jdbcType=NCHAR},",
          "CONT_ABBR = #{contAbbr,jdbcType=NCHAR},",
          "CONT_TITLE = #{contTitle,jdbcType=NCHAR},",
          "TEL1 = #{tel1,jdbcType=NCHAR},",
          "TEL2 = #{tel2,jdbcType=NCHAR},",
          "MOBILE1 = #{mobile1,jdbcType=NCHAR},",
          "MOBILE2 = #{mobile2,jdbcType=NCHAR},",
          "FAX = #{fax,jdbcType=NCHAR},",
          "EMAIL1 = #{email1,jdbcType=NCHAR},",
          "EMAIL2 = #{email2,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TConttel record);
}