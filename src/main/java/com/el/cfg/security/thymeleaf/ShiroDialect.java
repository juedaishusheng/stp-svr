package com.el.cfg.security.thymeleaf;

import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.processor.IProcessor;

import java.util.HashSet;
import java.util.Set;

/**
 * @author neo.pan
 * @since 16/8/10
 */
public class ShiroDialect extends AbstractDialect {

    private static final String PREFIX = "shiro";

    @Override
    public String getPrefix() {
        return PREFIX;
    }

    private static final Set<IProcessor> processors = new HashSet<>();

    static {
        processors.add(AccountAttrProcessor.create());
        processors.add(AnyRolesAttrProcessor.create());
    }

    @Override
    public Set<IProcessor> getProcessors() {
        return processors;
    }
}
