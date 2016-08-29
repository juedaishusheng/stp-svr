package com.el.stp.om.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.om.domain.SoProdCondition;
import com.el.stp.om.domain.SoProdDomain;
import com.el.stp.om.service.PrintSaleSoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 印刷销售订单
 * Created by xuzhe on 2016/8/24.
 */
@RestController
@RequestMapping("api/om/om001")
public class OmPrintSaleSoController {
    @Autowired
    private PrintSaleSoService soService;

    @RequestMapping("/listView")
    public PageUtil printSale(SoProdCondition soProd) {
        List<SoProdDomain> printSaleSo = soService.selectPrintSaleSo(soProd);
        return PageUtil.pageBean(printSaleSo, soProd);
    }

    /**
     * 查看
     *
     * @param soProd
     * @return
     */
    @RequestMapping("/headView")
    public List<SoProdDomain> headView(SoProdDomain soProd) {
        List<SoProdDomain> printSaleSo = soService.selectHeadView(soProd);
        return printSaleSo;
    }

    /**
     * 产品信息
     * @param so
     * @return
     */
    @RequestMapping("/productInfo")
    public List<SoProdDomain> prodInfo(SoProdDomain so){
        List<SoProdDomain> productInfo = soService.selectProductInfo(so);
        return productInfo;
    }

}
