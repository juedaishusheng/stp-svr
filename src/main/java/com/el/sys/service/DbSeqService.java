package com.el.sys.service;

/**
 * 流水发号服务
 * <p>
 * Created on 16/5/25.
 *
 * @author panlw
 */
public interface DbSeqService {

    /**
     * 订单流水发号
     *
     * @param key 发号键值
     * @return 下一订单流水号
     */
    int nextOrderSeq(String key);

}
