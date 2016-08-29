package com.el.cfg.repository;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandler;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Created on 16/7/23.
 *
 * @author panlw
 */
@Configuration
@EnableConfigurationProperties(RepositoryConfigurationProperties.class)
@MapperScan({
    "com.el.cfg.mapper",
    "com.el.cfg.security.mapper",
    "com.el.sys.mapper",
    "com.el.stp.*.mapper",
})
public class RepositoryConfiguration {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private RepositoryConfigurationProperties properties;

    @Primary
    @Bean
    public javax.sql.DataSource dataSource() {
        log.debug("[APP-BEAN] dataSource: " + properties.toString());
        DataSource dataSource = new DataSource();
        dataSource.setPoolProperties(properties);
        return dataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        log.debug("[APP-BEAN] transactionManager");
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        log.debug("[APP-BEAN] sqlSessionFactory");
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setTypeHandlers(new TypeHandler[]{
            new PurifyStringTypeHandler()
        });
        sessionFactoryBean.setDataSource(dataSource());
        return sessionFactoryBean.getObject();
    }
}
