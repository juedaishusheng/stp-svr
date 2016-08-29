package com.el.stp.fm.controller;

import com.el.stp.common.util.PageUtil;
import com.el.stp.fm.domain.AccountCondition;
import com.el.stp.fm.domain.AccountDomain;
import com.el.stp.fm.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by max on 2016/8/2.
 */
@RestController
@RequestMapping("/api/fm/fm002")
public class FmAccountController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private AccountService accountService;

    /**
     * 初始化查询
     * @return
     */
    @RequestMapping("/listView")
    public   PageUtil  accountDomains(AccountCondition acc){

        List<AccountDomain> accountDomains = accountService.accountInfo(acc);

      return  PageUtil.pageBean(accountDomains,acc);
    }

    @RequestMapping("/listTotal")
    public List<AccountDomain>  accountTotal(AccountCondition acc){

        List<AccountDomain> accountTotal = accountService.accountTotalInfo(acc);

        return accountTotal;
    }

    @RequestMapping("/delinoteProdView")
    public PageUtil  delinoteProdBtn(AccountCondition delinoteProd){

        List<AccountDomain> accountDomains = accountService.delinoteProdBtn(delinoteProd);

        return  PageUtil.pageBean(accountDomains,delinoteProd);
    }


    @RequestMapping("/ticketView")
    public PageUtil ticketBtn(AccountCondition ticket){

        List<AccountDomain> accountDomains = accountService.ticketBtn(ticket);

        return  PageUtil.pageBean(accountDomains,ticket);
    }
    @RequestMapping("/ticketTotal")
    public List<AccountDomain> ticketTotal( AccountCondition ticket){
        List<AccountDomain> ticketTotal = accountService.ticketTotalInfo(ticket);
        return ticketTotal;
    }


    @RequestMapping("/payView")
    public  PageUtil payBtn(AccountCondition pay){

        List<AccountDomain> accountDomains = accountService.payBtn(pay);

        return  PageUtil.pageBean(accountDomains,pay);

    }

    @RequestMapping("/payTotal")
    public List<AccountDomain> payTotal( AccountCondition pay){
        List<AccountDomain> payTotal = accountService.payTotalInfo(pay);
        return payTotal;
    }


    @RequestMapping("/statementView")
    public  PageUtil statementBtn(AccountCondition statement){

        List<AccountDomain> accountDomains = accountService.statementBtn(statement);

        return  PageUtil.pageBean(accountDomains,statement);
    }

    @RequestMapping("/statementTotal")
    public List<AccountDomain> statementTotal( AccountCondition statement){
        List<AccountDomain> statementTotal = accountService.statementTotalInfo(statement);
        return statementTotal;
    }


    @RequestMapping("/handStatementView")
    public  Boolean handStatementBtn(@RequestParam("soProdId") Long soProdId){
        return accountService.handStatementBtn(soProdId);
    }

}
