package com.el.sys.service;

import com.el.cfg.security.ShiroUtil;
import com.el.cfg.security.domain.MyAccountAttributes;
import com.el.sys.domain.MenuTree;
import com.el.sys.domain.MenuTreeBuilder;
import com.el.sys.mapper.MenuMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created on 16/5/22.
 *
 * @author panlw
 */
@Component("authService")
public class AuthServiceImpl implements InitializingBean, AuthService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private MenuMapper menuMapper;

    private MenuTreeBuilder menuTreeBuilder;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("[APP-INIT] all menus fetching...");
        menuTreeBuilder = new MenuTreeBuilder(menuMapper.menus());
        log.info("[APP-INIT] all menus fetched.");
    }

    @Override
    public String sessionId() {
        return ShiroUtil.sessionId();
    }

    @Override
    public MyAccountAttributes accountAttributes() {
        return ShiroUtil.accountAttributes();
    }

    @Override
    public String accountName() {
        final MyAccountAttributes accountAttributes = accountAttributes();
        return accountAttributes == null ? "" : accountAttributes.getUsername();
    }

    @Override
    public List<MenuTree> menuTrees() {
        return menuTreeBuilder.menusOf(accountAttributes().getRole());
    }
}
