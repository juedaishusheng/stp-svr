package com.el.stp.sm.service;

import com.el.DataVersionException;
import com.el.cfg.mapper.TDelinoteDeliMapper;
import com.el.stp.sm.domain.TDelinoteDeliDomain;
import com.el.stp.sm.domain.TDelinoteProdDomain;
import com.el.stp.sm.mapper.SmDelinoteManageMapper;
import com.el.sys.domain.DbAudit;
import com.el.sys.service.DbAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 发货通知单处理service
 * Created by xueyu on 2016/8/5.
 */
@Service
public class SmDelinoteManageServiceImpl implements SmDelinoteManageService {

    @Autowired
    private DbAuditService dbAuditService;

    @Autowired
    private SmDelinoteManageMapper smDelinoteManageMapper;

    @Autowired
    private TDelinoteDeliMapper tDelinoteDeliMapper;

    @Transactional
    @Override
    public TDelinoteDeliDomain updateDeli(TDelinoteDeliDomain deli) {
        deli.setAudit(dbAuditService.audit());
        if(deli.getId()!=null){
            int r = smDelinoteManageMapper.updateDeli(deli);
            if (r != 1) {
                throw new DataVersionException(deli);
            }
            return deli;
        }else{
            smDelinoteManageMapper.insertDeli(deli);
            return deli;
        }
    }
    @Transactional
    @Override
    public int delDeli(Long[] ids) {
        if(ids!=null && ids.length>0){
            int r = 0;
            for(Long id:ids){
                r += tDelinoteDeliMapper.deleteByPrimaryKey(id);
            }
            return r;
        }else{
            throw new DataVersionException("删除物流信息时没有找到");
        }
    }

    @Transactional
    @Override
    public int batchUpdatedelinoteProd(List<TDelinoteProdDomain> prodList){
        int r = 0;
        DbAudit audit = dbAuditService.audit();
        for (TDelinoteProdDomain prod:prodList){
            prod.setAudit(audit);
            r+=smDelinoteManageMapper.updatedelinoteProd(prod);
        }
        return r;
    }
}
