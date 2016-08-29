package com.el.dev.domain;

import com.el.util.DateUtil;
import com.el.util.JdeUtil;
import lombok.Data;

import java.util.Date;

/**
 * Created on 16/5/25.
 *
 * @author panlw
 */
@Data
public class DevSampleDomain {

    private Date someDate;

    /**
     * SQL - SELECT TBL.COL as someDateJde
     * @param jdeDate
     */
    public void setSomeDateJde(Integer jdeDate) {
        someDate = JdeUtil.fromJdeDate(jdeDate);
    }

    /**
     * Thymeleaf - ${someDateYmd}
     * JSON - obj.someDateYmd
     * @return
     */
    public String getSomeDateYmd() {
        return DateUtil.toYmd(someDate);
    }
    /**
     * @param ymdDate
     */
    public void setSomeDateYmd(String ymdDate) {
        someDate = DateUtil.fromYmd(ymdDate);
    }

}
