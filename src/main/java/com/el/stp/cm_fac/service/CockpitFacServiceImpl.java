package com.el.stp.cm_fac.service;

import com.el.stp.cm_fac.domain.CapacityDomain;
import com.el.stp.cm_fac.mapper.CockpitFacMapper;
import com.el.stp.common.util.CockpitUtil;
import com.el.sys.domain.KeyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created on 2016/8/4 19:59.
 * 驾驶舱（工厂）
 * @author Conway
 */
@Service
public class CockpitFacServiceImpl implements CockpitFacService {

    @Autowired
    private CockpitFacMapper cockpitMapper;

    @Override
    public List<Integer> orderCompletionCharNum(String facid, String capaType) {
        List<CapacityDomain> orderCapacityNumList = cockpitMapper.facOorderDayCapacityNum(facid, capaType);//工厂按天占用产能总和
        CapacityDomain orderCapacityTotal = cockpitMapper.facOrderCapacityTotal(facid, capaType);//公司日产能总和
        return CockpitUtil.computeCharYData(orderCapacityNumList,orderCapacityTotal);
    }

    @Override
    public Map<String,String> orderCockpitStatusNum(String ouid, String capaType) {
        List<KeyValue> orderStatusNumList = cockpitMapper.orderStatusNum(ouid);//各生产订单状态订单数
        return CockpitUtil.computeOrderStatusData(null,orderStatusNumList);
    }

}
