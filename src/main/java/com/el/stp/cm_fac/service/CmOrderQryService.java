package com.el.stp.cm_fac.service;

import com.el.stp.cm_fac.domain.*;

import java.util.List;

/**
 * Created by Vincent on 2016/8/9.
 * cm209服务接口
 */
public interface CmOrderQryService {
    /**
     * 查询主界面数据
     * @param cmOrderQryMainCondition 主页面查询条件
     * @return
     */
    List<CmOrderQryMainDomain> queryOrderMain(CmOrderQryMainCondition cmOrderQryMainCondition);

    /**
     * 查询子页面的Head数据
     * @param soId 订单ID
     * @return
     */
    CmOrderQryHeadDomain queryOrderHead(Integer soId);

    /**
     * 子页面的数据，所有子页面的数据都在这里查询
     * @param soId 订单ID
     * @return
     */
    CmOrderQryDtlData queryOrderDtlData(Integer soId);

    /**
     *子页面数据中的产品明细查询
     * @param soId
     * @return
     */
    List<CmOrderQryDtlDomain> queryOrderDtl(Integer soId);

    /**
     * 子页面数据中的产能需求，根据产品ID查询
     * @param prodId
     * @return
     */
    List<CmOrderQryProdProcessDomain> queryOrderProdProcess(Integer prodId);

    /**
     *子页面数据中的订单排产
     * @param soId
     * @return
     */
    List<CmOrderQryOccupyDomain> queryOrderOccupy(Integer soId);

    /**
     * 子页面数据中的生产报工
     * @param soId 订单ID
     * @return
     */
    List<CmOrderQrySorptDomain> queryOrderSorpt(Integer soId);

    /**
     *子页面数据中的完工入库
     * @param soId 订单ID
     * @return
     */
    List<CmOrderQryProdInDomain> queryOrderProdIn(Integer soId);

    /**
     * 子页面数据中的生产记录
     * @param soId 订单ID
     * @return
     */
    List<CmOrderQrySnoteItemDomain> queryOrderSnoteItem(Integer soId);
}
