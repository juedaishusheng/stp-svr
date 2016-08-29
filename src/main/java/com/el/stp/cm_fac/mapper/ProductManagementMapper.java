package com.el.stp.cm_fac.mapper;

import com.el.stp.cm_fac.domain.*;
import com.el.stp.common.util.StringUtils;
import com.el.sys.domain.UdcMeta;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 * Created by max on 2016/8/17 0017.
 */
public interface ProductManagementMapper {


    final class SqlProvider extends SQL {

        //生产管理主页面数据查询
        private void productManagementQuery(){
            SELECT("m.SO_ID soId");
            SELECT("s.ID sid");
            SELECT("o.OU_CODE ouCode");
            SELECT("o.OU_NAME ouName");
            SELECT("s.SO_NO soNo");
            //SELECT("m.RETURN_DATE returnDate");//数据表里面缺失字段,此字段需要修改
            SELECT("m.ACPT_USER acptUser");
            SELECT("m.ACPT_TIME acptTime");
            SELECT("p.PROD_CODE prodCode");
            SELECT("p.PROD_NAME prodName");
           // SELECT("p.PROD_TYPE prodType");
            SELECT("p.QUALITY_LEVEL qualifyLevel");
            SELECT("p.PRINT_DIFF_LEVEL printDiffLevel");
            SELECT("p.BIND_DIFF_LEVEL bindDiffLevel");
            SELECT("m.DIST_QTY distQty");
            SELECT("m.PAPER_READY_STATUS paperReadyStatus");
            SELECT("m.PAPER_APPR_DATE paperApprDate");
            //SELECT("m.PROD_INFO_STATUS prodInfoStatus");
            SELECT("(SELECT DISTINCT UDC.VAL_DESC1 FROM T_UDC UDC WHERE UDC.UDC_CODE=M.PROD_INFO_STATUS AND UDC.DOMAIN_CODE=#{meta.domainCode} AND UDC.UDC_TYPE=#{meta.udcType}) AS prodInfoStatus");
            SELECT("m.PROD_APPR_DATE prodApprDate");
            SELECT("m.SO_PROD_ID soProdId");//此字段替换T_SO_MANU表中缺失的SO_MANU_ID
        }

        private void selectCondition(){
            FROM("T_SO s");
            LEFT_OUTER_JOIN("T_SO_PROD d ON d.SO_ID = s.ID");
            LEFT_OUTER_JOIN("T_PROD p ON p.ID = d.PROD_ID");
            LEFT_OUTER_JOIN("T_OU o ON o.ID= s.OU_ID");
            LEFT_OUTER_JOIN("T_SO_MANU m ON m.SO_PROD_ID=d.ID");
            WHERE("m.MANU_STATUS != 04");
        }

        //过滤条件
        private void whereCondition(@Param("productManagement")ProductManagementCondition productManagementCondition){
            if (!StringUtils.isEmpty(StringUtils.trimAll(productManagementCondition.getProdName()))) {
                WHERE("p.PROD_NAME = #{productManagement.prodName}");
            }
            if (!StringUtils.isEmpty(StringUtils.trimAll(productManagementCondition.getSoNo()))) {
                WHERE("s.SO_NO = #{productManagement.soNo}");
            }
            if (!StringUtils.isEmpty(StringUtils.trimAll(productManagementCondition.getProdAppr()))) {
                WHERE("m.PROD_INFO_STATUS = #{productManagement.prodAppr}");
            }
            if (!StringUtils.isEmpty(StringUtils.trimAll(productManagementCondition.getPaperAppr()))) {
                WHERE("m.PAPER_READY_STATUS = #{productManagement.paperAppr}");
            }
        }

        //分页数据总条数NUM
        private static final String PRODUCT_MANAGEMENT_NUM_QUERYSQL = "productManagementSearchNumSQL";
        public String productManagementSearchNumSQL(@Param("productManagement")ProductManagementCondition productManagementCondition,
                                                    @Param("meta") UdcMeta udcMeta){
            SELECT("COUNT(1) AS N");
            selectCondition();
            whereCondition(productManagementCondition);
            return toString();
        }

