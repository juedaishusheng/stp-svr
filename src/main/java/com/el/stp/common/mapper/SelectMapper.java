package com.el.stp.common.mapper;

import com.el.sys.domain.CodeName;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 * Created on 2016/8/3 15:33.
 * @author Conway
 */
public interface SelectMapper {
    final class SqlProvider extends SQL {
        private void processTypes_ou_Query(@Param("ouid") String ouid) {
            SELECT("capa.CAPA_TYPE as name,capa.OU_ID as code");
            FROM("T_FACT_STDCAPA capa ");
            INNER_JOIN("T_OU tou ON capa.OU_ID =(DECODE(tou.RELATED_OU_ID1,NULL,tou.ID,tou.RELATED_OU_ID1))");
            WHERE("tou.id=#{ouid}");
        }

        private void processTypes_fac_Query(@Param("factid") String factid) {
            SELECT("CAPA_TYPE");
            FROM("T_FACT_STDCAPA");
            WHERE("FACT_ID=#{factid}");
            GROUP_BY("CAPA_TYPE");
        }

        private void udcCodeQuery(@Param("udcCodes")List<String> udcCodes) {
            SELECT("DISTINCT UDC_CODE as code, VAL_DESC1 as name");
            FROM("T_UDC");
            WHERE("VAL_ENABLED = 1");
            WHERE("UDC_CODE in ("+ SqlUtil.toSqlStringSet(udcCodes) +")");
        }

        //工序类型-业务公司udcCode查询SQL
        private static final String PROCESS_TYPES_OU_QUERY_SQL = "processTypesOuQuerySql";
        public String processTypesOuQuerySql(@Param("ouid") String ouid) {
            processTypes_ou_Query(ouid);
            return toString();
        }

        //工序类型-生产工厂udcCode查询SQL
        private static final String PROCESS_TYPES_FAC_QUERY_SQL = "processTypesFacQuery";
        public String processTypesFacQuery(@Param("factid") String factid) {
            processTypes_fac_Query(factid);
            return toString();
        }

        //工序类型 列表项查询SQL
        private static final String PROCESS_TYPES_UDCCODE_QUERY_SQL = "processTypeUdcCodeQuerySql";
        public String processTypeUdcCodeQuerySql(@Param("udcCodes")List<String> udcCodes){
            udcCodeQuery(udcCodes);
            return toString();
        }

    }


    /**
     * 工序类型
     * @param: ouid 业务公司
     * @return  UDC码
     */
    @SelectProvider(type = SqlProvider.class, method =SqlProvider.PROCESS_TYPES_OU_QUERY_SQL)
    List<String> processTypeOuUdcCode(@Param("ouid")String ouid);

    /**
     * 工序类型
     * @param: factid 生产工厂
     * @return  UDC码
     */
    @SelectProvider(type = SqlProvider.class, method =SqlProvider.PROCESS_TYPES_FAC_QUERY_SQL)
    List<String> processTypeFacUdcCode(@Param("factid")String factid);

    /**
     * 工序类型
     * @return 列表项
     */
    @SelectProvider(type = SqlProvider.class, method =SqlProvider.PROCESS_TYPES_UDCCODE_QUERY_SQL)
    List<CodeName> processTypeItems(@Param("udcCodes")List<String> udcCodes);

}
