package com.el.stp.cm_fac.mapper;

import com.el.stp.cm_fac.domain.*;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Vincent on 2016/8/9.
 * cm209订单查询Mapper
 */
public interface CmOrderQryMapper {
    final class SqlProvider extends SQL {
        private void orderQry() {
            SELECT("ou.ou_code as ouCode");
            SELECT("ou.ou_name            ouName");
            SELECT("ou.id AS ouId");
            SELECT("so.id as soId");
            SELECT("so.so_no as soNo");
            SELECT("so.manu_due_date as manuDueDate");
            SELECT("manu.acpt_user as acptUser");
            SELECT("manu.acpt_time as acptTime");
            SELECT("prod.prod_code as prodCode");
            SELECT("prod.prod_name as prodName");
           // SELECT("prod.prod_type as prodType");
            SELECT("prod.quality_level as qualityLevel");
            SELECT("prod.print_diff_level as printDiffLevel");
            SELECT("prod.bind_diff_level as bindDiffLevel");
           // SELECT("prod.bind_type as bindType");
            SELECT("manu.dist_qty as distQty");
            SELECT("manu.acpt_status as acptStatus");
            SELECT("manu.manu_status as manuStatus");
            FROM("t_so so");
            LEFT_OUTER_JOIN("t_ou ou on so.ou_id = ou.id");
            LEFT_OUTER_JOIN("t_so_manu manu on so.id = manu.so_id");
            LEFT_OUTER_JOIN("t_so_prod soprod on so.id = soprod.so_id");
            LEFT_OUTER_JOIN(" t_prod prod on soprod.prod_id = prod.id");


        }

        private final static String QUERY_ORDER_COUNT = "queryOrderCount";

        public String queryOrderCount(CmOrderQryMainCondition cmOrderQryMainCondition) {
            SELECT("COUNT(1) AS CT");
            FROM("t_so so");
            LEFT_OUTER_JOIN("t_ou ou on so.ou_id = ou.id");
            LEFT_OUTER_JOIN("t_so_manu manu on so.id = manu.so_id");
            LEFT_OUTER_JOIN("t_so_prod soprod on so.id = soprod.so_id");
            LEFT_OUTER_JOIN(" t_prod prod on soprod.prod_id = prod.id");
            if (cmOrderQryMainCondition != null) {
                if (!StringUtils.isEmpty(cmOrderQryMainCondition.getProdName())) {
                    WHERE("prod.prod_name LIKE  concat(concat('%',#{prodName}),'%')");
                }
                if (!StringUtils.isEmpty(cmOrderQryMainCondition.getSoNo())) {
                    WHERE("so.so_no=#{soNo}");
                }
                if (!StringUtils.isEmpty(cmOrderQryMainCondition.getOuName())) {
                    WHERE("ou.ou_name LIKE concat(concat('%',#{ouName}),'%')");
                }

                if (!StringUtils.isEmpty(StringUtils.trimAllWhitespace(cmOrderQryMainCondition.getManuStatus()))) {
                    WHERE("manu.manu_status=#{manuStatus}");
                }
                if (!StringUtils.isEmpty(cmOrderQryMainCondition.getManuDueDateStart()) && !StringUtils.isEmpty(cmOrderQryMainCondition.getManuDueDateEnd())) {
                    WHERE("so.manu_due_date between #{manuDueDateStart} and #{manuDueDateEnd}");
                }
                if (!StringUtils.isEmpty((cmOrderQryMainCondition.getSoNo()))) {
                    WHERE("so.so_no=#{soNo}");
                }

                if (!StringUtils.isEmpty(cmOrderQryMainCondition.getField())) {
                    ORDER_BY(cmOrderQryMainCondition.getField() + " " + cmOrderQryMainCondition.getOrder());
                }

            }
            return toString();
        }

        private static final String QUERY_ORDER_MAIN = "queryOrderMainSql";

