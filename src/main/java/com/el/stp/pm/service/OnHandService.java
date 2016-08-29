package com.el.stp.pm.service;

import com.el.stp.pm.domain.OnHandCondition;
import com.el.stp.pm.domain.OnHandDomain;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Title:待价格审核
 * Description:
 *
 * @Company: Elitesland
 * @project: stp-svr
 * @author: james.zhang
 * @version: 1.0.0
 * @time: 2016/8/24
 */
public interface OnHandService {
    List<OnHandDomain> selectOnHandInfo(OnHandCondition onHandCondition);
}
