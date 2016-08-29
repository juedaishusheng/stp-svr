package com.el.stp.fc.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.common.util.StringUtils;
import com.el.stp.fc.domian.ProdInCondition;
import com.el.stp.fc.domian.ProdInDomain;
import com.el.stp.fc.service.ProdInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 成品入库单管理
 * Created by xuzhe on 2016/8/1.
 */
@RestController
@RequestMapping("/api/fc/fc007")
public class FcProdInController {
    @Autowired
    private ProdInService prodInService;

    @RequestMapping("/listView")
    public PageUtil prodIn(ProdInCondition pro) {
        if(pro==null)pro = new ProdInCondition();
        return PageUtil.pageBean(prodInService.prodInInfo(pro), pro);

    }

    @RequestMapping("/editView")
    public PageUtil prodInDetailInfo(ProdInCondition pro) {
        if(pro==null)pro = new ProdInCondition();
        return PageUtil.pageBean(prodInService.prodInDetailInfo(pro), pro);
    }

}
