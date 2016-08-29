package com.el.cfg.mapper;

import com.el.cfg.domain.TAddress;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TAddressMapper {
    @Delete({
        "delete from T_ADDRESS",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_ADDRESS (ID, OU_ID, ",
        "ADDR_NO, ADDR_FLAG, CONT_LINE_NO, ",
        "CONT_ADDR_TYPE, ADD1, ",
        "ADD2, ADD3, ADD4, ",
        "COUNTRY, PROVINCE, CITY, ",
        "COUNTY, TOWN, AREA, ",
        "ADDD, ZIP, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{addrNo,jdbcType=DECIMAL}, #{addrFlag,jdbcType=CHAR}, #{contLineNo,jdbcType=DECIMAL}, ",
        "#{contAddrType,jdbcType=NCHAR}, #{add1,jdbcType=NCHAR}, ",
        "#{add2,jdbcType=NCHAR}, #{add3,jdbcType=NCHAR}, #{add4,jdbcType=NCHAR}, ",
        "#{country,jdbcType=NCHAR}, #{province,jdbcType=NCHAR}, #{city,jdbcType=NCHAR}, ",
        "#{county,jdbcType=NCHAR}, #{town,jdbcType=NCHAR}, #{area,jdbcType=NCHAR}, ",
        "#{addd,jdbcType=NCHAR}, #{zip,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_ADDRESS.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TAddress record);

    @Select({
        "select",
        "ID, OU_ID, ADDR_NO, ADDR_FLAG, CONT_LINE_NO, CONT_ADDR_TYPE, ADD1, ADD2, ADD3, ",
        "ADD4, COUNTRY, PROVINCE, CITY, COUNTY, TOWN, AREA, ADDD, ZIP, LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_ADDRESS",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_FLAG", property="addrFlag", jdbcType=JdbcType.CHAR),
        @Result(column="CONT_LINE_NO", property="contLineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="CONT_ADDR_TYPE", property="contAddrType", jdbcType=JdbcType.NCHAR),
        @Result(column="ADD1", property="add1", jdbcType=JdbcType.NCHAR),
        @Result(column="ADD2", property="add2", jdbcType=JdbcType.NCHAR),
        @Result(column="ADD3", property="add3", jdbcType=JdbcType.NCHAR),
        @Result(column="ADD4", property="add4", jdbcType=JdbcType.NCHAR),
        @Result(column="COUNTRY", property="country", jdbcType=JdbcType.NCHAR),
        @Result(column="PROVINCE", property="province", jdbcType=JdbcType.NCHAR),
        @Result(column="CITY", property="city", jdbcType=JdbcType.NCHAR),
        @Result(column="COUNTY", property="county", jdbcType=JdbcType.NCHAR),
        @Result(column="TOWN", property="town", jdbcType=JdbcType.NCHAR),
        @Result(column="AREA", property="area", jdbcType=JdbcType.NCHAR),
        @Result(column="ADDD", property="addd", jdbcType=JdbcType.NCHAR),
        @Result(column="ZIP", property="zip", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TAddress selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, ADDR_NO, ADDR_FLAG, CONT_LINE_NO, CONT_ADDR_TYPE, ADD1, ADD2, ADD3, ",
        "ADD4, COUNTRY, PROVINCE, CITY, COUNTY, TOWN, AREA, ADDD, ZIP, LOCKER_ID, LOCK_TS, ",
        "MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_ADDRESS"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="ADDR_FLAG", property="addrFlag", jdbcType=JdbcType.CHAR),
        @Result(column="CONT_LINE_NO", property="contLineNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="CONT_ADDR_TYPE", property="contAddrType", jdbcType=JdbcType.NCHAR),
        @Result(column="ADD1", property="add1", jdbcType=JdbcType.NCHAR),
        @Result(column="ADD2", property="add2", jdbcType=JdbcType.NCHAR),
        @Result(column="ADD3", property="add3", jdbcType=JdbcType.NCHAR),
        @Result(column="ADD4", property="add4", jdbcType=JdbcType.NCHAR),
        @Result(column="COUNTRY", property="country", jdbcType=JdbcType.NCHAR),
        @Result(column="PROVINCE", property="province", jdbcType=JdbcType.NCHAR),
        @Result(column="CITY", property="city", jdbcType=JdbcType.NCHAR),
        @Result(column="COUNTY", property="county", jdbcType=JdbcType.NCHAR),
        @Result(column="TOWN", property="town", jdbcType=JdbcType.NCHAR),
        @Result(column="AREA", property="area", jdbcType=JdbcType.NCHAR),
        @Result(column="ADDD", property="addd", jdbcType=JdbcType.NCHAR),
        @Result(column="ZIP", property="zip", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TAddress> selectAll();

    @Update({
        "update T_ADDRESS",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "ADDR_NO = #{addrNo,jdbcType=DECIMAL},",
          "ADDR_FLAG = #{addrFlag,jdbcType=CHAR},",
          "CONT_LINE_NO = #{contLineNo,jdbcType=DECIMAL},",
          "CONT_ADDR_TYPE = #{contAddrType,jdbcType=NCHAR},",
          "ADD1 = #{add1,jdbcType=NCHAR},",
          "ADD2 = #{add2,jdbcType=NCHAR},",
          "ADD3 = #{add3,jdbcType=NCHAR},",
          "ADD4 = #{add4,jdbcType=NCHAR},",
          "COUNTRY = #{country,jdbcType=NCHAR},",
          "PROVINCE = #{province,jdbcType=NCHAR},",
          "CITY = #{city,jdbcType=NCHAR},",
          "COUNTY = #{county,jdbcType=NCHAR},",
          "TOWN = #{town,jdbcType=NCHAR},",
          "AREA = #{area,jdbcType=NCHAR},",
          "ADDD = #{addd,jdbcType=NCHAR},",
          "ZIP = #{zip,jdbcType=NCHAR},",
          "LOCKER_ID = #{lockerId,jdbcType=DECIMAL},",
          "LOCK_TS = #{lockTs,jdbcType=TIMESTAMP},",
          "MODIFYER_ID = #{modifyerId,jdbcType=DECIMAL},",
          "MODIFY_TS = #{modifyTs,jdbcType=TIMESTAMP},",
          "MODIFY_APPSVR = #{modifyAppsvr,jdbcType=NCHAR},",
          "MODIFY_MODULE = #{modifyModule,jdbcType=NCHAR},",
          "DATA_VERSION = #{dataVersion,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(TAddress record);
}