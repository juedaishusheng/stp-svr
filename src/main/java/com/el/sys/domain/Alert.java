package com.el.sys.domain;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * 报红信息
 *
 * Created on 16/6/13.
 *
 * @author panlw
 */
@ToString
public class Alert {
    /**
     * 标题
     */
    @Getter
    private String title;

    /**
     * 消息列表
     */
    @Getter
    private List<String> msgs;

    /**
     * @param title 标题
     * @param msgs 消息列表
     * @return 警告
     */
    public static Alert newAlert(String title, List<String> msgs) {
        Alert alert = new Alert();
        alert.title = title;
        alert.msgs = msgs;
        return alert;
    }

    /**
     * 是否是锁警告?
     */
    private boolean lock;
    public boolean getLock() {
        return lock;
    }

    /**
     * @param title 标题
     * @param msgs 消息列表
     * @return 锁警告
     */
    public static Alert lockAlert(String title, List<String> msgs) {
        Alert alert = newAlert(title, msgs);
        alert.lock = true;
        return alert;
    }
}
