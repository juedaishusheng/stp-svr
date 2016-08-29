package com.el.cfg.security.thymeleaf;

import com.el.cfg.security.ShiroUtil;
import com.el.cfg.security.domain.MyAccountAttributes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.attr.AbstractTextChildModifierAttrProcessor;

/**
 * 用于显示账户名
 *
 * @author neo.pan
 * @since 16/8/10
 */
public class AccountAttrProcessor extends AbstractTextChildModifierAttrProcessor {

    protected final transient Logger log = LoggerFactory.getLogger(getClass());

    static AccountAttrProcessor create() {
        return new AccountAttrProcessor();
    }

    private static final String ATTRIBUTE_NAME = "account";
    private static final int PRECEDENCE = 300;

    private AccountAttrProcessor() {
        super(ATTRIBUTE_NAME);
        log.debug("[APP-AUTH] 'shiro:{}' created", ATTRIBUTE_NAME);
    }

    @Override
    public int getPrecedence() {
        return PRECEDENCE;
    }

    @Override
    protected String getText(Arguments arguments, Element element, String attributeName) {
        final MyAccountAttributes accountAttributes = ShiroUtil.accountAttributes();
        return accountAttributes != null ? accountAttributes.getUsername() : element.getAttributeValue(attributeName);
    }
}
