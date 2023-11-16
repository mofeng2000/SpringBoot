package com.luoli.springboot_04_junit;

import com.luoli.dao.SaleMachine;
import com.luoli.dao.Triangle;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

@RunWith(SpringJUnit4ClassRunner.class)

@SpringBootTest
class Springboot04JunitApplicationTests2 {
    //1.注入你要测试的对象
    @Autowired
//    private BookDao bookDao;
    private SaleMachine saleMachine;

    @Test
    void initialTest() {
        String operation = saleMachine.operation("Beer", "5c");

        Assert.assertEquals("Failure Information\n" + "Money Error",operation);
    }

}