        //生产管理主页面
        private static final String PRODUCT_MANAGEMENT_QUERY_SQL = "productManagementQuerySql";
        public String productManagementQuerySql(@Param("productManagement")ProductManagementCondition productManagementCondition,
                                                @Param("meta") UdcMeta udcMeta) {
            productManagementQuery();
            selectCondition();
            whereCondition(productManagementCondition);
            //排序字段
            if (!StringUtils.isEmpty(productManagementCondition.getField())) {
                ORDER_BY(productManagementCondition.getField() + " " + productManagementCondition.getOrder());
            }
            return SqlUtil.paging(toString(),productManagementCondition);
        }

        //子页面头部数据查询
        private static final String HEAD_INFO_QUERY_SQL = "headInfoQuerySql";
        public String headInfoQuerySql(@Param("sid") Integer sid,
                                       @Param("meta") UdcMeta udcMeta) {
            productManagementQuery();
            selectCondition();
            if (null!=sid) {
                WHERE("s.ID = #{sid}");
            }
            return toString();
        }
        //生产管理-详情页-产品明细数据查询语句
        private void productDetailQuery(){
            SELECT("p.PROD_CODE as prodCode");
            SELECT("p.PROD_NAME as prodName");
            //SELECT("p.PROD_TYPE as prodType");
            SELECT("p.QUALITY_LEVEL as qualifyLevel");
            SELECT("p.PRINT_DIFF_LEVEL as printDiffLevel");
            SELECT("p.BIND_DIFF_LEVEL as bindDiffLevel");
            //SELECT("p.BIND_TYPE as bindType");
            SELECT("m.DIST_QTY as manuQty");
            SELECT("m.PROD_INFO_STATUS as prodInfoStatus");
            SELECT("NVL((select sum(WHIN_QTY) from T_PRODIN i where I.SOMANU_ID=M.ID)/m.DIST_QTY,0)*100 as finishRate");

        }
        //生产管理-详情页-产品明细数据查询
        private static final String PRODUCT_DETAIL_QUERY_SQL = "productDetailQuerySql";
        public String productDetailQuerySql(@Param("sid") Integer sid){
            productDetailQuery();
            selectCondition();
            if (null!=sid) {
                WHERE("s.ID = #{sid}");
            }
            return toString();
        }

        //生产管理-详情页-产能需求数据查询
        private void productRequireQuery(){
            SELECT("OU.CAPA_TYPE cat3");
            SELECT("OU.CAPA processQty");
            SELECT("OU.UOM processUom");
            FROM("T_OCCUPY OU");
            INNER_JOIN("T_SO_MANU M ON M.ID = OU.SO_MANU_ID");
            INNER_JOIN("T_FACT_STDCAPA f ON f.OU_ID = OU.DISTOU_ID");
            //WHERE("M.ID=")
        }
        //生产管理-详情页-产能需求数据查询
        private static final String PRODUCT_REQUIRE_QUERY_SQL = "productRequireQuerySql";
        public String productRequireQuerySql(){
            productRequireQuery();
            return toString();
        }

        //生产管理-子页面-文件检查查询 seven
        private static final String FILE_CHECK_QUERY_SQL = "fileCheckQuerySql";
        public String fileCheckQuerySql(@Param("meta") UdcMeta udcMeta) {
            productManagementQuery();
            selectCondition();
            return toString();
        }

        //生产管理-子页面-文件检查-产能需求 seven
        private static final String FILE_CHECK_DOUBLE_CLICK_QUERY_SQL = "fileCheckDoubleClickQuerySql";
        public String fileCheckDoubleClickQuerySql(@Param("soProdId") Integer soProdId){
            SELECT("o.CAPA_TYPE capaType");
            SELECT("o.CAPA capa");
            SELECT("s.UOM uom");
            FROM("T_OCCUPY o");
            INNER_JOIN("T_SO_MANU m on m.SO_PROD_ID = o.SO_MANU_ID");
            INNER_JOIN("T_FACT_STDCAPA s on s.OU_ID=o.DISTOU_ID and s.FACT_ID=o.FACT_ID");
            WHERE("o.SO_MANU_ID=#{soProdId}");
            return toString();
        }

