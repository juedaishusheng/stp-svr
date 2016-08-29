package com.el.stp.cm_ou.mapper;

import com.el.stp.cm_ou.domain.DateCondition;
import com.el.stp.cm_ou.domain.FactoryCapacityDomain;
import com.el.stp.cm_ou.domain.PrintSoDomain;
import com.el.stp.common.util.StringUtils;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import com.el.stp.cm_ou.domain.ProcessPriceDomain;

import java.util.Date;
import java.util.List;

/**
 * @author billy
 * @since 16/8/1.
 */
public interface FactoryCapacityMapper {
    final class SqlProvider extends SQL {


        //====================产能数据 start======================
        private static final String CAPACITY_DATA = "capacityData";
        public String capacityData(@Param("dateCondition") DateCondition dateCondition) {
            capacityDatas();
            capacitFrom();
            capacityDataConditon(dateCondition);
            return SqlUtil.paging(toString(), dateCondition);
        }

        private void capacityDatas() {
            SELECT("DT,CAPA_TYPE,CAPA,DAILY_CAPA,UOM ");
        }

        private void capacitFrom() {
            FROM("V_OCCUPY");
//            LEFT_OUTER_JOIN("T_FACT_STDCAPA C ON C.FACT_ID=T.FACT_ID");
//            LEFT_OUTER_JOIN("T_PROD P ON P.ID=T.PROD_ID");
        }

        private void capacityDataConditon(@Param("dateCondition") DateCondition dateCondition){
            if (StringUtils.notEmpty(dateCondition.getDateFrom()) && StringUtils.notEmpty(dateCondition.getDateTo())) {
                WHERE("DT BETWEEN to_date(#{dateCondition.dateFrom},'yyyy-MM-dd')" +
                    " and to_date(#{dateCondition.dateTo},'yyyy-mm-dd')");
            }
            WHERE("FACT_ID=#{dateCondition.factId}");
            WHERE("OU_ID=#{dateCondition.ouId}");
        }

        private static final String CAPACITY_TOTAL = "capacityTotal";
        public String capacityTotal(@Param("dateCondition") DateCondition dateCondition) {
            SELECT("COUNT(1) AS N");
            capacitFrom();
            capacityDataConditon(dateCondition);
            return toString();
        }
        //====================产能数据  end ======================

        private static final String PRINT_SO_INFO = "printSoInfo";
        public String printSoInfo(@Param("dateCondition") DateCondition dateCondition) {
            printSoDatas();
            printSoFrom();
            printSoCondition(dateCondition);
            return SqlUtil.paging(toString(), dateCondition);
        }

        private void printSoDatas() {
            SELECT("SO_ID soId,CUST_CODE custCode,CUST_NAME custName,SO_NO soNo,AGENT_NAME agentName,SO_DATE soDate,DUE_DATE dueDate," +
                "ACPT_USER acptUser,ACPT_TIME acptTime,MANU_COMP_DATE manuCompDate,DIST_METHOD distMethod," +
                "DIST_QTY distQty,MANU_STATUS manuStatus,QUALITY_LEVEL qualityLevel,PRINT_DIFF_LEVEL printDiffLevel," +
                "BIND_DIFF_LEVEL bindDiffLevel,MANU_QTY manuQty,PROD_CODE prodCode,PROD_NAME prodName,PROD_TYPE prodType");

//            WHERE("t.OU_ID=1");
        }
        private void printSoFrom() {
            FROM("V_SO_MANU");
//            LEFT_OUTER_JOIN("T_CUST c on t.CUST_ID=c.ID");
//            LEFT_OUTER_JOIN("T_SO_MANU m on t.ID = m.SO_ID");
//            LEFT_OUTER_JOIN("(select r.FACT_ID,r.OU_ID,r.QUALIFY_LEVEL,r.PRINT_DIFF_LEVEL,r.BIND_DIFF_LEVEL " +
//                "from T_FACT_RELATE r where r.FACT_ID=1) x on x.OU_ID=t.OU_ID ");
//            LEFT_OUTER_JOIN("(SELECT d.SO_ID,d.MANU_QTY,p.PROD_CODE,p.PROD_NAME,p.PROD_TYPE " +
//                "FROM T_SO_PROD d LEFT JOIN T_PROD p on d.PROD_ID=p.ID) p ON t.ID=p.SO_ID");
//            LEFT_OUTER_JOIN("T_ADDRESS_BOOK b on T.AGENT_ID=B.ID");
        }
        private void printSoCondition(@Param("dateCondition") DateCondition dateCondition) {
            if (StringUtils.notEmpty(dateCondition.getDateFrom()) && StringUtils.notEmpty(dateCondition.getDateTo())) {
                WHERE("SO_DATE BETWEEN to_date(#{dateCondition.dateFrom},'yyyy-MM-dd')" +
                    " and to_date(#{dateCondition.dateTo},'yyyy-mm-dd')");
            }
            WHERE("FACT_ID=#{dateCondition.factId}");
            WHERE("OU_ID=#{dateCondition.ouId}");
        }

        private static final String PRINT_SO_TOTAL = "printSoTotal";

        public String printSoTotal(@Param("dateCondition") DateCondition dateCondition) {
            SELECT("COUNT(1) AS N");
            printSoFrom();
            printSoCondition(dateCondition);
            return toString();
        }
    }

    /*工序产能*/
    @Select({"SELECT T.CAPA_TYPE capaType,T.DAILY_CAPA dailyCapa,T.UOM, O.OU_NAME as ouName FROM T_FACT_STDCAPA T " +
        "LEFT JOIN T_OU O ON O.ID = T.OU_ID"})
    List<FactoryCapacityDomain> capacitys();

    /*产能数据tab*/
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.CAPACITY_DATA)
    List<FactoryCapacityDomain> capacityData(@Param("dateCondition") DateCondition dateCondition);

    /*产能数据总数*/
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.CAPACITY_TOTAL)
    Integer capacityTotal(@Param("dateCondition") DateCondition dateCondition);

    /*印刷订单tab数据*/
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRINT_SO_INFO)
    List<PrintSoDomain> printSoData(@Param("dateCondition") DateCondition dateCondition);

    /*印刷订单数据总数*/
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRINT_SO_TOTAL)
    Integer printSoTotal(@Param("dateCondition") DateCondition dateCondition);

    /**
     * seven 修改 16-8-2
     * 工序价格
     */
    @Select({"select p.PROCESS_CODE processCode,n.PROCESS_NAME processName,n.CAT1 cat1,n.CAT2 cat2,n.CAT3 cat3,p.PRICE price,p.PRICE_UOM priceUom " +
        "FROM T_PROCESS_PRICE p JOIN T_PROCESS n ON n.id = p.id where p.ADDR_NO = #{addrNo}"})
    List<ProcessPriceDomain> processPriceIn(@Param("addrNo") String addrNo);

    @Select({"select T_SO.SO_NO soNo FROM T_SO"})
    List<PrintSoDomain> printOrderInfo();
}
