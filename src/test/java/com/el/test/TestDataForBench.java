package com.el.test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created on 16/6/30.
 *
 * @author panlw
 */
public class TestDataForBench {

    private static final String T_NEW_USER =
        " UNION ALL SELECT 'test_u%d', '9bbb66bda489d8286ff18f8832bbbe399c761237c9d6d0e4029bac1f33e972be'" +
            ", 1, 'DEV', 1, 'DBA', 'admin' FROM DUAL";

    public static String createNewUserSqls(int userIndexFrom, int userCount) {
        return IntStream.range(userIndexFrom, userIndexFrom + userCount)
            .mapToObj(i -> String.format(T_NEW_USER, i))
            .collect(Collectors.joining("\n"));
    }
}
