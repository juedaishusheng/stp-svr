package com.el.dev.tdd;

import org.junit.Test;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;
import static org.junit.Assert.assertEquals;

/**
 * Created on 16/5/28.
 *
 * @author panlw
 */
public class BigDecimalTest {
    @Test
    public void movePoint() throws Exception {
        BigDecimal dec = BigDecimal.valueOf(499999);

        BigDecimal prc = dec.movePointLeft(4);
        assertEquals(BigDecimal.valueOf(49.9999).setScale(4, HALF_UP), prc);

        BigDecimal amt = prc.multiply(BigDecimal.TEN).movePointRight(2);
        assertEquals(BigDecimal.valueOf(49999.9).setScale(2, HALF_UP), amt);
    }
}
