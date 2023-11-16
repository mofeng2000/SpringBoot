package com.lit;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lit.dao.UserDao;
import com.lit.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
//        //方式一按条件查询
//        QueryWrapper qw=new QueryWrapper();
//        qw.lt("age",18);
//        List<User> users = userDao.selectList(qw);
//        System.out.println(users);
//        //方式二按Lambda条件查询
//        QueryWrapper<User> qw = new QueryWrapper<User>();
//        qw.lambda().lt(User::getAge, 18);
//        List<User> users = userDao.selectList(qw);
//        System.out.println(users);
        //方式三按Lambda条件查询
        LambdaQueryWrapper<User> lqw=new LambdaQueryWrapper<User>();
        lqw.lt(User::getAge, 18);
        List<User> users = userDao.selectList(lqw);
        System.out.println(users);
    }

//    @Test
//    void testGetByPage() {
//        IPage page = new Page(1, 2);
//        userDao.selectPage(page, null);
//        System.out.println("一共多少页: " + page.getPages());
//        System.out.println("当前页码值: " + page.getCurrent());
//        System.out.println("每页显示数: " + page.getSize());
//        System.out.println("一共多少条: " + page.getTotal());
//        System.out.println("数据" + page.getRecords());
//    }


}
