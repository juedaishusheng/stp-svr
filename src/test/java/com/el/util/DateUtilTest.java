package com.el.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

/**
 * Created on 16/4/28.
 *
 * @author panlw
 */
public class DateUtilTest {

    @Test
    public void toYmd() throws Exception {
        Calendar cal = DateUtil.pureDate();
        cal.set(2016, 4 - 1, 28);
        Assert.assertEquals("2016-4-28", DateUtil.toYmd(cal.getTime()));
    }

    @Test
    public void fromYmd() throws Exception {
        Calendar cal = DateUtil.pureDate();
        cal.set(2016, 4 - 1, 28);
        Assert.assertEquals(cal.getTime(), DateUtil.fromYmd("2016-4-28"));
    }

}
