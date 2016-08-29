package com.el.stp.sm.domain;

import com.el.cfg.domain.TDelinoteDeli;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by xuzhe on 2016/8/3.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DelinoteDeliDomain extends TDelinoteDeli {
    private String docNo;
    private String soNo;
    private String custCode;
    private String custName;
    private String prodName;
    private String prodCode;
    private String ouName;
    private Date demandDeliDate;

    public String getDeliDateYmd() {
        return DateUtil.toYmd(getDeliDate());
    }

    public String getDemandDeliDateYmd() {
        return DateUtil.toYmd(getDemandDeliDate());
    }


    /**
     * 销售订单正数 - T_DELINOTE_PROD.SOPROD_QTY
     */
    private Long soprodQty;


    /**
     * 要求发货数量 - T_DELINOTE_PROD.DEMAND_DELI_QTY
     */
    private Long demandDeliQty;

    /**
     * 要求赠送数量 - T_DELINOTE_PROD.DEMAND_GIFT_QTY
     */
    private Long demandGiftQty;

    /**
     * 累计发货数量 - T_DELINOTE_PROD.SUM_DELI_QTY
     */
    private Long sumDeliQty;

    /**
     * 累计赠送数量 - T_DELINOTE_PROD.SUM_GIFT_QTY
     */
    private Long sumGiftQty;

    /**
     * 单位 - T_DELINOTE_PROD.UOM
     */
    private String uom;

    /**
     * 单位重量 - T_DELINOTE_PROD.UOM_WEIGHT
     */
    private BigDecimal uomWeight;

    /**
     * 总重量 - T_DELINOTE_PROD.WEIGHT
     */
    private BigDecimal weight;

    /**
     * 打包方式 - T_DELINOTE_PROD.PACKAGE_METHOD
     */
    private String packageMethod;

    /**
     * 每箱本数 - T_DELINOTE_PROD.QTY_PERPACKAGE
     */
    private Long qtyPerpackage;

    /**
     * 箱数 - T_DELINOTE_PROD.PACKAGE_QTY
     */
    private Long packageQty;

    /**
     * 余数 - T_DELINOTE_PROD.SPARE_QTY
     */
    private Long spareQty;

    /**
     * 送货地址号 - T_DELINOTE_PROD.DELI_ADDR_NO
     */
    private Long deliAddrNo;


    /**
     * 送货联系人 - T_DELINOTE_PROD.CONT_PERSON
     */
    private String contPerson;

    /**
     * 联系电话 - T_DELINOTE_PROD.CONT_TEL
     */
    private String contTel;

    /**
     * 备注 - T_DELINOTE_PROD.REMARK
     */
    private String remark;

}
