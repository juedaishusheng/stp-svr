package com.el.stp.cm_ou.service;

import com.el.stp.cm_ou.domain.FactoryCondition;
import com.el.stp.cm_ou.domain.FactoryDomain;

import java.util.List;

/**
 * @author billy
 * @since 16/7/30.
 */
public interface FactoryService {

    List<FactoryDomain> factoryInfo(FactoryCondition factoryCondition);
    List<FactoryDomain> headInfo(Integer factId);
}
