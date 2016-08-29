package com.el.stp.cm_ou.service;

import com.el.stp.cm_ou.domain.*;
import com.el.stp.cm_ou.mapper.FactoryCapacityMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author billy
 * @since 16/8/1.
 */
@Service
public class FactoryCapacityServiceImpl implements FactoryCapacityService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private FactoryCapacityMapper factoryCapacityMapper;

    @Override
    public List<FactoryCapacityDomain> capacitys() {
        return factoryCapacityMapper.capacitys();
    }

    /**
     * 产能数据tab数据
     * @param dateCondition
     * @return
     */
    @Override
    public List<FactoryCapacityDomain> capacityData(DateCondition dateCondition) {
        Integer rowCount = factoryCapacityMapper.capacityTotal(dateCondition);
        log.info("[sms] rowCount=" + rowCount + ", pageIndex=" + dateCondition.getPageIndex());
        dateCondition.setRowCount(rowCount);
        return rowCount > 0 ? factoryCapacityMapper.capacityData(dateCondition) : null;
    }

    /**
     * 印刷订单tab数据
     * @param dateCondition
     * @return
     */
    @Override
    public List<PrintSoDomain> printSoData(DateCondition dateCondition) {
        Integer rowCount = factoryCapacityMapper.printSoTotal(dateCondition);
        log.info("[sms] rowCount=" + rowCount + ", pageIndex=" + dateCondition.getPageIndex());
        dateCondition.setRowCount(rowCount);
        return rowCount > 0 ?  factoryCapacityMapper.printSoData(dateCondition) : null;
    }

    /**
     * added by seven 2016-08-06
     * 工序价格
     */
    @Override
    public List<ProcessPriceDomain> processPriceIn(String addrNo) {
        return factoryCapacityMapper.processPriceIn(addrNo);
    }


    @Override
    public List<PrintSoDomain> printOrderInfo() {
        List<PrintSoDomain> printOrders = factoryCapacityMapper.printOrderInfo();
        return printOrders;
    }

}
