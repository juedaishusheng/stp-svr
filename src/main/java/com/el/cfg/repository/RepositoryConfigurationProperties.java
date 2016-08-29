package com.el.cfg.repository;

import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created on 16/7/27.
 *
 * @author panlw
 */
@ConfigurationProperties(prefix = "jdbc")
public class RepositoryConfigurationProperties extends PoolProperties {

    private static final String SQL_VALIDATION_QUERY = "SELECT 1 FROM DUAL";
    private static final int TIME_BETWEEN_EVICTION_RUNS_MILLIS = 30 * 1000;
    private static final int REMOVE_ABANDONED_TIMEOUT = 60;

    // @see http://tomcat.apache.org/tomcat-8.0-doc/jdbc-pool.html#Inside_the_Apache_Tomcat_Container
    // Commented lines is default settings
    public RepositoryConfigurationProperties() {
        setJmxEnabled(false);
        setDefaultAutoCommit(false);

        //setMaxActive(100);
        //setMaxIdle(getMaxActive());
        //setInitialSize(10);
        //setMinIdle(getInitialSize());

        setValidationQuery(SQL_VALIDATION_QUERY);
        //setMaxWait(30 * 1000);
        //setValidationInterval(30 * 1000);
        setTimeBetweenEvictionRunsMillis(TIME_BETWEEN_EVICTION_RUNS_MILLIS); // 5 * 1000
        //setMinEvictableIdleTimeMillis(60 * 1000);
        setTestOnConnect(true);
        //setTestOnReturn(false);
        //setTestOnBorrow(false);

        setRemoveAbandoned(true);
        setRemoveAbandonedTimeout(REMOVE_ABANDONED_TIMEOUT);
        setLogAbandoned(true);

        setJdbcInterceptors("ConnectionState;StatementFinalizer");
    }

    @Override
    public String toString() {
        return "RepositoryConfig{" +
            "driverClassName='" + getDriverClassName() + '\'' +
            ", url='" + getUrl() + '\'' +
            ", username='" + getUsername() + '\'' +
            ", password='" + getPassword() + '\'' +
            '}';
    }
}
