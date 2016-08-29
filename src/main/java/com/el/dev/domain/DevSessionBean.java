package com.el.dev.domain;

import com.el.sys.domain.BeanInSession;
import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created on 16/3/28.
 *
 * @author panlw
 */
@Profile({"dev", "neo"})
@Component
@Data
public class DevSessionBean implements BeanInSession {

    private int count;

    public void increase() {
        count += 1;
    }
}
