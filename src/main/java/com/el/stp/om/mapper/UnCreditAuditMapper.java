package com.el.stp.om.mapper;

import com.el.stp.common.util.StringUtils;
import com.el.stp.om.domain.SoProdCondition;
import com.el.stp.om.domain.SoProdDomain;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 * Created by xuzhe on 2016/8/26.
 */
public interface UnCreditAuditMapper {
    final class SqlPrivder extends SQL {
        /**
         * 查询sql
         */
        public void selectSoSql() {
            SELECT("t.so_status as soStatus,so.so_no as \"so.soNo\"");
            SELECT("so.so_date as \"so.soDate\",so.due_date as \"so.dueDate\"");
            SELECT("agent.addr_name as \"agent.addrName\",mcu.id as \"mcu.mcuId\"");
            SELECT("agent.id as \"agent.agentId\",mcu.mcu_name as \"mcu.mcuName\"");
            SELECT("cust.cust_code as \"cust.custCode\",cust.cust_name as \"cust.custName\"");
            SELECT("so.amt as \"so.amt\",prod.prod_code as \"prod.prodCode\"");
            SELECT("prod.prod_name as \"prod.prodName\",udc.val_desc1 as \"udc.valDesc1\"");
            SELECT("t.manu_qty as manuQty,t.calc_amt as calcAmt");
        }

        /**
         * 查询表关联
         */
        public void selectCondition() {
            FROM("t_so_prod t");
            LEFT_OUTER_JOIN("t_so so on t.so_id=so.id");
            LEFT_OUTER_JOIN(" T_ADDRESS_BOOK agent on so.agent_id=agent.id");
            LEFT_OUTER_JOIN("t_mcu mcu on so.mcu_id=mcu.id");
            LEFT_OUTER_JOIN("t_cust cust on so.cust_id=cust.id");
            LEFT_OUTER_JOIN("t_prod prod on t.prod_id=prod.id");
            LEFT_OUTER_JOIN("t_udc udc on prod.PROD_CAT1=udc.udc_code");
        }

        public void selectWhereSQL(@Param("soProd") SoProdCondition soProd) {
            if (soProd != null) {
                if (soProd.getSo() != null && !StringUtils.isEmpty(soProd.getSo().getSoName())) {
                    WHERE("so.so_name =#{soProd.so.soName}");
                }
            }
            if (soProd != null) {
                if (soProd.getCust() != null && !StringUtils.isEmpty(soProd.getCust().getCustName())) {
                    WHERE("cust.cust_name =#{soProd.cust.custName}");
                }
            }
            if (soProd != null) {
                if (soProd.getProd() != null && !StringUtils.isEmpty(soProd.getProd().getProdName())) {
                    WHERE("prod.prod_name =#{soProd.prod.prodName}");
                }
            }
            if (soProd != null) {
                if (soProd.getSo() != null && !StringUtils.isEmpty(soProd.getSo().getSoDate())) {
                    WHERE("so.so_date >=#{soProd.om001DateFrom}");
                }
            }
            if (soProd != null) {
                if (soProd.getSo() != null && !StringUtils.isEmpty(soProd.getSo().getSoDate())) {
                    WHERE("so.so_date <=#{soProd.om001DateTo}");
                }
            }
        }

        private static final String SELECT_CREDITAUDIT = "selectCreditAudit";

        public String selectCreditAudit(@Param("soProd") SoProdCondition soProd) {
            selectSoSql();
            selectCondition();
            selectWhereSQL(soProd);
            return SqlUtil.paging(toString(), soProd);
        }

        private static final String SELECT_CREDITAUDIT_NUM = "selectCreditAuditNum";

        /**
         * 分页总条数
         *
         * @param soProd
         * @return
         */
        public String selectCreditAuditNum(@Param("soProd") SoProdCondition soProd) {
            SELECT("count(1) as value");
            selectCondition();
            selectWhereSQL(soProd);
            return toString();
        }
    }

    /**
     * 印刷销售订单
     *
     * @param soProd
     * @return
     */
    @SelectProvider(type = SqlPrivder.class, method = SqlPrivder.SELECT_CREDITAUDIT)
    List<SoProdDomain> selectCreditAudit(@Param("soProd") SoProdCondition soProd);

    /**
     * 分页条数
     *
     * @param soProd
     * @return
     */
    @SelectProvider(type = SqlPrivder.class, method = SqlPrivder.SELECT_CREDITAUDIT_NUM)
    Integer selectCreditAuditNum(@Param("soProd") SoProdCondition soProd);
}
