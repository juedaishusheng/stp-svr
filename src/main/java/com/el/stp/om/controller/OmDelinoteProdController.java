package com.el.stp.om.controller;


import com.el.stp.common.util.PageUtil;
import com.el.stp.om.domain.DelinoteProdCondition;
import com.el.stp.om.domain.DelinoteProdDomain;
import com.el.stp.om.service.DelinoteProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 发货通知单查询
 * Created by xuzhe on 2016/7/28.
 */
@RestController
@RequestMapping("/api/om/om005")
public class OmDelinoteProdController {
    @Autowired
    private DelinoteProdService delinoteProdService;

    @RequestMapping("/listView")
    public PageUtil delinoteProd(DelinoteProdCondition delinoteProd) {
        List<DelinoteProdDomain> delinoteProds = delinoteProdService.selectDelinoteInfo(delinoteProd);
        return PageUtil.pageBean(delinoteProds, delinoteProd);
    }
}

