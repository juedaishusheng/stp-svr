package com.el.stp.sm.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.sm.domain.SmDelinoteProdDomain;
import com.el.stp.sm.service.SmDelinoteProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 待处理发货通知单
 * Created by xuzhe on 2016/8/3.
 */
@RestController
@RequestMapping("/api/sm/sm001")
public class SmUnDelinoteProdController {
    @Autowired
    private SmDelinoteProdService smDelinoteProdService;

    @RequestMapping("/listView")
    public PageUtil unDelinoteProd(SmDelinoteProdDomain deli) {
        List<SmDelinoteProdDomain> UnDelinoteProd = smDelinoteProdService.selectUnDelinoteInfo(deli);
        return PageUtil.pageBean(UnDelinoteProd,deli);
    }
}
