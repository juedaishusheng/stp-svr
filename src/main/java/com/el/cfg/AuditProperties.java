package com.el.cfg;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 16/7/27.
 *
 * @author panlw
 */
@Configuration
@ConfigurationProperties(prefix = "audit")
public class AuditProperties {

    /**
     * 更新产生的程序ID
     */
    @Getter
    @Setter
    private String progId;

    /**
     * 更新发生的节点ID
     */
    @Getter
    @Setter
    private String nodeId;
}
