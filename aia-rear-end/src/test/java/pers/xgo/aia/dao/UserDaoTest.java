package pers.xgo.aia.dao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.xgo.aia.po.UserPo;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    void getOne() {
        System.out.println(userDao);
        System.out.println("11");
        UserPo userPo = userDao.getOne(1l);
        System.out.println(userPo);
        assertNotNull(userPo);
    }
}