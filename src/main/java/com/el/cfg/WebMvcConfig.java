package com.el.cfg;

import com.el.cfg.security.thymeleaf.ShiroDialect;
import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * MVC层配置
 *
 * Created on 16/3/14.
 *
 * @see <a href="http://www.concretepage.com/spring-4/
 * spring-4-mvc-internationalization-i18n-and-localization-l10n-annotation-example">
 * Spring 4 MVC Internationalization (i18n) and Localization (l10n) Annotation Example</a>
 *
 * @author panlw
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    protected final transient Logger log = LoggerFactory.getLogger(getClass());

    @Bean
    public SpringTemplateEngine templateEngine(
        TemplateResolver templateResolver, MessageSource messageSource) {
        log.debug("[APP-BEAN] templateEngine with shiro:*");
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver);
        engine.addDialect(new LayoutDialect());
        engine.addDialect(new ShiroDialect());
        return engine;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/error");
        registry.addViewController("/login");
    }

    /**
     * Enable request parameters validation by annotation {@link org.springframework.validation.annotation.Validated}.
     * @return
     */
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
