package com.el.sys.service;

import com.el.DataVersionException;
import com.el.sys.domain.StpDbKey;
import com.el.sys.domain.StpUser;
import com.el.sys.mapper.StpUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 16/7/28.
 *
 * @author panlw
 */
@Service
public class StpUserServiceImpl implements StpUserService {

    @Autowired
    private DbAuditService dbAuditService;

    @Autowired
    private StpUserMapper stpUserMapper;

    @Transactional
    @Override
    public void createUser(StpUser user) {
        user.setAudit(dbAuditService.audit());
        stpUserMapper.insertUser(user);
    }

    @Transactional
    @Override
    public void updateUser(StpUser user) {
        user.setAudit(dbAuditService.audit());
        if (0 == stpUserMapper.updateUser(user)) {
            throw new DataVersionException(user);
        }
    }

    @Transactional
    @Override
    public void enableUser(Long id, Long version) {
        StpDbKey user = (StpDbKey) new StpDbKey().fill(id, version, dbAuditService.audit());
        if (0 == stpUserMapper.enableUser(user)) {
            throw new DataVersionException(user);
        }
    }

    @Transactional
    @Override
    public void disableUser(Long id, Long version) {
        StpDbKey user = (StpDbKey) new StpDbKey().fill(id, version, dbAuditService.audit());
        if (0 == stpUserMapper.disableUser(user)) {
            throw new DataVersionException(user);
        }
    }
}
