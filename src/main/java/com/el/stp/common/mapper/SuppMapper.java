package com.el.stp.common.mapper;

import com.el.stp.common.domain.TSuppDomain;
import com.el.stp.sm.domain.TPapertransDomain;
import com.el.stp.sm.mapper.PapertransMapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 供应商自定义mapper
 * Created by xueyu on 2016/8/10.
 */
public interface SuppMapper {
    class SqlProvider extends SQL {

        private static final String TABLE_NAME = "T_SUPP";

        private final SQL commonSql = new SQL()
            .SELECT("t.id        as id")
            .SELECT("t.addr_no   as addrNo")
            .SELECT("t.supp_code as suppCode")
            .SELECT("t.supp_name as suppName")
            .SELECT("t.supp_abbr as suppAbbr")
            .SELECT("t.py        as py")
            .SELECT("t.py_abbr   as pyAbbr")
            .SELECT("t.ou_id     as ouId")
            .SELECT("t.mcu_id    as mcuId")
            .SELECT("t.acc_class as accClass")
            .FROM(TABLE_NAME + " t")
            .WHERE("1=1 ");

        private static final String SELECT_BY_PARAM_SQL = "selectByParam";

        public String selectByParam(TSuppDomain supp) {
            SQL sql = commonSql;
            if(supp!=null){
                if(!StringUtils.isEmpty(supp.getSuppCode())){
                    sql.WHERE("t.supp_code = #{suppCode}");
                }
                if(!StringUtils.isEmpty(supp.getSuppName())){
                    sql.WHERE("t.supp_name = #{suppName}");
                }
            }

            sql.ORDER_BY("t.supp_name");
            return sql.toString();
        }

        private static final String SELECT_ONE_SQL = "selectOne";

        public String selectOne(String addrNo){
            SQL sql = commonSql;
            if(!StringUtils.isEmpty(addrNo)){
                sql.WHERE("t.addr_no = #{addrNo}");
            }
            return sql.toString();
        }
    }
    /**
     * 供应商列表
     * @param supp 查询参数
     * @return 供应商列表
     */
    @SelectProvider(type = SuppMapper.SqlProvider.class, method = SuppMapper.SqlProvider.SELECT_BY_PARAM_SQL)
    List<TSuppDomain> selectByParam(TSuppDomain supp);

    /**
     * 根据suppCode查询供应商
     * @param addrNo 供应商地址号（唯一索引）
     * @return 供应商
     */
    @SelectProvider(type = SuppMapper.SqlProvider.class, method = SqlProvider.SELECT_ONE_SQL)
    TSuppDomain suppOne(String addrNo);

}
