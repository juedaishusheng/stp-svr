package com.el.stp.cm_fac.mapper;

import com.el.stp.cm_fac.domain.CapacityDataDomain;
import com.el.stp.cm_fac.domain.MeetOrderDomain;
import com.el.stp.cm_fac.domain.OuDomain;
import com.el.stp.cm_fac.domain.ProductSpecsDomain;
import com.el.stp.cm_ou.domain.FactoryCapacityDomain;
import com.el.stp.cm_ou.mapper.FactoryCapacityMapper;
import com.el.stp.cm_ou.mapper.OrderPriceMapper;
import com.el.stp.common.util.StringUtils;
import com.el.sys.domain.PagingBean;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.Date;
import java.util.List;

/**
 * @author spring
 */
public interface OrderTakeMapper {


    final class SqlProvider extends SQL {

        //订单接单主页面数据查询
        private void orderTakeQuery() {
            SELECT("f.ID  as id");
            SELECT("o.OU_NAME  as ouName");
            SELECT("s.SO_NO  as soNo");
            SELECT("s.MANU_DUE_DATE  as manuDueDate");
            SELECT("f.FACT_AMT  as factAmt");
            SELECT("p.PROD_CODE  as prodCode");
            SELECT("p.PROD_NAME  as prodName");
            SELECT("p.PROD_TYPE  as prodType");
            SELECT("p.QUALITY_LEVEL  as qualityLevel");
            SELECT("p.PRINT_DIFF_LEVEL  as printDiffLevel");
            SELECT("p.BIND_DIFF_LEVEL  as bindDiffLevel");
            SELECT("p.BIND_TYPE  as bindType");
            SELECT("d.MANU_QTY  as manuQty");
            SELECT("f.SEIZE_START_TIME  as seizeStartTime");
        }
        //查询数据源
        private void selectCondition(){
            FROM("T_SO_FACTGROUP f ");
            LEFT_OUTER_JOIN("T_SO_CALC c ON f.CALC_ID = c.ID");
            LEFT_OUTER_JOIN("T_OU o ON c.OU_ID = o.ID");
            LEFT_OUTER_JOIN("T_SO s ON c.SO_ID = s.ID");
            LEFT_OUTER_JOIN("T_SO_PROD d ON d.SO_ID = s.ID");
            LEFT_OUTER_JOIN("T_PROD p ON d.PROD_ID = p.ID");
            WHERE("f.SEIZE_START_TIME <= sysdate AND f.ACPT_STATUS != 01");
        }
        private static final String ORDER_TAKE_QUERY_SQL = "orderTakeQuerysQL";
        public String orderTakeQuerysQL(@Param("pagingBean") PagingBean pagingBean) {
            orderTakeQuery();
            selectCondition();
            //排序字段
            if (!StringUtils.isEmpty(pagingBean.getField())) {
                ORDER_BY(pagingBean.getField() + " " + pagingBean.getOrder());
            }
            return SqlUtil.paging(toString(),pagingBean);
        }

        //分页数据总条数NUM
        private static final String ORDER_TAKE_SEARCH_NUM_QUERYSQL = "orderTakeSearchNumSQL";
        public String orderTakeSearchNumSQL(){
            SELECT("COUNT(1) AS N");
            selectCondition();
            return toString();
        }

        //子页面头部数据查询
        private static final String ORDER_DETAIL_QUERY_SQL = "orderDetailQuerySql";
        public String orderDetailQuerySql(@Param("id") Integer id) {
            orderTakeQuery();
            selectCondition();
            if (null!=id) {
                WHERE("f.ID = #{id}");
            }
            return toString();
        }

        //================订单接单子页面-产品明细 start Seven====================
        private void productDetailList() {

            SELECT("p.PROD_CODE as prodCode");
            SELECT("p.PROD_NAME as prodName");
            SELECT("p.PROD_TYPE as prodType");
            SELECT("p.QUALITY_LEVEL as qualifyLevel");
            SELECT("p.PRINT_DIFF_LEVEL as printDiffLevel");
            SELECT("p.BIND_DIFF_LEVEL as bindDiffLevel");
            SELECT("p.BIND_TYPE as bindType");
            SELECT("d.MANU_QTY as manuQty");
            SELECT("p.ID as prodId");
        }

        private static final String PRODUCT_DETAIL_LIST_SQL = "productDetailListSql";
        public String productDetailListSql() {
            productDetailList();
            selectCondition();
            return toString();
        }
        //================订单接单子页面-产品明细 end====================

        //================订单接单-产品明细-产能需求 start Seven====================
        private void productDetailDemand(){

            SELECT("p.CAT3  as cat3");
            SELECT("s.PROCESS_QTY  as processQty");
            SELECT("s.PROCESS_UOM  as processUom");
            FROM("T_PROCESS p");
            LEFT_OUTER_JOIN("T_PROD_PROCESS s ON s.PROCESS_ID = p.ID");
            LEFT_OUTER_JOIN("T_PROD d ON d.ID = s.PROD_ID");
        }

