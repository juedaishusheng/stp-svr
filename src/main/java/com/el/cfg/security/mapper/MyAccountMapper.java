package com.el.cfg.security.mapper;

import com.el.cfg.security.domain.MyAccountProperties;
import org.apache.ibatis.annotations.Select;

/**
 * Created on 16/7/23.
 *
 * @author panlw
 */
public interface MyAccountMapper {

    /**
     * 根据用户ID查找账户属性
     *
     * @param username 用户ID
     * @return 账户属性
     */
    @Select("select id, username, password, salt, role, profile" +
        " from s_users where enabled = 1 and username = #{username}")
    MyAccountProperties accountOf(String username);
}
