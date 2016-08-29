package com.el.stp.cm_ou.mapper;

import com.el.stp.cm_ou.domain.FactoryCondition;
import com.el.stp.cm_ou.domain.FactoryDomain;
import com.el.stp.cm_ou.domain.OrderPriceDomain;
import com.el.stp.common.util.StringUtils;
import com.el.sys.domain.PagingBean;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import static com.el.stp.cm_ou.mapper.OrderPriceMapper.SqlProvider.*;

/**
 * Created by Spring on 2016/8/1.
 */
public interface OrderPriceMapper {

    final class SqlProvider extends SQL {

//        private void orderPriceQuery(){
//            SELECT("A.ADDR_NO as addrNo");
//            SELECT("A.ADDR_NAME as addrName");
//
//            SELECT("C.ONTIME_RATE as ontimeRate");
//            SELECT("C.QUALIFY_LEVEL as qualifyLevel");
//            SELECT("C.PRINT_DIFF_LEVEL as printDiffLevel");
//            SELECT("C.BIND_DIFF_LEVEL as bindDiffLevel");
//
//            SELECT("T_PROD.PROD_CODE as prodCode");
//            SELECT("T_PROD.PROD_NAME as prodName");
//
//            SELECT("E.MANU_QTY as manuQty");
//
//            SELECT("D.DIST_QTY as distQty");
//            SELECT("D.CALC_AMT as calcAmt");
//
//            SELECT("B.CALC_AMT as distAmt");
//            SELECT("B.ARGUED_AMT as arguedAmt");
//            SELECT("B.ARGUE_DESC as argueDesc");
//            SELECT("B.COST_AMT as costAmt");
//            SELECT("B.LOCKER_ID as lockerId");
//            SELECT("B.LOCK_TS as lockTs");
//            SELECT("B.ID as tid");
//
//            FROM("T_MANUDIST_FACT B");
//
//            LEFT_OUTER_JOIN("T_FACTORY ON T_FACTORY.ID=B.FACT_ID");
//            LEFT_OUTER_JOIN("T_ADDRESS_BOOK A ON A.ADDR_NO=T_FACTORY.ADDR_NO");
//            LEFT_OUTER_JOIN("T_FACT_RELATE C ON C.FACT_ID = B.FACT_ID");
//            LEFT_OUTER_JOIN("T_MANUDIST_PROD D ON D.SOPROD_ID = B.FACT_ID");
//            LEFT_OUTER_JOIN("T_SO_PROD E ON E.ID = D.SOPROD_ID");
//            LEFT_OUTER_JOIN("T_PROD ON T_PROD.ID = E.PROD_ID");
//
//            WHERE("B.ACPT_STATUS='05'");
//
//        }
        //订单核价select
        private void orderPriceQuery(){
//            SELECT("A.ADDR_NO as addrNo");
//            SELECT("A.ADDR_NAME as addrName");
//
//            SELECT("C.ONTIME_RATE as ontimeRate");
//            SELECT("C.QUALIFY_LEVEL as qualifyLevel");
//            SELECT("C.PRINT_DIFF_LEVEL as printDiffLevel");
//            SELECT("C.BIND_DIFF_LEVEL as bindDiffLevel");
//
//            SELECT("T_PROD.PROD_CODE as prodCode");
//            SELECT("T_PROD.PROD_NAME as prodName");
//
//            SELECT("E.MANU_QTY as manuQty");
//
//            SELECT("D.DIST_QTY as distQty");
//            SELECT("D.CALC_AMT as calcAmt");
//
//            SELECT("B.CALC_AMT as distAmt");
//            SELECT("B.ARGUED_AMT as arguedAmt");
//            SELECT("B.ARGUE_DESC as argueDesc");
//            SELECT("B.COST_AMT as costAmt");
//            SELECT("B.LOCKER_ID as lockerId");
//            SELECT("B.LOCK_TS as lockTs");
//            SELECT("B.ID as tid");
            SELECT("ADDR_NO addrNo,ADDR_NAME as addrName,ONTIME_RATE as ontimeRate,QUALIFY_LEVEL as qualifyLevel,PRINT_DIFF_LEVEL as printDiffLevel," +
                "BIND_DIFF_LEVEL as bindDiffLevel,PROD_CODE as prodCode,PROD_NAME as prodName,MANU_QTY as manuQty," +
                "DIST_QTY as distQty,CALC_AMT as calcAmt,ARGUED_AMT as arguedAmt,ARGUE_DESC as argueDesc,COST_AMT as costAmt," +
                "LOCKER_ID as lockerId,LOCK_TS as lockTs,ID as tid,");
        }

