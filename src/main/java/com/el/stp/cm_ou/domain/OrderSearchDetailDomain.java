package com.el.stp.cm_ou.domain;

import com.el.cfg.domain.TProd;
import com.el.cfg.domain.TSoFactgroup;
import lombok.Data;

/**
 * Created on 2016/8/16 14:59.
 * 订单明细（订单查询）
 * @author Conway
 */
@Data
public class OrderSearchDetailDomain {
    private String custCode;//客户编号
    private String custName;//客户名称
    private String soNo;//订单编号
    private String agentName;//营业员
    private String soDate;//登记时间
    private String soStatus;//订单状态
    private String acptStatus;//分单状态
    private String distMethod;//分单方式
    private String lineSplitFlag;//是否行拆分
    private String qtySplitFlag;//是否数量拆分
    private String addrNo;//工厂编号
    private String addrName;//工厂名称
    private String accpDate;//接单时间
    private String acptUser;//接单人
    private String distStatus;//分单状态2
    private String clerk;//业务员、营业员
    private String somanuId;//工厂生产表ID
    private String manudistfactId;//手工分单工厂ID
    private String manudistprodId;//手工分单产品ID
    private String dueDate;//要求交期
    private String planDeliDate;//生产交期
    private String manuDueDate;//生产交期
    private String acptTime;//接单时间
    private String soid;//订单ID

    //----------产品明细-----------------|
    private TProd prod;//产品
    private String manuQty;//产品总数
    private String distQty;//分单数量
    private String distQty2;//分单数量（未分单订单）
    private String soprodId;//订单产品ID
    private String manuStatus;//产品状态
    private String whinQty;//入库数量
    private String rptQty;//完工数量
    private String rptNum;//完成比例

    //----------产能需求-----------------|
    private String capaType;//工序类型
    private String capa;//工序合作产能
    private String uom;//单位

    //-----------分单对象----------------|
    private TSoFactgroup soFactgroup;//分单计算工厂分组
    private String productTotalPrice;//产品总价
    private String arguedAmt;//订单价格

}







