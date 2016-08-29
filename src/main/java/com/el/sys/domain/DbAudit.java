package com.el.sys.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * 业务表的审计信息
 * <p>
 * Created on 16/5/21.
 *
 * @author panlw
 */
public class DbAudit {

    /**
     * 更新操作用户的ID
     */
    @Getter
    @Setter
    private Long userId;

    /**
     * 更新发生的时间点
     */
    @Getter
    @Setter
    private Timestamp timeAt;

    /**
     * 更新产生的程序ID
     */
    @Getter
    @Setter
    private String progId;

    /**
     * 更新发生的节点ID
     */
    @Getter
    @Setter
    private String nodeId;
}
