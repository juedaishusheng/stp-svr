package com.el.stp.cm_fac.controller;
import com.el.stp.cm_fac.service.CockpitFacService;
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
 * 驾驶舱 工厂
 * @author Conway
 */
@RestController
@RequestMapping("/api/cm_fac/cm201")
public class CmCockpitFacController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private CockpitFacService cockpitService;
    /**
     * 各状态订单数
     */
    @RequestMapping("/orderStatus")
    public Map<String, String> orderStatusNum(@RequestParam String processType) {
        if (StringUtils.isEmpty(processType)) {
            log.info("下拉菜单值为空.... ");
        }
        Map<String,String> orderStatusNum = cockpitService.orderCockpitStatusNum("1", "A");
        System.out.println("orderStatusNum = [" + orderStatusNum.toString() + "]");
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
