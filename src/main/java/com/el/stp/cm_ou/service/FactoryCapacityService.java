package com.el.stp.cm_ou.service;

import com.el.stp.cm_ou.domain.DateCondition;
import com.el.stp.cm_ou.domain.FactoryCapacityDomain;
import com.el.stp.cm_ou.domain.PrintSoDomain;
import com.el.stp.cm_ou.domain.ProcessPriceDomain;

import java.util.Date;
import java.util.List;

/**
 * @author billy
 * @since 16/8/1.
 */
public interface FactoryCapacityService {
    List<FactoryCapacityDomain> capacitys();

    List<FactoryCapacityDomain> capacityData(DateCondition dateCondition);

    List<PrintSoDomain> printSoData(DateCondition dateCondition);

    /**
     * seven 修改 16-8-2
     * 工序价格
     */
    List<ProcessPriceDomain> processPriceIn(String addrNo);

    List<PrintSoDomain> printOrderInfo();

}
