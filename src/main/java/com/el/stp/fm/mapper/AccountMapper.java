package com.el.stp.fm.mapper;

import com.el.cfg.domain.TCustSettle;
import com.el.stp.fm.domain.AccountCondition;
import com.el.stp.fm.domain.AccountDomain;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Johnny on 2016/8/2.
 */
public interface AccountMapper {
    final class SqlProvider extends SQL {

        private void accountQuery (){

            SELECT("tu.ID as ouId");
            SELECT("tu.OU_CODE as ouCode");
            SELECT("tu.OU_NAME as ouName");
            SELECT("tc.ID as custId");
            SELECT("tc.CUST_CODE as custCode");
            SELECT("tc.CUST_NAME as custName");
            SELECT("ts.SO_NO as soNo");
            SELECT("ts.SO_DATE as soDate");
            SELECT("ts.AGENT_ID as agentId");
            SELECT("tp.PROD_CODE as prodCode");
            SELECT("tp.PROD_NAME as prodName");
            SELECT("tsp.ID as id");
            SELECT("tsp.PROD_UOM as prodUom");
            SELECT("tsp.MANU_QTY as manuQty");
            SELECT("tsp.CURR_QUOTE_PRICE as currQuotePrice");
            SELECT("tsp.CURR_QUOTE_AMT as currQuoteAmt");
            SELECT("tsp.FORE_CURR_CODE as foreCurrCode");
            SELECT("tsp.CURR_RATE as currRate");
            SELECT("tsp.QUOTE_PRICE as quotePrice");
            SELECT("tsp.QUOTE_AMT as quoteAmt");
            SELECT("tsp.WHIN_QTY as whinQty");
            SELECT("tsp.DELI_QTY as deliQty");
            SELECT("tsp.SETTLE_FLAG as settleFlag");
            SELECT("tsp.SO_STATUS as soStatus");
            /*SELECT("tci.INV_AMT as invAmt" );
            SELECT("tci.OVERDUE_AMT as overdueAmt" );
            SELECT("tci.OVERDUE_DAYS as overdueDays" );*/
            SELECT("(select sum(INV_AMT) from T_CUSTSETTLE_INV tci where tci.SETTLE_ID = tcs.ID) AS invAmt");
            SELECT("(select sum(RECV_AMT) from T_CUSTINV_RECV tcr join T_CUSTSETTLE_INV tci on tcr.CUSTSETT_ID = tci.id where tci.SETTLE_ID = tcs.ID) as recvAmt");
            SELECT("(select sum(OVERDUE_AMT) from T_CUSTSETTLE_INV tci where tci.SETTLE_ID = tcs.ID) AS overdueAmt");
            SELECT("(select MAX(OVERDUE_DAYS) from T_CUSTSETTLE_INV tci where tci.SETTLE_ID = tcs.ID) AS overdueDays");
        }


        private void accountFrom (){
            FROM("T_SO_PROD tsp");
            JOIN ("T_SO ts ON tsp.SO_ID = ts.ID");
            JOIN ("T_OU tu ON ts.OU_ID = tu.ID");
            JOIN ("T_CUST tc ON ts.CUST_ID = tc.ID");
            JOIN ("T_PROD tp ON tsp.PROD_ID = tp.ID");
            /*LEFT_OUTER_JOIN("T_CUSTSETTLE_INV tci ON tu. ID = tci.OU_ID AND tc.ID = tci.CUST_ID AND ts.SO_NO = tci.SO_NO AND tp.PROD_CODE = tci.PROD_CODE");*/
            LEFT_OUTER_JOIN("T_CUST_SETTLE tcs on tcs.SO_ID = tsp.SO_ID AND tcs.SO_PROD_ID = tsp.ID");

        }

        private void accountWhereSql (@Param("account") AccountCondition account){
            if(null != account) {
                if (!StringUtils.isEmpty(account.getOuName())) {
                    WHERE("tu.OU_NAME = #{account.ouName}");
                }
                if (!StringUtils.isEmpty(account.getCustName())) {
                    WHERE("tc.CUST_NAME = #{account.custName}");
                }
                if (!StringUtils.isEmpty(account.getProdName())) {
                    WHERE("tp.PROD_NAME = #{account.prodName}");
                }
                if (!StringUtils.isEmpty(account.getAgentId())) {
                    WHERE("ts.AGENT_ID = #{account.agentId}");
                }
                if (!StringUtils.isEmpty(account.getSoNo())) {
                    WHERE("ts.SO_NO = #{account.soNo}");
                }
                if (account.getSoDateFrom() != null) {
                    WHERE("ts.SO_DATE >= #{account.soDateFrom}");
                }
                if (account.getSoDateTo() != null) {
                    WHERE("ts.SO_DATE <= #{account.soDateTo}");
                }
            }

        }

