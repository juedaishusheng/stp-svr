package com.el.cfg.security;

import com.el.cfg.security.filter.AnyRolesAuthorizationFilter;
import com.el.cfg.security.filter.MyCasFilter;
import com.el.cfg.security.filter.MyFormAuthenticationFilter;
import com.el.cfg.security.realm.MyCasRealm;
import com.el.cfg.security.realm.MyJdbcRealm;
import com.el.cfg.security.realm.MySimpleRealm;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.cas.CasFilter;
import org.apache.shiro.config.Ini;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.ServletContainerSessionManager;
import org.apache.shiro.web.session.mgt.WebSessionManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Shiro 配置
 * <ul>
 * <li><a href="http://shiro.apache.org/web.html">Apache Shiro Web Support</a></li>
 * <li><a http://shiro.apache.org/spring.html">Integrating Apache Shiro into Spring-based Applications</a></li>
 * <li><a href="http://stackoverflow.com/questions/31388445/apache-shiro-jdbcrealm-with-javaconfig-and-spring-boot">JdbcRealm</a></li>
 * <li><a href="http://blog.csdn.net/catoop/article/details/50534006">Spring Boot 集成 Shiro 和 CAS</a></li>
 * <li><a href="http://howiefh.github.io/2015/05/19/shiro-cas-single-sign-on/">Shiro & CAS 实现单点登录</a></li>
 * <li><a href="http://stackoverflow.com/questions/28430446/cas-single-logout-not-working">CAS Single logout not working</a></li>
 * </ul>
 * <p>
 * Created on 16/7/20.
 *
 * @author panlw
 */
@Slf4j
@Configuration
public class ShiroConfiguration {

    /*----------------------+
    |   SHIRO FILTER INIT   |
    +======================*/

    private static final String REALM_NAME = "stpRealm";

    @Bean
    @DependsOn("shiroFilter")
    public FilterRegistrationBean shiroFilterRegistrationBean() {
        log.info("[APP-BEAN] shiroFilterRegistrationBean");
        FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
        filterRegistration.setFilter(new DelegatingFilterProxy("shiroFilter"));
        // 该值缺省为false,表示生命周期由SpringApplicationContext管理, 设置为true则表示由ServletContainer管理
        filterRegistration.addInitParameter("targetFilterLifecycle", "true");
        filterRegistration.addUrlPatterns("/*");
        return filterRegistration;
    }

    private ShiroRealmProperties realmProperties;

    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shiroFilter(ShiroRealmProperties realmProperties) throws Exception {
        log.info("[APP-BEAN] shiroFilter: {}", realmProperties);
        this.realmProperties = realmProperties;

        MyShiroFilterFactoryBean shiroFilter = new MyShiroFilterFactoryBean();
        shiroFilter.setSecurityManager(shiroSecurityManager());
        shiroFilter.setLoginUrl(realmProperties.getLoginUrl());

        Map<String, Filter> filters = new LinkedHashMap<>();
        filters.put("cas", shiroCasFilter());
        filters.put("authc", shiroFormAuthenticationFilter());
        filters.put("anyroles", shiroAnyRoleAuthorizationFilter());
        shiroFilter.setFilters(filters);

        final Ini shiroIni = Ini.fromResourcePath("classpath:shiro.ini");
        shiroFilter.setFilterChainDefinitionMap(shiroIni.getSection("urls"));

//        MyFilterChainDefinitionSectionMetaSource sectionMetaSource = new MyFilterChainDefinitionSectionMetaSource();
//        log.debug("---------Ini.Section-----------"+sectionMetaSource.getObject());

        return shiroFilter;
    }

    @Bean
    public CasFilter shiroCasFilter() {
        log.info("[APP-BEAN] shiroCasFilter");
        CasFilter casFilter = new MyCasFilter();
        casFilter.setName("casFilter");
        casFilter.setEnabled(true);
        casFilter.setFailureUrl(realmProperties.getLoginUrl());
        return casFilter;
    }

    @Bean
    public MyFormAuthenticationFilter shiroFormAuthenticationFilter() {
        log.info("[APP-BEAN] shiroAuthenticationFilter");
        return new MyFormAuthenticationFilter();
    }

    @Bean
    public AnyRolesAuthorizationFilter shiroAnyRoleAuthorizationFilter() {
        log.info("[APP-BEAN] shiroAnyRoleAuthorizationFilter");
        return new AnyRolesAuthorizationFilter();
    }

    @Bean
    public SecurityManager shiroSecurityManager() {
        log.info("[APP-BEAN] shiroSecurityManager");
        return new DefaultWebSecurityManager() {{
            //setRealm(shiroJdbcRealm());
            setRealm(shiroRealm());
            setCacheManager(shiroCacheManager());
            setSessionManager(shiroSessionManager());
            //setRememberMeManager(rememberMeManager);
        }};
    }

    @Bean
    public CacheManager shiroCacheManager() {
        log.info("[APP-BEAN] shiroCacheManager");
        return new MemoryConstrainedCacheManager();
    }

    @Bean
    public Realm shiroRealm() {
        switch (realmProperties.getType()) {
            case CAS:
                return shiroCasRealm();
            case SIMPLE:
                return shiroSimpleRealm();
            default:
                return shiroJdbcRealm();
        }
    }

    private Realm shiroCasRealm() {
        log.info("[APP-BEAN] shiroCasRealm");
        return new MyCasRealm() {{
            setCasServerUrlPrefix(realmProperties.getCasServerUrlPrefix());
            setCasService(realmProperties.getCasService());
            setName(REALM_NAME);
            setCacheManager(shiroCacheManager());
        }};
    }

    private Realm shiroJdbcRealm() {
        log.info("[APP-BEAN] shiroJdbcRealm: " + REALM_NAME);
        return new MyJdbcRealm() {{
            setName(REALM_NAME);
            setCacheManager(shiroCacheManager());
        }};
    }

    private Realm shiroSimpleRealm() {
        log.info("[APP-BEAN] shiroSimpleRealm: " + REALM_NAME);
        return new MySimpleRealm(REALM_NAME, realmProperties.getSimple());
    }

    @Bean
    public WebSessionManager shiroSessionManager() {
        log.info("[APP-BEAN] shiroSessionManager");
        return new ServletContainerSessionManager();
//        return new DefaultWebSessionManager() {{
//            setCacheManager(shiroCacheManager());
//            //setGlobalSessionTimeout(1800); // default is 30m = 1800
//            //setSessionValidationInterval(3600); // default is 1h = 3600
//        }};
    }

    @Bean
    public SimpleCookie sessionIdCookie() {
        SimpleCookie cookie = new SimpleCookie();
        cookie.setHttpOnly(true);
        cookie.setMaxAge(-1);
        return cookie;
    }

    /**
     * Callback shiro beans that implements interface {@link org.apache.shiro.util.Initializable} or {@link org.apache.shiro.util.Destroyable}.
     *
     * @return lifecycleBeanPostProcessor
     */
    @Bean
    @ConditionalOnMissingBean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        log.info("[APP-BEAN] lifecycleBeanPostProcessor");
        return new LifecycleBeanPostProcessor();
    }

    /*----------------------+
    |   AOP & ANNOTATIONS   |
    +======================*/

    @Bean
    @ConditionalOnMissingBean
    @DependsOn("lifecycleBeanPostProcessor")
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        log.info("[APP-BEAN] defaultAdvisorAutoProxyCreator");
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
        return defaultAdvisorAutoProxyCreator;
    }

    @Bean
    @ConditionalOnMissingBean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        log.info("[APP-BEAN] authorizationAttributeSourceAdvisor");
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }
}
