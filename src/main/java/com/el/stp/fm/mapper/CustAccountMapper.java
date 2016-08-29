package com.el.stp.fm.mapper;

import com.el.stp.fm.domain.CustAccountCondition;
import com.el.stp.fm.domain.CustAccountDomain;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 * Created by max on 2016/8/2.
 */
public interface CustAccountMapper {
    final class SqlProvider extends SQL{

        private void custAccountQuery(){
            SELECT("tcs.ID as id");
            SELECT("tcs.OU_ID as ouId");
            SELECT("tcs.CUST_ID as custId");
            SELECT("tcs.DOC_NO as docNo");
            SELECT("tcs.SETTLE_DATE as settleDate");
            SELECT("tcs.DOC_STATUS as docStatus");
            SELECT("tcs.SO_ID as soId");
            SELECT("tcs.SO_PROD_ID as soProdId");
            SELECT("tcs.PROD_ID as prodId");
            SELECT("tcs.LINE_NO as lineNo");
            SELECT("tcs.UOM as uom");
            SELECT("tcs.SO_QTY as soQty");
            SELECT("tcs.SO_AMT as soAmt");
            SELECT("tcs.SETTLE_QTY as settleQty");
            SELECT("tcs.SETTLE_AMT as settleAmt");
            SELECT("tcs.ACCOUNT_DATE as accountDate");
            SELECT("tcs.ACCOUNT_AMT as accountAmt");
            SELECT("tcs.ACCOUNT_FLAG as accountFlag");
            SELECT("tcs.PRICE as price");
            SELECT("tu.OU_NAME as ouName");
            SELECT("tc.CUST_NAME as custName");

        }
        private void custAccountFrom (){
            FROM("T_CUST_SETTLE tcs");
            LEFT_OUTER_JOIN("T_OU tu ON tcs.OU_ID = tu.ID");
            LEFT_OUTER_JOIN("T_CUST tc ON tcs.CUST_ID = tc.ID");
        }

        private void custAccountWhereSql (CustAccountCondition ca){

        }


        private static final String CUSTACCOUNT_QUERY_SQL = "custAccountQuerySql";
        public String custAccountQuerySql(CustAccountCondition ca){
            custAccountQuery();
            custAccountFrom();
            custAccountWhereSql(ca);
            return  SqlUtil.paging(toString(), ca);
        }

        private static final String CUSTACCOUNT_NUM_SQL = "custAccountNumSql";
        public String custAccountNumSql(CustAccountCondition ca){
            SELECT("COUNT(1) AS VALUE");
            custAccountFrom();
            custAccountWhereSql(ca);
            return toString();
        }

    }

    /**
     * 客户对账单进度
     * @return
     */
    @SelectProvider(type = CustAccountMapper.SqlProvider.class,method = SqlProvider.CUSTACCOUNT_QUERY_SQL)
    List<CustAccountDomain> custAccountInfo(CustAccountCondition ca);

    @SelectProvider(type = CustAccountMapper.SqlProvider.class,method = SqlProvider.CUSTACCOUNT_NUM_SQL)
    Integer custAccountNum(CustAccountCondition ca);

}
