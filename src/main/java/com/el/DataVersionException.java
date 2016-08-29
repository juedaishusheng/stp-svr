package com.el;

/**
 * 数据版本异常
 * <p>
 * Created on 16/3/21.
 *
 * @author panlw
 */
public class DataVersionException extends RuntimeException {

    public DataVersionException(Object record) {
        this("Data version exception when update record: " + record);
    }

    public DataVersionException(String message) {
        super(message);
    }
}