        //查询数据源
        private void selectCondition() {
            FROM("V_MANUDIST_PROD");

//            LEFT_OUTER_JOIN("T_FACTORY ON T_FACTORY.ID=B.FACT_ID");
//            LEFT_OUTER_JOIN("T_ADDRESS_BOOK A ON A.ADDR_NO=T_FACTORY.ADDR_NO");
//            LEFT_OUTER_JOIN("T_FACT_RELATE C ON C.FACT_ID = B.FACT_ID");
//            LEFT_OUTER_JOIN("T_MANUDIST_PROD D ON D.SOPROD_ID = B.FACT_ID");
//            LEFT_OUTER_JOIN("T_SO_PROD E ON E.ID = D.SOPROD_ID");
//            LEFT_OUTER_JOIN("T_PROD ON T_PROD.ID = E.PROD_ID");

            WHERE("ACPT_STATUS='05'");
        }

        public static final String ORDERPRICE_QUERY_SQL = "orderPriceQuerySql";
        public String orderPriceQuerySql(PagingBean pagingBean) {
            orderPriceQuery();
            selectCondition();
            //排序字段
            if (!StringUtils.isEmpty(pagingBean.getField())) {
                ORDER_BY(pagingBean.getField() + " " + pagingBean.getOrder());
            }
            return SqlUtil.paging(toString(), pagingBean);
        }

        //分页数据总条数NUM
        private static final String ORDERPRICE_SEARCH_NUM_QUERYSQL = "orderPriceSearchNumSQL";
        public String orderPriceSearchNumSQL(){
            SELECT("COUNT(1) AS N");
            selectCondition();
            return toString();
        }

        //订单核价-同意事件更新表
        private void orderPriceUpdate() {

            UPDATE("T_MANUDIST_FACT");
            SET("T_MANUDIST_FACT.ACPT_STATUS='07',T_MANUDIST_FACT.PRICE_APPRER='',T_MANUDIST_FACT.PRICE_APPR_TIME=''");

        }
        private static final String ORDER_UPDATE_INFO = "orderUpdateInfo";
        public String orderUpdateInfo(@Param("orderId") Integer orderId) {

            orderPriceUpdate();
            if (null!=orderId) {
                WHERE("T_MANUDIST_FACT.ID = #{orderId}");
            }
            return toString();
        }

        //订单核价-退回事件修改表
        private void orderPriceBack() {

            UPDATE("T_MANUDIST_FACT");
            SET("T_MANUDIST_FACT.ACPT_STATUS='06',T_MANUDIST_FACT.PRICE_APPRER='',T_MANUDIST_FACT.PRICE_APPR_TIME='',PRICE_APPR_COMMENT=#{textareaContent}");

        }
        private static final String ORDER_PRICE_BACK_INFO = "orderPriceBackInfo";
        public String orderPriceBackInfo(@Param("orderId")Integer orderId,
                                         @Param("textareaContent") String textareaContent) {

            orderPriceBack();
            if (null!=orderId) {
                WHERE("T_MANUDIST_FACT.ID = #{orderId}");
            }
            return toString();
        }
    }

    /**
     * 订单核价
     * @return
     */
    @SelectProvider(type = OrderPriceMapper.SqlProvider.class, method = ORDERPRICE_QUERY_SQL)
    List<OrderPriceDomain> orderPriceInfo(PagingBean pagingBean);

    /**
     * 订单核价分页总数量
     */
    @SelectProvider(type = OrderPriceMapper.SqlProvider.class, method = OrderPriceMapper.SqlProvider.ORDERPRICE_SEARCH_NUM_QUERYSQL)
    Integer totalOrderPrice();

    /**
     * 同意按钮
     * @param orderId
     * @return
     */
    @SelectProvider(type = OrderPriceMapper.SqlProvider.class, method = OrderPriceMapper.SqlProvider.ORDER_UPDATE_INFO)
    List<OrderPriceDomain> orderUpdateInfo(@Param("orderId") Integer orderId);

    /**
     * 退回
     * @param textareaContent
     * @return
     */
    @SelectProvider(type = OrderPriceMapper.SqlProvider.class, method = OrderPriceMapper.SqlProvider.ORDER_PRICE_BACK_INFO)
    List<OrderPriceDomain> orderPriceBackInfo(@Param("orderId")Integer orderId,@Param("textareaContent") String textareaContent);

}
