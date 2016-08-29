package com.el.sys.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * DB 用户数据
 * <p>
 * Created on 16/7/27.
 *
 * @author panlw
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class StpUser extends StpDbKey {

    /**
     * 有效(1)/无效(0)
     */
    private Integer enabled;

    /**
     * 用户ID
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 角色
     */
    private String role;

    /**
     * 其他个人信息(JSON)
     */
    private String profile;
}
