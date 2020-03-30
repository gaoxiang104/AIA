package pers.xgo.aia.dao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.xgo.aia.enums.BookStatusEnum;
import pers.xgo.aia.po.BookPo;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class BookDaoTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(BookDaoTest.class);

    @Autowired
    private BookDao bookDao;

    @Test
    void insert() {
        BookPo bookPo = new BookPo();
        bookPo.setName("MySQL必知必会");
        bookPo.setDescription("MySQL 入门书籍，必看哦！");
        bookPo.setStatus(BookStatusEnum.HAVE_READ);
        bookPo.setCreateAt(new Date());

        Integer result = bookDao.insert(bookPo);

        LOGGER.info("result : " + result);
        LOGGER.info("bookPo : " + bookPo);

        assertNotNull(result);
    }
}