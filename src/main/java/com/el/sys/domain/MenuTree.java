package com.el.sys.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 16/7/25.
 *
 * @author panlw
 */
public class MenuTree {

    public MenuTree self() {
        return this;
    }

    @Getter
    private Menu menu;

    public String menuId() {
        return menu.getMenuId();
    }

    public String upperId() {
        return menu.getUpperId();
    }

    public boolean isTopMenu() {
        return upperId().isEmpty();
    }

    public boolean isSubMenu() {
        return !isTopMenu();
    }

    @Getter
    private List<MenuTree> subs;

    public void addSubTree(MenuTree tree) {
        if (subs == null) {
            subs = new ArrayList<>();
        }
        subs.add(tree);
    }

    public static MenuTree createTree(Menu menu) {
        MenuTree tree = new MenuTree();
        tree.menu = menu;
        return tree;
    }

    @Override
    public int hashCode() {
        return menuId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && menuId().equals(((MenuTree) obj).menuId());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MenuTree{").append(menuId());
        if (subs != null) {
            sb.append("[").append(
                subs.stream()
                    .map(MenuTree::menuId)
                    .collect(Collectors.joining(","))
            ).append("]");
        }
        sb.append("}");
        return sb.toString();
    }
}