        //生产管理-子页面-纸张检查查询 seven
        private void paperCheckQuery(){
            SELECT("p.DOC_NO docNo");
            SELECT("P.DOC_DATE docDate");
            SELECT("p.ITEM_ID itemId");
            SELECT("e.ITEM_NAME itemName");
            SELECT("e.LINE_TYPE lineType");
            SELECT("e.CAT1 cat1");
            SELECT("e.CAT2 cat2");
            SELECT("e.cat7 cat7");
            SELECT("e.cat8 cat8");
            SELECT("e.cat9 cat9");
            SELECT("p.PLAN_OUT_QTY planOutQty");
            SELECT("s.PAPER_READY_STATUS paperReadyStatus");
            FROM("T_PAPERTRANS p");
            INNER_JOIN("T_SO_MANU s on s.SO_ID = p.SO_ID and s.SO_PROD_ID = p.SOPROD_ID");
            INNER_JOIN("T_ITEM e on e.ID = p.ITEM_ID");
            WHERE("s.SO_ID = #{soId}");
        }
        private static final String PAPER_CHECK_QUERY_SQL = "paperCheckQuerySql";
        public String paperCheckQuerySql(){
            paperCheckQuery();
            return toString();
        }

        //生产管理-子页面-生产报工
        private void productReportQuery(){
            SELECT("p.PROD_CODE prodCode");
            SELECT("p.PROD_NAME prodName");
            SELECT("s.RPT_DT rptDt");
            SELECT("s.RPTER_NAME rpterName");
            SELECT("s.RPT_TYPE rptType");
            SELECT("s.RPT_UOM rptUom");
            SELECT("o.CAPA capa");
            SELECT("s.RPT_QTY rptQty");
            FROM("T_SORPT s");
            JOIN("T_SO_MANU u ON u.ID= s.SO_MANU_ID");
            JOIN("T_OCCUPY o ON o.SO_MANU_ID = s.SO_MANU_ID");
            JOIN("T_PROD p ON p.ID = s.PROD_ID");
            //WHERE("");
        }
        private static final String PRODUCT_REPORT_QUERY_SQL = "productReportQuerySql";
        public String productReportQuerySql(){
            productReportQuery();
            return toString();
        }

        //生产管理-子页面-记录上报查询
        private void recordReportQuery(){
            SELECT("P.ITEM_DT itemDt");
            SELECT("P.RPTER_NAME rpterName");
            SELECT("P.ITEM_DESC itemDesc");
            SELECT("P.ITEM_IMPACT itemImpact");
            SELECT("P.ITEM_SOLUTION itemSolution");

            FROM("T_SONOTE_ITEM P");
            INNER_JOIN("T_SO_MANU S ON S.MANU_DIST_ID = P.SO_MANU_ID");
        }
        private static final String RECORD_REPORT_QUERY_SQL = "recordReportQuerySql";
        public String recordReportQuerySql(@Param("soId") Integer soId) {
            recordReportQuery();
            //有需要的，不要删
            //  if (null!=soId) {
            //      WHERE("S.SO_ID = #{soId} OR S.MANU_DIST_ID = #{soId}");
            //  }
            return toString();
        }

        //生产管理-子页面-完工入库查询
        private void finishPutQuery(){
            SELECT("S.SO_ID soId");
            SELECT("D.PROD_CODE prodCode");
            SELECT("D.PROD_NAME prodName");
            SELECT("P.WHIN_PIC whinPic");
            SELECT("P.DOC_DATE docDate");
            SELECT("S.DIST_QTY distQty");
            SELECT("(select sum(SM.WHIN_QTY) From T_SO_MANU SM where SM.SO_ID=S.SO_ID OR SM.MANU_DIST_ID=S.MANU_DIST_ID) AS sumDistQty");
            SELECT("P.WHIN_QTY whinQty");
            SELECT("NVL(S.DIST_QTY-(select sum(SM.WHIN_QTY) From T_SO_MANU SM where SM.SO_ID=S.SO_ID OR SM.MANU_DIST_ID=S.MANU_DIST_ID),0) AS unWhinQty");
            SELECT("P.REMARK remark");

            FROM("T_PRODIN P");
            INNER_JOIN("T_SO_MANU S ON S.ID = P.SOMANU_ID");
            INNER_JOIN("T_PROD D ON D.ID = P.PROD_ID");
           // WHERE("S.SO_ID='1' OR S.MANU_DIST_ID='1'");
        }
        private static final String FINISH_PUT_QUERY_SQL = "finishPutQuerySql";
        public String finishPutQuerySql(@Param("soId") Integer soId) {
            finishPutQuery();
            //有需要的，不要删
          //  if (null!=soId) {
          //      WHERE("S.SO_ID = #{soId} OR S.MANU_DIST_ID = #{soId}");
          //  }
            return toString();
        }