        public String queryOrderMainSql(CmOrderQryMainCondition cmOrderQryMainCondition) {
            orderQry();
            if (cmOrderQryMainCondition != null) {
                if (!StringUtils.isEmpty(cmOrderQryMainCondition.getProdName())) {
                    WHERE("prod.prod_name LIKE  concat(concat('%',#{prodName}),'%')");
                }
                if (!StringUtils.isEmpty(cmOrderQryMainCondition.getSoNo())) {
                    WHERE("so.so_no=#{soNo}");
                }
                if (!StringUtils.isEmpty(cmOrderQryMainCondition.getOuName())) {
                    WHERE("ou.ou_name LIKE concat(concat('%',#{ouName}),'%')");
                }

                if (!StringUtils.isEmpty(StringUtils.trimAllWhitespace(cmOrderQryMainCondition.getManuStatus()))) {
                    WHERE("manu.manu_status=#{manuStatus}");
                }
                if (!StringUtils.isEmpty(cmOrderQryMainCondition.getManuDueDateStart()) && !StringUtils.isEmpty(cmOrderQryMainCondition.getManuDueDateEnd())) {
                    WHERE("so.manu_due_date between #{manuDueDateStart} and #{manuDueDateEnd}");
                }
                if (!StringUtils.isEmpty((cmOrderQryMainCondition.getSoNo()))) {
                    WHERE("so.so_no=#{soNo}");
                }

                if (!StringUtils.isEmpty(cmOrderQryMainCondition.getField())) {
                    ORDER_BY(cmOrderQryMainCondition.getField() + " " + cmOrderQryMainCondition.getOrder());
                }

            }
            return SqlUtil.paging(toString(), cmOrderQryMainCondition);
        }

        private static final String QUERY_ORDER_HEAD = "queryOrderHeadSql";

        public String queryOrderHeadSql(Integer soId) {
            SELECT("ou.ou_code       as ouCode");
            SELECT("ou.ou_name       ouName");
            SELECT("ou.id            AS ouId");
            SELECT("so.id            as soId");


            SELECT("so.so_no         as soNo");
            SELECT("so.manu_due_date as manuDueDate");
            SELECT("manu.acpt_user   as acptUser");
            SELECT("manu.acpt_time   as acptTime");
            SELECT("manu.dist_qty    as distQty");
            SELECT("manu.acpt_status as acptStatus");
            SELECT("manu.manu_status as manuStatus");
            SELECT("manu.PAPER_READY_STATUS as paperReadyStatus");
            FROM(" t_so so");
            LEFT_OUTER_JOIN(" t_ou ou on so.ou_id = ou.id");
            LEFT_OUTER_JOIN("  t_so_manu manu on so.id = manu.so_id");
            WHERE("rownum = 1");

            WHERE("so.id=#{soId}");

            return toString();
        }


        private final static String QUERY_ORDER_DTL = "queryOrderDtlSql";

        public String queryOrderDtlSql(Integer soId) {
            SELECT("soprod.so_id            as soId");
            SELECT("prod.id               as prodId");
            SELECT("soprod.id               as soProdId");
            SELECT("somanu.id               as soManuId");
            SELECT("soprod.line_no          as lineNo");
            SELECT("prod.prod_code          as prodCode");
            SELECT("prod.prod_name          as prodName");
            //SELECT("prod.prod_type          as prodType");
            SELECT("prod.quality_level      as qualityLevel");
            SELECT("prod.print_diff_level   as printDiffLevel");
            SELECT("prod.bind_diff_level    as bindDiffLevel");
           // SELECT("prod.bind_type          as bindType");
            SELECT("somanu.dist_qty         as distQty");
            SELECT("somanu.prod_info_status as prodInfoStatus");
            FROM("t_so so");
            INNER_JOIN("t_so_prod soprod  on so.id = soprod.so_id");
            INNER_JOIN("t_prod prod on soprod.prod_id = prod.id");
            LEFT_OUTER_JOIN("t_so_manu somanu  on soprod.id = somanu.so_prod_id");
            WHERE("soprod.so_id=#{soId}");
            return toString();

        }

        private final static String QUERY_ORDER_PRODPROCESS = "queryOrderProdProcessSql";

        public String queryOrderProdProcessSql(Integer prodId) {
            SELECT("rownum as lineNo");
            SELECT("prodProcess.Process_Qty as processQty");
            SELECT("process.process_name    as processName");
            SELECT("process.price_uom as priceUom");
            SELECT("process.cat1 as processType");
            FROM("T_PROD_PROCESS prodProcess");
            LEFT_OUTER_JOIN("t_process process ON prodProcess.Process_Id=process.Id");
            WHERE("prodProcess.Prod_Id=#{prodId}");
            return toString();
        }

        private final static String QUERY_ORDER_OCCUPY = "queryOrderOccupy";

        public String queryOrderOccupy(@Param("soId") Integer soId) {
            SELECT("rownum as lineNo");
            SELECT("prod.prod_code       as prodCode");
            SELECT("prod.prod_name       as prodName");
            SELECT("process.cat1         as processType");
            SELECT("process.process_name as processName");
            SELECT("occupy.capa");
            SELECT("process.rpt_uom  as    rptUom");
            FROM("T_SO_PROD soProd");
            INNER_JOIN("T_PROD prod  on soProd.Prod_Id = prod.id");
            LEFT_OUTER_JOIN("T_OCCUPY occupy on soProd.Prod_Id = occupy.prod_id  and soProd.So_Id = occupy.so_id");
            LEFT_OUTER_JOIN("T_PROD_PROCESS prodProcess on prod.id = prodProcess.Prod_Id");
            LEFT_OUTER_JOIN("t_process process on prodProcess.Process_Id = process.id");
            WHERE("soProd.So_Id=#{soId}");
            return toString();
        }

