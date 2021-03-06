package com.el.dev.tdd.fizzbuzzwhizz;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/**
 * Created on 16/2/26.
 *
 * @author panlw
 */
public final class Rules {

    public static Rule atom(Matcher matcher, Action action) {
        return n -> matcher.matches(n) ? action.to(n) : "";
    }

    public static Rule anyof(Rule... rules) {
        return n ->stringStream(n, rules)
                .filter(s -> !s.isEmpty())
                .findFirst()
                .orElse("");
    }

    public static Rule allof(Rule... rules) {
        return n -> stringStream(n, rules)
                .collect(joining());
    }

    private static Stream<String> stringStream(int n, Rule[] rules) {
        return Arrays.asList(rules).stream()
                .map(r -> r.apply(n));
    }

    private Rules() {
    }
}
