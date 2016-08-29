package com.el.stp.fm.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.fm.domain.PrintPoCondition;
import com.el.stp.fm.domain.PrintPoDomain;
import com.el.stp.fm.service.PrintPoService;
import com.el.sys.domain.PagingBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Johnny on 2016/7/29.
 * 印刷采购单主页面 and  总计
 */
@RestController
@RequestMapping("/api/fm/fm005")
public class FmPrintPoController {

    @Autowired
    private PrintPoService printPoService;

    private final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 初始化查询
     * @return
     */
    @RequestMapping("/listView")
    public PageUtil printPos (PrintPoCondition ppc){



        List<PrintPoDomain> printPo = printPoService.printPoInfo(ppc);


        return PageUtil.pageBean(printPo,ppc);
    }

    @RequestMapping("/totalView")
    public List<PrintPoDomain> total( PrintPoCondition ppc){

        log.info("进来了啊啊啊啊啊");
        List<PrintPoDomain> total = printPoService.totalInfo(ppc);

        return total;
    }
}
