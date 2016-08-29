package com.el.stp.cm_fac.domain;

import com.el.sys.domain.PagingBean;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by max on 2016/8/12 0012.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OuCondition extends PagingBean {

    /**
     * 公司名称
     */
    private String ouName;
    /**
     * 质量等级
     */
    private String qualifyLevel;

    /**
     * 印刷难度等级
     */
    private String printDiffLevel;

    /**
     * 装订难度等级
     */
    private String bindDiffLevel;

    @Override
    public String toString() {
        return "OuCondition{" +
            "ouName='" + ouName + '\'' +
            ", qualifyLevel='" + qualifyLevel + '\'' +
            ", printDiffLevel='" + printDiffLevel + '\'' +
            ", bindDiffLevel='" + bindDiffLevel + '\'' +
            '}';
    }
}