        //生产管理-子页面-完工入库-成功保存后-更新T_SO_MANU表状态
        private static final String UPDATE_T_SO_MANU_SQL = "updateTSoManuSql";
        public String updateTSoManuSql() {
            UPDATE("T_SO_MANU SM");
            SET("SM.MANU_STATUS = '03'");
            WHERE("(select sum(WHIN_QTY) from T_PRODIN WHERE SOMANU_ID=#{somanuId})>= DIST_QTY");
            return toString();
        }

    }

    /**
     * 生产管理主页分页总数量
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRODUCT_MANAGEMENT_NUM_QUERYSQL)
    Integer totalProductManagement(@Param("productManagement")ProductManagementCondition productManagementCondition,
                                   @Param("meta") UdcMeta udcMeta);

    //生产管理主页数据
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRODUCT_MANAGEMENT_QUERY_SQL)
    List<ProductManagementDomain> productManagementInfo(@Param("productManagement")ProductManagementCondition productManagementCondition,
                                                        @Param("meta") UdcMeta udcMeta);
    /**
     * 生产管理子页面数据查询
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.HEAD_INFO_QUERY_SQL)
    List<ProductManagementDomain> headInfoList(@Param("sid") Integer sid,
                                               @Param("meta") UdcMeta udcMeta);

    //生产管理-详情页-产品明细
    @SelectProvider(type = SqlProvider.class,method = SqlProvider.PRODUCT_DETAIL_QUERY_SQL)
    List<ProductDetailDomain> productDetailInfoList(@Param("sid") Integer sid);

    //生产管理-详情页-产能需求
    @SelectProvider(type = SqlProvider.class,method = SqlProvider.PRODUCT_REQUIRE_QUERY_SQL)
    List<ProductRequireDomain> productRequireInfoList();

    //生产管理-子页面-文件检查查询 seven
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.FILE_CHECK_QUERY_SQL)
    List<ProductManagementDomain> fileCheckList(@Param("meta") UdcMeta udcMeta);

    //生产管理-子页面-文件检查-产能需求
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.FILE_CHECK_DOUBLE_CLICK_QUERY_SQL)
    List<ProductManagementPageCheckDomain> fileCheckDoubleClickList(@Param("soProdId") Integer soProdId);

    //生产管理-子页面-纸张检查
    @SelectProvider(type = SqlProvider.class,method = SqlProvider.PAPER_CHECK_QUERY_SQL)
    List<ProductManagementPaperCheckDomain> productManagementPaperCheckList(@Param("soId") Integer soId);

    //生产管理-子页面-生产报工
    @SelectProvider(type = SqlProvider.class,method = SqlProvider.PRODUCT_REPORT_QUERY_SQL)
    List<ProductManagementProductReportDomain> productManagementProductReportList();

    //生产管理-子页面-记录上报查询
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.RECORD_REPORT_QUERY_SQL)
    List<RecordReportDomain> recordReportList(@Param("soId") Integer soId);

    //生产管理-子页面-完工入库查询
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.FINISH_PUT_QUERY_SQL)
    List<FinishPutDomain> finishPutList(@Param("soId") Integer soId);

    //生产管理-子页面-完工入库-成功保存后-更新T_SO_MANU表状态
    @UpdateProvider(type = SqlProvider.class, method = SqlProvider.UPDATE_T_SO_MANU_SQL)
    int tSoManuSattusUpdate(@Param("somanuId") Long somanuId);

}
