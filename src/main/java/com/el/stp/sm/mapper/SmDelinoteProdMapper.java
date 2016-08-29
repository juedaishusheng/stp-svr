package com.el.stp.sm.mapper;

import com.el.stp.sm.domain.SmDelinoteProdDomain;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 * 待处理发货通知单查询
 * Created by xuzhe on 2016/8/3.
 */
public interface SmDelinoteProdMapper {
    final class SqlProvider extends SQL {
        /**
         * 待处理发货通知查询SQl
         */
        private void selectUndelinoteProdSQL() {
            SELECT("d.SOPROD_QTY as \"delinote.soprodQty\"");
            SELECT("d.demand_gift_qty  \"as delinote.demandGiftQty\",d.sum_deli_qty as \"delinote.sumDeliQty\"");
            SELECT("d.sum_gift_qty  as \"delinote.sumGiftQty\",d.line_status as \"delinote.lineStatus\"");
            SELECT("d.uom_weight as \"delinote.uomWeight\",d.weight as \"delinote.weight\"");
            SELECT("d.deli_addr_no  as \"delinote.deliAddrNo\",d.cont_person  as \"delinote.contPerson\"");
            SELECT("d.cont_tel  as \"delinote.contTel\",d.demand_deli_date as demandDeliDate");
            SELECT(" d.package_method as \"delinote.packageMethod\"");
            SELECT("d.qty_perpackage as \"delinote.qtyPerpackage\"");
            SELECT("d.package_qty as \"delinote.packageQty\"");
            SELECT("d.spare_qty as \"delinote.spareQty\"");
            SELECT("d.remark  as \"delinote.remark\"");
            SELECT("m.doc_no as docNo");
            SELECT("ou.ou_name as ouName,so.so_no   as soNO");
            SELECT("cust.cust_code  as custCode,cust.cust_name  as custName");
            SELECT("prod.prod_code  as prodCode,prod.prod_name  as prodName");
        }

        /**
         * 表关联
         */
        private void selectCondition(){
            FROM("T_DELINOTE_PROD d");
            LEFT_OUTER_JOIN(" t_delinote m on d.DELINOTE_ID = m.id");
            LEFT_OUTER_JOIN("t_ou ou on m.ou_id = ou.id");
            LEFT_OUTER_JOIN("t_so so on d.so_id = so.id");
            LEFT_OUTER_JOIN("t_cust cust on d.cust_id = cust.id");
            LEFT_OUTER_JOIN("t_prod prod on d.prod_id = prod.id");
        }
        private static final String SELECT_UNDELINOTEPROD = "selectUnDelinoteProd";

        public String selectUnDelinoteProd(@Param("deli") SmDelinoteProdDomain deli) {
            selectUndelinoteProdSQL();
            selectCondition();
            WHERE("d.line_status in ('01','02')");
            if (null != deli.getDemandDeliDate()) {
                WHERE("d.demand_deli_date <=#{deli.demandDeliDate}");
            }
            return SqlUtil.paging(toString(), deli);
        }
        private static final String SELECT_UNDELINOTEPROD_NUM = "selectUnDelinoteProdNum";
        public String selectUnDelinoteProdNum(@Param("deli") SmDelinoteProdDomain deli) {
            SELECT("count(1) as value");
            selectCondition();
            WHERE("d.line_status in ('01','02')");
            if (null != deli.getDemandDeliDate()) {
                WHERE("d.demand_deli_date <=#{deli.demandDeliDate}");
            }
            return toString();
        }
    }

    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_UNDELINOTEPROD)
    List<SmDelinoteProdDomain> selectUnDelinoteInfo(@Param("deli") SmDelinoteProdDomain deli);

    /**
     * 分页信息总数量
     * @param deli
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_UNDELINOTEPROD_NUM)
    Integer selectUnDelinoteProdNum(@Param("deli") SmDelinoteProdDomain deli);


}
