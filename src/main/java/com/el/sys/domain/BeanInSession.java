package com.el.sys.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.io.Serializable;

/**
 * Created on 16/4/2.
 *
 * @author panlw
 */
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public interface BeanInSession extends Serializable {
}
