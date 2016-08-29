package com.el.stp.sm.mapper;

import com.el.cfg.mapper.TDelinoteDeliMapper;
import com.el.stp.sm.domain.SmDelinoteManageCondition;
import com.el.stp.sm.domain.TDelinoteDeliDomain;
import com.el.stp.sm.domain.TDelinoteProdDomain;
import com.el.stp.sm.domain.TPapertransDomain;
import com.el.util.SqlUtil;
import com.el.util.SysSqlUtil;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 发货通知单处理
 * Created by xueyu on 2016/8/4.
 */
public interface SmDelinoteManageMapper{

    class SqlProvider extends SQL {

        private static final String TABLE_NAME = "T_DELINOTE_PROD";

        private static final String SELECT_BY_PARAM_SQL = "selectByParam";
        private static final String COUNT_BY_PARAM_SQL = "countByParam";

        public String selectByParam(SmDelinoteManageCondition condition) {
            return SqlUtil.paging(selectByParamSql(condition), condition);
        }
        public String countByParam(SmDelinoteManageCondition condition) {
            return "select count(1) from ("+selectByParamSql(condition)+")";
        }

        private String selectByParamSql(SmDelinoteManageCondition condition) {
            SQL sql = new SQL()
                .SELECT("m.doc_no           as \"note.docNo\"")
                .SELECT("ou.ou_name         as \"ou.ouName\"")
                .SELECT("so.so_no           as \"so.soNo\"")
                .SELECT("cust.cust_code     as \"cust.custCode\"")
                .SELECT("cust.cust_name     as \"cust.custName\"")
                .SELECT("prod.prod_code     as \"prod.prodCode\"")
                .SELECT("prod.prod_name     as \"prod.prodName\"")
                .SELECT("t.soprod_qty       as \"soprodQty\"")
                .SELECT("t.demand_deli_qty  as \"demandDeliQty\"")
                .SELECT("t.demand_gift_qty  as \"demandGiftQty\"")
                .SELECT("t.sum_deli_qty     as \"sumDeliQty\"")
                .SELECT("t.sum_gift_qty     as \"sumGiftQty\"")
                .SELECT("t.line_status      as \"lineStatus\"")
                .SELECT("t.uom_weight       as \"uomWeight\"")
                .SELECT("t.weight           as \"weight\"")
                .SELECT("t.deli_addr_no     as \"deliAddrNo\"")
                .SELECT("t.cont_person      as \"contPerson\"")
                .SELECT("t.cont_tel         as \"contTel\"")
                .SELECT("t.demand_deli_date as \"demandDeliDate\"")
                .SELECT("t.remark           as \"remark\"")
                .SELECT("t.package_method   as \"packageMethod\"")
                .SELECT("t.qty_perpackage   as \"qtyPerpackage\"")
                .SELECT("t.package_qty      as \"packageQty\"")
                .SELECT("t.spare_qty        as \"spareQty\"")
                .SELECT("t.id               as \"id\"")
                .FROM(TABLE_NAME + " t")
                .LEFT_OUTER_JOIN("t_delinote" + " m on t.delinote_id = m.id ")
                .LEFT_OUTER_JOIN("t_ou" + " ou on m.ou_id = ou.id ")
                .LEFT_OUTER_JOIN("t_so" + " so on t.so_id = so.id ")
                .LEFT_OUTER_JOIN("t_cust" + " cust on t.cust_id = cust.id ")
                .LEFT_OUTER_JOIN("t_prod" + " prod on t.prod_id = prod.id ")
                .WHERE("1=1 ");
            if(condition!=null){
                if(condition.getSo()!=null && !StringUtils.isEmpty(condition.getSo().getSoNo())){
                    sql.WHERE("so.so_no = #{so.soNo}");
                }
                if(condition.getCust()!=null && !StringUtils.isEmpty(condition.getCust().getCustName())){
                    sql.WHERE("cust.cust_name like " + SqlUtil.toSqlLikeString(condition.getCust().getCustName()));
                }
                if(condition.getProd()!=null && !StringUtils.isEmpty(condition.getProd().getProdName())){
                    sql.WHERE("prod.prod_name like " + SqlUtil.toSqlLikeString(condition.getProd().getProdName()));
                }
                if(condition.getDemandDeliDateFrom()!=null){
                    sql.WHERE("t.demand_deli_date >= #{demandDeliDateFrom}");
                }
                if(condition.getDemandDeliDateTo()!=null){
                    sql.WHERE("t.demand_deli_date <= #{demandDeliDateTo}");
                }
                if(!StringUtils.isEmpty(condition.getLineStatus())){
                    sql.WHERE("t.line_status in("+condition.getLineStatus()+")");
                }
                if(!StringUtils.isEmpty(condition.getField())) {
                    sql.ORDER_BY(condition.getField()+" "+condition.getOrder());
                }
            }
            return sql.toString();
        }

