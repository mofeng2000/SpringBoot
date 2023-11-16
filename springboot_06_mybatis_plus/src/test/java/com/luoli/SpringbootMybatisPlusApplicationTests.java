package com.luoli;

import com.luoli.dao.BookDao;
import com.sun.tracing.dtrace.Attributes;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {

    @Autowired
    private BookDao bookDao;



    @Test
    void contextLoads() {
        System.out.println(bookDao.selectById(2));
    }

    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }
}
