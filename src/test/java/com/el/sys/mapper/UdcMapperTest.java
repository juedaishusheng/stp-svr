package com.el.sys.mapper;

import com.el.sys.domain.UdcMetas;
import com.el.test.TestRepositoryConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created on 16/7/29.
 *
 * @author panlw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestRepositoryConfiguration.class)
public class UdcMapperTest {

    @Autowired
    private UdcMapper udcMapper;

    @Test
    public void codeNames() throws Exception {
        System.out.println("[APP-TEST] UDC of COUNTRY: " + udcMapper.codeNames(UdcMetas.COUNTRY).size());
    }

    @Test
    public void codeName() throws Exception {
        System.out.println("[APP-TEST] UDC of COUNTRY/NL: " + udcMapper.codeName(UdcMetas.COUNTRY, "NL"));
    }

}
