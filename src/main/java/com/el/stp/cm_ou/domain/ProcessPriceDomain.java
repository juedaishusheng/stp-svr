package com.el.stp.cm_ou.domain;
import lombok.Data;
/**
 * 工序价格
 * Created by seven on 16/8/6.
 */

@Data
public class ProcessPriceDomain {

    /**
     * ID
     */
    private  String addrNo;
    /**
     * 工序编号
     */
    private String processCode;

    /**
     * 工序名称
     */
    private String processName;

    /**
     * 工序大类
     */
    private String cat1;

    /**
     * 工序小类
     */
    private String cat2;

    /**
     * 工序子类
     */
    private String cat3;

    /**
     * 工序单价
     */
    private Double price;

    /**
     * 计量单位
     */
    private String priceUom;

}
