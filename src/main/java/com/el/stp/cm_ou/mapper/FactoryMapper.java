package com.el.stp.cm_ou.mapper;

import com.el.stp.cm_ou.domain.FactoryCondition;
import com.el.stp.cm_ou.domain.FactoryDomain;
import com.el.stp.common.util.StringUtils;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

public interface FactoryMapper {
    final class SqlProvider extends SQL {

        //工厂查询
        private void factoryQuery() {
            SELECT("a.FACT_ID factId,B.ADDR_NO addrNo,C.ADDR_NAME addrName,A.ONTIME_RATE ontimeRate,A.QUALIFY_LEVEL qualifyLevel," +
                "A.PRINT_DIFF_LEVEL printDiffLevel,A.BIND_DIFF_LEVEL bindDiffLevel");
            SELECT("A.VALID_FROM validFrom,A.VALID_TO validTo,NVL(X.CNT1, 0) manuNum,NVL(Y.CNT2, 0) paperReadyNum,NVL(Z.CNT3, 0) prodInfoNum");

        }

        //查询数据源
        private void selectCondition(){
            FROM ("T_FACT_RELATE A");
            INNER_JOIN("T_FACTORY B ON A.FACT_ID=B.ID");
            INNER_JOIN("T_ADDRESS_BOOK C ON B.ADDR_NO=C.ADDR_NO");
            LEFT_OUTER_JOIN("(SELECT K.FACT_ID, COUNT(K.SO_ID) CNT1 FROM " +
                "(SELECT DISTINCT FACT_ID,SO_ID FROM T_SO_MANU D" +
                " WHERE D.MANU_STATUS = '01' AND EXISTS (SELECT 1 FROM T_SO WHERE OU_ID = 1 AND ID = D.SO_ID)) K " +
                "GROUP BY K.FACT_ID) X ON X.FACT_ID = A.FACT_ID");
            LEFT_OUTER_JOIN("(SELECT L.FACT_ID, COUNT(L.SO_ID) CNT2 " +
                "FROM (SELECT DISTINCT FACT_ID,SO_ID FROM T_SO_MANU D  WHERE D.PAPER_READY_STATUS = '01' AND " +
                "EXISTS (SELECT 1 FROM T_SO WHERE OU_ID = 1 AND ID = D.SO_ID)) L GROUP BY L.FACT_ID) Y ON Y.FACT_ID = A.FACT_ID");
            LEFT_OUTER_JOIN("(SELECT M.FACT_ID, COUNT(M.SO_ID) CNT3 FROM (SELECT FACT_ID,SO_ID FROM T_SO_MANU D WHERE D.PROD_INFO_STATUS = '01' AND " +
                "EXISTS (SELECT 1 FROM T_SO WHERE OU_ID = 1 AND ID = D.SO_ID)) M GROUP BY M.FACT_ID ) Z ON Z.FACT_ID = A.FACT_ID");
        }

        //过滤条件
        private void whereCondition(@Param("factory") FactoryCondition factoryCondition){
            if (!StringUtils.isEmpty(StringUtils.trimAll(factoryCondition.getOuName()))) {
                WHERE("c.ADDR_NAME = #{factory.ouName}");
            }
            if (!StringUtils.isEmpty(StringUtils.trimAll(factoryCondition.getQualifyLevel()))) {
                WHERE("A.QUALIFY_LEVEL = #{factory.qualifyLevel}");
            }
            if (!StringUtils.isEmpty(StringUtils.trimAll(factoryCondition.getPrintDiffLevel()))) {
                WHERE("A.PRINT_DIFF_LEVEL = #{factory.printDiffLevel}");
            }
            if (!StringUtils.isEmpty(StringUtils.trimAll(factoryCondition.getBindDiffLevel()))) {
                WHERE("A.BIND_DIFF_LEVEL = #{factory.bindDiffLevel}");
            }
            WHERE("A.OU_ID=#{factory.ouId}");
        }

        private static final String FACTORY_QUERY_SQL = "factoryQuerySql";

        public String factoryQuerySql(@Param("factory") FactoryCondition factoryCondition) {

            factoryQuery();
            selectCondition();
            whereCondition(factoryCondition);

            //排序字段
            if (!StringUtils.isEmpty(factoryCondition.getField())) {
                ORDER_BY(factoryCondition.getField() + " " + factoryCondition.getOrder());
            }
            return SqlUtil.paging(toString(), factoryCondition);
        }

        //分页数据总条数NUM
        private static final String FACTORY_SEARCH_NUM_QUERYSQL = "factorySearchNumSQL";
        public String factorySearchNumSQL(@Param("factory") FactoryCondition factoryCondition){
            SELECT("COUNT(1) AS N");
            selectCondition();
            whereCondition(factoryCondition);
            return toString();
        }


        private static final String HEAD_INFO = "headInfo";

        public String headInfo(@Param("factId") Integer factId) {

            factoryQuery();
            selectCondition();

            if (null!=factId) {
                WHERE("a.FACT_ID = #{factId}");
            }
            return toString();
        }
    }


    /**
     * 工厂查询
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.FACTORY_QUERY_SQL)
    List<FactoryDomain> factoryInfo(@Param("factory") FactoryCondition factoryCondition);

    /**
     * 工厂查询分页总数量
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.FACTORY_SEARCH_NUM_QUERYSQL)
    Integer totalFactory(@Param("factory") FactoryCondition factoryCondition);

    /**
     * 表头查询
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.HEAD_INFO)
    List<FactoryDomain> headInfo(@Param("factId") Integer factId);
}
