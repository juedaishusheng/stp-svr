package com.el.stp.fm.service;

import com.el.cfg.domain.TCustSettle;
import com.el.cfg.mapper.*;
import com.el.stp.fm.domain.AccountCondition;
import com.el.stp.fm.domain.AccountDomain;
import com.el.stp.fm.mapper.AccountMapper;
import com.el.util.DocNoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Johnny on 2016/8/2.
 */
@Service
public class AccountServiceImpl implements AccountService{
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private TCustSettleMapper tCustSettleMapper;

    @Autowired
    private TSoProdMapper tSoProdMapper;

    @Autowired
    private TSoMapper tSoMapper;

    @Autowired
    private TProdMapper tProdMapper;

    @Autowired
    private TOuMapper tOuMapper;

    @Autowired
    private TCustMapper tCustMapper;

    @Autowired
    private TMcuMapper tMcuMapper;

    @Override
    public List<AccountDomain> accountInfo(AccountCondition account){
        Integer rowCount=accountMapper.accountBtnNum(account);
        account.setRowCount(rowCount);
        return rowCount>0?accountMapper.accountInfo(account):null;
    }

    @Override
    public List<AccountDomain> accountTotalInfo(AccountCondition acc){
        List<AccountDomain> accountTotal = accountMapper.accountTotal(acc);

        BigDecimal invAmtTotal = new BigDecimal(0);
        BigDecimal recvAmtTotal = new BigDecimal(0);
        BigDecimal quoteAmtTotal = new BigDecimal(0);
        BigDecimal currQuoteAmtTotal = new BigDecimal(0);


        for(AccountDomain accountList:accountTotal){

            if(accountList.getQuoteAmt() == null){
                accountList.setQuoteAmt(new BigDecimal(0));
            }
            if(accountList.getInvAmt() == null){
                accountList.setInvAmt(new BigDecimal(0));
            }
            if(accountList.getRecvAmt() == null){
                accountList.setRecvAmt(new BigDecimal(0));
            }
            if(accountList.getCurrQuoteAmt() == null){
                accountList.setCurrQuoteAmt(new BigDecimal(0));
            }

            invAmtTotal=invAmtTotal.add(accountList.getInvAmt());
            recvAmtTotal=recvAmtTotal.add(accountList.getRecvAmt());
            quoteAmtTotal=quoteAmtTotal.add(accountList.getQuoteAmt());
            currQuoteAmtTotal=currQuoteAmtTotal.add(accountList.getCurrQuoteAmt());
        }
        AccountDomain total = new AccountDomain();
        total.setInvAmtTotal(invAmtTotal);
        total.setRecvAmtTotal(recvAmtTotal);
        total.setQuoteAmtTotal(quoteAmtTotal);
        total.setCurrQuoteAmtTotal(currQuoteAmtTotal);

        List<AccountDomain> totals = new ArrayList<AccountDomain>();
        totals.add(total);

        return totals;
    }


    @Override
    public List<AccountDomain> prodInBtn(AccountCondition prodIn){
        Integer rowCount=accountMapper.prodInBtnNum(prodIn);
        prodIn.setRowCount(rowCount);
        return rowCount>0?accountMapper.prodInBtn(prodIn):null;
    }

    @Override
    public List<AccountDomain> delinoteProdBtn(AccountCondition delinoteProd){
        Integer rowCount=accountMapper.delinoteProdBtnNum(delinoteProd);
        delinoteProd.setRowCount(rowCount);
        return rowCount>0?accountMapper.delinoteProdBtn(delinoteProd):null;
    }



    @Override
    public List<AccountDomain> ticketBtn(AccountCondition ticket){
        Integer rowCount=accountMapper.ticketBtnNum(ticket);
        ticket.setRowCount(rowCount);
        return rowCount>0?accountMapper.ticketBtn(ticket):null;

    }

