package com.el.cfg.mapper;

import com.el.cfg.domain.TDelinoteDeli;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TDelinoteDeliMapper {
    @Delete({
        "delete from T_DELINOTE_DELI",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_DELINOTE_DELI (ID, DELINOTE_PROD_ID, ",
        "DELI_DATE, DELI_QTY, ",
        "GIFT_QTY, TRANS_COMPANY_ADDRNO, ",
        "TRNAS_COMPANY, TRANS_NO, ",
        "CARGO_NO, CARGO_PIC, CARGO_PERSON, ",
        "FEE1, FEE2, FEE3, ",
        "REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION)",
        "values (#{id,jdbcType=DECIMAL}, #{delinoteProdId,jdbcType=DECIMAL}, ",
        "#{deliDate,jdbcType=TIMESTAMP}, #{deliQty,jdbcType=DECIMAL}, ",
        "#{giftQty,jdbcType=DECIMAL}, #{transCompanyAddrno,jdbcType=DECIMAL}, ",
        "#{trnasCompany,jdbcType=NCHAR}, #{transNo,jdbcType=NCHAR}, ",
        "#{cargoNo,jdbcType=NCHAR}, #{cargoPic,jdbcType=NCHAR}, #{cargoPerson,jdbcType=NCHAR}, ",
        "#{fee1,jdbcType=DECIMAL}, #{fee2,jdbcType=DECIMAL}, #{fee3,jdbcType=DECIMAL}, ",
        "#{remark,jdbcType=NCHAR}, #{lockerId,jdbcType=DECIMAL}, ",
        "#{lockTs,jdbcType=TIMESTAMP}, #{modifyerId,jdbcType=DECIMAL}, ",
        "#{modifyTs,jdbcType=TIMESTAMP}, #{modifyAppsvr,jdbcType=NCHAR}, ",
        "#{modifyModule,jdbcType=NCHAR}, #{dataVersion,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT SEQ_T_DELINOTE_DELI.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TDelinoteDeli record);

    @Select({
        "select",
        "ID, DELINOTE_PROD_ID, DELI_DATE, DELI_QTY, GIFT_QTY, TRANS_COMPANY_ADDRNO, TRNAS_COMPANY, ",
        "TRANS_NO, CARGO_NO, CARGO_PIC, CARGO_PERSON, FEE1, FEE2, FEE3, REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_DELINOTE_DELI",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="DELINOTE_PROD_ID", property="delinoteProdId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DELI_DATE", property="deliDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DELI_QTY", property="deliQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="GIFT_QTY", property="giftQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="TRANS_COMPANY_ADDRNO", property="transCompanyAddrno", jdbcType=JdbcType.DECIMAL),
        @Result(column="TRNAS_COMPANY", property="trnasCompany", jdbcType=JdbcType.NCHAR),
        @Result(column="TRANS_NO", property="transNo", jdbcType=JdbcType.NCHAR),
        @Result(column="CARGO_NO", property="cargoNo", jdbcType=JdbcType.NCHAR),
        @Result(column="CARGO_PIC", property="cargoPic", jdbcType=JdbcType.NCHAR),
        @Result(column="CARGO_PERSON", property="cargoPerson", jdbcType=JdbcType.NCHAR),
        @Result(column="FEE1", property="fee1", jdbcType=JdbcType.DECIMAL),
        @Result(column="FEE2", property="fee2", jdbcType=JdbcType.DECIMAL),
        @Result(column="FEE3", property="fee3", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    TDelinoteDeli selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, DELINOTE_PROD_ID, DELI_DATE, DELI_QTY, GIFT_QTY, TRANS_COMPANY_ADDRNO, TRNAS_COMPANY, ",
        "TRANS_NO, CARGO_NO, CARGO_PIC, CARGO_PERSON, FEE1, FEE2, FEE3, REMARK, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION",
        "from T_DELINOTE_DELI"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="DELINOTE_PROD_ID", property="delinoteProdId", jdbcType=JdbcType.DECIMAL),
        @Result(column="DELI_DATE", property="deliDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DELI_QTY", property="deliQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="GIFT_QTY", property="giftQty", jdbcType=JdbcType.DECIMAL),
        @Result(column="TRANS_COMPANY_ADDRNO", property="transCompanyAddrno", jdbcType=JdbcType.DECIMAL),
        @Result(column="TRNAS_COMPANY", property="trnasCompany", jdbcType=JdbcType.NCHAR),
        @Result(column="TRANS_NO", property="transNo", jdbcType=JdbcType.NCHAR),
        @Result(column="CARGO_NO", property="cargoNo", jdbcType=JdbcType.NCHAR),
        @Result(column="CARGO_PIC", property="cargoPic", jdbcType=JdbcType.NCHAR),
        @Result(column="CARGO_PERSON", property="cargoPerson", jdbcType=JdbcType.NCHAR),
        @Result(column="FEE1", property="fee1", jdbcType=JdbcType.DECIMAL),
        @Result(column="FEE2", property="fee2", jdbcType=JdbcType.DECIMAL),
        @Result(column="FEE3", property="fee3", jdbcType=JdbcType.DECIMAL),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.NCHAR),
        @Result(column="LOCKER_ID", property="lockerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="LOCK_TS", property="lockTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFYER_ID", property="modifyerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="MODIFY_TS", property="modifyTs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_APPSVR", property="modifyAppsvr", jdbcType=JdbcType.NCHAR),
        @Result(column="MODIFY_MODULE", property="modifyModule", jdbcType=JdbcType.NCHAR),
        @Result(column="DATA_VERSION", property="dataVersion", jdbcType=JdbcType.DECIMAL)
    })
    List<TDelinoteDeli> selectAll();

    @Update({
        "update T_DELINOTE_DELI",
        "set DELINOTE_PROD_ID = #{delinoteProdId,jdbcType=DECIMAL},",
          "DELI_DATE = #{deliDate,jdbcType=TIMESTAMP},",
          "DELI_QTY = #{deliQty,jdbcType=DECIMAL},",
          "GIFT_QTY = #{giftQty,jdbcType=DECIMAL},",
          "TRANS_COMPANY_ADDRNO = #{transCompanyAddrno,jdbcType=DECIMAL},",
          "TRNAS_COMPANY = #{trnasCompany,jdbcType=NCHAR},",
          "TRANS_NO = #{transNo,jdbcType=NCHAR},",
          "CARGO_NO = #{cargoNo,jdbcType=NCHAR},",
          "CARGO_PIC = #{cargoPic,jdbcType=NCHAR},",
          "CARGO_PERSON = #{cargoPerson,jdbcType=NCHAR},",
          "FEE1 = #{fee1,jdbcType=DECIMAL},",
          "FEE2 = #{fee2,jdbcType=DECIMAL},",
          "FEE3 = #{fee3,jdbcType=DECIMAL},",
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
    int updateByPrimaryKey(TDelinoteDeli record);
}