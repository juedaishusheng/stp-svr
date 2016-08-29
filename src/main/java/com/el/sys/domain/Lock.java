package com.el.sys.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

/**
 * DB数据对象锁
 * <p>
 * Created on 16/6/15.
 *
 * @author panlw
 */
public class Lock {

    /**
     * 创建新锁
     *
     * @param lockType 锁类型
     * @param lockData 锁的目标数据
     * @param nodeId   节点ID
     * @param sessId   会话ID
     * @param userId   用户ID
     * @return 锁
     */
    public static Lock createLock(
        LockType lockType, String lockData, String nodeId, String sessId, String userId) {
        Lock lock = new Lock();
        lock.owned = true;
        lock.lockType = lockType;
        lock.lockData = lockData;
        lock.lockId = UUID.randomUUID().toString();
        lock.sessId = sessId;
        lock.nodeId = nodeId;
        lock.lockBy = userId;
        return lock;
    }

    /**
     * 仅保留用于解锁的数据
     *
     * @return self
     */
    public Lock toUnlockOnly() {
        sessId = null;
        lockAt = null;
        return this;
    }

    /**
     * 是否拥有该锁
     */
    @Getter
    private boolean owned;

    /**
     * 锁类型
     */
    @Getter
    @Setter
    private LockType lockType;

    /**
     * @return 锁类型编码
     */
    public String getLockCode() {
        return lockType.getCode();
    }

    /**
     * @param lockCode 锁类型编码
     */
    public void setLockCode(String lockCode) {
        lockType = LockType.of(lockCode);
    }

    /**
     * @return 锁类型描述
     */
    public String getLockDesc() {
        return lockType.getDesc();
    }

    /**
     * 加锁的数据
     */
    @Getter
    @Setter
    private String lockData;

    /**
     * 拥有锁的请求ID(UUID)
     */
    @Getter
    @Setter
    private String lockId;

    /**
     * 拥有锁的会话ID(由Servlet容器的设置决定,默认配置:32)
     *
     * @see <a href="http://tomcat.apache.org/tomcat-8.0-doc/config/sessionidgenerator.html#Standard_Implementation)">关于 Session ID 的长度</a>
     */
    @Getter
    @Setter
    private String sessId;
    /**
     * 拥有锁的节点ID
     */
    @Getter
    @Setter
    private String nodeId;

    /**
     * 加锁操作的用户
     */
    @Getter
    @Setter
    private String lockBy;
    /**
     * 加锁操作的时点
     */
    @Getter
    @Setter
    private Date lockAt;

    /**
     * @return 锁警告
     */
    public Alert alert() {
        return lockType.alert(lockBy);
    }
}
