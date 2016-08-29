package com.el.dev;

import com.el.dev.domain.DevGreeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created on 16/3/14.
 *
 * @author panlw
 */
@Profile({"dev", "neo"})
@RestController
@RequestMapping("/dev")
public class DevGreetingController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public DevGreeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        log.debug("[SMS] DevGreeting of " + name);
        return new DevGreeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping("/map_data")
    public Map<BigDecimal, BigDecimal> mapData() {
        return new HashMap<BigDecimal, BigDecimal>() {{
            put(BigDecimal.valueOf(1), BigDecimal.valueOf(1001));
            put(BigDecimal.valueOf(21), BigDecimal.valueOf(2101));
            put(BigDecimal.valueOf(333), BigDecimal.valueOf(3331));
        }};
    }
}
