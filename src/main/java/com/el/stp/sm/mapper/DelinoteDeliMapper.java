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
 * Created by xuzhe on 2016/8/3.
 */
public interface DelinoteDeliMapper {
    final class SqlProvider extends SQL {
        /**
         * 产品发货记录查询SQL
         */
        private void selectDelinoteDeliSQL() {
            SELECT("m.doc_no as  docNo");
            SELECT("ou.ou_name as ouName");
            SELECT("so.so_no  as soNo");
            SELECT("cust.cust_code as custCode");
            SELECT("cust.cust_name as custName");
            SELECT("prod.prod_code as prodCode");
            SELECT("prod.prod_name as prodName");
            SELECT("d.soprod_qty as soprodQty");
            SELECT("d.demand_deli_qty as demandDeliQty");
            SELECT("d.demand_gift_qty as demandGiftQty");
            SELECT("t.deli_qty as deliQty");
            SELECT("t.gift_qty as giftQty");
            SELECT("d.uom_weight as uomWeight");
            SELECT("d.weight as weight");
            SELECT("d.deli_addr_no as deliAddrNo");
            SELECT("d.cont_person as contPerson");
            SELECT("d.cont_tel as contTel");
            SELECT("d.demand_deli_date as demandDeliDate");
            SELECT("t.deli_date as deliDate");
            SELECT("d.remark as remark");
            SELECT("d.package_method as packageMethod");
            SELECT("d.qty_perpackage as qtyPerpackage");
            SELECT("d.package_qty as packageQty");
            SELECT("d.spare_qty as spareQty");
        }

        /**
         * 产品发货记录表关联
         */
        private void selectCondition() {
            FROM("T_DELINOTE_DELI t");
            LEFT_OUTER_JOIN("t_delinote_prod d on t.delinote_prod_id = d.id");
            LEFT_OUTER_JOIN(" t_delinote m on d.DELINOTE_ID = m.id");
            LEFT_OUTER_JOIN("t_ou ou on m.ou_id = ou.id");
            LEFT_OUTER_JOIN("t_so so on d.so_id = so.id");
            LEFT_OUTER_JOIN("t_cust cust on d.cust_id = cust.id");
            LEFT_OUTER_JOIN("t_prod prod on d.prod_id = prod.id");
        }

        /**
         * where条件
         *
         * @param deli
         */
        private void selectDelinoteDeliWhere(@Param("deli") DelinoteDeliCondition deli) {
            if (!StringUtils.isEmpty(deli.getSoNo())) {
                WHERE("so.so_no =#{deli.soNo}");
            }
            if (!StringUtils.isEmpty(deli.getCustName())) {
                WHERE("cust.cust_name =#{deli.custName}");
            }
            if (!StringUtils.isEmpty(deli.getProdName())) {
                WHERE("prod.prod_name =#{deli.prodName}");
            }
            if (null != deli.getDemandDeliDateFrom()) {
                WHERE("t.deli_date >=#{deli.demandDeliDateFrom}");
            }
            if (null != deli.getDemandDeliDateTo()) {
                WHERE("t.deli_date <=#{deli.demandDeliDateTo}");
            }
        }

        private static final String SELECT_DELINOTEDELI = "selectDelinoteDeli";

        public String selectDelinoteDeli(@Param("deli") DelinoteDeliCondition deli) {
            selectDelinoteDeliSQL();
            selectCondition();
            selectDelinoteDeliWhere(deli);
            return SqlUtil.paging(toString(), deli);
        }

        /**
         * 分页数据总条数
         */
        private static final String SELECT_DELINOTEDELI_NUM = "selectDelinoteDeliNum";

        public String selectDelinoteDeliNum(@Param("deli") DelinoteDeliCondition deli) {
            SELECT("count(1) as value");
            selectCondition();
            selectDelinoteDeliWhere(deli);
            return toString();
        }
    }

    /**
     * 产品发货记录查询
     *
     * @param deli
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_DELINOTEDELI)
    List<DelinoteDeliDomain> selectDelinoteDeli(@Param("deli") DelinoteDeliCondition deli);

    /**
     * 分页查询总数量
     *
     * @param deli
     * @return
   */
   @SelectProvider(type = SqlProvider.class,method = SqlProvider.SELECT_DELINOTEDELI_NUM)
    Integer selectDelinoteDeliNum(@Param("deli") DelinoteDeliCondition deli);
}
