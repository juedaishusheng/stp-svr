package com.el.stp.cm_ou.mapper;

import com.el.stp.cm_ou.domain.OrderSearchCondition;
import com.el.stp.cm_ou.domain.OrderSearchDetailDomain;
import com.el.stp.cm_ou.domain.OrderSearchDomain;
import com.el.stp.common.util.StringUtils;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

import static com.el.util.SqlUtil.SQL_DIALECT;

/**
 * Created on 2016/8/9 10:45.
 * 订单查询（业务公司）
 *
 * @author Conway
 */
public interface OrderSearchMapper {
    /**
     * (分单计算工厂分组)删除条件
     */
    @Select({
        "SELECT count(1) value",
        "FROM T_SO_FACTGROUP",
        "WHERE",
        "  EXISTS (",
        "     SELECT CA.SO_ID,ca. ID",
        "     INNER JOIN T_SO_FACTGROUP fac ON ca. ID = fac.CALC_ID",
        "     WHERE ca.SO_id =#{soid}",
        "  )"
    })
    Integer selectIsExistsFactgroupBySoid(String soid);

    /**
     * 删除订单自动分配计算
     */
    @Delete({
        "DELETE from T_SO_FACTGROUP",
        "WHERE CALC_ID = (",
        "   SELECT CALC_ID",
        "   FROM T_SO_CALC",
        "   WHERE SO_ID = #{soid}",
        ")"
    })
    int deleteSoFactgroupBySoid(String soid);

    /**
     * 删除分单计算工厂分组
     */
    @Delete({
        "DELETE T_SO_CALC",
        "WHERE SO_ID = #{soid}"
    })
    int deleteSoCalcBySoid(String soid);

    /**
     * 更新订单接单状态-暂停接单（01）
     */
    @Update({
        "update T_SO_PROD",
        "SET DIST_STATUS = '01'",
        "WHERE SO_ID =#{soid}"
    })
    int updateSoCalcBySoid(String soid);

