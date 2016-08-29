package com.el.sys.domain;

/**
 * Created on 16/7/29.
 *
 * @author panlw
 */
public interface UdcMeta {

    /**
     * @return 所在模块(平台自己的以字母开头，以与JDE区分)
     */
    String getDomainCode();

    /**
     *
     * @return UDC类型
     */
    String getUdcType();
}
