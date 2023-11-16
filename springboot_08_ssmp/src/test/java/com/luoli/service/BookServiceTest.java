package com.luoli.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luoli.dao.BookDao;
import com.luoli.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    void testGetById() {
       // Book book = bookDao.getById(1);
        System.out.println(bookService.getById(1));
    }

    @Test
    void testSave() {
        Book book=new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.save(book);

    }
    @Test
    void testUpdate() {
        Book book=new Book();
        book.setId(8);
        book.setType("测试数据666");
        book.setName("测试数据666");
        book.setDescription("测试数据666");
        bookService.update(book);
    }
    @Test
    void testDelete() {

        bookService.delete(8);
    }
    @Test
    void testGetAll() {

        System.out.println(bookService.getAll());
    }
    @Test
    void testGetPage() {
        IPage<Book> page = bookService.getPage(1, 3);
        System.out.println(page.getRecords());//总数据
        System.out.println(page.getPages());//总页数
        System.out.println(page.getTotal());//总条数
        System.out.println(page.getSize());//当前页的数量
        System.out.println(page.getCurrent());//当前页


    }

}
