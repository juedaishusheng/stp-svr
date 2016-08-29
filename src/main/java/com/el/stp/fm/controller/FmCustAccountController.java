package com.el.stp.fm.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.fm.domain.CustAccountCondition;
import com.el.stp.fm.domain.CustAccountDomain;
import com.el.stp.fm.service.CustAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by max on 2016/8/2.
 */
@RestController
@RequestMapping("api/fm/fm001")
public class FmCustAccountController {

    @Autowired
    private CustAccountService custAccountService;

    @RequestMapping("/listView")
    public PageUtil statementBtn(CustAccountCondition ca){

        List<CustAccountDomain> custAccountDomains = custAccountService.custAccountInfo(ca);

        return  PageUtil.pageBean(custAccountDomains,ca);
    }
    @RequestMapping("/accountView")
    public  Boolean accountBtn(@RequestParam("settleId") Long settleId){
        return custAccountService.accountBtn(settleId);

    }
}
