package com.el.util

import spock.lang.Specification

import static java.util.Calendar.*

/**
 * Created on 16/4/24.
 *
 * @author panlw
 */
class JdeUtilSpec extends Specification {

    def "Decimal number 3 is 1000"() {
        expect:
        JdeUtil.dec2zoom(3) == 1000
    }

    def "Java date -> JDE date"() {
        Calendar cal = DateUtil.pureDate();

        expect:
        cal.set(yyyy, mm - 1, dd)
        JdeUtil.toJdeDate(cal.getTime()) == jdeDate

        where:
        yyyy | mm | dd | jdeDate
        2016 | 1  | 1  | 116001
        2005 | 1  | 31 | 105031
        2007 | 9  | 20 | 107263
        1998 | 5  |  9 | 98129
    }
    def "JDE date -> Java date"() {
        Calendar cal = DateUtil.pureDate();

        expect:
        cal.set(yyyy, mm - 1, dd)
        JdeUtil.fromJdeDate(jdeDate) == cal.getTime()

        where:
        yyyy | mm | dd | jdeDate
        2016 | 1  | 1  | 116001
        2005 | 1  | 31 | 105031
        2007 | 9  | 20 | 107263
        1998 | 5  |  9 | 98129
    }

    def "Java time -> JDE time"() {
        Calendar cal = DateUtil.pureDate();

        expect:
        cal.set(HOUR_OF_DAY, h);
        cal.set(MINUTE, m);
        cal.set(SECOND, s);
        JdeUtil.toJdeTime(cal.getTime()) == jdeTime

        where:
        h  | m  | s  | jdeTime
        5  | 1  | 0  |  50100
        15 | 19 | 11 | 151911
        20 | 5  | 5  | 200505
    }

    def "JDE time -> Java time"() {
        Calendar cal = DateUtil.pureDate();

        expect:
        cal.set(HOUR_OF_DAY, h);
        cal.set(MINUTE, m);
        cal.set(SECOND, s);
        JdeUtil.fromJdeTime(jdeTime) == cal.getTime()

        where:
        h  | m  | s  | jdeTime
        5  | 1  | 0  |  50100
        15 | 19 | 11 | 151911
        20 | 5  | 5  | 200505
    }

    def "convert to int number for jde"() {
        expect:
        JdeUtil.toIntNumber(BigDecimal.valueOf(dec)) == num

        where:
        dec   | num
        12.49 | 12
        12.50 | 13
        12.51 | 13
    }
}
