package com.el.cfg.mapper;

import com.el.cfg.domain.F41021;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface F41021Mapper {
    @Select({
        "select",
        "LIITM, LIMCU, LILOCN, LILOTN, LITM, CO, LIPBIN, LIGLPT, LILOTS, LILRCJ, LIPQOH, ",
        "LIPBCK, LIPREQ, LIQWBO, LIOT1P, LIOT2P, LIOT1A, LIHCOM, LIPCOM, LIFCOM, LIFUN1, ",
        "LIQOWO, LIQTTR, LIQTIN, LIQONL, LIQTRI, LIQTRO, LINCDJ, LIQTY1, LIQTY2, LIURAB, ",
        "LIURRF, LIURAT, LIURCD, LIJOBN, LIPID, LIUPMJ, LIUSER, LITDAY, LIURDT, LIQTO1, ",
        "LIQTO2, LIHCMS, LIPJCM, LIPJDM, LISCMS, LISIBW, LISOBW, LISQOH, LISQWO, LISREQ, ",
        "LISWHC, LISWSC, LICHDF, LIWPDF, LICFGSID",
        "from F41021",
        "where LIITM = #{liitm,jdbcType=DECIMAL}",
          "and LIMCU = #{limcu,jdbcType=NCHAR}",
          "and LILOCN = #{lilocn,jdbcType=NCHAR}",
          "and LILOTN = #{lilotn,jdbcType=NCHAR}"
    })
    @Results({
        @Result(column="LIITM", property="liitm", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="LIMCU", property="limcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LILOCN", property="lilocn", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LILOTN", property="lilotn", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LITM", property="litm", jdbcType=JdbcType.NCHAR),
        @Result(column="CO", property="co", jdbcType=JdbcType.NCHAR),
        @Result(column="LIPBIN", property="lipbin", jdbcType=JdbcType.NCHAR),
        @Result(column="LIGLPT", property="liglpt", jdbcType=JdbcType.NCHAR),
        @Result(column="LILOTS", property="lilots", jdbcType=JdbcType.NCHAR),
        @Result(column="LILRCJ", property="lilrcj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIPQOH", property="lipqoh", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIPBCK", property="lipbck", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIPREQ", property="lipreq", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQWBO", property="liqwbo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIOT1P", property="liot1p", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIOT2P", property="liot2p", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIOT1A", property="liot1a", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIHCOM", property="lihcom", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIPCOM", property="lipcom", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIFCOM", property="lifcom", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIFUN1", property="lifun1", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQOWO", property="liqowo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTTR", property="liqttr", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTIN", property="liqtin", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQONL", property="liqonl", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTRI", property="liqtri", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTRO", property="liqtro", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINCDJ", property="lincdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTY1", property="liqty1", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTY2", property="liqty2", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIURAB", property="liurab", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIURRF", property="liurrf", jdbcType=JdbcType.NCHAR),
        @Result(column="LIURAT", property="liurat", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIURCD", property="liurcd", jdbcType=JdbcType.NCHAR),
        @Result(column="LIJOBN", property="lijobn", jdbcType=JdbcType.NCHAR),
        @Result(column="LIPID", property="lipid", jdbcType=JdbcType.NCHAR),
        @Result(column="LIUPMJ", property="liupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIUSER", property="liuser", jdbcType=JdbcType.NCHAR),
        @Result(column="LITDAY", property="litday", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIURDT", property="liurdt", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTO1", property="liqto1", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTO2", property="liqto2", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIHCMS", property="lihcms", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIPJCM", property="lipjcm", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIPJDM", property="lipjdm", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISCMS", property="liscms", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISIBW", property="lisibw", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISOBW", property="lisobw", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISQOH", property="lisqoh", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISQWO", property="lisqwo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISREQ", property="lisreq", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISWHC", property="liswhc", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISWSC", property="liswsc", jdbcType=JdbcType.DECIMAL),
        @Result(column="LICHDF", property="lichdf", jdbcType=JdbcType.NCHAR),
        @Result(column="LIWPDF", property="liwpdf", jdbcType=JdbcType.NCHAR),
        @Result(column="LICFGSID", property="licfgsid", jdbcType=JdbcType.NCHAR)
    })
    F41021 selectByPrimaryKey(@Param("liitm") BigDecimal liitm, @Param("limcu") String limcu, @Param("lilocn") String lilocn, @Param("lilotn") String lilotn);

    @Select({
        "select",
        "LIITM, LIMCU, LILOCN, LILOTN, LITM, CO, LIPBIN, LIGLPT, LILOTS, LILRCJ, LIPQOH, ",
        "LIPBCK, LIPREQ, LIQWBO, LIOT1P, LIOT2P, LIOT1A, LIHCOM, LIPCOM, LIFCOM, LIFUN1, ",
        "LIQOWO, LIQTTR, LIQTIN, LIQONL, LIQTRI, LIQTRO, LINCDJ, LIQTY1, LIQTY2, LIURAB, ",
        "LIURRF, LIURAT, LIURCD, LIJOBN, LIPID, LIUPMJ, LIUSER, LITDAY, LIURDT, LIQTO1, ",
        "LIQTO2, LIHCMS, LIPJCM, LIPJDM, LISCMS, LISIBW, LISOBW, LISQOH, LISQWO, LISREQ, ",
        "LISWHC, LISWSC, LICHDF, LIWPDF, LICFGSID",
        "from F41021"
    })
    @Results({
        @Result(column="LIITM", property="liitm", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="LIMCU", property="limcu", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LILOCN", property="lilocn", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LILOTN", property="lilotn", jdbcType=JdbcType.NCHAR, id=true),
        @Result(column="LITM", property="litm", jdbcType=JdbcType.NCHAR),
        @Result(column="CO", property="co", jdbcType=JdbcType.NCHAR),
        @Result(column="LIPBIN", property="lipbin", jdbcType=JdbcType.NCHAR),
        @Result(column="LIGLPT", property="liglpt", jdbcType=JdbcType.NCHAR),
        @Result(column="LILOTS", property="lilots", jdbcType=JdbcType.NCHAR),
        @Result(column="LILRCJ", property="lilrcj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIPQOH", property="lipqoh", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIPBCK", property="lipbck", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIPREQ", property="lipreq", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQWBO", property="liqwbo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIOT1P", property="liot1p", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIOT2P", property="liot2p", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIOT1A", property="liot1a", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIHCOM", property="lihcom", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIPCOM", property="lipcom", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIFCOM", property="lifcom", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIFUN1", property="lifun1", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQOWO", property="liqowo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTTR", property="liqttr", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTIN", property="liqtin", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQONL", property="liqonl", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTRI", property="liqtri", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTRO", property="liqtro", jdbcType=JdbcType.DECIMAL),
        @Result(column="LINCDJ", property="lincdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTY1", property="liqty1", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTY2", property="liqty2", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIURAB", property="liurab", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIURRF", property="liurrf", jdbcType=JdbcType.NCHAR),
        @Result(column="LIURAT", property="liurat", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIURCD", property="liurcd", jdbcType=JdbcType.NCHAR),
        @Result(column="LIJOBN", property="lijobn", jdbcType=JdbcType.NCHAR),
        @Result(column="LIPID", property="lipid", jdbcType=JdbcType.NCHAR),
        @Result(column="LIUPMJ", property="liupmj", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIUSER", property="liuser", jdbcType=JdbcType.NCHAR),
        @Result(column="LITDAY", property="litday", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIURDT", property="liurdt", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTO1", property="liqto1", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIQTO2", property="liqto2", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIHCMS", property="lihcms", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIPJCM", property="lipjcm", jdbcType=JdbcType.DECIMAL),
        @Result(column="LIPJDM", property="lipjdm", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISCMS", property="liscms", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISIBW", property="lisibw", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISOBW", property="lisobw", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISQOH", property="lisqoh", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISQWO", property="lisqwo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISREQ", property="lisreq", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISWHC", property="liswhc", jdbcType=JdbcType.DECIMAL),
        @Result(column="LISWSC", property="liswsc", jdbcType=JdbcType.DECIMAL),
        @Result(column="LICHDF", property="lichdf", jdbcType=JdbcType.NCHAR),
        @Result(column="LIWPDF", property="liwpdf", jdbcType=JdbcType.NCHAR),
        @Result(column="LICFGSID", property="licfgsid", jdbcType=JdbcType.NCHAR)
    })
    List<F41021> selectAll();
}