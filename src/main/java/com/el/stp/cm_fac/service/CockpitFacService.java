package com.el.stp.cm_fac.service;

import java.util.List;
import java.util.Map;

/**
 * Created on 2016/8/5 10:48.
 *
 * @author Conway
 */
public interface CockpitFacService {
    //当月订单产能完工数
    List<Integer> orderCompletionCharNum(String facid, String capaType);

    //各状态订单产能完工数
    Map<String, String> orderCockpitStatusNum(String facid, String capaType);
}
