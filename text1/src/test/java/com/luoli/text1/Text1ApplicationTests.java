package com.luoli.text1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)

@SpringBootTest
        //(classes = Text1Application.class)
//@ContextConfiguration(classes = Text1Application.class)
class Text1ApplicationTests {

    //1.注入你要测试的对象
    @Autowired
    private Triangle triangle;
//

    @Test
    void contextLoads() {
        //2.执行要测试的对象对相应的方法
        System.out.println(111);
        triangle.getBorders();
        //triangle.istriangle(triangle);
    }

}
