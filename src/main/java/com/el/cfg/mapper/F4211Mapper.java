package com.el.cfg.mapper;

import com.el.cfg.domain.F4211;
import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface F4211Mapper {
    @Select({
        "select",
        "SDKCOO, SDDOCO, SDDCTO, SDLNID, SDSFXO, SDMCU, SDCO, SDAN8, SDSHAN, SDPA8, SDDRQJ, ",
        "SDTRDJ, SDADDJ, SDIVD, SDCNDJ, SDITM, SDLITM, SDLOCN, SDLOTN, SDDSC1, SDLNTY, ",
        "SDNXTR, SDLTTR, SDEMCU, SDUOM, SDUORG, SDUPRC, SDAEXP, SDAOPN, SDPTC, SDRYIN, ",
        "SDKCO, SDDOC, SDDCT, SDPSN, SDTAX1, SDTXA1, SDEXR1, SDCTRY, SDFY, SDCRCD, SDCRR, ",
        "SDFUP, SDFEA, SDTORG, SDUSER, SDPID, SDJOBN, SDUPMJ, SDTDAY, SDDEID, SDRLNU, ",
        "SDANBY, SDPRAN8",
        "from F4211"
    })
    @Results({
        @Result(column="SDKCOO", property="sdkcoo", jdbcType=JdbcType.NCHAR),
        @Result(column="SDDOCO", property="sddoco", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDDCTO", property="sddcto", jdbcType=JdbcType.NCHAR),
        @Result(column="SDLNID", property="sdlnid", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDSFXO", property="sdsfxo", jdbcType=JdbcType.NCHAR),
        @Result(column="SDMCU", property="sdmcu", jdbcType=JdbcType.NCHAR),
        @Result(column="SDCO", property="sdco", jdbcType=JdbcType.NCHAR),
        @Result(column="SDAN8", property="sdan8", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDSHAN", property="sdshan", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDPA8", property="sdpa8", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDDRQJ", property="sddrqj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDTRDJ", property="sdtrdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDADDJ", property="sdaddj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDIVD", property="sdivd", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDCNDJ", property="sdcndj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDITM", property="sditm", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDLITM", property="sdlitm", jdbcType=JdbcType.NCHAR),
        @Result(column="SDLOCN", property="sdlocn", jdbcType=JdbcType.NCHAR),
        @Result(column="SDLOTN", property="sdlotn", jdbcType=JdbcType.NCHAR),
        @Result(column="SDDSC1", property="sddsc1", jdbcType=JdbcType.NCHAR),
        @Result(column="SDLNTY", property="sdlnty", jdbcType=JdbcType.NCHAR),
        @Result(column="SDNXTR", property="sdnxtr", jdbcType=JdbcType.NCHAR),
        @Result(column="SDLTTR", property="sdlttr", jdbcType=JdbcType.NCHAR),
        @Result(column="SDEMCU", property="sdemcu", jdbcType=JdbcType.NCHAR),
        @Result(column="SDUOM", property="sduom", jdbcType=JdbcType.NCHAR),
        @Result(column="SDUORG", property="sduorg", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDUPRC", property="sduprc", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDAEXP", property="sdaexp", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDAOPN", property="sdaopn", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDPTC", property="sdptc", jdbcType=JdbcType.NCHAR),
        @Result(column="SDRYIN", property="sdryin", jdbcType=JdbcType.NCHAR),
        @Result(column="SDKCO", property="sdkco", jdbcType=JdbcType.NCHAR),
        @Result(column="SDDOC", property="sddoc", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDDCT", property="sddct", jdbcType=JdbcType.NCHAR),
        @Result(column="SDPSN", property="sdpsn", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDTAX1", property="sdtax1", jdbcType=JdbcType.NCHAR),
        @Result(column="SDTXA1", property="sdtxa1", jdbcType=JdbcType.NCHAR),
        @Result(column="SDEXR1", property="sdexr1", jdbcType=JdbcType.NCHAR),
        @Result(column="SDCTRY", property="sdctry", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDFY", property="sdfy", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDCRCD", property="sdcrcd", jdbcType=JdbcType.NCHAR),
        @Result(column="SDCRR", property="sdcrr", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDFUP", property="sdfup", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDFEA", property="sdfea", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDTORG", property="sdtorg", jdbcType=JdbcType.NCHAR),
        @Result(column="SDUSER", property="sduser", jdbcType=JdbcType.NCHAR),
        @Result(column="SDPID", property="sdpid", jdbcType=JdbcType.NCHAR),
        @Result(column="SDJOBN", property="sdjobn", jdbcType=JdbcType.NCHAR),
        @Result(column="SDUPMJ", property="sdupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDTDAY", property="sdtday", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDDEID", property="sddeid", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDRLNU", property="sdrlnu", jdbcType=JdbcType.NCHAR),
        @Result(column="SDANBY", property="sdanby", jdbcType=JdbcType.DECIMAL),
        @Result(column="SDPRAN8", property="sdpran8", jdbcType=JdbcType.DECIMAL)
    })
    List<F4211> selectAll();
}