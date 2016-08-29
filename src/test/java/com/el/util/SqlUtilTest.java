package com.el.util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created on 16/5/26.
 *
 * @author panlw
 */
public class SqlUtilTest {

    @Test(expected = NullPointerException.class)
    public void toSqlString_null() throws Exception {
        SqlUtil.toSqlString(null);
    }
    @Test
    public void toSqlString_empty() throws Exception {
        assertEquals("''", SqlUtil.toSqlString(""));
    }
    @Test
    public void toSqlString() throws Exception {
        assertEquals("''''", SqlUtil.toSqlString("'"));
        assertEquals("''''''", SqlUtil.toSqlString("''"));
        assertEquals("'\\%'", SqlUtil.toSqlString("%"));
        assertEquals("'\\_'", SqlUtil.toSqlString("_"));
        assertEquals("'''abc'''", SqlUtil.toSqlString("'abc'"));
        assertEquals("'\\%abc\\_'", SqlUtil.toSqlString("%abc_"));
    }

    @Test(expected = NullPointerException.class)
    public void toSqlLikeString_null() throws Exception {
        SqlUtil.toSqlLikeString(null);
    }
    @Test(expected = IllegalArgumentException.class)
    public void toSqlLikeString_empty() throws Exception {
        SqlUtil.toSqlLikeString("");
    }

    @Test(expected = NullPointerException.class)
    public void toSqlStringSet_null() throws Exception {
        SqlUtil.toSqlStringSet(null);
    }
    @Test
    public void toSqlStringSet_empty() throws Exception {
        assertEquals("()", SqlUtil.toSqlStringSet(new ArrayList<>()));
    }
    @Test
    public void toSqlStringSet_null_only() throws Exception {
        assertEquals("()", SqlUtil.toSqlStringSet(Arrays.asList(null, null)));
    }
    @Test
    public void toSqlStringSet() throws Exception {
        assertEquals("('''','\\%','\\_')", SqlUtil.toSqlStringSet(Arrays.asList("'", "%", "_")));
    }

    @Test(expected = NullPointerException.class)
    public void toSqlNumberSet_null() throws Exception {
        SqlUtil.toSqlNumberSet(null);
    }
    @Test
    public void toSqlNumberSet_null_only() throws Exception {
        assertEquals("()", SqlUtil.toSqlNumberSet(Arrays.asList(null, null)));
    }
    @Test
    public void toSqlNumberSet_empty() throws Exception {
        assertEquals("()", SqlUtil.toSqlNumberSet(new ArrayList<>()));
    }
    @Test
    public void toSqlNumberSet() throws Exception {
        assertEquals("(0,1,10)", SqlUtil.toSqlNumberSet(Arrays.asList(0, 1, 10)));
    }

}
