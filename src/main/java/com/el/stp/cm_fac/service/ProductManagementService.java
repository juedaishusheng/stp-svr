package com.el.stp.cm_fac.service;

import com.el.cfg.domain.TProdin;
import com.el.cfg.domain.TSonoteItem;
import com.el.stp.cm_fac.domain.*;

import java.util.List;

/**
 * Created by max on 2016/8/17 0017.
 */
public interface ProductManagementService {
    //生产管理主页
    List<ProductManagementDomain> productManagementInfo(ProductManagementCondition productManagementCondition);

    //生产管理子页面-头部数据查询
    List<ProductManagementDomain> headInfoList(Integer sid);

    //生产管理-详情页-产品明细
    List<ProductDetailDomain> productDetailInfoList(Integer sid);

    //生产管理-详情页-产能需求
    List<ProductRequireDomain> productRequireInfoList();

    //生产管理-子页面-文件检查查询
    List<ProductManagementDomain> fileCheckList();

    //生产管理-子页面-文件检查-产能需求
    List<ProductManagementPageCheckDomain> fileCheckDoubleClickList(Integer soProdId);

    //生产管理-子页面-纸张检查
    List<ProductManagementPaperCheckDomain> productManagementPaperCheckList(Integer soId);

    //生产管理-子页面-生产报工
    List<ProductManagementProductReportDomain> productManagementProductReportList();

    //生产管理-子页面-记录上报查询
    List<RecordReportDomain> recordReportList(Integer soId);

    //生产管理-子页面-记录上报保存
    int recordReportSaveList(TSonoteItem tSonoteItem);

    //生产管理-子页面-完工入库查询
    List<FinishPutDomain> finishPutList(Integer soId);

    //生产管理-子页面-完工入库保存
    int finishPutSaveList(TProdin prodin);

}