        private static final String QUERY_ORDER_SORPT = "querySorpt";

        public String querySorpt(@Param("soId") Integer soId) {
            SELECT("sort.rpt_dt   rptDt");
            SELECT("tel.cont_name contName");
            SELECT("sort.rpt_type");
            SELECT("sort.rpt_uom  rptUom");
            SELECT("sort.rpt_qty  rptQty");
            FROM("T_SORPT sort");
            LEFT_OUTER_JOIN("t_conttel tel on sort.RPTER_ID = tel.id");
            WHERE("sort.so_id=#{soId}");

            return toString();
        }

        private final static String QUERY_ORDER_PRODIN = "queryProdIn";

        public String queryProdIn(@Param("soId") Integer soId) {
            SELECT("prodIn.Prod_Id  as prodId");
            SELECT("prod.prod_code  as prodCode");
            SELECT("prod.prod_name  as prodName");
            SELECT("prodIn.Doc_Date as docDate");
            SELECT("prodIn.Whin_Pic as contName");
            SELECT("soProd.Manu_Qty as manuQty");
            FROM("T_PRODIN prodIn");
            INNER_JOIN("T_PROD prod on prodIn.Prod_Id = prod.id");
            LEFT_OUTER_JOIN("T_SO_PROD soProd on prodIn.Soprod_Id = soProd.Id");
            WHERE("prodIn.So_Id=#{soId}");
            return toString();
        }

        private final static String QUERY_ORDER_SNOTEITEM = "querySnoteItem";

        public String querySnoteItem(@Param("soId") Integer soId) {
            SELECT("soNote.Item_Dt       as itemDt");
            SELECT("tel.cont_name        as contName");
            SELECT("soNote.Item_Desc     as itemDesc");
            SELECT("soNote.Item_Impact   as itemImpact");
            SELECT("soNote.Item_Solution as itemSolution");
            FROM("T_SONOTE_ITEM soNote");
            LEFT_OUTER_JOIN("T_CONTTEL tel ON soNote.Rpter_Id = tel.id");
            WHERE("soNote.So_Id =#{soId}");
            System.out.println();
            return toString();

        }


    }

    @SelectProvider(type = SqlProvider.class, method = SqlProvider.QUERY_ORDER_COUNT)
    public Integer queryOrderCount(CmOrderQryMainCondition cmOrderQryMainCondition);

    @SelectProvider(type = SqlProvider.class, method = SqlProvider.QUERY_ORDER_MAIN)
    public List<CmOrderQryMainDomain> queryOrderMain(CmOrderQryMainCondition cmOrderQryMainCondition);

    @SelectProvider(type = SqlProvider.class, method = SqlProvider.QUERY_ORDER_HEAD)
    public CmOrderQryHeadDomain queryOrderHead(Integer soId);

    @SelectProvider(type = SqlProvider.class, method = SqlProvider.QUERY_ORDER_DTL)
    public List<CmOrderQryDtlDomain> queryOrderDtl(Integer soId);

    @SelectProvider(type = SqlProvider.class, method = SqlProvider.QUERY_ORDER_PRODPROCESS)
    public List<CmOrderQryProdProcessDomain> queryOrderProdProcess(Integer prodId);

    @SelectProvider(type = SqlProvider.class, method = SqlProvider.QUERY_ORDER_OCCUPY)
    public List<CmOrderQryOccupyDomain> queryOrderOccupy(@Param("soId") Integer soId);

    @SelectProvider(type = SqlProvider.class, method = SqlProvider.QUERY_ORDER_SORPT)
    public List<CmOrderQrySorptDomain> queryOrderSorpt(@Param("soId") Integer soId);

    @SelectProvider(type = SqlProvider.class, method = SqlProvider.QUERY_ORDER_PRODIN)
    public List<CmOrderQryProdInDomain> queryOrderProdIn(@Param("soId") Integer soId);

    @SelectProvider(type = SqlProvider.class, method = SqlProvider.QUERY_ORDER_SNOTEITEM)
    public List<CmOrderQrySnoteItemDomain> queryOrderSnoteItem(@Param("soId") Integer soId);


}