        private static final String DELI_TABLE_NAME = "T_DELINOTE_DELI";
        private static final String SELECT_DELI_BY_PARAM_SQL = "queryDeli";
        public String queryDeli(TDelinoteDeliDomain deli) {
            SQL sql = new SQL()
                .SELECT("t.id     as id")
                .SELECT("t.delinote_prod_id     as delinoteProdId")
                .SELECT("t.trans_company_addrno as transCompanyAddrno")
                .SELECT("t.cargo_no as cargoNo")
                .SELECT("t.cargo_pic as cargoPic")
                .SELECT("t.cargo_person as cargoPerson")
                .SELECT("t.fee1 as fee1")
                .SELECT("t.fee2 as fee2")
                .SELECT("t.deli_qty as deliQty")
                .SELECT("t.gift_qty as giftQty")
                .SELECT("t.deli_date as deliDate")
                .FROM(DELI_TABLE_NAME + " t")
                .WHERE("1=1 ");
            if(deli!=null){
                if(deli.getDelinoteProdId()!=null){
                    sql.WHERE("t.delinote_prod_id = #{delinoteProdId}");
                }
            }
            return sql.toString();
        }

        private static final String UPDATE_DELI_SQL = "updateDeli";
        public String updateDeli(TDelinoteDeliDomain deli) {
            SQL sql = new SQL() {{
                if(deli!=null){
                    UPDATE(DELI_TABLE_NAME);
                    if(deli.getTransCompanyAddrno()!=null){
                        SET("trans_company_addrno = #{transCompanyAddrno}");
                    }
                    if(!StringUtils.isEmpty(deli.getCargoNo())){
                        SET("cargo_no = #{cargoNo}");
                    }
                    if(!StringUtils.isEmpty(deli.getCargoPic())){
                        SET("cargo_pic = #{cargoPic}");
                    }
                    if(!StringUtils.isEmpty(deli.getCargoPerson())){
                        SET("cargo_person = #{cargoPerson}");
                    }
                    if(!StringUtils.isEmpty(deli.getFee1())){
                        SET("fee1 = #{fee1}");
                    }
                    if(!StringUtils.isEmpty(deli.getFee2())){
                        SET("fee2 = #{fee2}");
                    }
                    if(!StringUtils.isEmpty(deli.getDeliQty())){
                        SET("deli_qty = #{deliQty}");
                    }
                    if(!StringUtils.isEmpty(deli.getGiftQty())){
                        SET("gift_qty = #{giftQty}");
                    }
                    if(deli.getDeliDate()!=null){
                        SET("deli_date = #{deliDate}");
                    }
                    if(deli.getModifyerId()!=null){
                        SET("MODIFYER_ID = #{modifyerId}");
                    }
                    if(!StringUtils.isEmpty(deli.getModifyModule())){
                        SET("MODIFY_MODULE = #{modifyModule}");
                    }
                    if(!StringUtils.isEmpty(deli.getModifyAppsvr())){
                        SET("MODIFY_APPSVR = #{modifyAppsvr}");
                    }
                    WHERE("id = #{id}");
                }
            }};
            return sql.toString();
        }

