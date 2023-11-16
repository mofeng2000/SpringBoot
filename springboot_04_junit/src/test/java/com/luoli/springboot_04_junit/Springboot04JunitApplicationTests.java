package com.luoli.springboot_04_junit;

import com.luoli.dao.BookDao;
import com.luoli.dao.Triangle;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

@RunWith(SpringJUnit4ClassRunner.class)

@SpringBootTest
class Springboot04JunitApplicationTests {
    //1.注入你要测试的对象
    @Autowired
//    private BookDao bookDao;
    private Triangle triangle;


//    @AfterClass
//    void init(){
//        Triangle triangle=new Triangle(3,3,3);
//    }
    //2.执行要测试的对象对相应的方法
    @Test
    void istriangleTest() {
        Triangle triangle=new Triangle(3,3,3);
        boolean istriangle = triangle.istriangle(triangle);
        Assert.assertEquals(true,istriangle);
    }
    @Test
    void getTypeTest() {
        Triangle triangle=new Triangle(4,3,5);
        String type = triangle.getType(triangle);
        Assert.assertEquals("Scalene",type);

    }
    @Test
    void diffOfBordersTest() {
        int len = triangle.diffOfBorders(3,5);
        Assert.assertEquals(2 ,len);
    }
    @Test
    void getBordersTest() {
        Triangle triangle=new Triangle(3,4,5);
        long[] borders = triangle.getBorders();
        long[] mi ={3,4,5};

        Assert.assertEquals(Arrays.toString(mi), Arrays.toString(borders));
    }
}
