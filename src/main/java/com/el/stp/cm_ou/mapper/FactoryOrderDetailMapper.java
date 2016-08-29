package com.el.stp.cm_ou.mapper;

import com.el.stp.cm_ou.domain.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

import static com.el.stp.cm_ou.mapper.FactoryOrderDetailMapper.SqlProvider.*;

/**
 * Created by Spring on 2016/8/8.
 */

public interface FactoryOrderDetailMapper {


    final class SqlProvider extends SQL {

        private void factoryOrderDetailQuery() {

            SELECT("DT dt, PROD_CODE prodCode, PROD_NAME prodName, CAPA_TYPE rptType, CAPA capa, UOM uom");

            FROM("V_OCCUPY");
        }
        private static final String FACTORYORDERDETAIL_QUERY_SQL = "factoryOrderDetailQuerySql";
        public String factoryOrderDetailQuerySql(@Param("factId")Integer factId,
                                                 @Param("soId")Integer soId) {
            factoryOrderDetailQuery();
            if(null!=factId && null!=soId){
                WHERE("FACT_ID=#{factId}");
                WHERE("SO_ID=#{soId}");
            }
            return toString();
        }
    }
    /**
     * 订单排产
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.FACTORYORDERDETAIL_QUERY_SQL)
    List<SchedulingDomain> schedulingInfo(@Param("factId")Integer factId,
                                          @Param("soId")Integer soId);

    /**
     * 产品明细
     * @return
     */
    @Select({"SELECT PROD_CODE prodCode,PROD_NAME prodName,PROD_TYPE prodType,QUALITY_LEVEL qualityLevel,PRINT_DIFF_LEVEL printDiffLevel,BIND_DIFF_LEVEL bindDiffLevel,BIND_TYPE bindType FROM V_SO_MANU WHERE (FACT_ID=#{factId} and SO_ID=#{soId})"})
    List<ProductionDetailDomain> productionDetailInfo(@Param("factId")Integer factId,
                                                      @Param("soId")Integer soId);

    /**
     * 生产报工
     * @return
     */
    @Select({"SELECT PROD_CODE prodCode,PROD_NAME prodName,RPT_DT rptDt,RPTER_NAME rpterName,RPT_TYPE rptType,RPT_UOM uom,RPT_QTY rptQty,SUM_QTY rptQtyAmt,RPT_QTY rptQty FROM V_SORPT WHERE (FACT_ID=#{factId} and SO_ID=#{soId})"})
    List<ProductionReportDomain> productionReportInfo(@Param("factId")Integer factId,
                                                      @Param("soId")Integer soId);

    /**
     * 完工入库
     * @return
     */
    @Select({"SELECT PROD_CODE prodCode,PROD_NAME prodName,WHIN_PIC contName,DOC_DATE docDate,DIST_QTY manuQty,SUM_QTY addInQty,WHIN_QTY inQty,REMARK remark FROM V_PRODIN WHERE (FACT_ID=#{factId} and SO_ID=#{soId})"})
    List<CompletionDomain> completionInfo(@Param("factId")Integer factId,
                                          @Param("soId")Integer soId);

    /**
     * 生产记录
     * @return
     */
    @Select({"SELECT T.ITEM_DT itemDt,T.ITEM_DESC itemDesc,T.ITEM_IMPACT itemImpact FROM T_SONOTE_ITEM T "})
    List<ProductionRecordDomain> productionRecordInfo();

    /**
     * 工序类型
     * @return
     */
    @Select({"select CAPA_TYPE capaType from T_FACT_STDCAPA"})
    List<FactoryCapacityDomain> capaTypes();
}
