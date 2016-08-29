package com.el.cfg.mapper;

import com.el.cfg.domain.TItem;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TItemMapper {
    @Delete({
        "delete from T_ITEM",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into T_ITEM (ID, OUTER_ID, ",
        "OUTER_ID2, OUTER_ID3, ",
        "ITEM_CODE, ITEM_NAME, ",
        "FULL_NAME, STORE_TYPE, ",
        "LINE_TYPE, BRIEF, SPEC, ",
        "CAT1, CAT2, CAT3, ",
        "CAT4, CAT5, CAT6, ",
        "CAT7, CAT8, CAT9, ",
        "CAT10, PRP1, PRP2, ",
        "PRP3, PRP4, PRP5, ",
        "PRP6, PRP7, PRP8, ",
        "PRP9, PRP10, UOM, ",
        "UOM2, UOM3, UOM4, ",
        "UOM5, UOM6, UOM7, ",
        "WEIGHT, VOLUME, ",
        "URC_C1, URC_C2, URC_C3, ",
        "URC_C4, URC_C5, URC_D1, ",
        "URC_D2, URC_D3, ",
        "URC_N1, URC_N2, URC_N3, ",
        "URC_N4, URC_N5, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, ",
        "MODIFY_TS, MODIFY_APPSVR, ",
        "MODIFY_MODULE, DATA_VERSION, ",
        "PY, PY_ABBR)",
        "values (#{id,jdbcType=DECIMAL}, #{outerId,jdbcType=DECIMAL}, ",
        "#{outerId2,jdbcType=NCHAR}, #{outerId3,jdbcType=NCHAR}, ",
        "#{itemCode,jdbcType=NCHAR}, #{itemName,jdbcType=NCHAR}, ",
        "#{fullName,jdbcType=NCHAR}, #{storeType,jdbcType=NCHAR}, ",
        "#{lineType,jdbcType=NCHAR}, #{brief,jdbcType=NCHAR}, #{spec,jdbcType=NCHAR}, ",
        "#{cat1,jdbcType=NCHAR}, #{cat2,jdbcType=NCHAR}, #{cat3,jdbcType=NCHAR}, ",
        "#{cat4,jdbcType=NCHAR}, #{cat5,jdbcType=NCHAR}, #{cat6,jdbcType=NCHAR}, ",
        "#{cat7,jdbcType=NCHAR}, #{cat8,jdbcType=NCHAR}, #{cat9,jdbcType=NCHAR}, ",
        "#{cat10,jdbcType=NCHAR}, #{prp1,jdbcType=NCHAR}, #{prp2,jdbcType=NCHAR}, ",
        "#{prp3,jdbcType=NCHAR}, #{prp4,jdbcType=NCHAR}, #{prp5,jdbcType=NCHAR}, ",
        "#{prp6,jdbcType=NCHAR}, #{prp7,jdbcType=NCHAR}, #{prp8,jdbcType=NCHAR}, ",
        "#{prp9,jdbcType=NCHAR}, #{prp10,jdbcType=NCHAR}, #{uom,jdbcType=NCHAR}, ",
        "#{uom2,jdbcType=NCHAR}, #{uom3,jdbcType=NCHAR}, #{uom4,jdbcType=NCHAR}, ",
        "#{uom5,jdbcType=NCHAR}, #{uom6,jdbcType=NCHAR}, #{uom7,jdbcType=NCHAR}, ",
        "#{weight,jdbcType=DECIMAL}, #{volume,jdbcType=DECIMAL}, ",
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
    @SelectKey(statement="SELECT SEQ_T_ITEM.NEXTVAL FROM DUAL", keyProperty="id", before=true, resultType=Long.class)
    int insert(TItem record);

    @Select({
        "select",
        "ID, OUTER_ID, OUTER_ID2, OUTER_ID3, ITEM_CODE, ITEM_NAME, FULL_NAME, STORE_TYPE, ",
        "LINE_TYPE, BRIEF, SPEC, CAT1, CAT2, CAT3, CAT4, CAT5, CAT6, CAT7, CAT8, CAT9, ",
        "CAT10, PRP1, PRP2, PRP3, PRP4, PRP5, PRP6, PRP7, PRP8, PRP9, PRP10, UOM, UOM2, ",
        "UOM3, UOM4, UOM5, UOM6, UOM7, WEIGHT, VOLUME, URC_C1, URC_C2, URC_C3, URC_C4, ",
        "URC_C5, URC_D1, URC_D2, URC_D3, URC_N1, URC_N2, URC_N3, URC_N4, URC_N5, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION, ",
        "PY, PY_ABBR",
        "from T_ITEM",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OUTER_ID", property="outerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OUTER_ID2", property="outerId2", jdbcType=JdbcType.NCHAR),
        @Result(column="OUTER_ID3", property="outerId3", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_CODE", property="itemCode", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_NAME", property="itemName", jdbcType=JdbcType.NCHAR),
        @Result(column="FULL_NAME", property="fullName", jdbcType=JdbcType.NCHAR),
        @Result(column="STORE_TYPE", property="storeType", jdbcType=JdbcType.NCHAR),
        @Result(column="LINE_TYPE", property="lineType", jdbcType=JdbcType.NCHAR),
        @Result(column="BRIEF", property="brief", jdbcType=JdbcType.NCHAR),
        @Result(column="SPEC", property="spec", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT1", property="cat1", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT2", property="cat2", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT3", property="cat3", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT4", property="cat4", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT5", property="cat5", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT6", property="cat6", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT7", property="cat7", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT8", property="cat8", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT9", property="cat9", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT10", property="cat10", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP1", property="prp1", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP2", property="prp2", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP3", property="prp3", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP4", property="prp4", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP5", property="prp5", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP6", property="prp6", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP7", property="prp7", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP8", property="prp8", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP9", property="prp9", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP10", property="prp10", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM2", property="uom2", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM3", property="uom3", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM4", property="uom4", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM5", property="uom5", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM6", property="uom6", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM7", property="uom7", jdbcType=JdbcType.NCHAR),
        @Result(column="WEIGHT", property="weight", jdbcType=JdbcType.DECIMAL),
        @Result(column="VOLUME", property="volume", jdbcType=JdbcType.DECIMAL),
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
    TItem selectByPrimaryKey(Long id);

    @Select({
        "select",
        "ID, OUTER_ID, OUTER_ID2, OUTER_ID3, ITEM_CODE, ITEM_NAME, FULL_NAME, STORE_TYPE, ",
        "LINE_TYPE, BRIEF, SPEC, CAT1, CAT2, CAT3, CAT4, CAT5, CAT6, CAT7, CAT8, CAT9, ",
        "CAT10, PRP1, PRP2, PRP3, PRP4, PRP5, PRP6, PRP7, PRP8, PRP9, PRP10, UOM, UOM2, ",
        "UOM3, UOM4, UOM5, UOM6, UOM7, WEIGHT, VOLUME, URC_C1, URC_C2, URC_C3, URC_C4, ",
        "URC_C5, URC_D1, URC_D2, URC_D3, URC_N1, URC_N2, URC_N3, URC_N4, URC_N5, LOCKER_ID, ",
        "LOCK_TS, MODIFYER_ID, MODIFY_TS, MODIFY_APPSVR, MODIFY_MODULE, DATA_VERSION, ",
        "PY, PY_ABBR",
        "from T_ITEM"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="OUTER_ID", property="outerId", jdbcType=JdbcType.DECIMAL),
        @Result(column="OUTER_ID2", property="outerId2", jdbcType=JdbcType.NCHAR),
        @Result(column="OUTER_ID3", property="outerId3", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_CODE", property="itemCode", jdbcType=JdbcType.NCHAR),
        @Result(column="ITEM_NAME", property="itemName", jdbcType=JdbcType.NCHAR),
        @Result(column="FULL_NAME", property="fullName", jdbcType=JdbcType.NCHAR),
        @Result(column="STORE_TYPE", property="storeType", jdbcType=JdbcType.NCHAR),
        @Result(column="LINE_TYPE", property="lineType", jdbcType=JdbcType.NCHAR),
        @Result(column="BRIEF", property="brief", jdbcType=JdbcType.NCHAR),
        @Result(column="SPEC", property="spec", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT1", property="cat1", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT2", property="cat2", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT3", property="cat3", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT4", property="cat4", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT5", property="cat5", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT6", property="cat6", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT7", property="cat7", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT8", property="cat8", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT9", property="cat9", jdbcType=JdbcType.NCHAR),
        @Result(column="CAT10", property="cat10", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP1", property="prp1", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP2", property="prp2", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP3", property="prp3", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP4", property="prp4", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP5", property="prp5", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP6", property="prp6", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP7", property="prp7", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP8", property="prp8", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP9", property="prp9", jdbcType=JdbcType.NCHAR),
        @Result(column="PRP10", property="prp10", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM", property="uom", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM2", property="uom2", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM3", property="uom3", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM4", property="uom4", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM5", property="uom5", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM6", property="uom6", jdbcType=JdbcType.NCHAR),
        @Result(column="UOM7", property="uom7", jdbcType=JdbcType.NCHAR),
        @Result(column="WEIGHT", property="weight", jdbcType=JdbcType.DECIMAL),
        @Result(column="VOLUME", property="volume", jdbcType=JdbcType.DECIMAL),
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
    List<TItem> selectAll();

    @Update({
        "update T_ITEM",
        "set OUTER_ID = #{outerId,jdbcType=DECIMAL},",
          "OUTER_ID2 = #{outerId2,jdbcType=NCHAR},",
          "OUTER_ID3 = #{outerId3,jdbcType=NCHAR},",
          "ITEM_CODE = #{itemCode,jdbcType=NCHAR},",
          "ITEM_NAME = #{itemName,jdbcType=NCHAR},",
          "FULL_NAME = #{fullName,jdbcType=NCHAR},",
          "STORE_TYPE = #{storeType,jdbcType=NCHAR},",
          "LINE_TYPE = #{lineType,jdbcType=NCHAR},",
          "BRIEF = #{brief,jdbcType=NCHAR},",
          "SPEC = #{spec,jdbcType=NCHAR},",
          "CAT1 = #{cat1,jdbcType=NCHAR},",
          "CAT2 = #{cat2,jdbcType=NCHAR},",
          "CAT3 = #{cat3,jdbcType=NCHAR},",
          "CAT4 = #{cat4,jdbcType=NCHAR},",
          "CAT5 = #{cat5,jdbcType=NCHAR},",
          "CAT6 = #{cat6,jdbcType=NCHAR},",
          "CAT7 = #{cat7,jdbcType=NCHAR},",
          "CAT8 = #{cat8,jdbcType=NCHAR},",
          "CAT9 = #{cat9,jdbcType=NCHAR},",
          "CAT10 = #{cat10,jdbcType=NCHAR},",
          "PRP1 = #{prp1,jdbcType=NCHAR},",
          "PRP2 = #{prp2,jdbcType=NCHAR},",
          "PRP3 = #{prp3,jdbcType=NCHAR},",
          "PRP4 = #{prp4,jdbcType=NCHAR},",
          "PRP5 = #{prp5,jdbcType=NCHAR},",
          "PRP6 = #{prp6,jdbcType=NCHAR},",
          "PRP7 = #{prp7,jdbcType=NCHAR},",
          "PRP8 = #{prp8,jdbcType=NCHAR},",
          "PRP9 = #{prp9,jdbcType=NCHAR},",
          "PRP10 = #{prp10,jdbcType=NCHAR},",
          "UOM = #{uom,jdbcType=NCHAR},",
          "UOM2 = #{uom2,jdbcType=NCHAR},",
          "UOM3 = #{uom3,jdbcType=NCHAR},",
          "UOM4 = #{uom4,jdbcType=NCHAR},",
          "UOM5 = #{uom5,jdbcType=NCHAR},",
          "UOM6 = #{uom6,jdbcType=NCHAR},",
          "UOM7 = #{uom7,jdbcType=NCHAR},",
          "WEIGHT = #{weight,jdbcType=DECIMAL},",
          "VOLUME = #{volume,jdbcType=DECIMAL},",
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
    int updateByPrimaryKey(TItem record);
}