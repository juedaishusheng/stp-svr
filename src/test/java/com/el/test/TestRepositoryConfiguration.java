package com.el.test;

import com.el.cfg.repository.RepositoryConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 16/7/27.
 *
 * @author panlw
 */

@Configuration
@EnableConfigurationProperties(TestRepositoryConfigurationProperties.class)
public class TestRepositoryConfiguration extends RepositoryConfiguration {
}
