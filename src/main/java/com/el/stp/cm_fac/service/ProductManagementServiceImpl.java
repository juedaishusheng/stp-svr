package com.el.stp.cm_fac.service;

import com.el.cfg.domain.TProdin;
import com.el.cfg.domain.TSonoteItem;
import com.el.cfg.mapper.TProdinMapper;
import com.el.cfg.mapper.TSonoteItemMapper;
import com.el.stp.cm_fac.domain.*;
import com.el.stp.cm_fac.mapper.ProductManagementMapper;
import com.el.sys.domain.UdcMetas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by max on 2016/8/17 0017.
 */
@Service
public class ProductManagementServiceImpl implements ProductManagementService {
    @Autowired
    private ProductManagementMapper productManagementMapper;
    @Autowired
    private TProdinMapper prodinMapper;
    @Autowired
    private TSonoteItemMapper tSonoteItemMapper;

    //生产管理主页面
    @Override
    public List<ProductManagementDomain> productManagementInfo(ProductManagementCondition productManagementCondition) {
        Integer rowCount = productManagementMapper.totalProductManagement(productManagementCondition, UdcMetas.valueOf("PRODUCT_CONFIRMATION_STATUS"));
        productManagementCondition.setRowCount(rowCount);
        return rowCount > 0 ? productManagementMapper.productManagementInfo(productManagementCondition,UdcMetas.valueOf("PRODUCT_CONFIRMATION_STATUS")) : null;
    }

    //生产管理子页面-头部数据查询
    public List<ProductManagementDomain> headInfoList(Integer sid){
        return productManagementMapper.headInfoList(sid,UdcMetas.valueOf("PRODUCT_CONFIRMATION_STATUS"));
    }

    //生产管理-详情页-产品明细
    public List<ProductDetailDomain> productDetailInfoList(Integer sid){
        return productManagementMapper.productDetailInfoList(sid);
    }

    //生产管理-详情页-产能需求
    public List<ProductRequireDomain> productRequireInfoList(){
        return productManagementMapper.productRequireInfoList();
    }

    //生产管理-子页面-文件检查查询
    public List<ProductManagementDomain> fileCheckList(){
        return productManagementMapper.fileCheckList(UdcMetas.valueOf("PRODUCT_CONFIRMATION_STATUS"));
    }

    //生产管理-子页面-文件检查查询-产品需求
    public List<ProductManagementPageCheckDomain> fileCheckDoubleClickList(Integer soProdId){
        return productManagementMapper.fileCheckDoubleClickList(soProdId);
    }

    //生产管理-子页面-纸张检查
    public List<ProductManagementPaperCheckDomain> productManagementPaperCheckList(Integer soId) {
        return productManagementMapper.productManagementPaperCheckList(soId);
    }

    //生产管理-子页面-生产报工
    public List<ProductManagementProductReportDomain> productManagementProductReportList(){
        return productManagementMapper.productManagementProductReportList();
    }

    //生产管理-子页面-记录上报查询
    public List<RecordReportDomain> recordReportList(Integer soId){
        return productManagementMapper.recordReportList(soId);
    }
    //生产管理-子页面-记录上报保存
    public int recordReportSaveList(TSonoteItem tSonoteItem){
        return tSonoteItemMapper.insert(tSonoteItem);
    }

    //生产管理-子页面-完工入库查询
    public List<FinishPutDomain> finishPutList(Integer soId){
        return productManagementMapper.finishPutList(soId);
    }

    //生产管理-子页面-完工入库保存
    public int finishPutSaveList(TProdin prodin){
        int saveResult = prodinMapper.insert(prodin);
        if(saveResult>0){//保存成功，更新T_SO_MANU状态码
            return productManagementMapper.tSoManuSattusUpdate(prodin.getSomanuId());
        }
        return 0;
    }

}
