package com.el.cfg.security.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author neo.pan
 * @since 16/8/16
 */
@Data
@EqualsAndHashCode(of = "username")
public class MyAccountProperties implements MyAccountAttributes {

    /**
     * ID
     */
    private Long id;
    /**
     * 用户ID
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 密码(SALT)
     */
    private String salt;
    /**
     * 用户角色
     */
    private String role;
    /**
     * 其他信息
     */
    private MyAccountProfile profile;

    @Override
    public int compareTo(MyAccountAttributes another) {
        return username.compareTo(another.getUsername());
    }
}
