package com.el.sys.domain;

import lombok.Getter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 16/6/15.
 *
 * @author panlw
 */
public enum LockType {

    ORDER("ORDER", "订单编辑中"),
    ;

    @Getter
    private String code;

    @Getter
    private String desc;

    @Override
    public String toString() {
        return code;
    }

    LockType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private static Map<String, LockType> codeToEnums = new HashMap<>();

    static {
        for (LockType e : values()) {
            codeToEnums.put(e.code, e);
        }
    }

    public static LockType of(String code) {
        LockType e = codeToEnums.get(code);
        if (e == null) {
            throw new IllegalArgumentException("No such enum code: " + code);
        }
        return e;
    }

    public Alert alert(String lockBy) {
        return Alert.lockAlert(desc, Arrays.asList("操作者: " + lockBy));
    }
}
