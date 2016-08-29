package com.el.sys.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 数据主键和审计信息
 * <p>
 * Created on 16/7/28.
 *
 * @author panlw
 */
@Data
@ToString(exclude = "audit")
@EqualsAndHashCode(of = "id")
public class DbKey {

    /**
     * 数据ID
     */
    private Long id;

    /**
     * 数据版本
     */
    private Long version;

    /**
     * 审计信息
     */
    private DbAudit audit;

    /**
     * 填充基本信息
     *
     * @param id      数据ID
     * @param version 数据版本
     * @param audit   审计信息
     * @return self
     */
    public DbKey fill(Long id, Long version, DbAudit audit) {
        this.id = id;
        this.version = version;
        this.audit = audit;
        return this;
    }
}
