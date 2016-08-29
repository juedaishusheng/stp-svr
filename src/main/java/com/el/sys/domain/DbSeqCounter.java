package com.el.sys.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DB发号计数器
 * <p>
 * Created on 16/6/15.
 *
 * @author panlw
 */
@Data
@EqualsAndHashCode(of = {"counterCode", "counterKey"})
public class DbSeqCounter {
    /**
     * 发号器编码 - S_COUNTERS.COUNTER_CODE
     */
    private String counterCode;

    /**
     * 计数器功能描述 - S_COUNTERS.COUNTER_DESC
     */
    private String counterDesc;

    /**
     * 计数复位条件 - S_COUNTERS.COUNTER_KEY
     */
    private String counterKey;

    /**
     * 计数最大值, 比如9999 - S_COUNTERS.COUNTER_MAX
     */
    private Integer counterMax;

    /**
     * 当前计数值: 1开始 - S_COUNTERS.COUNTER_VAL
     */
    private Integer counterVal = 1;

    /**
     * 为新的发号键创建发号器
     *
     * @param counterKey 发号键
     * @return 发号器
     */
    public DbSeqCounter createForNewKey(String counterKey) {
        DbSeqCounter counter = new DbSeqCounter();
        counter.setCounterCode(counterCode);
        counter.setCounterDesc(counterDesc);
        counter.setCounterMax(counterMax);
        counter.setCounterVal(counterVal);
        counter.setCounterKey(counterKey);
        return counter;
    }

    /**
     * 发下一个号
     *
     * @return self
     */
    public DbSeqCounter next(String counterKey) {
        if (this.counterKey.equals(counterKey)) {
            counterVal += 1;
            checkOverflow();
        } else {
            resetForNewKey(counterKey);
        }
        return this;
    }

    private void checkOverflow() {
        if (counterVal > counterMax) {
            throw new UnsupportedOperationException(
                "Counter value is greater than max value: " + toString());
        }
    }

    private void resetForNewKey(String counterKey) {
        this.counterKey = counterKey;
        counterVal = 1;
    }
}
