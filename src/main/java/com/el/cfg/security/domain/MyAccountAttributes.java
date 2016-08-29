package com.el.cfg.security.domain;

/**
 * Created on 16/7/26.
 *
 * @author panlw
 */
public interface MyAccountAttributes extends Comparable<MyAccountAttributes> {

    /**
     * @return ID
     */
    Long getId();

    /**
     * @return 用户ID
     */
    String getUsername();

    /**
     * @return 用户角色
     */
    String getRole();

    /**
     * @return 其他信息(JSON)
     */
    MyAccountProfile getProfile();
}
