package com.el.stp.pm.mapper;

import com.el.stp.common.util.StringUtils;
import com.el.stp.pm.domain.QuoteSearchCondition;
import com.el.stp.pm.domain.QuoteSearchDomain;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Title:
 * Description:
 *
 * @Company: Elitesland
 * @project: stp-svr
 * @author: li-jc
 * @version: 1.0.0
 * @time: 2016/8/23
 */
public interface QuoteSearchMapper {

    final class SqlProvider extends SQL {

        public void selectQuotation(QuoteSearchCondition quoteSearch) {
            String prodNameWhere = "";
            if (!StringUtils.isEmpty(quoteSearch.getProdName())) {
                prodNameWhere = " and t2.PROD_NAME = t1.PROD_NAME";
            }
            SELECT("t1.ID Id");
            SELECT("t1.LINE_NO lineNo");
            SELECT("t1.QUOTE_ID quoteId");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_DATE = t1.QUOTE_DATE and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then t1.QUOTE_NO else null end quoteNo");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_DATE = t1.QUOTE_DATE and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then t1.QUOTE_STATUS else null end quoteStatus");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_DATE = t1.QUOTE_DATE and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then to_char(t1.QUOTE_DATE, 'YYYY-MM-DD') else null end quoteDate");
            SELECT("t1.CUST_ID custId");
            SELECT("t1.CUST_CODE custCode");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_DATE = t1.QUOTE_DATE and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then t1.CUST_NAME else null end custName");
            SELECT("t1.OU_ID ouId");
            SELECT("t1.OU_CODE ouCode");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_DATE = t1.QUOTE_DATE and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then t1.DEP_NAME else null end depName");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_DATE = t1.QUOTE_DATE and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then t1.AGENT_NAME else null end agentName");
            SELECT("t1.SALE_MANAGER_ID saleManagerId");
            SELECT("case when (select min(t2.id) from V_QUOTE_PROD t2 where t2.QUOTE_NO = t1.QUOTE_NO and t2.CUST_NAME = t1.CUST_NAME and t2.QUOTE_DATE = t1.QUOTE_DATE and t2.QUOTE_STATUS = t1.QUOTE_STATUS "+prodNameWhere+") = t1.id  then t1.SUM_AMT else null end sumAmt");
            SELECT("t1.QUOTE_PRICE quotePrice");
            SELECT("t1.MANU_QTY manuQty");
            SELECT("t1.QUOTE_AMT quoteAmt");
            SELECT("t1.PROD_ID prodId");
            SELECT("t1.CUST_AMT custAmt");
            //SELECT("t1.FREE_FLAG freeFlag");
            SELECT("t1.PROD_TYPE prodType");
            SELECT("t1.PROD_CODE prodCode");
            SELECT("t1.PROD_NAME prodName");
        }

        private void selectWhereSQL(QuoteSearchCondition quoteSearch) {
            if (!StringUtils.isEmpty(StringUtils.trimAll(quoteSearch.getMercherId()))) {
                WHERE("t1.MERCHER_ID =#{quoteSearch.mercherId}");
            }
            if (!StringUtils.isEmpty(StringUtils.trimAll(quoteSearch.getSaleManagerId()))) {
                WHERE("t1.SALE_MANAGER_ID =#{quoteSearch.saleManagerId}");
            }
            if (!StringUtils.isEmpty(StringUtils.trimAll(quoteSearch.getCustName()))) {
                WHERE("t1.CUST_NAME like '%'||#{quoteSearch.custName}||'%'");
            }
            if (!StringUtils.isEmpty(StringUtils.trimAll(quoteSearch.getProdName()))) {
                WHERE("t1.PROD_NAME like '%'||#{quoteSearch.prodName}||'%'");
            }
            if (!StringUtils.isEmpty(StringUtils.trimAll(quoteSearch.getQuoteNo()))) {
                WHERE("t1.QUOTE_NO like '%'||#{quoteSearch.quoteNo}||'%'");
            }
            if (quoteSearch.getCreateDate() != null) {
                WHERE("t1.QUOTE_DATE >= #{quoteSearch.createDate}");
            }
            if (quoteSearch.getEndDate() != null) {
                WHERE("t1.QUOTE_DATE < #{quoteSearch.endDate}");
            }
            if (!StringUtils.isEmpty(quoteSearch.getQuoteStatus())) {
                WHERE("t1.QUOTE_STATUS in " + SqlUtil.toSqlStringSet(quoteSearch.getQuoteStatusList()));
            }
            if(true){
                ORDER_BY("t1.QUOTE_ID desc,t1.ID");
            }
        }

        private void selectCondition() {
            FROM("V_QUOTE_PROD t1");
        }

        private static final String SELECT_QUOTEINFO = "selectQuoteInfo";

        public String selectQuoteInfo(@Param("quoteSearch") QuoteSearchCondition quoteSearch) {
            selectQuotation(quoteSearch);
            selectCondition();
            selectWhereSQL(quoteSearch);
            return SqlUtil.paging(toString(), quoteSearch);
        }

        private static final String SELECT_QUOTE_NUM = "selectQuoteNum";

        public String selectQuoteNum(@Param("quoteSearch") QuoteSearchCondition quoteSearch) {
            SELECT("count(1) as value");
            selectCondition();
            selectWhereSQL(quoteSearch);
            return toString();
        }
    }

    //主页面数据
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_QUOTEINFO)
    List<QuoteSearchDomain> selectQuoteInfo(@Param("quoteSearch") QuoteSearchCondition quoteSearch);

    //主页面数据总数
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_QUOTE_NUM)
    Integer selectQuoteNum(@Param("quoteSearch") QuoteSearchCondition quoteSearch);
}
