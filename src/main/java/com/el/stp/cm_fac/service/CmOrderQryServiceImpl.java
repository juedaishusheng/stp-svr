package com.el.stp.cm_fac.service;

import com.el.stp.cm_fac.mapper.CmOrderQryMapper;
import com.el.stp.cm_fac.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vincent on 2016/8/9.
 * cm209的service实现类
 */
@Service
public class CmOrderQryServiceImpl implements CmOrderQryService {

    @Autowired
    private CmOrderQryMapper cmOrderQryMapper;

    @Override
    public CmOrderQryDtlData queryOrderDtlData(Integer soId) {
        CmOrderQryDtlData cmOrderDtlData = new CmOrderQryDtlData();

        CmOrderQryHeadDomain cmOrderQryHeadDomain = this.queryOrderHead(soId);
        List<CmOrderQryDtlDomain> cmOrderQryDtlDomains = this.queryOrderDtl(soId);
        List<CmOrderQryOccupyDomain> cmOrderQryOccupyDomains = this.queryOrderOccupy(soId);
        List<CmOrderQrySorptDomain> cmOrderQrySorptDomains = this.queryOrderSorpt(soId);
        List<CmOrderQryProdInDomain> cmOrderQryProdInDomains = this.queryOrderProdIn(soId);
        List<CmOrderQrySnoteItemDomain> cmOrderQrySnoteItemDomains = this.queryOrderSnoteItem(soId);
        cmOrderDtlData.setCmOrderQryHeadDomain(cmOrderQryHeadDomain);
        cmOrderDtlData.setCmOrderQryDtlDomains(cmOrderQryDtlDomains);
        cmOrderDtlData.setCmOrderQryOccupyDomains(cmOrderQryOccupyDomains);
        cmOrderDtlData.setCmOrderQrySorptDomains(cmOrderQrySorptDomains);
        cmOrderDtlData.setCmOrderQryProdInDomains(cmOrderQryProdInDomains);
        cmOrderDtlData.setCmOrderQrySnoteItemDomains(cmOrderQrySnoteItemDomains);
        return cmOrderDtlData;
    }

    @Override
    public List<CmOrderQryMainDomain> queryOrderMain(CmOrderQryMainCondition cmOrderQryMainCondition) {
        Integer count = cmOrderQryMapper.queryOrderCount(cmOrderQryMainCondition);
        cmOrderQryMainCondition.setRowCount(count);
        return count > 0 ? cmOrderQryMapper.queryOrderMain(cmOrderQryMainCondition) : null;
    }

    @Override
    public CmOrderQryHeadDomain queryOrderHead(Integer soId) {
        CmOrderQryHeadDomain cmOrderQryHeadDomain = cmOrderQryMapper.queryOrderHead(soId);
        return cmOrderQryHeadDomain;
    }

    @Override
    public List<CmOrderQryDtlDomain> queryOrderDtl(Integer soId) {
        List<CmOrderQryDtlDomain> cmOrderQryDtlDomains = cmOrderQryMapper.queryOrderDtl(soId);
        return cmOrderQryDtlDomains;
    }

    @Override
    public List<CmOrderQryProdProcessDomain> queryOrderProdProcess(Integer prodId) {
        List<CmOrderQryProdProcessDomain> cmOrderQryProdProcessDomains = cmOrderQryMapper.queryOrderProdProcess(prodId);
        return cmOrderQryProdProcessDomains;
    }

    @Override
    public List<CmOrderQryOccupyDomain> queryOrderOccupy(Integer soId) {
        return cmOrderQryMapper.queryOrderOccupy(soId);
    }

    @Override
    public List<CmOrderQrySorptDomain> queryOrderSorpt(Integer soId) {
        List<CmOrderQrySorptDomain> sorptDomains = cmOrderQryMapper.queryOrderSorpt(soId);
        return sorptDomains;
    }

    @Override
    public List<CmOrderQryProdInDomain> queryOrderProdIn(Integer soId) {
        return cmOrderQryMapper.queryOrderProdIn(soId);
    }

    @Override
    public List<CmOrderQrySnoteItemDomain> queryOrderSnoteItem(Integer soId) {
        return cmOrderQryMapper.queryOrderSnoteItem(soId);
    }
}
