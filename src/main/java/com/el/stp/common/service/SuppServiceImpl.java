package com.el.stp.common.service;

import com.el.stp.common.domain.TSuppDomain;
import com.el.stp.common.mapper.SuppMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 供应商相关service
 * Created by xueyu on 2016/8/10.
 */
@Service
public class SuppServiceImpl implements SuppService {
    @Autowired
    private SuppMapper suppMapper;

    /**
     * 查询供应商列表
     * @param supp TSuppDomain，可以传null值
     * @return 供应商列表
     */
    @Override
    public List<TSuppDomain> querySuppByParam(TSuppDomain supp) {
        return suppMapper.selectByParam(supp);
    }

    /**
     * 根据suppcode查询供应商
     * @param addrNo 供应商地址号（唯一索引）
     * @return 供应商
     */
    @Override
    public TSuppDomain suppOne(String addrNo) {
        return suppMapper.suppOne(addrNo);
    }


}