    final class SqlProvider extends SQL {
        //订单查询-字段
        private void orderSearchFromSQL() {
            SELECT("cu.CUST_CODE AS \"cust.custCode\"");
            SELECT("cu.CUST_NAME AS \"cust.custName\"");
            SELECT("so.SO_NO AS \"so.soNo\"");
            SELECT("(SELECT ADDR_NAME FROM T_ADDRESS_BOOK AB WHERE so.AGENT_ID = AB.ID ) AS clerk");
            SELECT("so.DUE_DATE AS \"so.dueDate\"");
            SELECT("pro.PROD_CODE AS \"prod.prodCode\"");
            SELECT("pro.PROD_NAME AS \"prod.prodName\"");
            SELECT("pro.PROD_TYPE AS \"prod.prodType\"");
            SELECT("pro.QUALITY_LEVEL AS \"prod.qualityLevel\"");
            SELECT("pro.PRINT_DIFF_LEVEL AS \"prod.printDiffLevel\"");
            SELECT("pro.BIND_DIFF_LEVEL AS \"prod.bindDiffLevel\"");
            SELECT("pro.BIND_TYPE AS \"prod.bindType\"");
            SELECT("spod.MANU_QTY AS \"soProd.manuQty\"");
            SELECT("so.MANU_DUE_DATE AS \"so.manuDueDate\"");
            SELECT("spod.SO_STATUS AS \"soProd.soStatus\"");
            SELECT("ma.ACPT_STATUS AS \"soManu.acptStatus\"");
            SELECT("ma.DIST_METHOD AS \"soManu.distMethod\"");
            SELECT("so.SO_DATE AS \"so.soDate\"");
            SELECT("ma.DIST_QTY AS \"soManu.distQty\"");
            SELECT("fac.ADDR_NO AS addrNo");
            SELECT("(SELECT ADDR_NAME FROM\tT_ADDRESS_BOOK A WHERE fac.ADDR_NO=A.ADDR_NO) AS addrName");
            SELECT("ma.ACPT_USER AS \"soManu.acptUser\"");
            SELECT("ma.ACPT_TIME AS \"soManu.acptTime\"");
            SELECT("so.LINE_SPLIT_FLAG AS \"so.lineSplitFlag\"");
            SELECT("spod.QTY_SPLIT_FLAG AS \"soProd.qtySplitFlag\"");
            SELECT("ma.PAPER_READY_STATUS AS \"soManu.paperReadyStatus\"");
            SELECT("ma.PROD_INFO_STATUS AS \"soManu.prodInfoStatus\"");
            SELECT("ma.ID AS \"soManu.id\"");
            SELECT("maf.ID AS \"manudistFact.id\"");
            SELECT("so.ID AS \"so.id\"");
            SELECT("mp.ID AS \"manudistProd.id\"");
            SELECT("pro.ID AS \"prod.id\"");
            SELECT("maf.ACPT_STATUS AS \"manudistFact.acptStatus\"");
            SELECT("(SELECT SUM(NVL(P.WHIN_QTY,0))/NVL(ma.DIST_QTY,1) FROM T_PRODIN P WHERE ma.ACPT_STATUS = '01' OR ma.ACPT_STATUS = '02' ) AS completionRate");
        }
        //订单查询-查询条件
        private void selectCondition(){
            FROM("T_SO_PROD spod");
            JOIN("T_SO_MANU ma ON ma.SO_PROD_ID = spod.ID");
            JOIN("T_PROD pro ON spod.PROD_ID = pro.ID");
            JOIN("T_SO so ON ma.SO_ID = so.ID OR so.ID=spod.SO_ID");
            JOIN("T_CUST cu ON so.CUST_ID = cu.ID");
            JOIN("T_ADDRESS_BOOK adb ON so.AGENT_ID = adb.ID");
            JOIN("T_FACTORY fac ON ma.FACT_ID = fac.ID OR fac.ADDR_NO=adb.ADDR_NO");
            JOIN("T_PRODIN pin ON ma.ID = pin.WHIN_QTY");
            JOIN("T_MANUDIST_PROD mp ON pro.id=mp.prod_id OR SO.ID=MP.SOPROD_ID OR so.ID=mp.SO_ID");
            JOIN("T_MANUDIST_FACT maf ON maf.FACT_ID=fac.ID");
        }
        //订单查询-判断条件
        private void searchOrderWhereSQL(OrderSearchCondition searchCondition){
            if(!StringUtils.isEmpty(searchCondition)){
                //登陆角色所属工厂ID
                if (!StringUtils.isEmpty(searchCondition.getOuid())){
                    WHERE("so.ou_id=#{ouid}");
                }
                //产品名称
                if (!StringUtils.isEmpty(searchCondition.getProductName())) {
                    WHERE(SQL_DIALECT.like("pro.PROD_NAME","productName"));
                }
                //订单编号
                if (!StringUtils.isEmpty(searchCondition.getOrderNo())) {
                    WHERE(SQL_DIALECT.like("so.SO_NO","orderNo"));
                }
                //订单状态
                if (!StringUtils.trimAll(searchCondition.getOrderStatus()).isEmpty()) {
                    WHERE("spod.SO_STATUS=#{orderStatus}");
                }
                //分单状态
                if (!StringUtils.trimAll(searchCondition.getAcptStatus()).isEmpty()) {
                    WHERE("ma.ACPT_STATUS=#{acptStatus}");
                }
                //分单方式
                if (!StringUtils.trimAll(searchCondition.getAcptMethod()).isEmpty()) {
                    WHERE("ma.DIST_METHOD=#{acptMethod}");
                }
                //生产工厂
                if (!StringUtils.isEmpty(searchCondition.getFactoryAddr())) {
                    WHERE(SQL_DIALECT.like("adb.ADDR_NAME","factory"));
                }
                //纸张确认
                if (!StringUtils.trimAll(searchCondition.getPaperReadyStatus()).isEmpty()) {
                    WHERE("ma.PAPER_READY_STATUS=#{paperReadyStatus}");
                }
                //产品状态
                if (!StringUtils.trimAll(searchCondition.getProductStatus()).isEmpty()) {
                    WHERE("ma.PROD_INFO_STATUS=#{productStatus}");
                }
                //交货开始日期
                if (!StringUtils.isEmpty(searchCondition.getStartDuedate())) {
                    WHERE("to_char(so.DUE_DATE,'yyyy-mm-dd')>=#{startDuedate}");
                }
                //交货截止日期
                if (!StringUtils.isEmpty(searchCondition.getEndDuedate())) {
                    WHERE("to_char(so.DUE_DATE,'yyyy-mm-dd')<=#{endDuedate}");
                }
            }
            //筛选已经分单、手工分单、未分单的结果集合
            WHERE("(ma.ACPT_STATUS='01' OR ma.ACPT_STATUS='02' OR maf.ACPT_STATUS='05' OR maf.ACPT_STATUS='06' OR maf.ACPT_STATUS='07')");
        }

