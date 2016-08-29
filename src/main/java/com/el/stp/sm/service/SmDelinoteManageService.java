package com.el.stp.sm.service;

import com.el.stp.sm.domain.TDelinoteDeliDomain;
import com.el.stp.sm.domain.TDelinoteProdDomain;
import com.el.stp.sm.mapper.SmDelinoteManageMapper;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.ui.Model;

import java.util.List;

/**
 * 发货通知单处理service
 * Created by xueyu on 2016/8/5.
 */
public interface SmDelinoteManageService {

    /**
     * 新增/更新物流信息
     * @param deli TDelinoteDeliDomain
     * @return 操作的数据bean
     */
    TDelinoteDeliDomain updateDeli(TDelinoteDeliDomain deli);

    /**
     * 删除物流信息
     * @param ids PK数组
     * @return sql执行结果
     */
    int delDeli(Long[] ids);

    /**
     * 更新发货通知单细表
     * @param prodList TDelinoteProdDomain
     * @return 操作数
     */
    int batchUpdatedelinoteProd(List<TDelinoteProdDomain> prodList);

}
