package com.el.sys.service;

import com.el.sys.domain.DbAudit;

/**
 * 提供DB数据表审计信息的服务
 * <p>
 * Created on 16/4/29.
 *
 * @author panlw
 */
public interface DbAuditService {

    /**
     * 取得当前用户ID
     *
     * @return 用户ID
     */
    String userId();

    /**
     * 取得当前回话ID
     *
     * @return 回话ID
     */
    String sessId();

    /**
     * 取得应用节点ID
     *
     * @return 应用节点ID
     */
    String nodeId();

    /**
     * 取得审计信息
     *
     * @return 审计信息
     */
    DbAudit audit();
}
