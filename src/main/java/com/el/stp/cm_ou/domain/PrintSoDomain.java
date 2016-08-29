package com.el.stp.cm_ou.domain;

import com.el.cfg.domain.TSoManu;
import com.el.util.DateUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @author billy
 * @since 16/8/5.
 * 印刷订单
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PrintSoDomain extends TSoManu{

    private Long soId;
    private String custCode;
    private String custName;
    private String soNo;
    private String agentName;
    private Date soDate;
    public String getSoDateYmd(){return DateUtil.toYmd(getSoDate());}
    private Date dueDate;
    public String getDueDateYmd(){return DateUtil.toYmd(getDueDate());}
    private String acptUser;
    private String qualityLevel;
    private String printDiffLevel;
    private String bindDiffLevel;
    private Integer manuQty;
    private String prodCode;
    private String prodName;
    private String prodType;

}
