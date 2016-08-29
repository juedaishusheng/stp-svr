package com.el.sys.mapper;

import com.el.sys.domain.Lock;
import com.el.sys.domain.LockType;
import com.el.test.TestRepositoryConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static com.el.test.TestDataProvider.*;

/**
 * Created on 16/7/27.
 *
 * @author panlw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestRepositoryConfiguration.class)
@Transactional
@Rollback
public class LockMapperTest {

    private static final String LOCK_CODE = "ORDER";
    private static final String LOCK_DATA = "A201607270001";

    private Lock createLock() {
        return Lock.createLock(LockType.valueOf(LOCK_CODE), LOCK_DATA,
            TEST_NODE_ID, TEST_SESS_ID, TEST_USER_ID);
    }

    @Autowired
    private LockMapper lockMapper;

    @Test
    public void getSyncLock() throws Exception {
        lockMapper.getSyncLock();
    }

    @Test
    public void getLock() throws Exception {
        lockMapper.getLock(LOCK_CODE, LOCK_DATA);
    }

    @Test
    public void lock() throws Exception {
        lockMapper.lock(createLock());
    }

    @Test
    public void unlock() throws Exception {
        lockMapper.unlock(createLock());
    }

    @Test
    public void unlockSession() throws Exception {
        lockMapper.unlock(createLock());
    }

    @Test
    public void unlockNode() throws Exception {
        lockMapper.unlockNode(TEST_NODE_ID);
    }

}
