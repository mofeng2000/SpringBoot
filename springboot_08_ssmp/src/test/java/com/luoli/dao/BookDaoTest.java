package com.luoli.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luoli.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
       // Book book = bookDao.getById(1);
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
        Book book=new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book);

    }
    @Test
    void testUpdate() {
        Book book=new Book();
        book.setId(7);
        book.setType("测试数据666");
        book.setName("测试数据666");
        book.setDescription("测试数据666");
        bookDao.updateById(book);
    }
    @Test
    void testDelete() {

        bookDao.deleteById(7);
    }
    @Test
    void testGetAll() {

        System.out.println(bookDao.selectList(null));
    }
    @Test
    void testGetPage() {
        IPage page=new Page(1,3);
      bookDao.selectPage(page,null);
        System.out.println(page.getRecords());//总数据
        System.out.println(page.getPages());//总页数
        System.out.println(page.getTotal());//总条数
        System.out.println(page.getSize());//当前页的数量
        System.out.println(page.getCurrent());//当前页


    }
    @Test//条件查询
    void testGetBy() {
        QueryWrapper<Book> qw=new QueryWrapper<>();
        qw.like("name","spring");
       bookDao.selectList(qw);
    }
    @Test//条件查询
    void testGetBy2() {
        String name=null;
        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<>();
        lqw.like(name!=null,Book::getName,name);
        bookDao.selectList(lqw);
    }
}
