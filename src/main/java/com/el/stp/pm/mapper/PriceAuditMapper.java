package com.el.stp.pm.mapper;

import com.el.stp.common.util.StringUtils;
import com.el.stp.pm.domain.PriceAuditCondition;
import com.el.stp.pm.domain.PriceAuditDomain;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Title:待价格审核
 * Description:
 *
 * @Company: Elitesland
 * @project: stp-svr
 * @author: james.zhang
 * @version: 1.0.0
 * @time: 2016/8/24
 */
public interface PriceAuditMapper {

    final class SqlProvider extends SQL{
        public void selectQuotation(PriceAuditCondition priceAuditCondition) {
            String prodNameWhere = "";
            if (!StringUtils.isEmpty(priceAuditCondition.getProdName())) {
                prodNameWhere = " and t2.PROD_NAME = t1.PROD_NAME";
            }
            SELECT("t1.ID id");
            SELECT("t1.LINE_NO lineNo");
            SELECT("t1.QUOTE_ID quoteId");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then t1.QUOTE_NO else null end quoteNo");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then t1.QUOTE_STATUS else null end quoteStatus");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then to_char(t1.QUOTE_DATE, 'YYYY-MM-DD') else null end quoteDate");
            SELECT("t1.CUST_ID custId");
            SELECT("t1.CUST_CODE custCode");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then t1.CUST_NAME else null end custName");
            SELECT("t1.OU_ID ouId");
            SELECT("t1.OU_CODE ouCode");
            SELECT("t1.OU_NAME ouName");
            SELECT("t1.MERCHER_ID mercherId");
            SELECT("t1.SALE_MANAGER_ID saleManagerId");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then t1.SUM_AMT else null end sumAmt");
            SELECT("t1.QUOTE_PRICE quotePrice");
            SELECT("t1.MANU_QTY manuQty");
            SELECT("t1.QUOTE_AMT quoteAmt");
            SELECT("t1.PROD_ID prodId");
            SELECT("t1.CUST_AMT custAmt");
            //删除该字段
            /*SELECT("t1.FREE_FLAG freeFlag");*/
            SELECT("t1.PROD_TYPE prodType");
            SELECT("t1.PROD_CODE prodCode");
            SELECT("t1.PROD_NAME prodName");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then t1.AGENT_NAME else null end agentName");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then t1.DEP_NAME else null end depName");
            FROM("V_QUOTE_PROD t1");
        }

        //查询待价格审核信息
        public static final String SELECT_PRICE_AUDIT_INFO = "selectPriceAuditInfo";
        public String selectPriceAuditInfo (@Param("priceAuditCondition") PriceAuditCondition priceAuditCondition){
            selectQuotation(priceAuditCondition);
            selectWhereSQL(priceAuditCondition);
            return SqlUtil.paging(toString(), priceAuditCondition);
        }

        //查询待价格审核总数
        public static final String SELECT_PRICE_AUDIT_NUM = "selectPriceAuditNum";
        public String selectPriceAuditNum (@Param("priceAuditCondition") PriceAuditCondition priceAuditCondition) {
            SELECT("count(1) as value");
            FROM("V_QUOTE_PROD t1");
            selectWhereSQL(priceAuditCondition);
            return toString();
        }

        //设置查询条件
        private void selectWhereSQL(PriceAuditCondition priceAuditCondition) {
            if (!StringUtils.isEmpty(priceAuditCondition.getCustName())) {
                WHERE(" t1.CUST_NAME like '%'||#{priceAuditCondition.custName}||'%'");
            }
            if (!StringUtils.isEmpty(priceAuditCondition.getProdName())) {
                WHERE("t1.PROD_NAME like '%'||#{priceAuditCondition.prodName}||'%'");
            }
            if (!StringUtils.isEmpty(priceAuditCondition.getQuoteNo())) {
                WHERE("t1.QUOTE_NO like '%'||#{priceAuditCondition.quoteNo}||'%'");
            }
            if(true){
                ORDER_BY("t1.QUOTE_ID desc,t1.ID");
            }
        }

    }
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_PRICE_AUDIT_INFO)
    List<PriceAuditDomain> selectPriceAuditInfo(@Param("priceAuditCondition") PriceAuditCondition priceAuditCondition);
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_PRICE_AUDIT_NUM)
    Integer selectPriceAuditNum(@Param("priceAuditCondition") PriceAuditCondition priceAuditCondition);
}
