package com.el.stp.om.mapper;

import com.el.stp.common.util.StringUtils;
import com.el.stp.om.domain.DelinoteProdCondition;
import com.el.stp.om.domain.DelinoteProdDomain;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;


/**
 * Created by xuzhe on 2016/7/28.
 */
public interface DelinoteProdMapper {
    final class SqlProvider extends SQL {
        /**
         * 查询sql
         */
        public void selectProdSQl() {
            SELECT("d.SOPROD_QTY as soprodQty,d.demand_deli_qty as demandDeliQty");
            SELECT("d.demand_gift_qty  as demandGiftQty,d.sum_deli_qty as sumDeliQty");
            SELECT("d.sum_gift_qty  as sumGiftQty,d.line_status as lineStatus");
            SELECT("d.uom_weight as uomWeight,d.weight as weight");
            SELECT("d.deli_addr_no  as deliAddrNo,d.cont_person  as contPerson");
            SELECT("d.cont_tel  as contTel,d.demand_deli_date as demandDeliDate");
            SELECT("d.remark  as remark");
            SELECT("m.doc_no as docNo");
            SELECT("ou.ou_name as ouName,so.so_no   as soNO");
            SELECT("cust.cust_code  as custCode,cust.cust_name  as custName");
            SELECT("prod.prod_code  as prodCode,prod.prod_name  as prodName");
        }

        /**
         * 查询表关联
         */
        public void selectCondition() {
            FROM("T_DELINOTE_PROD d");
            LEFT_OUTER_JOIN(" t_delinote m on d.DELINOTE_ID = m.id");
            LEFT_OUTER_JOIN("t_ou ou on m.ou_id = ou.id");
            LEFT_OUTER_JOIN("t_so so on d.so_id = so.id");
            LEFT_OUTER_JOIN("t_cust cust on d.cust_id = cust.id");
            LEFT_OUTER_JOIN("t_prod prod on d.prod_id = prod.id");
        }

        /**
         * 查询where条件
         *
         * @param delinoteProd
         */
        public void selectWhereSQL(@Param("delinoteProd") DelinoteProdCondition delinoteProd) {
            if (!StringUtils.isEmpty(delinoteProd.getSoNo())) {
                WHERE("so.so_no =#{delinoteProd.soNo}");
            }
            if (!org.springframework.util.StringUtils.isEmpty(delinoteProd.getCustName())) {
                WHERE("cust.cust_name =#{delinoteProd.custName}");
            }
            if (!org.springframework.util.StringUtils.isEmpty(delinoteProd.getProdName())) {
                WHERE("prod.prod_name =#{delinoteProd.prodName}");
            }
            if (delinoteProd.getDemandDeliDateFrom() != null) {
                WHERE("d.demand_deli_date >=#{delinoteProd.demandDeliDateFrom}");
            }
            if (delinoteProd.getDemandDeliDateTo() != null) {
                WHERE("d.demand_deli_date <=#{delinoteProd.demandDeliDateTo}");
            }
            if (!StringUtils.isEmpty(delinoteProd.getLineStatus())) {
                WHERE("d.line_status in (#{delinoteProd.lineStatus})");
            }
        }

        private static final String SELECT_DELINOTEPROD = "selectDelinoteProd";

        public String selectDelinoteProd(@Param("delinoteProd") DelinoteProdCondition delinoteProd) {
            selectProdSQl();
            selectCondition();
            selectWhereSQL(delinoteProd);
            return SqlUtil.paging(toString(), delinoteProd);
        }

        private static final String SELECT_DELINOTEPROD_NUM = "selectDelinoteProdNum";

        /**
         * 分页数据总条数
         *
         * @param delinoteProd
         * @return
         */
        public String selectDelinoteProdNum(@Param("delinoteProd") DelinoteProdCondition delinoteProd) {
            SELECT("count(1) as value");
            selectCondition();
            selectWhereSQL(delinoteProd);
            return toString();

        }
    }

    /**
     * 发货通知单查询分页信息
     *
     * @param delinoteProd
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_DELINOTEPROD)
    List<DelinoteProdDomain> selectDelinoteInfo(@Param("delinoteProd") DelinoteProdCondition delinoteProd);

    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_DELINOTEPROD_NUM)
    Integer selectDelinoteProdNum(@Param("delinoteProd") DelinoteProdCondition delinoteProd);

}
