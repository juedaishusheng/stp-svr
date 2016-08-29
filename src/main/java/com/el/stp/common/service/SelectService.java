package com.el.stp.common.service;

import com.el.sys.domain.CodeName;

import java.util.List;

/**
 * Created on 2016/8/3 20:00.
 *
 * @author Conway
 */
public interface SelectService {
    //获取工序类型-业务公司
    List<CodeName> processTypeOuUdcCodeItems(String ouid);

    //获取工序类型-生产工厂
    public List<CodeName> processTypeFacUdcCodeItems(String facid);
}
