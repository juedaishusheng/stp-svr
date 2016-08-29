package com.el.test;

import com.el.cfg.repository.RepositoryConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created on 16/5/14.
 *
 * @author panlw
 */
@ConfigurationProperties(locations = "classpath:test-jdbc.yml", prefix = "jdbc")
public class TestRepositoryConfigurationProperties extends RepositoryConfigurationProperties {
}
