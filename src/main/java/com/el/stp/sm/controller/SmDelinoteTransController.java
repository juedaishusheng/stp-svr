package com.el.stp.sm.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.sm.domain.DelinoteDeliCondition;
import com.el.stp.sm.domain.DelinoteDeliDomain;
import com.el.stp.sm.service.DelinoteTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 发货通知单物流信息查询
 * Created by xuzhe on 2016/8/12.
 */
@RestController
@RequestMapping("/api/sm/sm003")
public class SmDelinoteTransController {
    @Autowired
    private DelinoteTransService delinoteTransService;

    @RequestMapping("/listView")
    public PageUtil delinoteTrans(DelinoteDeliCondition deli) {
        List<DelinoteDeliDomain> delinoteTrans = delinoteTransService.selectDelinoteTrans(deli);
        return PageUtil.pageBean(delinoteTrans, deli);

    }
}