    @Override
    public List<AccountDomain> ticketTotalInfo(AccountCondition ticket){
        List<AccountDomain> ticketTotal = accountMapper.ticketTotal(ticket);

        BigDecimal invAmtTotal = new BigDecimal(0);
        BigDecimal quoteAmtTotal = new BigDecimal(0);
        BigDecimal taxAmtTotal = new BigDecimal(0);
        BigDecimal netAmtTotal = new BigDecimal(0);

        for(AccountDomain ticketList:ticketTotal){
            if(ticketList.getQuoteAmt() == null){
                ticketList.setQuoteAmt(new BigDecimal(0));
            }

            invAmtTotal=invAmtTotal.add(ticketList.getCsi().getInvAmt());
            netAmtTotal=netAmtTotal.add(ticketList.getCsi().getNetAmt());
            quoteAmtTotal=quoteAmtTotal.add(ticketList.getQuoteAmt());
            taxAmtTotal=taxAmtTotal.add(ticketList.getCsi().getTaxAmt());

        }


        AccountDomain total = new AccountDomain();
        total.setInvAmtTotal(invAmtTotal);
        total.setNetAmtTotal(netAmtTotal);
        total.setQuoteAmtTotal(quoteAmtTotal);
        total.setTaxAmtTotal(taxAmtTotal);

        List<AccountDomain> totals = new ArrayList<AccountDomain>();
        totals.add(total);

        return totals;
    }


    @Override
    public List<AccountDomain> payBtn(AccountCondition pay){
        Integer rowCount=accountMapper.payBtnNum(pay);
        pay.setRowCount(rowCount);
        return rowCount>0?accountMapper.payBtn(pay):null;
    }

    @Override
    public List<AccountDomain> payTotalInfo(AccountCondition pay){
        List<AccountDomain> payTotal = accountMapper.payTotal(pay);

        BigDecimal invAmtTotal = new BigDecimal(0);
        BigDecimal recvAmtTotal = new BigDecimal(0);

        for(AccountDomain payList:payTotal){
            invAmtTotal=invAmtTotal.add(payList.getCsi().getInvAmt());
            log.info("------",invAmtTotal);
            log.info("111111111",payList.getCsi().getInvAmt());

            recvAmtTotal=recvAmtTotal.add(payList.getCr().getRecvAmt());
        }
        AccountDomain total = new AccountDomain();
        total.setInvAmtTotal(invAmtTotal);
        total.setRecvAmtTotal(recvAmtTotal);

        List<AccountDomain> totals = new ArrayList<AccountDomain>();
        totals.add(total);

        return totals;
    }


    @Override
    public List<AccountDomain> statementBtn(AccountCondition statement){
        Integer rowCount=accountMapper.statementBtnNum(statement);
        statement.setRowCount(rowCount);
        return rowCount>0?accountMapper.statementBtn(statement):null;
    }

    @Override
    public List<AccountDomain> statementTotalInfo(AccountCondition statement){
        List<AccountDomain> statementTotal = accountMapper.statementTotal(statement);

        BigDecimal soAmtTotal = new BigDecimal(0);
        BigDecimal accountAmtTotal = new BigDecimal(0);

        for(AccountDomain statementList:statementTotal){
            soAmtTotal=soAmtTotal.add(statementList.getCad().getSoAmt());
            accountAmtTotal=accountAmtTotal.add(statementList.getCad().getAccountAmt());
        }
        AccountDomain total = new AccountDomain();
        total.setSoAmtTotal(soAmtTotal);
        total.setAccountAmtTotal(accountAmtTotal);

        List<AccountDomain> totals = new ArrayList<AccountDomain>();
        totals.add(total);

        return totals;
    }


