package com.el.stp.sm.mapper;

import com.el.stp.sm.domain.DelinoteDeliCondition;
import com.el.stp.sm.domain.DelinoteDeliDomain;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by xuzhe on 2016/8/15.
 */
public interface DelinoteTransMapper {
    final class SqlProvider extends SQL{
        /**
         * 发货通知单物流查询SQL
         */
        private void selectDelinoteTransSQL(){
            SELECT("m.doc_no as docNo");
            SELECT("ou.ou_name as ouName");
            SELECT("so.so_no as soNo");
            SELECT("cust.cust_name as custName");
            SELECT("t.trans_company_addrno as transCompanyAddrno");
            SELECT("t.cargo_no as cargoNo");
            SELECT("t.cargo_pic as cargoPic");
            SELECT(" t.cargo_person as cargoPerson");
            SELECT("t.fee1 as fee1");
            SELECT("t.fee2 as fee2");
        }

        /**
         * 表关联
         */
        private void selectConidtion(){
            FROM("T_DELINOTE_DELI t");
            LEFT_OUTER_JOIN("t_delinote_prod d on t.delinote_prod_id = d.id");
            LEFT_OUTER_JOIN("t_delinote m on d.delinote_id = m.id");
            LEFT_OUTER_JOIN("t_ou ou on m.ou_id = ou.id");
            LEFT_OUTER_JOIN("t_so so on d.so_id = so.id");
            LEFT_OUTER_JOIN("t_cust cust on d.cust_id = cust.id");
        }
        private void selectDelinoteTransWhere(@Param("deli") DelinoteDeliCondition deli){
            if (!StringUtils.isEmpty(deli.getTransCompanyAddrno())) {
                WHERE("t.trans_company_addrno =#{deli.transCompanyAddrno}");
            }
            if (!StringUtils.isEmpty(deli.getCargoPic())) {
                WHERE("t.cargo_pic =#{deli.cargoPic}");
            }
            if (!StringUtils.isEmpty(deli.getCargoNo())) {
                WHERE("t.cargo_no =#{deli.cargoNo}");
            }
            if (null != deli.getDemandDeliDateFrom()) {
                WHERE("t.deli_date >=#{deli.demandDeliDateFrom}");
            }
            if (null != deli.getDemandDeliDateTo()) {
                WHERE("t.deli_date <=#{deli.demandDeliDateTo}");
            }
        }
        private static final String SELECT_DELINOTETRANS = "selectDelinoteTrans";

        public String selectDelinoteTrans(@Param("deli") DelinoteDeliCondition deli) {
            selectDelinoteTransSQL();
            selectConidtion();
            selectDelinoteTransWhere(deli);
            return SqlUtil.paging(toString(), deli);
        }

        /**
         * 分页总数量
         */
        private  static final String SELECT_DELINOTETRANS_NUM = "selectDelinoteTransNum";
        public String selectDelinoteTransNum(@Param("deli") DelinoteDeliCondition deli) {
            SELECT("count(1) as value");
            selectConidtion();
            selectDelinoteTransWhere(deli);
            return toString();
        }
    }
    /**
     * 发货通知单物流查询
     * @param deli
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_DELINOTETRANS)
    List<DelinoteDeliDomain> selectDelinoteTrans(@Param("deli") DelinoteDeliCondition deli);

    /**
     * 分页
     * @param deli
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_DELINOTETRANS_NUM)
    Integer selectDelinoteTransNum(@Param("deli") DelinoteDeliCondition deli);
}
