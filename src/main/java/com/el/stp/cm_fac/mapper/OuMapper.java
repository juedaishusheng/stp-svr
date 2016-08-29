package com.el.stp.cm_fac.mapper;

import com.el.stp.cm_fac.domain.*;
import com.el.stp.cm_ou.domain.*;
import com.el.stp.common.util.StringUtils;
import com.el.sys.domain.PagingBean;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;


/**
 * @author max
 * @created on 16/8/1
 * 公司查询主页面、子页面、印刷订单详情页面SQL
 */
public interface OuMapper {
    final class SqlProvider extends SQL {

        /**
         * 公司查询SQL语句 暂时是选取出所有的工厂关联公司的信息
         */
        private void ouQuery() {
            SELECT("F.ONTIME_RATE as ontimeRate"); //上月交付准时率
            SELECT("F.QUALIFY_LEVEL as qualifyLevel"); //质量等级
            SELECT("F.PRINT_DIFF_LEVEL as printDiffLevel"); //印刷难度等级
            SELECT("F.BIND_DIFF_LEVEL as bindDiffLevel"); //装订难度等级
            SELECT("F.VALID_FROM as validFrom"); //合作开始日期
            SELECT("F.VALID_TO as validTo");  //合作结束日期
            SELECT("U.ID as ouId");  //T_OU表序列号
            SELECT("U.OU_CODE as ouCode");  //公司编号
            SELECT("U.OU_NAME as ouName");  //公司名称
            SELECT("C.TEL1 as tel1");  //公司总机
            SELECT("A.CITY as city");  //城市
            SELECT("A.ADD1 as add1");  //地址1
            SELECT("A.ADD2 as add2");  //地址2
            SELECT("nvl((SELECT COUNT (DISTINCT M1.SO_ID) FROM T_SO S1,T_SO_MANU M1 WHERE M1.SO_ID = S1.ID and S1.OU_ID = F.OU_ID and M1.MANU_STATUS='01'),0) as manuNum"); //生产中数量
            SELECT("nvl((SELECT COUNT (DISTINCT M2.SO_ID) FROM T_SO S2,T_SO_MANU M2 WHERE M2.SO_ID = S2.ID and S2.OU_ID = F.OU_ID and M2.PAPER_READY_STATUS='01'),0) as paperReadyNum");  //纸张未确认数量
            SELECT("nvl((SELECT COUNT (*) FROM T_SO S3,T_SO_MANU M3 WHERE M3.SO_ID = S3.ID and S3.OU_ID = F.OU_ID and M3.PROD_INFO_STATUS='01'),0) as prodInfoNum"); //产品信息未确认数量
        }

        /**
         * 公司查询-关联表
         */
        private void selectCondition() {
            FROM("T_FACT_RELATE F");
            LEFT_OUTER_JOIN("T_OU U  ON F.OU_ID = U.ID");
            //TO DO 要加上一个 A.ADDR_NO = 当前登入者ADDR_NO条件
            LEFT_OUTER_JOIN("T_CONTTEL C ON C.OU_ID = F.OU_ID");
            //TO DO 要加上一个 A.ADDR_NO = 当前登入者ADDR_NO条件
            LEFT_OUTER_JOIN("T_ADDRESS A ON A.OU_ID = F.OU_ID");
        }

        //公司查询公共查询条件
        private void ouQueryWhereSql(@Param("ou") OuCondition ou) {
            if (ou != null) {
                //公司条件
                if (!StringUtils.isEmpty(StringUtils.trimAll(ou.getOuName()))) {
                    WHERE("U.OU_NAME = #{ou.ouName}");
                }
                //质量难度等级条件
                if (!StringUtils.isEmpty(StringUtils.trimAll(ou.getQualifyLevel()))) {
                    WHERE("F.QUALIFY_LEVEL = #{ou.qualifyLevel}");
                }
                //印刷难度等级条件
                if (!StringUtils.isEmpty(StringUtils.trimAll(ou.getPrintDiffLevel()))) {
                    WHERE("F.PRINT_DIFF_LEVEL = #{ou.printDiffLevel}");
                }
                //装订难度等级条件
                if (!StringUtils.isEmpty(StringUtils.trimAll(ou.getBindDiffLevel()))) {
                    WHERE("F.BIND_DIFF_LEVEL = #{ou.bindDiffLevel}");
                }
            }
        }

