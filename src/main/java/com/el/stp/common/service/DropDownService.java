package com.el.stp.common.service;

import com.el.stp.common.domain.DropDownDomain;
import com.el.stp.common.domain.DropDownMetas;

import java.util.List;
import java.util.Map;

/**
 * 预先输入框service
 * Created by xueyu on 2016/8/15.
 */
public interface DropDownService {
    /**
     *
     * @param metas 预先输入框辅助类：元数据
     * @param key 用户输入值
     * @return 查询结果
     */
    @Deprecated
    List<DropDownDomain> findAllWaitingItem(DropDownMetas metas, String key);
}
