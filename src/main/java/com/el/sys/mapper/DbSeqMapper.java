package com.el.sys.mapper;

import com.el.sys.domain.DbSeqCounter;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface DbSeqMapper {

    /**
     * 新增发号器
     *
     * @param counter 发号器
     * @return 更新记录数
     */
    @Insert({
        "insert into S_COUNTERS (COUNTER_CODE, COUNTER_DESC, ",
        "COUNTER_KEY, COUNTER_MAX, COUNTER_VAL)",
        "values (#{counterCode}, #{counterDesc,jdbcType=NCHAR}, ",
        "#{counterKey}, #{counterMax}, #{counterVal})"
    })
    int insertCounter(DbSeqCounter counter);

    /**
     * 取得发号器
     *
     * @param counterCode 发号器编码
     * @return 发号器
     */
    @Select({
        "select COUNTER_CODE as counterCode",
        "     , COUNTER_KEY as counterKey",
        "     , COUNTER_MAX as counterMax",
        "     , COUNTER_VAL as counterVal",
        "  from S_COUNTERS",
        " where COUNTER_CODE = #{counterCode}",
    })
    DbSeqCounter selectCounter(String counterCode);

    /**
     * 更新流水号
     *
     * @param counter 新的发号器状态
     * @return 更新记录数
     */
    @Update({
        "update S_COUNTERS",
        "   set COUNTER_KEY = #{counterKey}",
        "     , COUNTER_VAL = #{counterVal}",
        " where COUNTER_CODE = #{counterCode}",
    })
    int updateCounter(DbSeqCounter counter);
}
