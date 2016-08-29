package com.el.sys.mapper;

import org.apache.ibatis.annotations.Select;

import java.sql.Timestamp;

/**
 * Created on 16/4/26.
 *
 * @author panlw
 */
public interface DbSysMapper {
    /**
     * @return DB当前日期
     */
    @Select("SELECT SYSDATE FROM DUAL")
    Timestamp now();

    @Select("SELECT (TO_NUMBER(TO_CHAR(SYSDATE, 'YYYYDDD')) - 1900000) as jdeDate FROM DUAL")
    Integer jdeNow();

    /**
     * @return DB当前日期(YYYYMMDD)
     */
    @Select("SELECT TO_CHAR(SYSDATE, 'YYYYMMDD') AS YYYYMMDD FROM DUAL")
    String yyyymmdd();

    /**
     * @return DB当前日期(YYYYMMDD, 数值)
     */
    @Select("SELECT TO_NUMBER(TO_CHAR(SYSDATE, 'YYYYMMDD')) AS YYYYMMDD FROM DUAL")
    Integer yyyymmddNumber();
}
