package com.el.stp.cm_ou.controller;

import com.el.stp.cm_ou.service.CockpitOuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created on 2016/8/1 8:53.
 * 驾驶舱 业务公司
 * @author Conway
 */
@RestController
@RequestMapping("/api/cm_ou/cm001")
public class CmCockpitOuController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private CockpitOuService cockpitService;
    /**
     * 各状态订单数
     */
    @RequestMapping("/orderStatus")
    public Map<String, String> orderStatusNum(@RequestParam String processType) {
        if (StringUtils.isEmpty(processType)) {
            log.info("下拉菜单值为空.... ");
        }
        Map<String, String> orderStatusNum = cockpitService.orderCockpitStatusNum("1", "A");
        return orderStatusNum;
    }

    /**
     * 图形产能数据
     */
    @RequestMapping("/orderCompletionChar")
    public List<Integer> orderCompletionCharNum(@RequestParam String processType) {
        if (StringUtils.isEmpty(processType)) {
            log.info("2下拉菜单值为空.... ");
        }
        List<Integer> orderCompletionCharNum = cockpitService.orderCompletionCharNum("1", "A");
        System.out.println("orderCompletionCharNum = [" + orderCompletionCharNum.toString() + "]");
        return orderCompletionCharNum;
    }


}
