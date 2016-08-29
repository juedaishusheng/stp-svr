package com.el.cfg.security;

import com.el.cfg.security.realm.MyCasRealmProperties;
import com.el.cfg.security.realm.MySimpleRealmProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author neo.pan
 * @since 16/8/16
 */
@Data
@Component("realmProperties")
@ConfigurationProperties("realm")
public class ShiroRealmProperties {

    /**
     * 应用登录URL
     */
    private static final String LOGIN_URL = "/login";
    /**
     * 应用登出URL
     */
    private static final String LOGOUT_URL = "/app_logout";

    /**
     * 应用服务URL
     */
    private String appServiceUrl = "http://localhost:9000";

    /**
     * @return 应用登录URL
     */
    public String getLoginUrl() {
        return type == RealmType.CAS ? cas.getSsoLoginUrl(appServiceUrl) : LOGIN_URL;
    }

    /**
     * @return 应用登出URL
     */
    public String getLogoutUrl() {
        return type == RealmType.CAS ? cas.getSsoLogoutUrl(appServiceUrl + LOGOUT_URL) : LOGOUT_URL;
    }

    public enum RealmType {SIMPLE, JDBC, CAS}

    private RealmType type;

    public boolean isCasRealm() {
        return type == RealmType.CAS;
    }

    private MyCasRealmProperties cas;

    public String getCasServerUrlPrefix() {
        return cas.getCasServiceUrl();
    }

    public String getCasService() {
        return cas.getEndpointUrl(appServiceUrl);
    }

    private MySimpleRealmProperties simple;
}
