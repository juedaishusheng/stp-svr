package com.el.sys.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.el.sys.domain.Menu.ALL_ROLES;
import static org.junit.Assert.assertEquals;

/**
 * Created on 16/7/27.
 *
 * @author panlw
 */
public class MenuTreeBuilderTest {

    private MenuTreeBuilder menuTreeBuilder;

    @Before
    public void setUp() throws Exception {
        menuTreeBuilder = new MenuTreeBuilder(createMenus());
    }

    private static List<Menu> createMenus() {
        return Arrays.asList(
            createMenu("pm", "pm001", "PM,DEV"),
            createMenu("pm", "pm002", "DEV,PM,XX"),
            createMenu("ui", "ui001", "DEV"),
            createMenu("ui", "ui002", "DEV,XX"),
            createMenu("", "home", ALL_ROLES),
            createMenu("", "pm", "DEV,PM"),
            createMenu("", "ui", "DEV,XX")
        );
    }

    private static Menu createMenu(String upperId, String id, String roles) {
        return new Menu() {{
            setUpperId(upperId);
            setMenuId(id);
            setMenuRoles(roles);
        }};
    }

    @Test
    public void menusOfDEV() throws Exception {
        String expected = "[MenuTree{home}, MenuTree{pm[pm001,pm002]}, MenuTree{ui[ui001,ui002]}]";
        assertEquals(expected, menuTreeBuilder.menusOf("DEV").toString());
    }

    @Test
    public void menusOfPM() throws Exception {
        String expected = "[MenuTree{home}, MenuTree{pm[pm001,pm002]}]";
        assertEquals(expected, menuTreeBuilder.menusOf("PM").toString());
    }

    @Test
    public void menusOfXX() throws Exception {
        String expected = "[MenuTree{home}, MenuTree{ui[ui002]}]";
        assertEquals(expected, menuTreeBuilder.menusOf("XX").toString());
    }

}
