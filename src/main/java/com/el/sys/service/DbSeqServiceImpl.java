package com.el.sys.service;

import com.el.sys.domain.DbSeqCounter;
import com.el.sys.mapper.DbSeqMapper;
import com.el.sys.mapper.LockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 16/5/25.
 *
 * @author panlw
 */
@Service
public class DbSeqServiceImpl implements DbSeqService {

    /**
     * 订单流水原型
     */
    private static final DbSeqCounter ORDER_COUNTER = new DbSeqCounter() {{
        setCounterCode("order");
        setCounterDesc("订单流水");
        setCounterMax(9999);
        setCounterKey("YYYYMMDD");
        setCounterVal(1);
    }};

    @Autowired
    private LockMapper lockMapper;

    @Autowired
    private DbSeqMapper dbSeqMapper;

    /**
     * 发号
     *
     * @param counterTmpl 流水发号原型
     * @param counterKey  流水发号键值
     * @return 下一流水号
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Integer nextSeq(DbSeqCounter counterTmpl, String counterKey) {
        lockMapper.getSyncLock();
        DbSeqCounter counter = dbSeqMapper.selectCounter(counterTmpl.getCounterCode());
        if (counter == null) {
            counter = counterTmpl.createForNewKey(counterKey);
            dbSeqMapper.insertCounter(counter);
        } else {
            dbSeqMapper.updateCounter(counter.next(counterKey));
        }
        return counter.getCounterVal();
    }

    @Override
    public int nextOrderSeq(String key) {
        return nextSeq(ORDER_COUNTER, key);
    }
}