        private static final String ACCOUNT_QUERY_SQL = "accountQuerySql";

        public String accountQuerySql(@Param("account") AccountCondition account){
            accountQuery();
            accountFrom();
            accountWhereSql(account);
            return  SqlUtil.paging(toString(),account);

        }

        private static final String ACCOUNT_NUM_SQL = "accountNumSQL";
        public String accountNumSQL(@Param("account") AccountCondition account){
            SELECT("COUNT(1) AS VALUE");
            accountFrom();
            accountWhereSql(account);
            return toString();
        }

        private static final String ACCOUNT_TOTAL_SQL = "accountTotalSql";

        public String accountTotalSql(@Param("account") AccountCondition account){
            accountQuery();
            accountFrom();
            accountWhereSql(account);
            return  toString();

        }



        /**
         * 完工查询
         */
        private void prodInQuery (){
            SELECT("tpi.OU_ID as \"tp.ouId\"");
            SELECT("tpi.MCU_ID as \"tp.mcuId\"");
            SELECT("tpi.FACT_ID as \"tp.factId\"");
            SELECT("tpi.DOC_NO as \"tp.docNo\"");
            SELECT("tpi.DOC_TYPE as \"tp.docType\"");
            SELECT("tpi.DOC_DATE as docDate");
            SELECT("tpi.DOC_STATUS as \"tp.docStatus\"");
            SELECT("tpi.WH_ID as \"tp.whId\"");
            SELECT("tpi.WHIN_PIC as \"tp.whinPic\"");
            SELECT("tpi.SO_ID as \"tp.soId\"");
            SELECT("tpi.SOPROD_ID as \"tp.soprodId\"");
            SELECT("tpi.SOMANU_ID as \"tp.somanuId\"");
            SELECT("tpi.CUST_ID as \"tp.custId\"");
            SELECT("tpi.PROD_ID as \"tp.prodId\"");
            SELECT("tpi.WHIN_QTY as \"tp.whinQty\"");
            SELECT("tpi.SOPROD_QTY as \"tp.soprodQty\"");
            SELECT("tpi.BOTTOM as \"tp.bottom\"");
            SELECT("tpi.HEIGHT as \"tp.height\"");
            SELECT("tpi.QTY_PERPACKAG as \"tp.qtyPerpackag\"");
            SELECT("tpi.SPARE_QTY as \"tp.spareQty\"");
            SELECT("tpi.REMARK as \"tp.remark\"");
        }

        private void prodInFrom(){

            FROM("T_PRODIN tpi");
        }

        private void prodInWhereSql(@Param("prodIn") AccountCondition prodIn){

        }


        private static final String PRODIN_QUERY_SQL = "prodInQuerySql";

        public String prodInQuerySql(@Param("prodIn") AccountCondition prodIn){
            prodInQuery();
            prodInFrom();
            prodInWhereSql(prodIn);
            return  SqlUtil.paging(toString(),prodIn);
        }

        private static final String PRODIN_NUM_SQL = "prodInNumSQL";
        public String prodInNumSQL(@Param("prodIn") AccountCondition prodIn){
            SELECT("COUNT(1) AS VALUE");
            prodInFrom();
            prodInWhereSql(prodIn);
            return toString();
        }


