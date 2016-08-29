package com.el.sys.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 菜单树构造器
 * <p>
 * Created on 16/7/25.
 *
 * @author panlw
 */
public class MenuTreeBuilder {

    private static final Logger log = LoggerFactory.getLogger(MenuTreeBuilder.class);

    private static final MenuTree UPPER_NOT_FOUND = new MenuTree() {
        @Override
        public void addSubTree(MenuTree tree) {
            log.warn("[APP-MENU] upper menu is not found or not accessible: " + tree.menuId());
        }
    };

    private List<Menu> allMenus;

    /**
     * @param allMenus 全部菜单
     */
    public MenuTreeBuilder(List<Menu> allMenus) {
        //log.debug("[APP-MENU] allMenus: " + allMenus);
        this.allMenus = allMenus;
    }

    public List<MenuTree> menusOf(String role) {
        List<MenuTree> trees = allMenus.stream()
            .filter(x -> x.hasRole(role))
            .map(MenuTree::createTree)
            .collect(Collectors.toList());
        //log.debug("[APP-MENU] trees: " + trees);

        List<MenuTree> topTrees = trees.stream()
            .filter(MenuTree::isTopMenu)
            .collect(Collectors.toList());
        //log.debug("[APP-MENU] topTrees: " + trees);

        Map<String, MenuTree> topTreeMap = topTrees.stream()
            .collect(Collectors.toMap(MenuTree::menuId, MenuTree::self));

        trees.stream()
            .filter(MenuTree::isSubMenu)
            .forEach(x -> topTreeMap.getOrDefault(
                x.upperId(), UPPER_NOT_FOUND).addSubTree(x));

        return topTrees;
    }

}
