package com.el.util;

import com.el.ApplicationException;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/scripting/prog_guide/api.html">JS Engine API</a>
 *
 * Created on 16/7/18.
 *
 * @author panlw
 */
public final class JsEngine {

    static ScriptEngine engine;
    static {
        ScriptEngineManager engineManager = new ScriptEngineManager();
        engine = engineManager.getEngineByName("nashorn");
    }

    public static void loadScripts(String scripts) {
        try {
            engine.eval(scripts);
        }
        catch (Exception e) {
            throw new ApplicationException("scripts is illegel: " + scripts);
        }
    }

    public static <T> T getFunctor(Class<T> clazz, String scripts) {
        loadScripts(scripts);
        Invocable invocable = (Invocable)engine;
        return invocable.getInterface(clazz);
    }

    public static Bindings createBindings() {
        return engine.createBindings();
    }

    public static Object eval(String scripts, Bindings params) {
        try {
            return engine.eval(scripts, params);
        }
        catch (Exception e) {
            throw new ApplicationException("scripts is illegel: " + scripts);
        }
    }

    private JsEngine() {}
}
