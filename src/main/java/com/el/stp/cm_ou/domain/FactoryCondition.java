package com.el.stp.cm_ou.domain;

import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author billy
 * @since 16/8/12.
 * 工厂查询条件
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FactoryCondition extends PagingBean{

    /*公司id*/
    private Integer ouId;

    /*公司名称*/
    private String ouName;

    /*质量等级*/
    private String qualifyLevel;

    /*印刷难度等级*/
    private String printDiffLevel;

    /*装订难度等级*/
    private String bindDiffLevel;

}
