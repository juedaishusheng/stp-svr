package com.el.stp.om.service;

import com.el.stp.om.domain.SoProdCondition;
import com.el.stp.om.domain.SoProdDomain;

import java.util.List;

/**
 * Created by xuzhe on 2016/8/24.
 */
public interface PrintSaleSoService {
    /**
     * 初始化查询
     * @param soProd
     * @return
     */
    List<SoProdDomain>  selectPrintSaleSo(SoProdCondition soProd);

    /**
     * 查看
     * @param soProd
     * @return
     */
    List<SoProdDomain> selectHeadView(SoProdDomain soProd);

    /**
     * 产品信息
     * @param soProd
     * @return
     */
    List<SoProdDomain> selectProductInfo(SoProdDomain soProd);
}
