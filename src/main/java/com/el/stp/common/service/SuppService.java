package com.el.stp.common.service;

import com.el.stp.common.domain.TSuppDomain;

import java.util.List;

/**
 * 供应商相关service
 * Created by xueyu on 2016/8/10.
 */
public interface SuppService {
    /**
     * 查询供应商列表
     * @param supp TSuppDomain，可以传null值
     * @return 供应商列表
     */
    List<TSuppDomain> querySuppByParam(TSuppDomain supp);

    /**
     * 根据suppcode查询供应商
     * @param addrNo 供应商地址号（唯一索引）
     * @return 供应商
     */
    TSuppDomain suppOne(String addrNo);
}