        /**
         * 公司关联的工序查询SQL语句
         */
        private void stdCapaQuery() {
            SELECT("S.CAPA_TYPE as capaType"); //工序类型
            SELECT("S.DAILY_CAPA as dailyCapa"); //工序合作产能
            SELECT("S.UOM as uom"); //单位
            FROM("T_FACT_STDCAPA S");
        }

        /**
         * 产能数据查询SQL语句
         */
        private void capaQuery() {
            SELECT("P.PROD_NAME as prodName"); //产品名称
            SELECT("P.DAILY_CAPA as dailyCapa"); //合作产能
            SELECT("P.UOM as uom"); //单位
            SELECT("P.CAPA_TYPE as capaType"); //工序类型
            SELECT("P.DT as dt"); //日期
            SELECT("P.CAPA as capa"); //已占用产能
        }

        //产能数据关联表
        private void capaSelectCondition() {
            FROM("V_OCCUPY P");
        }

        //产能数据公共查询条件
        private void capaQueryWhereSql(@Param("capa") CapaCondition capa) {
            if (capa != null) {
                //公司条件
                if (!StringUtils.isEmpty(capa.getOuId())) {
                    WHERE("P.OU_ID = #{capa.ouId}");
                    //WHERE("C.OU_ID = 1");
                }
                if (StringUtils.notEmpty(capa.getDateFromYmd()) && StringUtils.notEmpty(capa.getDateToYmd())) {
                    WHERE("to_char(P.DT,'yyyy-mm-dd') BETWEEN to_char(#{capa.dateFromYmd},'yyyy-mm-dd hh24:mi:ss') and to_char(#{capa.dateToYmd},'yyyy-mm-dd hh24:mi:ss')");
                }
            }
        }

        /**
         * 印刷订单查询SQL语句
         */
        private void printQuery() {
            SELECT("M.PROD_CODE as proCode"); //产品编号
            SELECT("M.PROD_NAME as prodName"); //产品名称
            SELECT("M.PROD_TYPE as proType"); //产品类型
            SELECT("M.QUALITY_LEVEL as qualityLevel"); //质量等级
            SELECT("M.PRINT_DIFF_LEVEL as printDiffLevel"); //印刷难度等级
            SELECT("M.BIND_DIFF_LEVEL as bindDiffLevel"); //装订难度等级
            SELECT("M.BIND_TYPE as bindType"); //装订方式
            SELECT("M.SO_NO as soNo"); //订单编号
            SELECT("M.ID as soManuId"); //T_SO_MANU表ID
            SELECT("M.ACPT_USER as accpUser"); //接单员
            SELECT("M.ACPT_TIME as accpDate"); //接单时间
            SELECT("M.MANU_COMP_DATE as manuCompDate"); //生产交期
            SELECT("M.DIST_QTY as distQty"); //生产数量
            SELECT("M.MANU_STATUS as manuStatus"); //生产状态
            SELECT("M.FACT_ID as manuDistId"); //手工分单工厂ID
        }

        //印刷订单关联表
        private void printSelectCondition() {
            FROM("V_SO_MANU M");
        }

        //印刷订单公共查询条件
        private void printQueryWhereSql(@Param("capa") CapaCondition capa) {
            if (capa != null) {
                //公司条件
                if (!StringUtils.isEmpty(capa.getOuId())) {
                    WHERE("M.OU_ID = #{capa.ouId}");
                    //WHERE("S.OU_ID = 1");
                }
                if (!StringUtils.isEmpty(StringUtils.trimAll(capa.getManuStatus()))) {
                    WHERE("M.MANU_STATUS = #{capa.manuStatus}");
                }
                if (StringUtils.notEmpty(capa.getDateFromYmd()) && StringUtils.notEmpty(capa.getDateToYmd())) {
                    WHERE("to_char(M.MANU_COMP_DATE,'yyyy-mm-dd') BETWEEN to_char(#{capa.dateFromYmd},'yyyy-mm-dd hh24:mi:ss') and to_char(#{capa.dateToYmd},'yyyy-mm-dd hh24:mi:ss')");
                }
            }
        }

