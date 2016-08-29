package com.el.stp.common.util;

import com.el.stp.cm_fac.domain.CapacityDomain;
import com.el.sys.domain.KeyValue;
import com.el.util.DateUtil;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.util.*;

/**
 * Created on 2016/8/7 18:55.
 * 驾驶舱公共计算方法
 * @author Conway
 */
public class CockpitUtil {

    //计算产能率
    public static List<Integer> computeCharYData(List<CapacityDomain> orderCapacityNumList,CapacityDomain orderCapacityTotal){
        List<Integer> utilizationDataList = new ArrayList<>();//Y轴计算数值
        LocalDate today = LocalDate.now();
        int currentDay = today.getDayOfMonth();//当天day
        int currentMonthDay = today.lengthOfMonth();//当月总day
        int orderTotal = (orderCapacityTotal == null || orderCapacityTotal.getNum() < 1) ? 1 : orderCapacityTotal.getNum();
        for (int i = 1; i <= currentMonthDay; i++) { //生成当月每天利用率数据
            if (i > currentDay) {
                utilizationDataList.add(0);
            } else {
                int cockpitDate = 0;
                for (CapacityDomain cap : orderCapacityNumList) {
                    String dt = cap.getDt();
                    if (StringUtils.isEmpty(dt)) {
                        break;
                    }
                    Date dtData = DateUtil.fromYmd(dt);
                    LocalDate dtLocalDte = DateUtil.toLocalDate(dtData);
                    if (dtLocalDte.getDayOfMonth() == i) {
                        cockpitDate = cap.getNum() * 100 / orderTotal;
                        orderCapacityNumList.remove(cap);//待定
                        break;
                    }
                }
                utilizationDataList.add(cockpitDate);
            }
        }
        return utilizationDataList;
    }

    //计算订单生产状态数
    public static Map<String, String> computeOrderStatusData(KeyValue orderSeperate, List<KeyValue> orderStatusNumList) {
        Map<String, String> cokpitNumMap = new HashMap<>();
        if(!StringUtils.isEmpty(orderSeperate)){
            cokpitNumMap.put("num1", orderSeperate.getKey().toString());
            cokpitNumMap.put("num2", orderSeperate.getVal().toString());
        }
        for (KeyValue kv : orderStatusNumList) {
            if ("01".equals(kv.getKey())) {
                cokpitNumMap.put("num3", kv.getVal().toString());
            } else if ("02".equals(kv.getKey())) {
                cokpitNumMap.put("num4", kv.getVal().toString());
            } else if ("03".equals(kv.getKey())) {
                cokpitNumMap.put("num5", kv.getVal().toString());
            }
        }
        return cokpitNumMap;
    }
}
