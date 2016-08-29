package com.el.stp.cm_ou.service;

import com.el.stp.cm_ou.domain.FactoryCondition;
import com.el.stp.cm_ou.domain.FactoryDomain;
import com.el.stp.cm_ou.mapper.FactoryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author billy
 * @since 16/7/30.
 */
@Service
public class FactoryServiceImpl implements FactoryService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private FactoryMapper factoryMapper;


    @Override
    public List<FactoryDomain> factoryInfo(FactoryCondition factoryCondition) {
        Integer rowCount = factoryMapper.totalFactory(factoryCondition);
        log.info("[sms] rowCount=" + rowCount + ", pageIndex=" + factoryCondition.getPageIndex());
        factoryCondition.setRowCount(rowCount);
        return rowCount > 0 ? factoryMapper.factoryInfo(factoryCondition) : null;
    }

    @Override
    public List<FactoryDomain> headInfo(Integer factId) {
        List<FactoryDomain> factories = factoryMapper.headInfo(factId);
        return factories;
    }
}