        //订单明细-字段
        private void productSearchFileSql(){
            SELECT("CU.CUST_CODE AS custCode,CU.CUST_NAME AS custName,SO.SO_NO AS soNo");
            SELECT("SO.SO_DATE AS soDate,SO.DUE_DATE AS dueDate,SO.MANU_DUE_DATE AS manuDueDate");
            SELECT("MA.ACPT_STATUS AS acptStatus,MA.DIST_METHOD AS distMethod,FAC.ADDR_NO AS addrNo,MA.ID AS somanuId");
            SELECT("MA.ACPT_USER AS acptUser,MA.ACPT_TIME AS acptTime,SO.LINE_SPLIT_FLAG AS lineSplitFlag");
            SELECT("(SELECT ADDR_NAME from T_ADDRESS_BOOK ADB WHERE adb.ADDR_NO=FAC.ADDR_NO) AS addrName");
            SELECT("(SELECT B.ADDR_NAME from T_ADDRESS_BOOK B WHERE so.AGENT_ID=B.ID ) AS clerk");
        }

        //订单查询-产能需求
        private void capacityRequirements(){
            SELECT("(SELECT DISTINCT UDC.VAL_DESC1 FROM T_UDC UDC WHERE UDC.UDC_CODE=OC.CAPA_TYPE) AS CAPA_TYPE");
            SELECT("OC.CAPA,OC.UOM");
            FROM("T_OCCUPY OC");
            INNER_JOIN("T_SO_MANU MA ON OC.SO_MANU_ID=MA.ID");
            WHERE("MA.ID=#{manuid}");
        }
        //订单查询-进度跟踪
        private void trackingProgress(String acptMethod){
            SELECT("P.PROD_CODE ,P.PROD_NAME,P.PROD_TYPE");
            SELECT("SP.MANU_QTY,MA.DIST_QTY,MA.MANU_STATUS");
            SELECT("SUM(PIN.WHIN_QTY)");

            FROM("T_SO_MANU MA");
            RIGHT_OUTER_JOIN("T_SO_PROD SP ON MA.SO_ID=SP.SO_ID");
            INNER_JOIN("T_PROD P ON SP.PROD_ID=P.ID");
            INNER_JOIN("T_PRODIN PIN ON SP.PROD_ID=PIN.PROD_ID");
            WHERE("MA.ID=#{manuid}");
            GROUP_BY("P.PROD_CODE,P.PROD_NAME,P.PROD_TYPE,SP.MANU_QTY,MA.DIST_QTY,MA.MANU_STATUS");
        }
        //订单查询-完成列表
        private void completionList(){
            SELECT("OC.CAPA_TYPE,OC.CAPA,OC.UOM");
            SELECT("SUM(MA.RPT_QTY)");
            SELECT("SUM(RPT_QTY)/NVL(OC.CAPA,1)");
            FROM("T_OCCUPY OC");
            INNER_JOIN("SO_MANU_ID MA ON OC.SO_MANU_ID=MA.SO_MANU_ID");
            WHERE("MA.MANU_ID=#{manuid}");
        }

