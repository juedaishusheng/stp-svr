package com.el.stp.cm_fac.controller;

import com.el.cfg.domain.TProdin;
import com.el.cfg.domain.TSonoteItem;
import com.el.stp.cm_fac.domain.*;
import com.el.stp.cm_fac.service.ProductManagementService;
import com.el.stp.common.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by max on 2016/8/17 0017.
 * 生产管理controller
 */
@RestController
@RequestMapping("/api/cm_fac/cm207")
public class CmProductManagementController {

    @Autowired
    private ProductManagementService productManagementService;

    //生产管理主页面 seven
    @RequestMapping("/listView")
    public PageUtil productManagementServiceList(ProductManagementCondition productManagementCondition) {
        List<ProductManagementDomain> ProductManagement = productManagementService.productManagementInfo(productManagementCondition);
        return PageUtil.pageBean(ProductManagement,productManagementCondition);
    }

    //生产管理-详情页面头部数据
    @RequestMapping("/dblView")
    public List<ProductManagementDomain>  headInfoList(@RequestParam("sid") Integer sid) {
        return productManagementService.headInfoList(sid);
    }

    //生产管理-详情页-产品明细
    @RequestMapping("/productDetail")
    public List<ProductDetailDomain> productDetailInfoList(@RequestParam("sid") Integer sid){
        return productManagementService.productDetailInfoList(sid);
    }

    //生产管理-详情页-产能需求
    @RequestMapping("/productRequire")
    public List<ProductRequireDomain> productRequireInfoList(){
        return productManagementService.productRequireInfoList();
    }

    //生产管理-子页面-文件检查查询 seven
    @RequestMapping("/fileCheck")
    public List<ProductManagementDomain> fileCheckList(){
        return productManagementService.fileCheckList();
    }

    //生产管理-子页面-文件检查-产能需求 seven
    @RequestMapping("/fileCheckDoubleClick")
    public List<ProductManagementPageCheckDomain> fileCheckDoubleClickList(@RequestParam("soProdId") Integer soProdId){
        return productManagementService.fileCheckDoubleClickList(soProdId);
    }

    //生产管理-子页面-纸张检查 seven
    @RequestMapping("/pageCheck")
    public List<ProductManagementPaperCheckDomain> productManagementPaperCheckList(@RequestParam("soId") Integer soId) {
        return productManagementService.productManagementPaperCheckList(soId);
    }

    //生产管理-子页面-生产报工 seven
    @RequestMapping("/productReport")
    public List<ProductManagementProductReportDomain> productManagementProductReportList(){
        return productManagementService.productManagementProductReportList();
    }

    //生产管理-子页面-记录上报查询
    @RequestMapping("/recordReport")
    public List<RecordReportDomain> recordReportList(@RequestParam("soId")Integer soId){
        return productManagementService.recordReportList(soId);
    }
    //生产管理-子页面-记录上报保存
    @RequestMapping("/recordReportSave")
    @ResponseBody
    public int recordReportSaveList(TSonoteItem tSonoteItem){
        return productManagementService.recordReportSaveList(tSonoteItem);
    }

    //生产管理-子页面-完工入库查询
    @RequestMapping("/finishPut")
    public List<FinishPutDomain> finishPutList(@RequestParam("soId")Integer soId){
        return productManagementService.finishPutList(soId);
    }

    //生产管理-子页面-完工入库保存
    @RequestMapping("/finishPutSave")
    public int finishPutSaveList(TProdin prodin){
        return productManagementService.finishPutSaveList(prodin);
    }

}
