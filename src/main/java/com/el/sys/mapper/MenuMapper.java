package com.el.sys.mapper;

import com.el.sys.domain.Menu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created on 16/7/25.
 *
 * @author panlw
 */
public interface MenuMapper {

    /**
     * 取得所有菜单信息
     *
     * @return 所有菜单信息
     */
    @Select("select menu as menuId, menu_icon as menuIco, menu_label as menuLbl" +
        ", menu_fixed as menuFix, menu_upper as upperId, menu_order as menuOrder" +
        ", menu_roles as menuRoles from s_menus order by menu_upper, menu_order")
    List<Menu> menus();
}