        //分页数据总条数NUM
        private static final String ORDER_SEARCH_NUM_QUERYSQL = "orderSearchNumSQL";
        public String orderSearchNumSQL(OrderSearchCondition searchCondition){
            SELECT("COUNT(1) AS VALUE");
            selectCondition();
            searchOrderWhereSQL(searchCondition);
            return toString();
        }
        //分页信息数据PAGE
        private static final String ORDER_SEARCH_PAGE_QUERYSQL = "orderSearchPageQuery";
        public String orderSearchPageQuery(OrderSearchCondition searchCondition) {
            orderSearchFromSQL();
            selectCondition();
            searchOrderWhereSQL(searchCondition);
            return SqlUtil.paging(toString(), searchCondition);
        }

        //订单明细SQL
        private static final String ORDER_PRODUCT_STATUS_SEARCH_QUERYSQL = "orderProductAcptStatusSearchSQL";
        public String orderProductAcptStatusSearchSQL(){
            SELECT("CU.CUST_CODE AS custCode");
            SELECT("CU.CUST_NAME AS custName");
            SELECT("SO.SO_NO AS soNo");
            SELECT("(SELECT A.ADDR_NAME FROM T_ADDRESS_BOOK A WHERE SO.AGENT_ID = A. ID) AS clerk");
            SELECT("SO.SO_DATE AS soDate");
            SELECT("SO.DUE_DATE AS dueDate");
            SELECT("SO.MANU_DUE_DATE AS manuDueDate");
            SELECT("SP.SO_STATUS AS soStatus");
            SELECT("MA.ACPT_STATUS AS acptStatus");
            SELECT("MA.DIST_METHOD AS distMethod");
            SELECT("ADB.ADDR_NO AS addrNo");
            SELECT("(SELECT ADDR_NAME FROM T_ADDRESS_BOOK A WHERE A.ADDR_NO=F.ADDR_NO) AS addrName");
            SELECT("MA.ACPT_USER AS acptUser");
            SELECT("MA.ACPT_TIME AS accpDate");
            SELECT("SO.LINE_SPLIT_FLAG AS lineSplitFlag");
            SELECT("SP.QTY_SPLIT_FLAG AS qtySplitFlag");
            SELECT("SP.ID AS soprodId");
            SELECT("SO.id");
            FROM("T_SO_MANU MA");
            JOIN("T_SO SO ON MA.SO_ID=SO.ID");
            JOIN("T_CUST CU ON SO.CUST_ID=CU.ID");
            JOIN("T_ADDRESS_BOOK ADB ON SO.AGENT_ID=ADB.ID");
            JOIN("T_SO_PROD SP ON SP.ID=MA.SO_PROD_ID OR SO.ID=SP.SO_ID");
            JOIN("T_FACTORY F ON MA.FACT_ID=F.ID OR F.ADDR_NO=ADB.ADDR_NO");
            JOIN("T_MANUDIST_FACT MF ON MF.SO_ID=SO.ID OR MF.FACT_ID=F.ID");
            WHERE("MA.ID=#{somanuId}");
            WHERE("MF.ID=#{manudistId}");
            WHERE("SO.ID=#{soid}");
            return toString();
        }

        //String somanuId,String manudistprodId,String soprodId
        //产品信息SQL
        private static final String ORDER_PRODUCT_SEARCH_QUERYSQL = "orderProductSearchSQL";
        public String orderProductSearchSQL() {
            SELECT("P.PROD_CODE AS \"prod.prodCode\",P.PROD_NAME AS \"prod.prodName\",P.PROD_TYPE AS \"prod.prodType\"");
            SELECT("P.QUALITY_LEVEL AS \"prod.qualityLevel\",P.PRINT_DIFF_LEVEL AS \"prod.printDiffLevel\"");
            SELECT("P.BIND_DIFF_LEVEL AS \"prod.bindDiffLevel\",P.BIND_TYPE AS \"prod.bindType\"");
            SELECT("SP.MANU_QTY AS manuQty");
            SELECT("SP.DIST_QTY AS distQty");
            SELECT("(NVL(SP.MANU_QTY,0)-NVL(SP.DISTING_QTY,0)-NVL(SP.DIST_QTY,0)) AS distQty2");
            SELECT("SP.ID AS soprodId");
            SELECT("MP.ID AS manudistprodId");
            SELECT("MA.ID AS somanuId");
            SELECT("MA.DIST_METHOD AS distMethod");

            FROM("T_SO_PROD SP");
            JOIN("T_SO_MANU MA ON MA.SO_ID=SP.SO_ID OR MA.SO_PROD_ID=SP.id");
            JOIN("T_PROD P ON SP.PROD_ID=P.ID");
            JOIN("T_MANUDIST_PROD MP ON MP.SOPROD_ID=SP.ID");

            WHERE("(MA.ACPT_STATUS='01' AND MA.ID=#{somanuId}) OR MP.ID IN(SELECT ID FROM T_MANUDIST_PROD WHERE MANU_DIST_ID=#{manudistId}) OR SP.ID=#{soprodId}");
            return toString();
        }

