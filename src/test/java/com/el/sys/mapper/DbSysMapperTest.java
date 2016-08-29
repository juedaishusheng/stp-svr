package com.el.sys.mapper;

import com.el.cfg.repository.RepositoryConfiguration;
import com.el.test.TestRepositoryConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created on 16/4/28.
 *
 * @author panlw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestRepositoryConfiguration.class)
public class DbSysMapperTest {

    @Autowired
    private DbSysMapper mapper;

    @Test
    public void now() throws Exception {
        System.out.println("[APP-TEST] now: " + mapper.now());
    }

    @Test
    public void jdeNow() throws Exception {
        System.out.println("[APP-TEST] jdeNow: " + mapper.jdeNow());
    }

    @Test
    public void yyyymmdd() throws Exception {
        System.out.println("[APP-TEST] yyyymmdd: " + mapper.yyyymmdd());
    }

    @Test
    public void yyyymmddNumber() throws Exception {
        System.out.println("[APP-TEST] yyyymmddNumber: " + mapper.yyyymmddNumber());
    }

}
