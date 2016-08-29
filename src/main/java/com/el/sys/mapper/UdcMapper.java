package com.el.sys.mapper;

import com.el.sys.domain.CodeName;
import com.el.sys.domain.UdcMeta;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created on 16/7/29.
 *
 * @author panlw
 */
public interface UdcMapper {

    /**
     * @param udcMeta UDC 定义
     * @return UDC 选项列表
     */
    @Select({
        "SELECT UDC_CODE as code, VAL_DESC1 as name",
        "  FROM T_UDC",
        " WHERE VAL_ENABLED = 1",
        "   AND DOMAIN_CODE = #{meta.domainCode}",
        "   AND UDC_TYPE = #{meta.udcType}",
        " ORDER BY UDC_CODE nulls first",
    })
    List<CodeName> codeNames(@Param("meta") UdcMeta udcMeta);

    /**
     * @param udcMeta UDC 定义
     * @param udcCode UDC 键值
     * @return UDC 选项
     */
    @Select({
        "SELECT UDC_CODE as code, VAL_DESC1 as name",
        "  FROM T_UDC",
        " WHERE VAL_ENABLED = 1",
        "   AND DOMAIN_CODE = #{meta.domainCode}",
        "   AND UDC_TYPE = #{meta.udcType}",
        "   AND UDC_CODE = #{code}",
    })
    CodeName codeName(@Param("meta") UdcMeta udcMeta, @Param("code") String udcCode);
}