        /**
         * 工艺价格查询SQL语句
         */
        private void priceQuery() {
            SELECT("PR.PROCESS_CODE as processCode"); //工序编号
            SELECT("P.PROCESS_NAME as processName"); //工序名称
            SELECT("P.CAT1 as cat1"); //工序大类
            SELECT("P.CAT2 as cat2"); //工序小类
            SELECT("P.CAT3 as cat3"); //工序子类
            SELECT("PR.PRICE as price"); //工序单价
            SELECT("PR.PRICE_UOM as priceUom"); //工序单价
            FROM("T_PROCESS_PRICE PR");
            LEFT_OUTER_JOIN("T_PROCESS P ON P.ID = PR.PROCESS_ID");
        }

        //公司查询-主数据行数
        private static final String OU_QUERY_NUM_SQL = "ouQueryNumSql";

        public String ouQueryNumSql(@Param("ou") OuCondition ou) {
            SELECT("COUNT(1) AS VALUE");
            selectCondition();
            ouQueryWhereSql(ou);
            return toString();
        }

        //公司查询-主数据查询
        private static final String OU_QUERY_SQL = "ouQuerySql";

        public String ouQuerySql(@Param("ou") OuCondition ou) {
            ouQuery();
            selectCondition();
            ouQueryWhereSql(ou);
            //排序字段
            if (!StringUtils.isEmpty(ou.getField())) {
                ORDER_BY(ou.getField() + " " + ou.getOrder());
            }
            return SqlUtil.paging(toString(), ou);
        }

        //子页面表头查询
        private static final String HEAD_QUERY_SQL = "headQuerySql";

        public String headQuerySql(@Param("ouId") Integer ouId) {
            ouQuery();
            selectCondition();
            if (null != ouId) {
                WHERE("F.OU_ID = #{ouId}");
            }
            return toString();
        }

        //工序产能查询
        private static final String STDCAPA_QUERY_SQL = "stdCapaQuerySql";

        public String stdCapaQuerySql(@Param("ouId") Integer ouId) {
            stdCapaQuery();
            if (null != ouId) {
                WHERE("S.OU_ID = #{ouId}");
            }
            return toString();
        }

        //公司查询-子页面  产能数据 行数 TODO
        private static final String CAPA_QUERY_NUM_SQL = "capaQueryNumSql";

        public String capaQueryNumSql(@Param("capa") CapaCondition capa) {
            SELECT("COUNT(1) AS VALUE");
            capaSelectCondition();
            capaQueryWhereSql(capa);
            return toString();
        }

        //产能数据查询 TODO
        private static final String CAPA_QUERY_SQL = "capaQuerySql";

        public String capaQuerySql(@Param("capa") CapaCondition capa) {
            capaQuery();
            capaSelectCondition();
            capaQueryWhereSql(capa);
            //排序字段
            if (!StringUtils.isEmpty(capa.getField())) {
                ORDER_BY(capa.getField() + " " + capa.getOrder());
            }
            return toString();
        }

        //公司查询-子页面  印刷订单 行数 TODO
        private static final String PRINT_QUERY_NUM_SQL = "printQueryNumSql";

        public String printQueryNumSql(@Param("capa") CapaCondition capa) {
            SELECT("COUNT(1) AS VALUE");
            printSelectCondition();
            printQueryWhereSql(capa);
            return toString();
        }

        //印刷订单查询 TODO
        private static final String PRINT_QUERY_SQL = "printQuerySql";

        public String printQuerySql(@Param("capa") CapaCondition capa) {
            printQuery();
            printSelectCondition();
            printQueryWhereSql(capa);
            //排序字段
            if (!StringUtils.isEmpty(capa.getField())) {
                ORDER_BY(capa.getField() + " " + capa.getOrder());
            }
            return toString();
        }

        //工艺价格查询 TODO
        private static final String PRICE_QUERY_SQL = "priceQuerySql";

        public String priceQuerySql(@Param("ouId") Integer ouId) {
            priceQuery();
            if (null != ouId) {
                WHERE("PR.OU_ID = #{ouId}");
                //WHERE("PR.OU_ID = 1");
            }
            //TO DO 需要添加工厂ID条件
            /*if (null != factId) {
                WHERE("S.FACT_ID = #{factId}");
            }*/
            return toString();
        }

    }

