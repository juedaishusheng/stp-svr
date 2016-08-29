package com.el.sys.domain;

import java.io.Serializable;

/**
 * Created on 16/4/20.
 *
 * @author panlw
 */
public class CodeName extends KeyValue<String, String> implements Serializable {

    public CodeName() {
    }

    public CodeName(String code, String name) {
        super(code, name);
    }

    public String getCode() {
        return super.getKey();
    }

    public void setCode(String code) {
        super.setKey(code);
    }

    public String getName() {
        return super.getVal();
    }

    public void setName(String name) {
        super.setVal(name);
    }

    @Override
    public String toString() {
        return "CodeName{} " + super.toString();
    }
}
