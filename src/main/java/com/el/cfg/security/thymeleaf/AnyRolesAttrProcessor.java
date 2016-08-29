/*****************************************************************************
 * Copyright (c) 2013, theborakompanioni (http://www.example.org)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ****************************************************************************/

package com.el.cfg.security.thymeleaf;

import com.el.cfg.security.ShiroUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.attr.AbstractConditionalVisibilityAttrProcessor;

import java.util.List;

import static com.el.cfg.security.thymeleaf.ThymeleafFacade.evaluateAsStringsWithDelimiter;
import static com.el.cfg.security.thymeleaf.ThymeleafFacade.getRawValue;

/**
 * @author neo.pan
 * @see <a href="https://github.com/theborakompanioni/thymeleaf-extras-shiro/blob/master/src/main/java/at/pollux/thymeleaf/shiro/processor/attribute/HasAnyRolesAttrProcessor.java">theborakompanioni/thymeleaf-extras-shiro</a>
 * @since 16/8/10
 */
public class AnyRolesAttrProcessor extends AbstractConditionalVisibilityAttrProcessor {

    protected final transient Logger log = LoggerFactory.getLogger(getClass());

    static AnyRolesAttrProcessor create() {
        return new AnyRolesAttrProcessor();
    }

    private static final String DELIMITER = ",";

    private static final String ATTRIBUTE_NAME = "anyroles";
    private static final int PRECEDENCE = 300;

    private AnyRolesAttrProcessor() {
        super(ATTRIBUTE_NAME);
        log.debug("[APP-AUTH] 'shiro:{}' created", ATTRIBUTE_NAME);
    }

    @Override
    public int getPrecedence() {
        return PRECEDENCE;
    }

    @Override
    protected boolean isVisible(Arguments arguments, Element element, String attributeName) {
        String rawValue = getRawValue(element, attributeName);
        List<String> values = evaluateAsStringsWithDelimiter(arguments, rawValue, DELIMITER);
        return ShiroUtil.isRoleIn(values);
    }
}
