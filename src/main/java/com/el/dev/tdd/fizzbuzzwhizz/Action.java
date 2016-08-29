package com.el.dev.tdd.fizzbuzzwhizz;

/**
 * Created on 16/2/26.
 *
 * @author panlw
 */
@FunctionalInterface
public interface Action {

    String to(int n);

    static Action to(String str) {
        return n -> str;
    }

    static Action nop() {
        return n -> String.valueOf(n);
    }
}
