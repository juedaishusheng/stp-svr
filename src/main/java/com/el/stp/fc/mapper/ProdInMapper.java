package com.el.stp.fc.mapper;

import com.el.stp.fc.domian.ProdInCondition;
import com.el.stp.fc.domian.ProdInDomain;
import com.el.util.SqlUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 成品入库单管理
 * Created by xuzhe on 2016/8/1.
 */
public interface ProdInMapper {
    final class SqlProvider extends SQL {
        private static final String SELECT_PRODIN = "selectProdIn";
        public String selectProdIn(@Param("pro") ProdInCondition pro) {
            return SqlUtil.paging(selectProdInSql(pro), pro);
        }
        public String selectProdInSql(@Param("pro") ProdInCondition pro) {
            SELECT("sum(t.whin_qty) as whinQty");
            SELECT("p.prod_code as prodCode");
            SELECT("p.prod_name as prodName");
            SELECT("a.addr_name as addrName");
            FROM("T_PRODIN t");
            LEFT_OUTER_JOIN("T_PROD p on t.PROD_Id = p.ID");
            LEFT_OUTER_JOIN("T_FACTORY f on t.fact_id = f.id");
            LEFT_OUTER_JOIN("T_ADDRESS_book a on f.addr_no = a.addr_no ");
            LEFT_OUTER_JOIN("T_SO s on t.so_id = s.id");
            if(pro!=null){
                if (!StringUtils.isEmpty(pro.getSoNo())) {
                    WHERE("s.so_no =#{pro.soNo}");
                }
                if (!StringUtils.isEmpty(pro.getProdName())) {
                    WHERE("p.prod_name =#{pro.prodName}");
                }
                if (null != pro.getDocDateFrom()) {
                    WHERE("t.doc_date >=#{pro.docDateFrom}");
                }
                if (null != pro.getDocDateTo()) {
                    WHERE("t.doc_date <=#{pro.docDateTo}");
                }
            }
            GROUP_BY("p.prod_code, p.prod_name, a.addr_name");

            return toString();
        }

        private static final String SELECT_PRODINDETAIL = "selectProdInDetail";
        private static final String COUNT_PRODINDETAIL = "countProdInDetail";

        public String selectProdInDetail(@Param("pro") ProdInCondition pro) {
            return SqlUtil.paging(selectProdInDetailSql(pro), pro);
        }
        public String countProdInDetail(@Param("pro") ProdInCondition pro) {
            return "select count(1) from ("+selectProdInDetailSql(pro)+")";
        }

        public String selectProdInDetailSql(@Param("pro") ProdInCondition pro) {
            SELECT("t.doc_no as docNo");
            SELECT("t.doc_date as docDate");
            SELECT("t.whin_pic as whinPic");
            SELECT("t.remark as remark");
            SELECT("t.whin_qty as whinQty");
            SELECT("t.soprod_qty as soprodQty");
            SELECT("p.prod_code as prodCode");
            SELECT("p.prod_name as prodName");
            SELECT("c.cust_name as custName");
            SELECT("s.so_no as soNo");
            SELECT("a.addr_name as addrName");
            FROM("T_PRODIN t");
            LEFT_OUTER_JOIN("T_PROD p on t.PROD_Id = p.ID");
            LEFT_OUTER_JOIN("T_FACTORY f on t.fact_id = f.id");
            LEFT_OUTER_JOIN("T_ADDRESS_book a on f.addr_no = a.addr_no ");
            LEFT_OUTER_JOIN("T_CUST c on t.cust_id = c.id");
            LEFT_OUTER_JOIN("T_SO s on t.so_id = s.id");
            if(pro!=null){
                if (!StringUtils.isEmpty(pro.getProdCode())) {
                    WHERE("p.prod_code =#{pro.prodCode}");
                }
                if (!StringUtils.isEmpty(pro.getAddrName())) {
                    WHERE("a.addr_name =#{pro.addrName}");
                }
            }
            return toString();
        }

        /**
         * 成品入库单管理汇总总条数
         */
        private static final String PRODIN_NUM_SQL = "prodInNumSQL";

        public String prodInNumSQL(@Param("pro") ProdInCondition pro) {
            return "select count(1) from ("+selectProdInSql(pro)+")";
        }
    }


    /**
     * 成品入库单管理汇总
     *
     * @param pro
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_PRODIN)
    List<ProdInDomain> prodInInfo(@Param("pro") ProdInCondition pro);

    /**
     * 成品入库单管理汇总总条数
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.PRODIN_NUM_SQL)
    Integer prodInNum(@Param("pro") ProdInCondition pro);

    /**
     * 成品入库单管理明细
     *
     * @param pro
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.SELECT_PRODINDETAIL)
    List<ProdInDomain> prodInDetailInfo(@Param("pro") ProdInCondition pro);

    /**
     * 成品入库单管理明细总条数
     * @param pro
     * @return
     */
    @SelectProvider(type = SqlProvider.class, method = SqlProvider.COUNT_PRODINDETAIL)
    Integer countProdInDetailInfo(@Param("pro") ProdInCondition pro);


}
