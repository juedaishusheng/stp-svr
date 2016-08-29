package com.el.cfg.security.realm;

import lombok.Data;

/**
 * @author neo.pan
 * @since 16/8/16
 */
@Data
public class MyCasRealmProperties {

    /**
     * CAS服务器URL
     */
    private String casServiceUrl;

    /**
     * @param appServiceUrl 应用服务URL
     * @return 应用与CAS对接的URL
     */
    public String getEndpointUrl(String appServiceUrl) {
        return appServiceUrl + "/cas";
    }

    /**
     * @param appServiceUrl 应用服务URL
     * @return 单点登录URL
     */
    public String getSsoLoginUrl(String appServiceUrl) {
        return casServiceUrl + "/login?service=" + getEndpointUrl(appServiceUrl);
    }

    /**
     * @param appLogoutUrl 应用登出URL
     * @return 单点登出URL
     */
    public String getSsoLogoutUrl(String appLogoutUrl) {
        return casServiceUrl + "/logout?service=" + appLogoutUrl;
    }
}
