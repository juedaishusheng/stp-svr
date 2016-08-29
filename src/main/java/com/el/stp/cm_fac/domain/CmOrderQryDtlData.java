package com.el.stp.cm_fac.domain;

import lombok.Data;

import java.util.List;

/**
 * Created by Vincent on 2016/8/17.
 * 子页面的数据domain 包含产品明细、订单排场、生产报工、完工入库、生产记录
 */
@Data
public class CmOrderQryDtlData {
    private CmOrderQryHeadDomain cmOrderQryHeadDomain;//head部分
    private List<CmOrderQryDtlDomain> cmOrderQryDtlDomains;//产品明细
    private List<CmOrderQryOccupyDomain> cmOrderQryOccupyDomains;//订单排场
    private List<CmOrderQrySorptDomain> cmOrderQrySorptDomains;//生产报工
    private List<CmOrderQryProdInDomain> cmOrderQryProdInDomains;//完工入库;
    private List<CmOrderQrySnoteItemDomain> cmOrderQrySnoteItemDomains;//生产记录
}
