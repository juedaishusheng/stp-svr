package com.el.stp.cm_ou.service;

import com.el.stp.cm_fac.domain.CapacityDomain;
import com.el.stp.cm_ou.mapper.CockpitOuMapper;
import com.el.stp.common.util.CockpitUtil;
import com.el.sys.domain.KeyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created on 2016/8/4 19:59.
 * 驾驶舱（业务公司）
 * @author Conway
 */
@Service
public class CockpitOuServiceImpl implements CockpitOuService {

    @Autowired
    private CockpitOuMapper cockpitMapper;

    @Override
    public List<Integer> orderCompletionCharNum(String ouid, String capaType) {
        List<CapacityDomain> orderCapacityNumList = cockpitMapper.ouOrderDayCapacityNum(ouid, capaType);//工厂按天占用产能总和
        CapacityDomain orderCapacityTotal = cockpitMapper.ouOrderCapacityTotal(ouid, capaType);//公司日产能总和
        return CockpitUtil.computeCharYData(orderCapacityNumList,orderCapacityTotal);
    }

    @Override
    public Map<String, String> orderCockpitStatusNum(String ouid, String capaType) {
        KeyValue orderSeperate = cockpitMapper.orderSeperateNum(ouid);//订单总数 和未分单订单数
        List<KeyValue> orderStatusNumList = cockpitMapper.orderStatusNum(ouid);//各生产订单状态订单数
        return CockpitUtil.computeOrderStatusData(orderSeperate,orderStatusNumList);
    }

}