        /**
         * 发货查询
         */
        private void delinoteProdQuery (){
            SELECT("tdp.DELINOTE_ID as \"tdp.delinoteId\"");
            SELECT("tdp.LINE_STATUS as \"tdp.lineStatus\"");
            SELECT("tdp.SO_ID as \"tdp.soId\"");
            SELECT("tdp.SOPROD_ID as \"tdp.soprodId\"");
            SELECT("tdp.SOMANU_ID as \"tdp.soManuId\"");
            SELECT("tdp.CUST_ID as custId");
            SELECT("tdp.PROD_ID as \"tdp.prodId\"");
            SELECT("tdp.SOPROD_QTY as \"tdp.soprodQty\"");
            SELECT("tdp.WH_ID as \"tdp.whId\"");
            SELECT("tdp.DEMAND_DELI_DATE as demandDeliDate");
            SELECT("tdp.DEMAND_DELI_QTY as \"tdp.demandDeliQty\"");
            SELECT("tdp.DEMAND_GIFT_QTY as \"tdp.demandGiftQty\"");
            SELECT("tdp.SUM_DELI_QTY as \"tdp.sumDeliQty\"");
            SELECT("tdp.SUM_GIFT_QTY as \"tdp.sumGiftQty\"");
            SELECT("tdp.UOM as \"tdp.uom\"");
            SELECT("tdp.UOM_WEIGHT as \"tdp.uomWeight\"");
            SELECT("tdp.WEIGHT as \"tdp.weight\"");
            SELECT("tdp.PACKAGE_METHOD as \"tdp.packageMethod\"");
            SELECT("tdp.QTY_PERPACKAGE as \"tdp.qtyPerpackage\"");
            SELECT("tdp.PACKAGE_QTY as \"tdp.packageQty\"");
            SELECT("tdp.SPARE_QTY as \"tdp.spareQty\"");
            SELECT("tdp.DELI_ADDR_NO as \"tdp.deliAddrNo\"");
            SELECT("tdp.DELI_ADDR_DESC as \"tdp.deliAddrDesc\"");
            SELECT("tdp.CONT_PERSON as \"tdp.contPerson\"");
            SELECT("tdp.CONT_TEL as \"tdp.contTel\"");
            SELECT("tdp.REMARK as \"tdp.remark\"");
        }

        private void delinoteProdFrom(){

            FROM("T_DELINOTE_PROD tdp");
        }

        private void delinoteProdWhereSql(@Param("delinoteProd") AccountCondition delinoteProd){

        }


        private static final String DELINOTEPROD_QUERY_SQL = "delinoteProdQuerySql";

        public String delinoteProdQuerySql(@Param("delinoteProd") AccountCondition delinoteProd){
            delinoteProdQuery();
            delinoteProdFrom();
            delinoteProdWhereSql(delinoteProd);
            return  SqlUtil.paging(toString(),delinoteProd);
        }

        private static final String DELINOTEPROD_NUM_SQL = "delinoteProdNumSQL";
        public String delinoteProdNumSQL(@Param("delinoteProd") AccountCondition delinoteProd){
            SELECT("COUNT(1) AS VALUE");
            delinoteProdFrom();
            delinoteProdWhereSql(delinoteProd);
            return toString();
        }





        /**
         * 发票查询
         */
        private void ticketQuery (){
            SELECT("tci.NET_AMT as \"csi.netAmt\"");
            SELECT("tci.SO_NO as \"csi.soNo\"");
            SELECT("tci.PROD_CODE as \"csi.prodCode\"");
            SELECT("tci.INV_AMT as \"csi.invAmt\"");
            SELECT("tci.TAX_AMT as \"csi.taxAmt\"");
            SELECT("tci.GT_INV_NO as \"csi.gtInvNo\"");
            SELECT("tci.INV_DATE as invDate");
            SELECT("tci.OPEN_AMT as \"csi.openAmt\"");
            SELECT("tci.DUE_DATE as dueDate");
            SELECT("tci.OVERDUE_AMT as \"csi.overdueAmt\"");
            SELECT("tci.OVERDUE_DAYS as \"csi.overdueDays\"");
            SELECT("tu.OU_CODE as ouCode");
            SELECT("tu.OU_NAME as ouName");
            SELECT("tc.CUST_CODE as custCode");
            SELECT("tp.PROD_NAME as prodName");
            SELECT("ts.SO_DATE as soDate");
            SELECT("(select tc.CUST_CODE from T_CUST tc WHERE ts.CUST_ID = tc.ID) as prodCustCode");
            SELECT("(SELECT MANU_QTY FROM T_SO_PROD tsp WHERE tsp.SO_ID = ts1.ID AND tsp.PROD_ID = tp.ID) as manuQty");
            SELECT("(SELECT PROD_UOM FROM T_SO_PROD tsp WHERE tsp.SO_ID = ts1.ID AND tsp.PROD_ID = tp.ID) as prodUom");
            SELECT("(SELECT LINE_NO FROM T_SO_PROD tsp WHERE tsp.SO_ID = ts1.ID AND tsp.PROD_ID = tp.ID) as lineNo");
            SELECT("(SELECT QUOTE_AMT FROM T_SO_PROD tsp WHERE tsp.SO_ID = ts1.ID AND tsp.PROD_ID = tp.ID) as quoteAmt");

        }