    @Override
    public Boolean handStatementBtn(Long soProdId){
        log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!handStatementBtn start");
        List<TCustSettle> tCustSettleList = accountMapper.handStatementBtn(soProdId);
        if (tCustSettleList != null && tCustSettleList.size() > 0) {
            TCustSettle  tCustSettle = tCustSettleList.get(0);
            String date = DocNoUtil.getNum();
            String orderNum = accountMapper.queryOrderNumByDate(date);
            if (orderNum == null || "".equals(orderNum)){
                orderNum ="1";
            }
            tCustSettle.setDocNo(date+String.format("%06d", Long.parseLong(orderNum)));
            //当已发货数量小于订单数量手动生成结算单
            if (tCustSettle.getSettleQty() < tCustSettle.getSoQty()) {
                /*TSoProd tSoProd = tSoProdMapper.selectByPrimaryKey(soProdId);
                tSoProd.setSettleFlag("Y");
                tSoProdMapper.updateByPrimaryKey(tSoProd);*/
                tCustSettleMapper.insert(tCustSettle);

                /*//判断是否有库存 汇总PQOH-汇总UORG
                //获取产品信息
                Long prodId =tSoProd.getProdId();
                TProd tProd = tProdMapper.selectByPrimaryKey(prodId);
                String prodCode = tProd.getProdCode();
                //获取订单信息
                Long soId = tSoProd.getSoId();
                TSo tSo = tSoMapper.selectByPrimaryKey(soId);
                String soNo = tSo.getSoNo();
                String soType = tSo.getSoType();
                //获取T_OU信息
                Long ouId = tSo.getOuId();
                TOu tOu = tOuMapper.selectByPrimaryKey(ouId);
                String ouCode = tOu.getOuCode();
                //获取客户信息
                Long custId = tSo.getCustId();
                TCust tCust = tCustMapper.selectByPrimaryKey(custId);
                String custCode = tCust.getCustCode();
                //获取批次信息
                String batchDesc = tSo.getBatchDesc();
                //获取T_MCU信息
                Long mcuId = tSo.getMcuId();
                TMcu tMcu = tMcuMapper.selectByPrimaryKey(mcuId);
                String mcuCode = tMcu.getMcuCode();
                //locn
                String locn = "9001";


                log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!soProdId is:"+soProdId);
                log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!prodCode is:"+prodCode);
                log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!soNo is:"+soNo);
                log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!ouCode is:"+ouCode);
                log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!custCode is:"+custCode);
                log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!batchDesc is:"+batchDesc);
                BigDecimal sumPqoh = accountMapper.sumPqoh(ouCode,prodCode,batchDesc);
                log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!sumPqoh is:"+sumPqoh);*/

                return true;

            }else{
                return false;
            }

        }else{
            return null;
        }
    }
    @Override
    public Boolean autoStatementBtn(){
        log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!autoStatementBtn start");
        List<TCustSettle> tCustSettleList = accountMapper.autoStatementBtn();
        if (tCustSettleList != null && tCustSettleList.size() > 0) {
            for (int i = 0; i < tCustSettleList.size(); i++) {
                TCustSettle  tCustSettle = tCustSettleList.get(i);
                String date = DocNoUtil.getNum();
                String orderNum = accountMapper.queryOrderNumByDate(date);
                if (orderNum == null || "".equals(orderNum)){
                    orderNum ="1";
                }
                tCustSettle.setDocNo(date+String.format("%06d", Long.parseLong(orderNum)));
                //当已发货数量小于订单数量手动生成结算单
                if (tCustSettle.getSettleQty() >= tCustSettle.getSoQty()) {
                    /*TSoProd tSoProd = tSoProdMapper.selectByPrimaryKey(tCustSettle.getSoProdId());
                    tSoProd.setSettleFlag("Y");
                    tSoProdMapper.updateByPrimaryKey(tSoProd);*/
                    tCustSettleMapper.insert(tCustSettle);

                    /*//判断是否有库存 汇总PQOH
                    //获取产品信息
                    Long prodId =tSoProd.getProdId();
                    TProd tProd = tProdMapper.selectByPrimaryKey(prodId);
                    String prodCode = tProd.getProdCode();
                    //获取订单信息
                    Long soId = tSoProd.getSoId();
                    TSo tSo = tSoMapper.selectByPrimaryKey(soId);
                    String soNo = tSo.getSoNo();
                    String soType = tSo.getSoType();
                    //获取T_OU信息
                    Long ouId = tSo.getOuId();
                    TOu tOu = tOuMapper.selectByPrimaryKey(ouId);
                    String ouCode = tOu.getOuCode();
                    //获取客户信息
                    Long custId = tSo.getCustId();
                    TCust tCust = tCustMapper.selectByPrimaryKey(custId);
                    String custCode = tCust.getCustCode();
                    //获取批次信息
                    String batchDesc = tSo.getBatchDesc();
                    //获取T_MCU信息
                    Long mcuId = tSo.getMcuId();
                    TMcu tMcu = tMcuMapper.selectByPrimaryKey(mcuId);
                    String mcuCode = tMcu.getMcuCode();
                    //locn
                    String locn = "9001";

                    log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!soProdId is:"+tSoProd.getId());
                    log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!prodCode is:"+prodCode);
                    log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!soNo is:"+soNo);
                    log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!ouCode is:"+ouCode);
                    log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!custCode is:"+custCode);
                    log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!batchDesc is:"+batchDesc);
                    BigDecimal sumPqoh = accountMapper.sumPqoh(ouCode,prodCode,batchDesc);
                    log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!sumPqoh is:"+sumPqoh);*/

                }
            }

            return true;
        }else{
            return false;
        }

    }
}
