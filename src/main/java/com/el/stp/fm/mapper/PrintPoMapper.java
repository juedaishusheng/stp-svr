package com.el.stp.fm.mapper;

import com.el.stp.fm.domain.PrintPoCondition;
import com.el.stp.fm.domain.PrintPoDomain;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import static com.el.stp.fm.mapper.PrintPoMapper.SqlProvider.*;

import java.util.List;
import com.el.util.SqlUtil;

/**
 * Created by Johnny on 2016/7/31.
 */
public interface PrintPoMapper {
    final class SqlProvider extends SQL {

        private void printPoQuery(){
            SELECT("P.OU_ID as ouId");
            SELECT("P.SUPP_CODE as suppCode");
            SELECT("P.SUPP_NAME as suppName");
            SELECT("P.PO_NO as poNo");
            SELECT("P.PROD_CODE as prodCode");
            SELECT("P.PROD_NAME as prodName");
            SELECT("P.LINE_NO as lineNo");
            SELECT("P.QTY as qty");
            SELECT("P.UOM as uom");
            SELECT("P.PRICE as price");
            SELECT("P.AMT as amt");
            SELECT("P.PO_DATE as poDate");
            SELECT("P.WHIN_QTY as whinQty");
            SELECT("P.INV_AMT as invAmt");
            SELECT("P.NOINV_AMT as noinvAmt");
            SELECT("P.PAY_AMT as payAmt");
            SELECT("P.NOPAY_AMT as nopayAmt");
            SELECT("P.WHIN_AMT as whinAmt");
            SELECT("p.SO_NO as soNo");
            SELECT("tu.OU_NAME as ouName");

        }

        private void printPoFrom (){
            FROM("T_PRINT_PO P");
            LEFT_OUTER_JOIN("T_OU tu ON P.OU_ID = tu.ID");
        }

        private void printPoWhereSql (PrintPoCondition ppc){
            /**
             * 查询时条件
             */
            if(null != ppc){
                if ( !StringUtils.isEmpty(ppc.getOuName())) {
                    WHERE("tu.OU_NAME = #{ouName}");
                }
                if (!StringUtils.isEmpty(ppc.getPoNo())) {
                    WHERE("p.PO_NO LIKE " + SqlUtil.toSqlLikeString(ppc.getPoNo()));
                }
                if (!StringUtils.isEmpty(ppc.getSuppName())) {
                    WHERE("p.SUPP_NAME = #{suppName}");
                }
                if (!StringUtils.isEmpty(ppc.getProdName())) {
                    WHERE("p.PROD_NAME = #{prodName}");
                }
                if(ppc.getPoDateFrom()!=null){
                    WHERE("p.PO_DATE >= #{poDateFrom}");
                }
                if(ppc.getPoDateTo()!=null){
                    WHERE("p.PO_DATE <= #{poDateTo}");
                }

            }
        }

        private static final String PRINTPO_QUERY_SQL = "printPoQuerySql";

        public String printPoQuerySql(PrintPoCondition ppc){

            printPoQuery();
            printPoFrom();
            printPoWhereSql(ppc);
            return  SqlUtil.paging(toString(), ppc);
        }

        private static final String PRINTPO_NUM_SQL = "printPoNumSql";

        public String printPoNumSql(PrintPoCondition ppc){
            SELECT("COUNT(1) AS VALUE");
            printPoFrom();
            printPoWhereSql(ppc);
            return toString();

        }

        private static final String PRINTPO_TOTAL_SQL = "printPoTotalSql";

        public String printPoTotalSql(PrintPoCondition ppc){
            printPoQuery();
            printPoFrom();
            printPoWhereSql(ppc);
            return toString();

        }

    }
    /**
     * 印刷采购单结算管理查询
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRINTPO_QUERY_SQL)
    List<PrintPoDomain> printPoInfo(PrintPoCondition ppc);

    /**
     * 主页面分页
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRINTPO_NUM_SQL)
    Integer printPoNum(PrintPoCondition ppc);

    /**
     * 主页面合计
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRINTPO_TOTAL_SQL)
    List<PrintPoDomain> printPoTotal(PrintPoCondition ppc);

}
