package com.el.cfg.security;

import lombok.Getter;

/**
 * Created on 16/7/27.
 *
 * @author panlw
 */
public enum ShiroRole {

    DEV("系统开发"),
    SYS("系统管理"),

    PM("产品管理"),
    // TODO 角色
    ;

    /**
     * 角色描述
     */
    @Getter
    private final String desc;

    ShiroRole(String desc) {
        this.desc = desc;
    }
}