        //进度跟踪-字段
        private void trackingProgressSearchFileSql() {
            SELECT("P.PROD_CODE AS \"prod.prodCode\"");
            SELECT("P.PROD_NAME AS \"prod.prodName\"");
            SELECT("P.PROD_TYPE AS \"prod.prodType\"");
            SELECT("SP.MANU_QT AS manuQty");
            SELECT("SM.DIST_QTY AS distQty");
            SELECT("SUM(PIN.WHIN_QTY) AS whinQty");
            SELECT("SM.MANU_STATUS AS manuStatus");
            SELECT("SM.ID AS somanuId");
        }

        //进度跟踪-自动分单
        private static final String TRACKINGPROGRESS01_SEARCH_QUERYSQL = "trackingProgress01SearchSQL";

        public String trackingProgress01SearchSQL() {
            trackingProgressSearchFileSql();
            FROM("T_SO_PROD SP");
            JOIN("T_SO_MANU SM ON SP.SO_ID=SM.SO_ID ");
            JOIN("T_PROD P ON P.ID=SP.PROD_ID");
            JOIN("T_PRODIN PIN ON SP.PROD_ID=PIN.PROD_ID ");
            WHERE("SM.ID=#{somanuid}");
            GROUP_BY("P.PROD_CODE,P.PROD_NAME,P.PROD_TYPE,SP.MANU_QTY,SM.DIST_QTY,SM.MANU_STATUS,SM.ID");
            return toString();
        }

        //进度跟踪-手工分单
        private static final String TRACKINGPROGRESS02_SEARCH_QUERYSQL = "trackingProgress02SearchSQL";
        public String trackingProgress02SearchSQL() {
            trackingProgressSearchFileSql();
            FROM("T_SO_PROD SP");
            JOIN("T_SO_MANU SM ON SP.ID=SM.MANU_DIST_ID");
            JOIN("T_PROD P ON SM.SO_PROD_ID=P.ID");
            JOIN("T_PRODIN PIN ON SM.ID=PIN.SOMANU_ID");
            WHERE("SM.ID=#{somanuid}");
            WHERE("SM.SO_PROD_ID IN (SELECT SO_PROD_ID FROM T_SO_MANU WHERE MANU_DIST_ID=#{manudistid})");
            GROUP_BY("P.PROD_CODE,P.PROD_NAME,P.PROD_TYPE,SP.MANU_QTY,SM.DIST_QTY,SM.MANU_STATUS,SM.ID");
            return toString();
        }

        //进度跟踪-完工列表
        private static final String TRACKINGPROGRESS_COMPLETION_SEARCH_QUERYSQL = "trackingProgressCompletionSearchSQL";
        public String trackingProgressCompletionSearchSQL() {
            SELECT("OC.CAPA_TYPE AS capaType");
            SELECT("OC.CAPA AS capa");
            SELECT("OC.UOM AS uom");
            SELECT("SUM(SR.RPT_QTY) AS rptQty");
            SELECT("SUM(SR.RPT_QTY)/NVL(OC.CAPA,1) AS rptNum");

            FROM("T_OCCUPY OC");
            JOIN("T_SORPT SR ON OC.SO_MANU_ID=SR.SO_MANU_ID");
            WHERE("OC.SO_MANU_ID=#{somanuid}");
            GROUP_BY("OC.CAPA_TYPE,OC.CAPA,OC.UOM");
            return toString();
        }

