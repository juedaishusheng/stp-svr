package com.el.stp.common.controller;

import com.el.stp.common.service.SelectService;
import com.el.sys.domain.CodeName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;

/**
 * Created on 2016/8/3 15:33.
 * 公共下拉选择，根据角色
 * @author Conway
 */
@RestController
@RequestMapping("/api/common/select")
public class SelectController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private SelectService selectService;

    /**
     * 工序类型列表(业务公司)
     * @param: ouid 公司id
     */
    @RequestMapping("/processTypeOuItems")
    public List<CodeName> processTypeOuItems(@RequestParam("ouid") String ouid,HttpServletResponse response) {
        try {
            return selectService.processTypeOuUdcCodeItems(ouid);
        } catch (IllegalArgumentException ex) {
            selectNameNotFound(response, ex);
            return Collections.emptyList();
        }
    }
    /**
     * 工序类型列表(生产工厂)
     * @param: facid 工厂id
     */
    @RequestMapping("/processTypeFacItems")
    public List<CodeName> processTypeFacItems(@RequestParam("facid") String facid,HttpServletResponse response) {
        try {
            return selectService.processTypeFacUdcCodeItems(facid);
        } catch (IllegalArgumentException ex) {
            selectNameNotFound(response, ex);
            return Collections.emptyList();
        }
    }


    private void selectNameNotFound(HttpServletResponse response, IllegalArgumentException ex) {
        log.warn("[APP-WARN SelectController:] " + ex.getMessage());
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    }

}
