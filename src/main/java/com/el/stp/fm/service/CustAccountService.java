package com.el.stp.fm.service;

import com.el.stp.fm.domain.CustAccountCondition;
import com.el.stp.fm.domain.CustAccountDomain;

import java.util.List;

/**
 * Created by max on 2016/8/2.
 */
public interface CustAccountService {

    List<CustAccountDomain> custAccountInfo(CustAccountCondition ca);

    //立账
    Boolean accountBtn (Long id);
}
