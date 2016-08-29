package com.el.sys.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created on 16/7/23.
 *
 * @author panlw
 */
@Data
@EqualsAndHashCode(of = "menuId")
public class Menu {

    public static final String ALL_ROLES = "*";

    /**
     * 菜单ID
     */
    private String menuId;
    /**
     * 菜单图标
     */
    private String menuIco;
    /**
     * 菜单文字
     */
    private String menuLbl;
    /**
     * 菜单固定(1:不可关闭)
     */
    private int menuFix;
    /**
     * 上级菜单ID
     */
    private String upperId;
    /**
     * 同级菜单顺序
     */
    private int menuOrder;
    /**
     * 能访问该菜单的角色列表(逗号分隔)
     */
    private Set<String> menuRoles;

    public void setMenuRoles(String roles) {
        menuRoles = roles.equals(ALL_ROLES) ? null
            : Arrays.stream(roles.split(",")).collect(Collectors.toSet());
    }

    /**
     * 判断指定角色能否访问该菜单
     *
     * @param role 角色ID
     * @return 能?
     */
    public boolean hasRole(String role) {
        return menuRoles == null || menuRoles.contains(role);
    }
}