        private void ticketFrom(){
            FROM("T_CUSTSETTLE_INV tci");
            JOIN("T_CUST tc ON tc.ID = tci.CUST_Id");
            JOIN("T_PROD tp ON tp.PROD_CODE = tci.PROD_CODE");
            JOIN("T_OU tu ON tci.OU_ID = tu.ID");
            LEFT_OUTER_JOIN("T_SO ts ON ts.OU_ID = tci.OU_ID and ts.SO_NO = tci.SO_NO");
            LEFT_OUTER_JOIN(" T_SO ts1 ON ts1.SO_NO = tci.SO_NO");
        }

        private void ticketWhereSql(@Param("ticket") AccountCondition ticket){
            if(null != ticket) {
                if (!StringUtils.isEmpty(ticket.getOuName())) {
                    WHERE("tu.OU_NAME = #{ticket.ouName}");
                }
                if (!StringUtils.isEmpty(ticket.getCustName())) {
                    WHERE("tc.CUST_NAME = #{ticket.custName}");
                }
                if (!StringUtils.isEmpty(ticket.getProdName())) {
                    WHERE("tp.PROD_NAME = #{ticket.prodName}");
                }
                if (!StringUtils.isEmpty(ticket.getAgentId())) {
                    WHERE("ts.AGENT_ID = #{ticket.agentId}");
                }
                if (!StringUtils.isEmpty(ticket.getSoNo())) {
                    WHERE("ts.SO_NO = #{ticket.soNo}");
                }
                if (ticket.getSoDateFrom() != null) {
                    WHERE("ts.SO_DATE >= #{ticket.soDateFrom}");
                }
                if (ticket.getSoDateTo() != null) {
                    WHERE("ts.SO_DATE <= #{ticket.soDateTo}");
                }
            }
        }

        private static final String TICKET_QUERY_SQL = "ticketQuerySql";

        public String ticketQuerySql(@Param("ticket") AccountCondition ticket){
            ticketQuery();
            ticketFrom();
            ticketWhereSql(ticket);
            return  SqlUtil.paging(toString(),ticket);
        }

        private static final String TICKET_NUM_SQL = "ticketNumSQL";
        public String ticketNumSQL(@Param("ticket") AccountCondition ticket){
            SELECT("COUNT(1) AS VALUE");
            ticketFrom();
            ticketWhereSql(ticket);
            return toString();
        }

        private static final String TICKET_TOTAL_SQL = "ticketTotalSql";

        public String ticketTotalSql(@Param("ticket") AccountCondition ticket){
            ticketQuery();
            ticketFrom();
            ticketWhereSql(ticket);
            return  toString();
        }


        /**
         * 付款查询
         */
        private void payQuery (){

            SELECT("tcr.RECV_AMT as \"cr.recvAmt\"");
            SELECT("tcr.RECV_No as \"cr.recvNo\"");
            SELECT("tcr.LINE_NO as \"cr.lineNo\"");
            SELECT("tcr.PAYER as \"cr.payer\"");
            SELECT("tcr.RECV_DATE as recvDate");
            SELECT("tc.CUST_CODE as custCode");
            SELECT("tu.OU_CODE as ouCode");
            SELECT("tu.OU_NAME as ouName");
            SELECT("tcr.GT_INV_NO as gtInvNo");
            SELECT("tci.INV_AMT as \"csi.invAmt\"");
            SELECT("tci.INV_DATE as invDate");

        }
        private void payFrom(){


            /*WHERE 1=1

            AND EXISTS(SELECT 1 FORM T_SO_PROD P WHERE P.SO_ID = S.ID AND P.PROD_ID=1)*/

            FROM("T_CUSTINV_RECV tcr");
            JOIN("T_SO ts ON ts.SO_NO = tcr.SO_NO");
            JOIN("T_OU tu ON tu.ID = tcr.OU_ID");
            JOIN("T_CUST tc ON tc.ID = tcr.CUST_ID");
            LEFT_OUTER_JOIN("T_CUSTSETTLE_INV tci on tcr.CUSTSETT_ID = tci.id ");

        }

