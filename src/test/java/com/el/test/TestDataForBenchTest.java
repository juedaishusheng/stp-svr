package com.el.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 16/6/30.
 *
 * @author panlw
 */
public class TestDataForBenchTest {

    //@Test
    public void insert_500_users() throws Exception {
        System.out.println(TestDataForBench.createNewUserSqls(1, 500));
    }

}
