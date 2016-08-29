package com.el.cfg.mapper;

import com.el.cfg.domain.TCust;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TCustMapper {
    @Delete({
        "delete from T_CUST",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_CUST (ID, OU_ID, ",
        "MCU_ID, CUST_CODE, CUST_NAME, ",
        "CUST_ABBR, CUST_STATUS, ",
        "ADDR_NO, ACC_CLASS, ",
        "CURR_CODE, TAX_AREA, TAX_CODE, ",
        "CREDIT_LIMIT, BLOCK_FLAG, ",
        "PAYMENT_TERMS, PAYMENT_METHOD, ",
        "PIC_ID, OPEN_BY_NAME, ",
        "OPEN_DATE, PRICE_GROUP, ",
        "URC_C1, URC_C2, URC_C3, ",
        "URC_C4, URC_C5, URC_D1, ",
        "URC_D2, URC_D3, ",
        "URC_N1, URC_N2, URC_N3, ",
        "URC_N4, URC_N5, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION, ",
        "PY, PY_ABBR)",
        "values (#{id,jdbcType=DECIMAL}, #{ouId,jdbcType=DECIMAL}, ",
        "#{mcuId,jdbcType=DECIMAL}, #{custCode,jdbcType=NCHAR}, #{custName,jdbcType=NCHAR}, ",
        "#{custAbbr,jdbcType=NCHAR}, #{custStatus,jdbcType=NCHAR}, ",
        "#{addrNo,jdbcType=DECIMAL}, #{accClass,jdbcType=NCHAR}, ",
        "#{currCode,jdbcType=NCHAR}, #{taxArea,jdbcType=NCHAR}, #{taxCode,jdbcType=NCHAR}, ",
        "#{creditLimit,jdbcType=DECIMAL}, #{blockFlag,jdbcType=CHAR}, ",
        "#{paymentTerms,jdbcType=NCHAR}, #{paymentMethod,jdbcType=NCHAR}, ",
        "#{picId,jdbcType=DECIMAL}, #{openByName,jdbcType=NCHAR}, ",
        "#{openDate,jdbcType=TIMESTAMP}, #{priceGroup,jdbcType=NCHAR}, ",
        "#{urcC1,jdbcType=NCHAR}, #{urcC2,jdbcType=NCHAR}, #{urcC3,jdbcType=NCHAR}, ",
        "#{urcC4,jdbcType=NCHAR}, #{urcC5,jdbcType=NCHAR}, #{urcD1,jdbcType=TIMESTAMP}, ",
        "#{urcD2,jdbcType=TIMESTAMP}, #{urcD3,jdbcType=TIMESTAMP}, ",
        "#{urcN1,jdbcType=DECIMAL}, #{urcN2,jdbcType=DECIMAL}, #{urcN3,jdbcType=DECIMAL}, ",
        "#{urcN4,jdbcType=DECIMAL}, #{urcN5,jdbcType=DECIMAL}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL}, ",
        "#{py,jdbcType=NCHAR}, #{pyAbbr,jdbcType=NCHAR})"
    })
    @SelectKey(statement="SELECT SEQ_T_CUST.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TCust record);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, CUST_CODE, CUST_NAME, CUST_ABBR, CUST_STATUS, ADDR_NO, ACC_CLASS, ",
        "CURR_CODE, TAX_AREA, TAX_CODE, CREDIT_LIMIT, BLOCK_FLAG, PAYMENT_TERMS, PAYMENT_METHOD, ",
        "PIC_ID, OPEN_BY_NAME, OPEN_DATE, PRICE_GROUP, URC_C1, URC_C2, URC_C3, URC_C4, ",
        "URC_C5, URC_D1, URC_D2, URC_D3, URC_N1, URC_N2, URC_N3, URC_N4, URC_N5, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION, ",
        "PY, PY_ABBR",
        "from T_CUST",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUST_CODE", property="custCode", jdbcType=JdbcType.NCHAR),
        @Result(column="CUST_NAME", property="custName", jdbcType=JdbcType.NCHAR),
        @Result(column="CUST_ABBR", property="custAbbr", jdbcType=JdbcType.NCHAR),
        @Result(column="CUST_STATUS", property="custStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="ACC_CLASS", property="accClass", jdbcType=JdbcType.NCHAR),
        @Result(column="CURR_CODE", property="currCode", jdbcType=JdbcType.NCHAR),
        @Result(column="TAX_AREA", property="taxArea", jdbcType=JdbcType.NCHAR),
        @Result(column="TAX_CODE", property="taxCode", jdbcType=JdbcType.NCHAR),
        @Result(column="CREDIT_LIMIT", property="creditLimit", jdbcType=JdbcType.DECIMAL),
        @Result(column="BLOCK_FLAG", property="blockFlag", jdbcType=JdbcType.CHAR),
        @Result(column="PAYMENT_TERMS", property="paymentTerms", jdbcType=JdbcType.NCHAR),
        @Result(column="PAYMENT_METHOD", property="paymentMethod", jdbcType=JdbcType.NCHAR),
        @Result(column="PIC_ID", property="picId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OPEN_BY_NAME", property="openByName", jdbcType=JdbcType.NCHAR),
        @Result(column="OPEN_DATE", property="openDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PRICE_GROUP", property="priceGroup", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C1", property="urcC1", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C2", property="urcC2", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C3", property="urcC3", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C4", property="urcC4", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C5", property="urcC5", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_D1", property="urcD1", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="URC_D2", property="urcD2", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="URC_D3", property="urcD3", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="URC_N1", property="urcN1", jdbcType=JdbcType.DECIMAL),
        @Result(column="URC_N2", property="urcN2", jdbcType=JdbcType.DECIMAL),
        @Result(column="URC_N3", property="urcN3", jdbcType=JdbcType.DECIMAL),
        @Result(column="URC_N4", property="urcN4", jdbcType=JdbcType.DECIMAL),
        @Result(column="URC_N5", property="urcN5", jdbcType=JdbcType.DECIMAL),
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
    TCust selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OU_ID, MCU_ID, CUST_CODE, CUST_NAME, CUST_ABBR, CUST_STATUS, ADDR_NO, ACC_CLASS, ",
        "CURR_CODE, TAX_AREA, TAX_CODE, CREDIT_LIMIT, BLOCK_FLAG, PAYMENT_TERMS, PAYMENT_METHOD, ",
        "PIC_ID, OPEN_BY_NAME, OPEN_DATE, PRICE_GROUP, URC_C1, URC_C2, URC_C3, URC_C4, ",
        "URC_C5, URC_D1, URC_D2, URC_D3, URC_N1, URC_N2, URC_N3, URC_N4, URC_N5, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION, ",
        "PY, PY_ABBR",
        "from T_CUST"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OU_ID", property="ouId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MCU_ID", property="mcuId", jdbcType=JdbcType.DECIMAL),
        @Result(column="CUST_CODE", property="custCode", jdbcType=JdbcType.NCHAR),
        @Result(column="CUST_NAME", property="custName", jdbcType=JdbcType.NCHAR),
        @Result(column="CUST_ABBR", property="custAbbr", jdbcType=JdbcType.NCHAR),
        @Result(column="CUST_STATUS", property="custStatus", jdbcType=JdbcType.NCHAR),
        @Result(column="ADDR_NO", property="addrNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="ACC_CLASS", property="accClass", jdbcType=JdbcType.NCHAR),
        @Result(column="CURR_CODE", property="currCode", jdbcType=JdbcType.NCHAR),
        @Result(column="TAX_AREA", property="taxArea", jdbcType=JdbcType.NCHAR),
        @Result(column="TAX_CODE", property="taxCode", jdbcType=JdbcType.NCHAR),
        @Result(column="CREDIT_LIMIT", property="creditLimit", jdbcType=JdbcType.DECIMAL),
        @Result(column="BLOCK_FLAG", property="blockFlag", jdbcType=JdbcType.CHAR),
        @Result(column="PAYMENT_TERMS", property="paymentTerms", jdbcType=JdbcType.NCHAR),
        @Result(column="PAYMENT_METHOD", property="paymentMethod", jdbcType=JdbcType.NCHAR),
        @Result(column="PIC_ID", property="picId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OPEN_BY_NAME", property="openByName", jdbcType=JdbcType.NCHAR),
        @Result(column="OPEN_DATE", property="openDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PRICE_GROUP", property="priceGroup", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C1", property="urcC1", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C2", property="urcC2", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C3", property="urcC3", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C4", property="urcC4", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_C5", property="urcC5", jdbcType=JdbcType.NCHAR),
        @Result(column="URC_D1", property="urcD1", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="URC_D2", property="urcD2", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="URC_D3", property="urcD3", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="URC_N1", property="urcN1", jdbcType=JdbcType.DECIMAL),
        @Result(column="URC_N2", property="urcN2", jdbcType=JdbcType.DECIMAL),
        @Result(column="URC_N3", property="urcN3", jdbcType=JdbcType.DECIMAL),
        @Result(column="URC_N4", property="urcN4", jdbcType=JdbcType.DECIMAL),
        @Result(column="URC_N5", property="urcN5", jdbcType=JdbcType.DECIMAL),
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
    List<TCust> selectAll();

    @Update({
        "update T_CUST",
        "set OU_ID = #{ouId,jdbcType=DECIMAL},",
          "MCU_ID = #{mcuId,jdbcType=DECIMAL},",
          "CUST_CODE = #{custCode,jdbcType=NCHAR},",
          "CUST_NAME = #{custName,jdbcType=NCHAR},",
          "CUST_ABBR = #{custAbbr,jdbcType=NCHAR},",
          "CUST_STATUS = #{custStatus,jdbcType=NCHAR},",
          "ADDR_NO = #{addrNo,jdbcType=DECIMAL},",
          "ACC_CLASS = #{accClass,jdbcType=NCHAR},",
          "CURR_CODE = #{currCode,jdbcType=NCHAR},",
          "TAX_AREA = #{taxArea,jdbcType=NCHAR},",
          "TAX_CODE = #{taxCode,jdbcType=NCHAR},",
          "CREDIT_LIMIT = #{creditLimit,jdbcType=DECIMAL},",
          "BLOCK_FLAG = #{blockFlag,jdbcType=CHAR},",
          "PAYMENT_TERMS = #{paymentTerms,jdbcType=NCHAR},",
          "PAYMENT_METHOD = #{paymentMethod,jdbcType=NCHAR},",
          "PIC_ID = #{picId,jdbcType=DECIMAL},",
          "OPEN_BY_NAME = #{openByName,jdbcType=NCHAR},",
          "OPEN_DATE = #{openDate,jdbcType=TIMESTAMP},",
          "PRICE_GROUP = #{priceGroup,jdbcType=NCHAR},",
          "URC_C1 = #{urcC1,jdbcType=NCHAR},",
          "URC_C2 = #{urcC2,jdbcType=NCHAR},",
          "URC_C3 = #{urcC3,jdbcType=NCHAR},",
          "URC_C4 = #{urcC4,jdbcType=NCHAR},",
          "URC_C5 = #{urcC5,jdbcType=NCHAR},",
          "URC_D1 = #{urcD1,jdbcType=TIMESTAMP},",
          "URC_D2 = #{urcD2,jdbcType=TIMESTAMP},",
          "URC_D3 = #{urcD3,jdbcType=TIMESTAMP},",
          "URC_N1 = #{urcN1,jdbcType=DECIMAL},",
          "URC_N2 = #{urcN2,jdbcType=DECIMAL},",
          "URC_N3 = #{urcN3,jdbcType=DECIMAL},",
          "URC_N4 = #{urcN4,jdbcType=DECIMAL},",
          "URC_N5 = #{urcN5,jdbcType=DECIMAL},",
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
    int updateByPrimaryKey(TCust record);
}