        //订单查询-产能需求（已经分单的订单）
        private static final String PRODUCTSEARCHCAPACITY01_SEARCH_QUERYSQL = "productSearchCapacity01";
        public String productSearchCapacity01(){
            SELECT("OC.CAPA_TYPE AS capaType");
            SELECT("OC.CAPA AS capa");
            SELECT("OC.UOM AS uom");
            FROM("T_OCCUPY OC");
            JOIN("T_SO_MANU MA ON OC.SO_MANU_ID=MA.ID");
            WHERE("MA.ID=#{somanuId}");
            return toString();
        }
        //订单查询-产能需求（正在手工分单的订单）
        private static final String PRODUCTSEARCHCAPACITY02_SEARCH_QUERYSQL = "productSearchCapacity02";
        public String productSearchCapacity02(){
            SELECT("P.CAT3 AS capaType");
            SELECT("NVL(PP.PROCESS_QTY,0)*NVL(MP.DIST_QTY,0)/NVL(SOP.MANU_QTY,1)AS capa");
            SELECT("PP.PROCESS_UOM AS uom");
            FROM("T_MANUDIST_PROD MP");
            JOIN("T_PROD_PROCESS PP ON MP.PROD_ID=PP.PROD_ID");
            JOIN("T_PROCESS P ON PP.PROCESS_ID=P.ID");
            JOIN("T_SO_PROD SOP ON MP.SOPROD_ID=SOP.ID");
            WHERE("MP.ID=#{manudistprodId}");
            return toString();
        }
        //订单查询-产能需求（未分单的订单）
        private static final String PRODUCTSEARCHCAPACITY03_SEARCH_QUERYSQL = "productSearchCapacity03";
        public String productSearchCapacity03(){
            SELECT("P.CAT3 AS capaType");
            SELECT("NVL(PP.PROCESS_QTY,0)*(NVL(SOP.MANU_QTY,0)-NVL(SOP.DISTING_QTY,0)-NVL(SOP.DIST_QTY,0))/NVL(SOP.MANU_QTY,1)AS capa");
            SELECT("PP.PROCESS_UOM AS uom");
            FROM("T_SO_PROD SOP");
            JOIN("T_PROD_PROCESS PP ON SOP.PROD_ID=PP.PROD_ID");
            JOIN("T_PROCESS P ON PP.PROCESS_ID=P.ID");
            WHERE("SOP.ID=#{soprodId}");
            return toString();
        }

        //订单查询-分单对象
        private static final String PRODUCTSEPERATEOBJECT_SEARCH_QUERYSQL = "productSeperateObject";
        public String productSeperateObject(){
            SELECT("F.ADDR_NO AS addrNo");
            SELECT("AB.ADDR_NAME AS addrName");
            SELECT("P.PROD_NAME AS \"prod.prodName\"");
            SELECT("P.PROD_TYPE AS \"prod.prodType\"");
            SELECT("P.QUALITY_LEVEL AS \"prod.qualityLevel\"");
            SELECT("P.PRINT_DIFF_LEVEL AS \"prod.printDiffLevel\"");
            SELECT("P.BIND_DIFF_LEVEL AS \"prod.bindDiffLevel\"");
            SELECT("P.BIND_TYPE AS \"prod.bindType\"");
            SELECT("SF.LAST_MANU_FLAG AS \"soFactgroup.lastManuFlag\"");
            SELECT("SP.MANU_QTY AS manuQty");
            SELECT("MP.CALC_AMT AS productTotalPrice");
            SELECT("MF.ARGUED_AMT AS arguedAmt");
            SELECT("SF.GROUP_NO AS \"soFactgroup.groupNo\"");
            SELECT("SF.SEIZE_START_TIME AS \"soFactgroup.seizeStartTime\"");
            SELECT("SM.DIST_METHOD AS distMethod");
            SELECT("SF.ACPT_STATUS AS \"soFactgroup.acptStatus\"");
            SELECT("SF.ACPT_USER AS \"soFactgroup.acptUser\"");
            SELECT("SF.ACPT_TIME AS \"soFactgroup.acptTime\"");
            SELECT("SF.ACPT_COMMENT AS \"soFactgroup.acptComment\"");

            FROM("T_SO_FACTGROUP SF");
            JOIN("T_SO_CALC SC ON SF.CALC_ID=SC.ID");
            JOIN("T_FACTORY F ON SF.FACT_ID=F.ID");
            JOIN("T_ADDRESS_BOOK AB ON F.ADDR_NO=AB.ADDR_NO");
            JOIN("T_SO_PROD SP ON SP.SO_ID=SC.SO_ID");
            JOIN("T_PROD P ON SP.PROD_ID=P.ID");
            JOIN("T_MANUDIST_PROD MP ON MP.SOPROD_ID=SP.ID OR MP.FACT_ID=F.ID");
            LEFT_OUTER_JOIN("T_SO_MANU SM ON MP.MANU_DIST_ID=SM.MANU_DIST_ID");
            LEFT_OUTER_JOIN("T_MANUDIST_FACT MF ON MP.MANU_DIST_ID=MF.ID");

            WHERE("SC.SO_ID=#{soId} OR MP.SO_ID=#{soId}");
            return toString();
        }

