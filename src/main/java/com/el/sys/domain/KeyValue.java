package com.el.sys.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created on 16/4/20.
 *
 * @author panlw
 */
@Data
@EqualsAndHashCode(of = "key")
public class KeyValue<K, V> {
    /**
     * 键
     */
    private K key;
    /**
     * 值
     */
    private V val;

    public KeyValue() {
    }

    public KeyValue(K key, V val) {
        this.key = key;
        this.val = val;
    }
}
