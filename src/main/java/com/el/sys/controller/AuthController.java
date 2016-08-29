package com.el.sys.controller;

import com.el.sys.domain.MenuTree;
import com.el.sys.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created on 16/7/26.
 *
 * @author panlw
 */
@RestController
@RequestMapping("/api/ui")
public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping("/menus")
    public List<MenuTree> menus() {
        return authService.menuTrees();
    }
}
