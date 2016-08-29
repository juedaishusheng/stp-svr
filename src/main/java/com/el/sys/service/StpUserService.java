package com.el.sys.service;

import com.el.sys.domain.StpUser;

/**
 * Created on 16/7/28.
 *
 * @author panlw
 */
public interface StpUserService {

    /**
     * 创建新用户
     *
     * @param user 用户信息
     */
    void createUser(StpUser user);

    /**
     * 更新用户信息
     *
     * @param user 用户信息
     */
    void updateUser(StpUser user);

    /**
     * 使指定用户有效
     *
     * @param id      数据ID
     * @param version 数据版本
     */
    void enableUser(Long id, Long version);

    /**
     * 使指定用户无效
     *
     * @param id      数据ID
     * @param version 数据版本
     */
    void disableUser(Long id, Long version);
}
