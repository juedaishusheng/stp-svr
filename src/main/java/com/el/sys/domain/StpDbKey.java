package com.el.sys.domain;

/**
 * Created on 16/7/28.
 *
 * @author panlw
 */
public class StpDbKey extends DbKey {

    public Long getDataVersion() {
        return getVersion();
    }

    public void setDataVersion(Long dataVersion) {
        setVersion(dataVersion);
    }
}
