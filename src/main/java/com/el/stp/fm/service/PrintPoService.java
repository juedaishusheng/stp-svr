package com.el.stp.fm.service;

import com.el.stp.fm.domain.PrintPoCondition;
import com.el.stp.fm.domain.PrintPoDomain;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Johnny on 2016/7/31.
 */
public interface PrintPoService {
    List<PrintPoDomain> printPoInfo(PrintPoCondition ppc);
    List<PrintPoDomain> totalInfo(PrintPoCondition ppc);
}
