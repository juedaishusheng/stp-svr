package com.el.sys.service;

import com.el.sys.domain.Lock;
import com.el.sys.domain.LockType;

/**
 * Created on 16/6/15.
 *
 * @author panlw
 */
public interface LockService {

    /**
     * 取锁
     *
     * @param lockType 锁类型
     * @param lockData 加锁的数据
     * @return 锁
     */
    Lock getLock(LockType lockType, String lockData);

    /**
     * 加锁
     *
     * @param lockType 锁类型
     * @param lockData 加锁的数据
     * @return 锁
     */
    Lock lock(LockType lockType, String lockData);

    /**
     * 解锁
     *
     * @param lock 锁
     */
    void unlock(Lock lock);

    /**
     * 释放所有该会话创建的锁(会话关闭时执行)
     * @param sessId
     */
    void unlockSession(String sessId);

    /**
     * 释放所有该节点创建的锁(节点启动时执行)
     */
    void unlockNode();
}
