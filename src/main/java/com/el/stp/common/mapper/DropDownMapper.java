package com.el.stp.common.mapper;

import com.el.cfg.domain.TCust;
import com.el.stp.common.domain.DropDownDomain;
import com.el.stp.common.domain.DropDownMetas;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * 预先输入框
 * Created by xueyu on 2016/8/15.
 */
public interface DropDownMapper {

    class SqlProvider extends SQL {
        private static final String LIMIT_NUM = " rownum<10 ";
        private static final String NOMAL_STATUS = "1";


        private static final String QUERY_CUST = "queryCust";
        /**
         * 查询客户sql
         * @param param
         * @return
         */
        public String queryCust(DropDownDomain param) {
            SQL sql = new SQL()
                .SELECT("t.ID  as code")
                .SELECT("t.CUST_NAME  as name")
                .FROM("T_CUST t")
                .WHERE("t.CUST_STATUS="+NOMAL_STATUS);
                if(param!=null){
                    if(!StringUtils.isEmpty(param.getKey())){
                        String likeSql = SqlUtil.toSqlLikeString(param.getKey());
                        sql.WHERE("(t.CUST_NAME LIKE " + likeSql
                                +"OR t.CUST_CODE LIKE "+likeSql
                                +"OR t.CUST_ABBR LIKE"+likeSql
                                +"OR t.PY LIKE"+likeSql
                                +"OR t.PY_ABBR LIKE"+likeSql
                            +")");
                    }
                    if(param.getOuId()!=null){
                        sql.WHERE("t.OU_ID=#{ouId}");
                    }
                }
            return sql.WHERE(LIMIT_NUM).toString();
        }


        private static final String QUERY_PROD = "queryProd";
        /**
         * 查询"销售订单产品"sql
         * @param param
         * @return
         */
        public String queryProd(DropDownDomain param) {
            SQL sql = new SQL()
                .SELECT("t.ID  as code")
                .SELECT("t.PROD_NAME  as name")
                .FROM("T_PROD t");
            if(param!=null){
                if(!StringUtils.isEmpty(param.getKey())){
                    String likeSql = SqlUtil.toSqlLikeString(param.getKey());
                    sql.WHERE("(t.PROD_NAME LIKE " + likeSql
                        +"OR t.PROD_CODE LIKE "+likeSql
                        +"OR t.PY_ABBR LIKE"+likeSql
                        +"OR t.PY LIKE"+likeSql
                        +")");
                }
                if(param.getOuId()!=null){
                    sql.WHERE("t.OU_ID=#{ouId}");
                }
            }
            return sql.WHERE(LIMIT_NUM).toString();
        }
        private static final String QUERY_ORG_PROD = "queryOrgProd";
        /**
         * 查询"报价单产品"sql
         * @param param
         * @return
         */
        public String queryOrgProd(DropDownDomain param) {
            SQL sql = new SQL()
                .SELECT("t.ID  as code")
                .SELECT("t.PROD_NAME  as name")
                .FROM("T_ORG_PROD t");
            if(param!=null){
                if(!StringUtils.isEmpty(param.getKey())){
                    String likeSql = SqlUtil.toSqlLikeString(param.getKey());
                    sql.WHERE("(t.PROD_NAME LIKE " + likeSql
                        +"OR t.PROD_CODE LIKE "+likeSql
                        +"OR t.PY_ABBR LIKE"+likeSql
                        +"OR t.PY LIKE"+likeSql
                        +")");
                }
                if(param.getOuId()!=null){
                    sql.WHERE("t.OU_ID=#{ouId}");
                }
            }
            return sql.WHERE(LIMIT_NUM).toString();
        }


        private static final String QUERY_OU = "queryOu";
        /**
         * 查询公司sql
         * @param param
         * @return
         */
        public String queryOu(DropDownDomain param) {
            SQL sql = new SQL()
                .SELECT("t.ID  as code")
                .SELECT("t.OU_NAME  as name")
                .FROM("T_OU t")
                .WHERE("t.OU_STATUS="+NOMAL_STATUS);
            if(param!=null){
                if(!StringUtils.isEmpty(param.getKey())){
                    String likeSql = SqlUtil.toSqlLikeString(param.getKey());
                    sql.WHERE("(t.OU_NAME LIKE " + likeSql
                        +"OR t.OU_CODE LIKE "+likeSql
                        +"OR t.OU_ABBR LIKE "+likeSql
                        +"OR t.PY_ABBR LIKE"+likeSql
                        +"OR t.PY LIKE"+likeSql
                        +")");
                }
            }
            return sql.WHERE(LIMIT_NUM).toString();
        }



