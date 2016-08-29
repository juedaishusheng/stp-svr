package com.el.sys.mapper;

import com.el.sys.domain.StpUser;
import com.el.test.TestRepositoryConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static com.el.test.TestDataProvider.TEST_AUDIT;
import static org.junit.Assert.assertEquals;

/**
 * Created on 16/7/28.
 *
 * @author panlw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestRepositoryConfiguration.class)
@Transactional
@Rollback
public class StpUserMapperTest {

    @Autowired
    private StpUserMapper stpUserMapper;

    private static StpUser createUser() {
        return new StpUser() {{
            setUsername("guest");
            setPassword("<password>");
            setRole("GUEST");
            setProfile("{nickName: '^v^'}");
            setVersion(1L);
            setAudit(TEST_AUDIT);
        }};
    }

    @Test
    public void insertUser() throws Exception {
        assertEquals(1, stpUserMapper.insertUser(createUser()));
    }

    @Test
    public void updateUser() throws Exception {
        StpUser user = createUser();
        user.setId(0L);
        assertEquals(1, stpUserMapper.updateUser(user));
    }

    @Test
    public void selectByUsernameLike() throws Exception {
        System.out.println("[APP-TEST] selectByUsernameLike: "
            + stpUserMapper.selectByUsernameLike("m").size());
    }

    @Test
    public void enableUser() throws Exception {
        assertEquals(1, stpUserMapper.enableUser(new StpUser() {{
            setId(0L);
            setVersion(1L);
            setAudit(TEST_AUDIT);
        }}));
    }

    @Test
    public void disableUser() throws Exception {
        assertEquals(1, stpUserMapper.disableUser(new StpUser() {{
            setId(0L);
            setVersion(1L);
            setAudit(TEST_AUDIT);
        }}));
    }
}