        //订单查询-进度跟踪

    }

    /**
     * 订单查询分页数据信息
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.ORDER_SEARCH_PAGE_QUERYSQL)
    List<OrderSearchDomain> orderSerachList(OrderSearchCondition searchCondition);

    /**
     * 订单查询分页总数量
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.ORDER_SEARCH_NUM_QUERYSQL)
    Integer orderSearchNum(OrderSearchCondition searchCondition);

    /**
     * 订单明细
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.ORDER_PRODUCT_STATUS_SEARCH_QUERYSQL)
    List<OrderSearchDetailDomain> orderProductAcptStatusSearch(@Param("somanuId") String somanuId,
                                                               @Param("manudistId") String manudistId,
                                                               @Param("soid") String soid);
    /**
     * 产品明细
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.ORDER_PRODUCT_SEARCH_QUERYSQL)
    List<OrderSearchDetailDomain> orderProductSearch(@Param("somanuId") String somanuId,
                                                     @Param("manudistId") String manudistId,
                                                     @Param("soprodId") String soprodId);

    /**
     * 产能信息01（已经分单的订单）
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRODUCTSEARCHCAPACITY01_SEARCH_QUERYSQL)
    List<OrderSearchDetailDomain> productSearchCapacity01(@Param("somanuId") String somanuId);
    /**
     * 产能信息02（正在手工分单的订单）
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRODUCTSEARCHCAPACITY02_SEARCH_QUERYSQL)
    List<OrderSearchDetailDomain> productSearchCapacity02(@Param("manudistprodId") String manudistprodId);
    /**
     * 产能信息03（未分单的订单）
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRODUCTSEARCHCAPACITY03_SEARCH_QUERYSQL)
    List<OrderSearchDetailDomain> productSearchCapacity03(@Param("soprodId") String soprodId);

    /**
     * 分单对象
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRODUCTSEPERATEOBJECT_SEARCH_QUERYSQL)
    List<OrderSearchDetailDomain> productSeperateObject(@Param("soId") String soId);

    /**
     * 进度跟踪-自动分单
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.TRACKINGPROGRESS01_SEARCH_QUERYSQL)
    List<OrderSearchDetailDomain> trackingProgress01Search(@Param("somanuid") String somanuid);

    /**
     * 进度跟踪-手工分单
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.TRACKINGPROGRESS02_SEARCH_QUERYSQL)
    List<OrderSearchDetailDomain> trackingProgress02Search(@Param("somanuid") String somanuid,
                                                           @Param("manudistid") String manudistid);
    /**
     * 进度跟踪-完工列表
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.TRACKINGPROGRESS_COMPLETION_SEARCH_QUERYSQL)
    List<OrderSearchDetailDomain> trackingProgressCompletionSearch(@Param("somanuid") String somanuid);

}