        private void payWhereSql(@Param("pay") AccountCondition pay) {
            if(null != pay) {
                if (!StringUtils.isEmpty(pay.getOuName())) {
                    WHERE("tu.OU_NAME = #{pay.ouName}");
                }
                if (!StringUtils.isEmpty(pay.getCustName())) {
                    WHERE("tc.CUST_NAME = #{pay.custName}");
                }
                if (!StringUtils.isEmpty(pay.getProdName())) {
                    WHERE("tp.PROD_NAME = #{pay.prodName}");
                }
                if (!StringUtils.isEmpty(pay.getAgentId())) {
                    WHERE("ts.AGENT_ID = #{pay.agentId}");
                }
                if (!StringUtils.isEmpty(pay.getSoNo())) {
                    WHERE("ts.SO_NO = #{pay.soNo}");
                }
                if (pay.getSoDateFrom() != null) {
                    WHERE("ts.SO_DATE >= #{pay.soDateFrom}");
                }
                if (pay.getSoDateTo() != null) {
                    WHERE("ts.SO_DATE <= #{pay.soDateTo}");
                }
            }
        }

        private static final String PAY_QUERY_SQL = "payQuerySql";

        public String payQuerySql(@Param("pay") AccountCondition pay){
            payQuery();
            payFrom();
            payWhereSql(pay);
            return  SqlUtil.paging(toString(), pay);
        }

        private static final String PAY_NUM_SQL = "payNumSQL";
        public String payNumSQL(@Param("pay") AccountCondition pay){
            SELECT("COUNT(1) AS VALUE");
            payFrom();
            payWhereSql(pay);
            return toString();
        }

        private static final String PAY_TOTAL_SQL = "payTotalSQL";
        public String payTotalSQL(@Param("pay") AccountCondition pay){
            payQuery();
            payFrom();
            payWhereSql(pay);
            return toString();
        }


        /**
         * 结算查询
         */
        private void statementQuery (){
            SELECT("tcs.ID as id");
            SELECT("tcs.OU_ID as \"cad.ouId\"");
            SELECT("tcs.CUST_ID as \"cad.custId\"");
            SELECT("tcs.DOC_NO as \"cad.docNo\"");
            SELECT("tcs.SETTLE_DATE as \"cad.settleDate\"");
            SELECT("tcs.DOC_STATUS as \"cad.docStatus\"");
            SELECT("tcs.SO_ID as \"cad.soId\"");
            SELECT("tcs.SO_PROD_ID as \"cad.soProdId\"");
            SELECT("tcs.PROD_ID as \"cad.prodId\"");
            SELECT("tcs.LINE_NO as \"cad.lineNo\"");
            SELECT("tcs.UOM as \"cad.uom\"");
            SELECT("tcs.SO_QTY as \"cad.soQty\"");
            SELECT("tcs.SO_AMT as \"cad.soAmt\"");
            SELECT("tcs.SETTLE_QTY as \"cad.settleQty\"");
            SELECT("tcs.SETTLE_AMT as \"cad.settleAmt\"");
            SELECT("tcs.ACCOUNT_DATE as \"cad.accountDate\"");
            SELECT("tcs.ACCOUNT_AMT as \"cad.accountAmt\"");
            SELECT("tcs.ACCOUNT_FLAG as \"cad.accountFlag\"");
            SELECT("tcs.PRICE as \"cad.price\"");

            SELECT("tu.OU_NAME as \"cad.ouName\"");
            SELECT("tc.CUST_NAME as \"cad.custName\"");
        }