        private static final String SELECT_BY_PARAM_SQL = "selectByParam";
        /**
         * 过滤出 某表某字段 中符合输入值条件的所有值
         * @param param
         * @return
         */
        public String selectByParam(Map<String,Object> param) {
            if(!CollectionUtils.isEmpty(param)){
                DropDownMetas metas = (DropDownMetas)param.get("metas");
                String key = (String)param.get("key");
                if(metas!=null && !StringUtils.isEmpty(metas.getColumn())
                    && !StringUtils.isEmpty(metas.getTable())
                    && !StringUtils.isEmpty(key)){
                    StringBuilder build = new StringBuilder("");
                    String[] columns = metas.getColumn().split(",");
                    String like = SqlUtil.toSqlLikeString(key);
                    for (int i = 0; i < columns.length; i++) {
                        if(!StringUtils.isEmpty(columns[i])){
                            SQL sql =  new SQL();
                            if(build.length()==0){
                                build.append(sql.SELECT("DISTINCT "+columns[i]+ " as code")
                                    .SELECT(columns[i]+" as name")
                                    .FROM(metas.getTable())
                                    .WHERE(columns[i]+" like " + like)
                                    .WHERE(LIMIT_NUM).toString());
                            }else{
                                build.append(" UNION ");
                                build.append(sql.SELECT("DISTINCT "+columns[i]+ " as code")
                                    .SELECT(columns[i]+" as name")
                                    .FROM(metas.getTable())
                                    .WHERE(columns[i]+" like " + like)
                                    .WHERE(LIMIT_NUM).toString());
                            }
                        }
                    }
                    return "select code,name from("+build.toString()+") where "+LIMIT_NUM;
                }
            }
            return "";
        }
    }

    /**
     * 根据用户的输入值，过滤出 某表某字段 中符合输入值条件的所有值
     * @param metas DropDownMetas枚举（封装某表某字段）
     * @param key 用户输入值
     * @return 查询结果
     */
    @Deprecated
    @SelectProvider(type = DropDownMapper.SqlProvider.class, method = DropDownMapper.SqlProvider.SELECT_BY_PARAM_SQL)
    List<DropDownDomain> findAllWaitingItem(@Param("metas")DropDownMetas metas , @Param("key")String key);

    /**
     * 查询客户
     * @param param 查询条件
     * @return 查询结果：通过code和name封装CUST_CODE和CUST_NAME
     */
    @SelectProvider(type = DropDownMapper.SqlProvider.class, method = DropDownMapper.SqlProvider.QUERY_CUST)
    List<DropDownDomain> queryCustByParam(DropDownDomain param);

    /**
     * 查询"销售订单产品"
     * @param param 查询条件
     * @return 查询结果：通过code和name封装PROD_CODE和PROD_NAME
     */
    @SelectProvider(type = DropDownMapper.SqlProvider.class, method = DropDownMapper.SqlProvider.QUERY_PROD)
    List<DropDownDomain> queryProdByParam(DropDownDomain param);
    /**
     * 查询"报价单产品"
     * @param param 查询条件
     * @return 查询结果：通过code和name封装PROD_CODE和PROD_NAME
     */
    @SelectProvider(type = DropDownMapper.SqlProvider.class, method = DropDownMapper.SqlProvider.QUERY_ORG_PROD)
    List<DropDownDomain> queryOrgProdByParam(DropDownDomain param);

    /**
     * 查询公司
     * @param param 查询条件
     * @return 查询结果：通过code和name封装OU_CODE和OU_NAME
     */
    @SelectProvider(type = DropDownMapper.SqlProvider.class, method = DropDownMapper.SqlProvider.QUERY_OU)
    List<DropDownDomain> queryOuByParam(DropDownDomain param);

}
