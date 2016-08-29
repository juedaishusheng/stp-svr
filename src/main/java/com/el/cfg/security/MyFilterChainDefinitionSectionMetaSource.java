package com.el.cfg.security;

import com.el.cfg.security.domain.MyAccountProperties;
import com.el.cfg.security.mapper.MyAccountMapper;
import lombok.Setter;
import org.apache.shiro.config.Ini;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.config.IniFilterChainResolverFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Simon.Hu on 16/8/26.
 */
public class MyFilterChainDefinitionSectionMetaSource implements FactoryBean<Ini.Section> {

    @Autowired
    private MyAccountMapper myAccountMapper;

    @Setter
    private String filterChainDefinitions;

    @Override
    public Ini.Section getObject() throws Exception {
        Ini ini = new Ini();
        ini.load(filterChainDefinitions);

        Ini.Section section = ini.getSection(IniFilterChainResolverFactory.URLS);
        if (CollectionUtils.isEmpty(section)) {
            section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
        }

        //仅用于测试
        MyAccountProperties accountAttributes = myAccountMapper.accountOf("dev");
        section.put(accountAttributes.getUsername(), accountAttributes.getRole());
        return section;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
