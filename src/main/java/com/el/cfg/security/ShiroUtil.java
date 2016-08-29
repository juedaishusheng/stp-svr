package com.el.cfg.security;

import com.el.cfg.security.domain.MyAccountAttributes;
import com.el.cfg.security.domain.MyPrincipalCollection;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import java.util.Collection;

/**
 * Created on 16/7/25.
 *
 * @author panlw
 */
public final class ShiroUtil {

    private ShiroUtil() {
        throw new UnsupportedOperationException();
    }

    /**
     * 取得当前用户的账户属性
     *
     * @return 账户属性
     */
    public static MyAccountAttributes accountAttributes() {
        final Subject subject = SecurityUtils.getSubject();
        return subject == null ? null : accountAttributes(subject.getPrincipals());
    }

    /**
     * 取得当前用户的账户属性
     *
     * @return 账户属性
     */
    public static MyAccountAttributes accountAttributes(PrincipalCollection principalCollection) {
        return ((MyPrincipalCollection) principalCollection).getAccountAttributes();
    }

    /**
     * 取得当前回话ID
     *
     * @return 回话ID
     */
    public static String sessionId() {
        return (String) SecurityUtils.getSubject().getSession().getId();
    }

    /**
     * 确认当前用户角色是否在指定角色列表
     *
     * @param roles 角色列表
     * @return 是?
     */
    public static boolean isRoleIn(Collection<String> roles) {
        return roles.stream().anyMatch(ShiroUtil::isRoleOf);
    }

    /**
     * 确认当前用户是指定的角色
     *
     * @param role 角色
     * @return 是?
     */
    public static boolean isRoleOf(String role) {
        return SecurityUtils.getSubject().hasRole(role);
    }

    /**
     * 确认当前用户是指定的角色
     *
     * @param role 角色
     * @return 是?
     */
    public static boolean isRoleOf(ShiroRole role) {
        return isRoleOf(role.name());
    }
}