        private static final String PRODUCT_DETAIL_DEMAND_SQL = "productDetailDemandSql";
        public String productDetailDemandSql() {
            productDetailDemand();
            return toString();
        }
        //=============订单接单-产品明细-产能需求 end ===================================

        //============= 订单接单子页面-产能数据查询 start ====================================
        private void capacityDataQuery() {
            SELECT("TOC.DT as dt");
            SELECT("T.PROD_NAME as prodName");
            SELECT("TOC.CAPA_TYPE as capaType");
            SELECT("FA.DAILY_CAPA as dailyCapa");
            SELECT("TOC.CAPA as capa");
            SELECT("NVL(TOC.CAPA/FA.DAILY_CAPA,0)*100 as alScale");
        }
        private void selectCapacityDataCondition(){
            FROM("T_OCCUPY TOC");
            LEFT_OUTER_JOIN("T_FACT_STDCAPA FA ON FA.OU_ID = TOC.DISTOU_ID");
            LEFT_OUTER_JOIN("T_PROD T ON T.ID = TOC.PROD_ID");
        }
        private static final String CAPACITY_DATA_QUERY_SQL = "capacityDataQuerySql";
        public String capacityDataQuerySql(@Param("pagingBean") PagingBean pagingBean) {
            capacityDataQuery();
            selectCapacityDataCondition();
            //排序字段
            if (!StringUtils.isEmpty(pagingBean.getField())) {
                ORDER_BY(pagingBean.getField() + " " + pagingBean.getOrder());
            }
            return SqlUtil.paging(toString(),pagingBean);
        }

        //订单接单子页面-产能数据-分页数据总条数NUM
        private static final String PRODUCTDATA_SEARCH_NUM_QUERYSQL = "productDataSearchNumSql";
        public String productDataSearchNumSql(){
            SELECT("COUNT(1) AS N");
            selectCapacityDataCondition();
            return toString();
        }
        //============= 订单接单子页面-产能数据查询 end ====================================

        //====================产能数据查询按钮事件 start======================
        private static final String CAPACITY_DATA = "capacityData";
        public String capacityData(@Param("dateFrom") Date dateFrom,
                                   @Param("dateTo") Date dateTo) {
            capacityDataQuery();
            selectCapacityDataCondition();
            if (StringUtils.notEmpty(dateFrom) && StringUtils.notEmpty(dateTo)) {
               // WHERE("TOC.DT BETWEEN TO_DATE(#{dateFrom},'yyyy-mm-dd hh24:mi:ss') and TO_DATE(#{dateTo},'yyyy-mm-dd hh24:mi:ss')");
                WHERE("to_char(TOC.DT,'yyyy-mm-dd') BETWEEN to_char(#{dateFrom},'yyyy-mm-dd hh24:mi:ss') and to_char(#{dateTo},'yyyy-mm-dd hh24:mi:ss')");
            }

            return toString();
        }
        //====================产能数据查询按钮事件  end ======================

    }

    /**
     * 订单接单主页面数据查询
     * @return
     */
    @SelectProvider(type = OrderTakeMapper.SqlProvider.class, method = OrderTakeMapper.SqlProvider.ORDER_TAKE_QUERY_SQL)
    List<MeetOrderDomain> orderTakeIn(@Param("pagingBean") PagingBean pagingBean);

    /**
     * 订单接单子页面数据查询
     * @return
     */
    @SelectProvider(type = OrderTakeMapper.SqlProvider.class, method = OrderTakeMapper.SqlProvider.ORDER_DETAIL_QUERY_SQL)
    List<MeetOrderDomain> orderDetailsList(@Param("id") Integer id);

    /**
     * 订单接单主页分页总数量
     */
    @SelectProvider(type = OrderTakeMapper.SqlProvider.class, method = OrderTakeMapper.SqlProvider.ORDER_TAKE_SEARCH_NUM_QUERYSQL)
    Integer totalOrderTake();

    /**
     * 订单接单主页面-产品明细
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRODUCT_DETAIL_LIST_SQL)
    List<ProductSpecsDomain> productDetailList();
    /**
     * 订单接单子页面-产品明细-产能需求 seven
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRODUCT_DETAIL_DEMAND_SQL)
    List<ProductSpecsDomain> productDetailDemand(@Param("prodId") String prodId);

    /**
     * 订单接单子页面-产能数据分页总数量
     */
    @SelectProvider(type = OrderTakeMapper.SqlProvider.class, method = OrderTakeMapper.SqlProvider.PRODUCTDATA_SEARCH_NUM_QUERYSQL)
    Integer totalProductData();
    /**
     * 订单接单子页面-产能数据
     * @return
     */
    @SelectProvider(type = OrderTakeMapper.SqlProvider.class, method = OrderTakeMapper.SqlProvider.CAPACITY_DATA_QUERY_SQL)
    List<CapacityDataDomain> productDataList(@Param("pagingBean") PagingBean pagingBean);

    //产能数据查询按钮事件
    @SelectProvider(type = OrderTakeMapper.SqlProvider.class, method = OrderTakeMapper.SqlProvider.CAPACITY_DATA)
    List<CapacityDataDomain> capacityData(@Param("dateFrom") Date dateFrom,
                                             @Param("dateTo") Date dateTo);
}
