package com.el.stp.cm_ou.domain;

import com.el.cfg.domain.*;
import lombok.Data;

/**
 * Created on 2016/8/10 9:43.
 *  订单查询
 * @author Conway
 */
@Data
public class OrderSearchDomain{
    private TSoManu soManu;
    private TSoProd soProd;
    private TManudistProd manudistProd;
    private TManudistFact manudistFact;
    private TSo so;
    private TProd prod;
    private TCust cust;
    private String addrNo;//工厂编号
    private String addrName;//工厂名称
    private String completionRate;//完工率
    private String clerk;//营业员

}
