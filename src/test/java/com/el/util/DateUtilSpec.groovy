package com.el.util

import spock.lang.Specification

/**
 * Created on 16/5/19.
 *
 * @author panlw
 */
class DateUtilSpec extends Specification {

    def "days between two dates"() {
        Calendar cal = DateUtil.pureDate();

        expect:
        cal.set(yyyy1, mm1 - 1, dd1)
        Date d1 = cal.getTime();
        cal.set(yyyy2, mm2 - 1, dd2)
        Date d2 = cal.getTime();
        DateUtil.daysBetween(d1, d2) == days

        where:
        yyyy1 | mm1 | dd1 | yyyy2 | mm2 | dd2 | days
        2016  | 1   | 1   | 2016  | 1   | 2   | 1
        2016  | 5   | 19  | 2016  | 6   | 30  | 42
    }

}
