package com.el.sys.mapper;

import com.el.sys.domain.DbSeqCounter;
import com.el.test.TestRepositoryConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 16/7/27.
 *
 * @author panlw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestRepositoryConfiguration.class)
@Transactional
@Rollback
public class DbSeqMapperTest {

    private static final String COUNTER_CODE = "ORDER";
    private static final String COUNTER_DESC = "订单流水";
    private static final String COUNTER_KEY = "A20160727";
    private static final int COUNTER_MAX = 9999;

    private DbSeqCounter createCounter() {
        return new DbSeqCounter() {{
            setCounterCode(COUNTER_CODE);
            setCounterDesc(COUNTER_DESC);
            setCounterKey(COUNTER_KEY);
            setCounterMax(COUNTER_MAX);
        }};
    }

    @Autowired
    private DbSeqMapper dbSeqMapper;

    @Test
    public void insertCounter() throws Exception {
        dbSeqMapper.insertCounter(createCounter());
    }

    @Test
    public void selectCounter() throws Exception {
        dbSeqMapper.selectCounter(COUNTER_CODE);
    }

    @Test
    public void updateCounter() throws Exception {
        dbSeqMapper.updateCounter(createCounter());
    }

}