        private void statementFrom(){
            FROM("T_CUST_SETTLE tcs");
            LEFT_OUTER_JOIN("T_OU tu ON tcs.OU_ID = tu.ID");
            LEFT_OUTER_JOIN("T_CUST tc ON tcs.CUST_ID = tc.ID");
            LEFT_OUTER_JOIN("T_PROD tp ON tcs.PROD_ID = tp.ID");
            LEFT_OUTER_JOIN("T_SO ts ON tcs.SO_ID = ts.ID");

        }
        private void statementWhereSQL(@Param("statement") AccountCondition statement){
            if(null != statement) {
                if (!StringUtils.isEmpty(statement.getOuName())) {
                    WHERE("tu.OU_NAME = #{statement.ouName}");
                }
                if (!StringUtils.isEmpty(statement.getCustName())) {
                    WHERE("tc.CUST_NAME = #{statement.custName}");
                }
                if (!StringUtils.isEmpty(statement.getProdName())) {
                    WHERE("tp.PROD_NAME = #{statement.prodName}");
                }
                if (!StringUtils.isEmpty(statement.getAgentId())) {
                    WHERE("ts.AGENT_ID = #{statement.agentId}");
                }
                if (!StringUtils.isEmpty(statement.getSoNo())) {
                    WHERE("ts.SO_NO = #{statement.soNo}");
                }
                if (statement.getSoDateFrom() != null) {
                    WHERE("ts.SO_DATE >= #{statement.soDateFrom}");
                }
                if (statement.getSoDateTo() != null) {
                    WHERE("ts.SO_DATE <= #{statement.soDateTo}");
                }
            }
        }

        private static final String STATEMENT_QUERY_SQL = "statementQuerySql";

        public String statementQuerySql(@Param("statement") AccountCondition statement){
            statementQuery();
            statementFrom();
            statementWhereSQL(statement);
            return  SqlUtil.paging(toString(), statement);
        }

        /**
         * 分页信息
         */
        private static final String STATEMENT_NUM_SQL = "statementNumSQL";
        public String statementNumSQL(@Param("statement") AccountCondition statement){
            SELECT("COUNT(1) AS VALUE");
            statementFrom();
            statementWhereSQL(statement);
            return toString();
        }

        /**
         * 结算总和
         */
        private static final String STATEMENT_TOTAL_SQL = "statementTotalSql";

        public String statementTotalSql(@Param("statement") AccountCondition statement){
            statementQuery();
            statementFrom();
            statementWhereSQL(statement);
            return toString();
        }





        private void handStatementQuery (){
            SELECT("t1.ou_id                     ouId");
            SELECT("t1.cust_id                   custId");
            SELECT("SYSDATE                      settleDate");
            SELECT("'已结算'                     docStatus");
            SELECT("t1.id                        soId");
            SELECT("t2.id                        soProdId");
            SELECT("t2.prod_id                   prodId");
            SELECT("t2.line_no                   lineNo");
            SELECT("t2.manu_qty                  soQty");
            SELECT("t2.prod_uom                  uom");
            SELECT("t2.quote_price               price");
            SELECT("t2.manu_qty                  soQty");
            SELECT("t2.quote_amt                 soAmt");
            SELECT("t2.deli_qty                  settleQty");
            SELECT("t2.quote_price * t2.deli_qty settleAmt");
            FROM("t_so t1");
            INNER_JOIN("t_so_prod t2 ON t1.id = t2.so_id");
        }

        private static final String HAND_STATEMENT_QUERY_SQL = "handStatementQuerySql";

        public String handStatementQuerySql(@Param("soProdId") Long soProdId){
            handStatementQuery();
            //已发货数量必须小于订单正数才能手动结算
            if(true){
                WHERE("t2.deli_qty < t2.manu_qty");
            }
            //手动结算已结算的数据不允许重复结算
            if (true) {
                WHERE("t2.settle_flag != 'Y'");
            }
            //订单产品表主键
            if(null != soProdId ){
                WHERE("t2.id = #{soProdId}");
            }
            return toString();
        }
        private void autoStatementQuery (){
            SELECT("t1.ou_id                     ouId");
            SELECT("t1.cust_id                   custId");
            SELECT("SYSDATE                      settleDate");
            SELECT("'已结算'                     docStatus");
            SELECT("t1.id                        soId");
            SELECT("t2.id                        soProdId");
            SELECT("t2.prod_id                   prodId");
            SELECT("t2.line_no                   lineNo");
            SELECT("t2.manu_qty                  soQty");
            SELECT("t2.prod_uom                  uom");
            SELECT("t2.quote_price               price");
            SELECT("t2.manu_qty                  soQty");
            SELECT("t2.quote_amt                 soAmt");
            SELECT("t2.deli_qty                  settleQty");
            SELECT("t2.quote_price * t2.deli_qty settleAmt");
            FROM("t_so t1");
            INNER_JOIN("t_so_prod t2 ON t1.id = t2.so_id");
        }

        private static final String AUTO_STATEMENT_QUERY_SQL = "autoStatementQuerySql";

