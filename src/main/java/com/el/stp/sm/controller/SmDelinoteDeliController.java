package com.el.stp.sm.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.sm.domain.DelinoteDeliCondition;
import com.el.stp.sm.domain.DelinoteDeliDomain;
import com.el.stp.sm.service.DelinoteDeliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 产品发货记录查询
 * Created by xuzhe on 2016/8/3.
 */
@RestController
@RequestMapping("/api/sm/sm004")
public class SmDelinoteDeliController {
    @Autowired
    private DelinoteDeliService delinoteDeliService;
    @RequestMapping("/listView")
    public PageUtil delinoteDeli(DelinoteDeliCondition deli) {
        List<DelinoteDeliDomain> delinoteDeli = delinoteDeliService.selectDelinoteDeli(deli);
        return PageUtil.pageBean(delinoteDeli, deli);
    }

}