    /**
     * 公司查询主数据数据总行数
     *
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.OU_QUERY_NUM_SQL)
    Integer ouInfoNum(@Param("ou") OuCondition ou);

    /**
     * 公司查询
     *
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.OU_QUERY_SQL)
    List<OuDomain> ouInfo(@Param("ou") OuCondition ou);

    /**
     * 公司查询-子页面表头查询
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.HEAD_QUERY_SQL)
    List<OuDomain> headInfo(@Param("ouId") Integer ouId);

    /**
     * 工序产能查询
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.STDCAPA_QUERY_SQL)
    List<FactStdcapaDomain> stdCapaInfo(@Param("ouId") Integer ouId);

    /**
     * 公司查询子页面-产能数据总行数
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.CAPA_QUERY_NUM_SQL)
    Integer capaInfoNum(@Param("capa") CapaCondition capa);

    /**
     * 产能数据查询
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.CAPA_QUERY_SQL)
    List<CapaDataDomain> capaInfo(@Param("capa") CapaCondition capa);

    /**
     * 公司查询子页面-印刷订单总行数
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRINT_QUERY_NUM_SQL)
    Integer printInfoNum(@Param("capa") CapaCondition capa);

    /**
     * 印刷订单查询
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRINT_QUERY_SQL)
    List<PrintDataDomain> printInfo(@Param("capa") CapaCondition capa);

    /**
     * 工序价格查询
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRICE_QUERY_SQL)
    List<ProPriceDataDomain> priceInfo(@Param("ouId") Integer ouId);

    //以下是等待的SQL  TODO

    /**
     * 订单排场
     */
    @Select({"SELECT P.DT as dt,P.PROD_CODE as prodCode,P.PROD_NAME as prodName,P.CAPA_TYPE as rptType," ,
        "P.CAPA as capa,P.UOM as uom FROM V_OCCUPY P"})
    List<SchedulingDomain> orderPompInfo(@Param("manuDistId") Integer manuDistId);

    /**
     * 产品明细
     */
    @Select({"SELECT M.PROD_CODE as prodCode,M.PROD_NAME as prodName,M.PROD_TYPE as prodType," ,
        " M.QUALITY_LEVEL as qualityLevel,M.PRINT_DIFF_LEVEL as printDiffLevel,M.BIND_DIFF_LEVEL as bindDiffLevel," ,
            "M.BIND_TYPE as bindType, M.DIST_QTY as prodQty,M.MANU_STATUS as  prodInfoStatus FROM V_SO_MANU M "})
    List<ProductionDetailDomain> productDetailInfo(@Param("soManuId") Integer soManuId);

    /**
     * 生产报工
     */
    @Select({"SELECT S.PROD_CODE as prodCode,S.PROD_NAME as prodName,S.RPT_DT as rptDt,S.RPTER_NAME as contName,S.RPT_TYPE as rptType," ,
        " S.RPTER_NAME as rptName,S.RPT_UOM as uom,S.RPT_QTY as rptQty,S.SUM_QTY as rptQtyAmt,S.CAPA as sum FROM V_SORPT S "})
    List<ProductionReportDomain> productReportInfo(@Param("soManuId") Integer soManuId);

    /**
     * 完工入库
     */
    @Select({"SELECT P.PROD_CODE as prodCode,P.PROD_NAME as prodName,P.WHIN_PIC as contName," ,
        "P.DOC_DATE as docDate,P.DIST_QTY as manuQty,P.WHIN_QTY as inQty,P.REMARK as remark,P.SUM_QTY as addInQty FROM V_PRODIN P "})
    List<CompletionDomain> completionInfo(@Param("soManuId") Integer soManuId);

    /**
     * 生产记录
     */
    @Select({"SELECT T.ITEM_DT as itemDt,T.RPTER_NAME as contName,T.ITEM_DESC as itemDesc,T.ITEM_IMPACT as itemImpact," ,
        "T.ITEM_SOLUTION as itemSolution FROM T_SONOTE_ITEM T "})
    List<ProductionRecordDomain> productionRecordInfo(@Param("soManuId") Integer soManuId);

}
