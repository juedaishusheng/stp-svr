package com.el.stp.fm.service;

import com.el.stp.fm.domain.AccountCondition;
import com.el.stp.fm.domain.AccountDomain;

import java.util.List;

/**
 * Created by Johnny on 2016/8/2.
 */
public interface AccountService {
    //主页面查询
    List<AccountDomain> accountInfo(AccountCondition account);

    //主页面合计
    List<AccountDomain> accountTotalInfo(AccountCondition account);

    //完工查询
    List<AccountDomain> prodInBtn(AccountCondition prodIn);

    //发货查询
    List<AccountDomain> delinoteProdBtn(AccountCondition delinoteProd);

    //发票查询
    List<AccountDomain> ticketBtn (AccountCondition ticket);

    //发票合计
    List<AccountDomain> ticketTotalInfo (AccountCondition ticket);

    //收款查询
    List<AccountDomain> payBtn (AccountCondition pay);

    //收款合计查询
    List<AccountDomain> payTotalInfo (AccountCondition pay);

    //结算单查询
    List<AccountDomain> statementBtn (AccountCondition statement);

    //结算单合计
    List<AccountDomain> statementTotalInfo (AccountCondition statement);

    //手动结算
    Boolean handStatementBtn (Long soProdId);

    //自动结算
    Boolean autoStatementBtn ();
}
