package com.el.test;

import com.el.sys.domain.DbAudit;

/**
 * Created on 16/6/4.
 *
 * @author panlw
 */
public class TestDataProvider {

    /**
     * 测试会话ID
     */
    public static final String TEST_SESS_ID = "0123456789ABCDEF0123456789ABCDEF";

    /**
     * 测试用户ID
     */
    public static final String TEST_USER_ID = "TEST_USER";
    /**
     * 测试节点ID
     */
    public static final String TEST_NODE_ID = "TEST_NODE";
    /**
     * 测试程序ID
     */
    private static final String TEST_PROG_ID = "TEST_PROG";
    /**
     * 测试审计信息
     */
    public static final DbAudit TEST_AUDIT = new DbAudit() {{
        setProgId(TEST_PROG_ID);
        setNodeId(TEST_NODE_ID);
        setUserId(0L);
    }};
}
