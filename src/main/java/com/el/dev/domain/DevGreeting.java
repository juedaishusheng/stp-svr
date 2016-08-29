package com.el.dev.domain;

import lombok.Data;
import org.springframework.context.annotation.Profile;

/**
 * Created on 16/3/14.
 *
 * @author panlw
 */
@Profile({"dev", "neo"})
@Data
public class DevGreeting {

    private long id;
    private String content;

    public DevGreeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