        private static final String INSERT_DELI_SQL = "insertDeli";
        public String insertDeli(TDelinoteDeliDomain deli) {
            INSERT_INTO(DELI_TABLE_NAME);
            VALUES("id", "#{id}");
            if(deli!=null){
                if(deli.getDelinoteProdId()!=null){
                    VALUES("delinote_prod_id", "#{delinoteProdId}");
                }
                if(deli.getTransCompanyAddrno()!=null){
                    VALUES("trans_company_addrno", "#{transCompanyAddrno}");
                }
                if(!StringUtils.isEmpty(deli.getCargoNo())){
                    VALUES("cargo_no", "#{cargoNo}");
                }
                if(!StringUtils.isEmpty(deli.getCargoPic())){
                    VALUES("cargo_pic", "#{cargoPic}");
                }
                if(!StringUtils.isEmpty(deli.getCargoPerson())){
                    VALUES("cargo_person", "#{cargoPerson}");
                }
                if(!StringUtils.isEmpty(deli.getFee1())){
                    VALUES("fee1", "#{fee1}");
                }
                if(!StringUtils.isEmpty(deli.getFee2())){
                    VALUES("fee2", "#{fee2}");
                }
                if(!StringUtils.isEmpty(deli.getDeliQty())){
                    VALUES("deli_qty", "#{deliQty}");
                }
                if(!StringUtils.isEmpty(deli.getGiftQty())){
                    VALUES("gift_qty", "#{giftQty}");
                }
                if(deli.getDeliDate()!=null){
                    VALUES("deli_date", "#{deliDate}");
                }
                if(deli.getModifyerId()!=null){
                    VALUES("MODIFYER_ID", "#{modifyerId}");
                }
                if(!StringUtils.isEmpty(deli.getModifyModule())){
                    VALUES("MODIFY_MODULE", "#{modifyModule}");
                }
                if(!StringUtils.isEmpty(deli.getModifyAppsvr())){
                    VALUES("MODIFY_APPSVR", "#{modifyAppsvr}");
                }
            }
            return toString();
        }
        private static final String UPDATE_PROD_SQL = "updateProd";
        public String updateProd(TDelinoteProdDomain prod) {
            SQL sql = new SQL() {{
                if(prod!=null){
                    UPDATE(TABLE_NAME);
                    if(!StringUtils.isEmpty(prod.getLineStatus())){
                        SET("line_status = #{lineStatus}");
                    }
                    if(prod.getModifyerId()!=null){
                        SET("MODIFYER_ID = #{modifyerId}");
                    }
                    if(!StringUtils.isEmpty(prod.getModifyModule())){
                        SET("MODIFY_MODULE = #{modifyModule}");
                    }
                    if(!StringUtils.isEmpty(prod.getModifyAppsvr())){
                        SET("MODIFY_APPSVR = #{modifyAppsvr}");
                    }
                    WHERE("id = #{id}");
                }
            }};
            return sql.toString();
        }
    }

    /**
     * 发货通知单列表
     * @param condition 查询条件
     * @return 发货通知单列表
     */
    @SelectProvider(type = SmDelinoteManageMapper.SqlProvider.class, method = SmDelinoteManageMapper.SqlProvider.SELECT_BY_PARAM_SQL)
    List<TDelinoteProdDomain> selectByParam(SmDelinoteManageCondition condition);
    @SelectProvider(type = SmDelinoteManageMapper.SqlProvider.class, method = SmDelinoteManageMapper.SqlProvider.COUNT_BY_PARAM_SQL)
    Integer countByParam(SmDelinoteManageCondition condition);

    /**
     * 发货通知单明细对应的物流信息列表
     * @param deli 查询参数
     * @return 物流信息列表
     */
    @SelectProvider(type = SmDelinoteManageMapper.SqlProvider.class, method = SmDelinoteManageMapper.SqlProvider.SELECT_DELI_BY_PARAM_SQL)
    List<TDelinoteDeliDomain> queryDeliByParam(TDelinoteDeliDomain deli);

    /**
     * 更新物流信息列表
     * @param deli 查询参数
     * @return sql执行结果数
     */
    @UpdateProvider(type = SmDelinoteManageMapper.SqlProvider.class, method = SmDelinoteManageMapper.SqlProvider.UPDATE_DELI_SQL)
    int updateDeli(TDelinoteDeliDomain deli);

    /**
     * 新增物流信息列表
     * @param deli 查询参数
     * @return sql执行结果数
     */
    @InsertProvider(type = SmDelinoteManageMapper.SqlProvider.class, method = SmDelinoteManageMapper.SqlProvider.INSERT_DELI_SQL)
    @SelectKey(statement="SELECT SEQ_T_DELINOTE_DELI.NEXTVAL FROM DUAL", keyProperty="id",before=true, resultType=Long.class)
    Long insertDeli(TDelinoteDeliDomain deli);



    /**
     * 更新发货通知单细表
     * @param prod TDelinoteProdDomain
     * @return 操作数
     */
    @UpdateProvider(type = SmDelinoteManageMapper.SqlProvider.class, method = SmDelinoteManageMapper.SqlProvider.UPDATE_PROD_SQL)
    int updatedelinoteProd(TDelinoteProdDomain prod);
}
