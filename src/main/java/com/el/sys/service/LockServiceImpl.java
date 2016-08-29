package com.el.sys.service;

import com.el.sys.domain.Lock;
import com.el.sys.domain.LockType;
import com.el.sys.mapper.LockMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 16/6/15.
 *
 * @author panlw
 */
@Service
public class LockServiceImpl implements LockService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private DbAuditService dbAuditService;

    @Autowired
    private LockMapper lockMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void unlockNode() {
        final String nodeId = dbAuditService.nodeId();
        log.info("[APP-LOCK] node unlocking...: " + nodeId);
        lockMapper.unlockNode(nodeId);
        log.info("[APP-LOCK] node unlocked.");
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void unlockSession(String sessId) {
        lockMapper.unlockSession(dbAuditService.nodeId(), sessId);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void unlock(Lock lock) {
        lockMapper.unlock(lock);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public Lock getLock(LockType lockType, String lockData) {
        lockMapper.getSyncLock();
        return lockMapper.getLock(lockType.getCode(), lockData);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public Lock lock(LockType lockType, String lockData) {
        lockMapper.getSyncLock();
        Lock lock = lockMapper.getLock(lockType.getCode(), lockData);
        if (lock == null) {
            lock = Lock.createLock(lockType, lockData,
                dbAuditService.nodeId(), dbAuditService.sessId(), dbAuditService.userId());
            lockMapper.lock(lock);
        }
        return lock.toUnlockOnly();
    }

}