        public String autoStatementQuerySql(){
            autoStatementQuery();
            //已发货数量必须大于等于订单正数才能自动结算
            if(true){
                WHERE("t2.deli_qty >= t2.manu_qty");
            }
            //自动结算已结算的数据不允许重复结算
            if (true) {
                WHERE("t2.settle_flag != 'Y'");
            }
            return toString();
        }



    }


    /**
     *主页面查询
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.ACCOUNT_QUERY_SQL)
    List<AccountDomain> accountInfo(@Param("account") AccountCondition account);

    /**
     * 主页面分页
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.ACCOUNT_NUM_SQL)
    Integer accountBtnNum(@Param("account") AccountCondition  account);

    /**
     * 主页面合计
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.ACCOUNT_TOTAL_SQL)
    List<AccountDomain> accountTotal(@Param("account") AccountCondition account);

    /**
     * 完工查询
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRODIN_QUERY_SQL)
    List<AccountDomain> prodInBtn(@Param("prodIn") AccountCondition prodIn);

    /**
     * 完工分页
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRODIN_NUM_SQL)
    Integer prodInBtnNum(@Param("prodIn") AccountCondition prodIn);

    /**
     * 发货查询
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.DELINOTEPROD_QUERY_SQL)
    List<AccountDomain> delinoteProdBtn(@Param("delinoteProd") AccountCondition delinoteProd);

    /**
     *发货分页
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.DELINOTEPROD_NUM_SQL)
    Integer delinoteProdBtnNum(@Param("delinoteProd") AccountCondition delinoteProd);

    /**
     * 发票查询
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.TICKET_QUERY_SQL)
    List<AccountDomain> ticketBtn (@Param("ticket") AccountCondition ticket);

    /**
     * 发票分页
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.TICKET_NUM_SQL)
    Integer ticketBtnNum(@Param("ticket")AccountCondition  ticket);

    /**
     * 发票合计
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.TICKET_TOTAL_SQL)
    List<AccountDomain> ticketTotal (@Param("ticket") AccountCondition ticket);

    /**
     * 收款查询
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PAY_QUERY_SQL)
    List<AccountDomain> payBtn (@Param("pay") AccountCondition pay);

    /**
     * 收款分页
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PAY_NUM_SQL)
    Integer payBtnNum(@Param("pay")AccountCondition  pay);

    /**
     * 收款总计
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PAY_TOTAL_SQL)
    List<AccountDomain> payTotal(@Param("pay")AccountCondition  pay);


    /**
     * 结算单查询
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.STATEMENT_QUERY_SQL)
    List<AccountDomain> statementBtn (@Param("statement") AccountCondition statement);

    /**
     * 结算单分页
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.STATEMENT_NUM_SQL)
    Integer statementBtnNum(@Param("statement")AccountCondition  statement);

    /**
     * 结算单总计
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.STATEMENT_TOTAL_SQL)
    List<AccountDomain> statementTotal(@Param("statement")AccountCondition  statement);

    /**
     * 手动核算信息查询
     */
    @SelectProvider(type = SqlProvider.class,method = SqlProvider.HAND_STATEMENT_QUERY_SQL)
    List<TCustSettle> handStatementBtn(@Param("soProdId") Long soProdId);
    /**
     * 自动核算信息查询
     */
    @SelectProvider(type = SqlProvider.class,method = SqlProvider.AUTO_STATEMENT_QUERY_SQL)
    List<TCustSettle> autoStatementBtn();

    /**
     * 获取结算编号末尾序号
     * */
    @Select({
        "select substr(DOC_NO,9)+1 orderNum from stdev.t_cust_settle where DOC_NO like '%'||#{date}||'%'"
    })
    String queryOrderNumByDate(@Param("date") String date);

    /**
     * 汇总PQOH
     * co取ou_code
     * litm取prod_code
     * lilotn取batchDesc
     * */
    @Select({
        "SELECT COALESCE(sum(t1.lipqoh),0) pQoh FROM F41021 t1 WHERE trim(lilocn) = '9001' AND trim(t1.co)=#{co} AND trim(t1.litm)=#{litm} AND trim(t1.lilotn)=#{lilotn}"
    })
    BigDecimal sumPqoh(@Param("co") String co, @Param("litm") String litm,@Param("lilotn") String lilotn);

}
