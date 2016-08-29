package com.el.sys.mapper;

import com.el.test.TestRepositoryConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created on 16/7/27.
 *
 * @author panlw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestRepositoryConfiguration.class)
public class MenuMapperTest {

    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void menus() throws Exception {
        System.out.println("[APP-TEST] menus: " + menuMapper.menus().size());
    }

}
