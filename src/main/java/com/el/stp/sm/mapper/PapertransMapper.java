package com.el.stp.sm.mapper;

import java.util.List;

import com.el.stp.sm.domain.SmPapertransCondition;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import com.el.stp.sm.domain.TPapertransDomain;
import org.springframework.util.StringUtils;

public interface PapertransMapper {


    class SqlProvider extends SQL {

        private static final String TABLE_NAME = "T_PAPERTRANS";

        private static final String SELECT_BY_PARAM = "selectByParam";
        private static final String COUNT_BY_PARAM = "countByParam";

        public String countByParam(SmPapertransCondition condition){
            return "select count(1) from ("+selectByParamSql(condition)+")";
        }
        public String selectByParam(SmPapertransCondition condition){
            return SqlUtil.paging(selectByParamSql(condition), condition);
        }

        private String selectByParamSql(SmPapertransCondition condition) {
            SQL sql = new SQL()
            .SELECT("t.doc_no       as \"docNo\"")
            .SELECT("t.doc_date     as \"docDate\"")
            .SELECT("so.so_no       as \"so.soNo\"")
            .SELECT("cust.cust_code as \"cust.custCode\"")
            .SELECT("cust.cust_name as \"cust.custName\"")
            .SELECT("item.item_code as \"item.itemCode\"")
            .SELECT("item.item_name as \"item.itemName\"")
            .SELECT("item.cat3      as \"item.cat3\"")
            .SELECT("item.prp2      as \"item.prp2\"")
            .SELECT("item.prp1      as \"item.prp1\"")
            .SELECT("item.cat7      as \"item.cat7\"")
            .SELECT("item.cat8      as \"item.cat8\"")
            .SELECT("item.cat9      as \"item.cat9\"")
            .SELECT("t.plan_out_qty as \"planOutQty\"")
            .SELECT("t.uom          as \"uom\"")
            .SELECT("outWh.wh_name  as \"outWh.whName\"")
            .SELECT("inWh.wh_Name   as \"inWh.whName\"")
            .FROM(TABLE_NAME + " t")
            .LEFT_OUTER_JOIN("t_so" + " so on t.so_id = so.id ")
            .LEFT_OUTER_JOIN("t_cust" + " cust on so.cust_id = cust.id ")
            .LEFT_OUTER_JOIN("t_item" + " item on t.item_id = item.id")
            .LEFT_OUTER_JOIN("t_wh" + " outWh  on t.outwh_id = outWh.id")
            .LEFT_OUTER_JOIN("t_wh" + " inWh  on t.inwh_id = inWh.Id")
            .WHERE("1=1 ");
            if(condition!=null){
                if(condition.getSo()!=null && !StringUtils.isEmpty(condition.getSo().getSoNo())){
                    sql.WHERE("so.so_no = #{so.soNo}");
                }
                if(condition.getCust()!=null && !StringUtils.isEmpty(condition.getCust().getCustName())){
                    sql.WHERE("cust.cust_name like " + SqlUtil.toSqlLikeString(condition.getCust().getCustName()));
                }
                if(condition.getOutWh()!=null && !StringUtils.isEmpty(condition.getOutWh().getWhName())){
                    sql.WHERE("outWh.wh_name like " + SqlUtil.toSqlLikeString(condition.getOutWh().getWhName()));
                }
                if(condition.getInWh()!=null && !StringUtils.isEmpty(condition.getInWh().getWhName())){
                    sql.WHERE("inWh.wh_name like " + SqlUtil.toSqlLikeString(condition.getInWh().getWhName()));
                }
                if(condition.getDocDateFrom()!=null){
                    sql.WHERE("t.doc_date >= #{docDateFrom}");
                }
                if(condition.getDocDateTo()!=null){
                    sql.WHERE("t.doc_date <= #{docDateTo}");
                }
                if(!StringUtils.isEmpty(condition.getField())) {
                    sql.ORDER_BY(condition.getField()+" "+condition.getOrder());
                }
            }
            return sql.toString();
        }
    }

    /**
     * 纸张调拨单列表
     * @param condition 查询条件
     * @return 纸张调拨单列表
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_BY_PARAM)
    List<TPapertransDomain> selectByParam(SmPapertransCondition condition);
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.COUNT_BY_PARAM)
    Integer countByParam(SmPapertransCondition condition);

}
