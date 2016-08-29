package com.el.util;

import org.junit.Test;

import javax.script.Bindings;

import static org.junit.Assert.assertEquals;

/**
 * Created on 16/7/19.
 *
 * @author panlw
 */
public class JsEngineTest {

    public static final String JS_SCRIPTS = "function f01(a, b) { return a > b ? a - b : a + b; }";

    public interface Calculator {
        int f01(int a, int b);
    }

    @Test
    public void loadScripts() throws Exception {
        JsEngine.loadScripts(JS_SCRIPTS);
    }

    @Test
    public void getFunctor() throws Exception {
        Calculator calc = JsEngine.getFunctor(Calculator.class, JS_SCRIPTS);
        assertEquals(1, calc.f01(4, 3));
        assertEquals(7, calc.f01(3, 4));
    }

    public static final String JS_SCRIPTS_V2 = "a > b ? a - b : a + b";

    public static final String JS_SCRIPTS_V3 = "a > 1 ? a * c : a + c";

    @Test
    public void eval() throws Exception {
        Bindings params = JsEngine.createBindings();
        params.put("a", 4);
        params.put("b", 3);
        params.put("c", 2);
        assertEquals(1.0, (double)JsEngine.eval(JS_SCRIPTS_V2, params)/* data type is Double */, 0.1);
        assertEquals(8.0, (double)JsEngine.eval(JS_SCRIPTS_V3, params), 0.1);
    }
}
