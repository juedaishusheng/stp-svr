package com.el.sys.service;

import com.el.cfg.AuditProperties;
import com.el.sys.domain.DbAudit;
import com.el.sys.mapper.DbSysMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 16/4/29.
 *
 * @author panlw
 */
@Service
public class DbAuditServiceImpl implements DbAuditService {

    @Autowired
    private AuditProperties auditProperties;

    @Autowired
    private DbSysMapper dbSysMapper;

    @Autowired
    private AuthService authService;

    @Override
    public String userId() {
        return authService.accountName();
    }

    @Override
    public String sessId() {
        return authService.sessionId();
    }

    @Override
    public String nodeId() {
        return auditProperties.getNodeId();
    }

    @Override
    public DbAudit audit() {
        DbAudit audit = new DbAudit();
        audit.setUserId(authService.accountAttributes().getId());
        audit.setTimeAt(dbSysMapper.now());
        audit.setProgId(auditProperties.getProgId());
        audit.setNodeId(auditProperties.getNodeId());
        return audit;
    }
}
