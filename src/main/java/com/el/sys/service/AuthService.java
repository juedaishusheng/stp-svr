package com.el.sys.service;

import com.el.cfg.security.domain.MyAccountAttributes;
import com.el.sys.domain.MenuTree;

import java.util.List;

/**
 * 登录用户上下文信息服务
 * <p>
 * Created on 16/7/26.
 *
 * @author panlw
 */
public interface AuthService {

    /**
     * 取得当前登录账户属性
     *
     * @return 账户属性
     */
    MyAccountAttributes accountAttributes();

    /**
     * 取得当前账户名
     *
     * @return 账户名
     */
    String accountName();

    /**
     * 取得当前回话ID
     *
     * @return 回话ID
     */
    String sessionId();

    /**
     * 取得当前用户可访问的菜单树
     *
     * @return 菜单树列表
     */
    List<MenuTree> menuTrees();
}
