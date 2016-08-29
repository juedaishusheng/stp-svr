package com.el.cfg.security.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * @author neo.pan
 * @since 16/8/16
 */
@EqualsAndHashCode(of = "userId")
public class MyAccountProfile {

    /**
     * 用户ID
     */
    @Getter
    private Integer userId;

    /**
     * 工厂ID
     */
    @Getter
    private Integer factId;

    /**
     * 分公司ID
     */
    @Getter
    private Integer ouId;

    /**
     * 上级用户ID
     */
    @Getter
    private Integer puserId;

    /**
     * 所属机构（部门）ID
     */
    @Getter
    private Integer orgId;

    public void setUserId(String userId) {
        this.userId = Integer.parseInt(userId);
    }

    public void setFactId(String factId) {
        this.factId = Integer.parseInt(factId);
    }

    public void setOuId(String ouId) {
        this.ouId = Integer.parseInt(ouId);
    }

    public void setPuserId(String puserId) {
        this.puserId = Integer.parseInt(puserId);
    }

    public void setOrgId(String orgId) {
        this.orgId = Integer.parseInt(orgId);
    }
}

