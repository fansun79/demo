package com.sun.demo.dao;

import com.sun.demo.DemoApplication;
import com.sun.demo.entity.Role;
import com.sun.demo.entity.RoleUser;
import com.sun.demo.entity.User;
import com.sun.demo.entity.vo.UserVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@Transactional
@Rollback
public class UserDaoTest {

    private final static Logger logger = LoggerFactory.getLogger(UserDao.class);

    @Resource
    private UserDao userDao;

    @Resource
    private RoleDao roleDao;

    @Resource
    private RoleUserDao roleUserDao;

    @Test
    public void test()
    {

        User user = new User();
        user.setAccountID("account123");
        user.setName("fs");
        user.setPassword("12345678");

        User user_p = this.userDao.save(user);
        logger.info("主键为:{}",user_p);

        User user_s = this.userDao.getOne(user_p.getId());

        Assert.assertEquals(user.getAccountID(),user_s.getAccountID());

    }

    @Test
    public void testFindUsersByRole()
    {
        User user = new User();
        user.setAccountID("account123");
        user.setName("fs");
        user.setPassword("12345678");

        User user_p = this.userDao.save(user);

        Role role = new Role();
        role.setName("admin");
        role.setRemark("");
        Role role_p = roleDao.save(role);

        RoleUser roleUser = new RoleUser();
        roleUser.setRoleId(role_p.getId());
        roleUser.setUserId(user_p.getId());
        this.roleUserDao.save(roleUser);

        List<User> list = this.userDao.findUsersByRole(role_p.getId());
        System.out.println(list);


        List<UserVO> list1 = this.userDao.findUserVOsByRole(role_p.getId());
        System.out.println(list1);

    }

}
