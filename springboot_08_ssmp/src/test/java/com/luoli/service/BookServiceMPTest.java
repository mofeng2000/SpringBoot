package com.luoli.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luoli.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceMPTest {
    @Autowired
    private BookServiceMP bookServiceMP;

    @Test
    void testGetById() {
       // Book book = bookDao.getById(1);
        System.out.println(bookServiceMP.getById(1));
    }

    @Test
    void testSave() {
        Book book=new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookServiceMP.save(book);

    }
    @Test
    void testUpdate() {
        Book book=new Book();
        book.setId(9);
        book.setType("测试数据qqq");
        book.setName("测试数据666");
        book.setDescription("测试数据666");
        bookServiceMP.updateById(book);
    }
    @Test
    void testDelete() {

        bookServiceMP.removeById(9);
    }
    @Test
    void testGetAll() {

        System.out.println(bookServiceMP.list());
    }
    @Test
    void testGetPage() {
        IPage<Book> page = new Page<Book>(1, 3);
        bookServiceMP.page(page);
        System.out.println(page.getRecords());//总数据
        System.out.println(page.getPages());//总页数
        System.out.println(page.getTotal());//总条数
        System.out.println(page.getSize());//当前页的数量
        System.out.println(page.getCurrent());//当前页


    }

}
