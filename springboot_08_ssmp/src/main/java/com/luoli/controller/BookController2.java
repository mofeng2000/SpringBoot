package com.luoli.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.luoli.domain.Book;
import com.luoli.service.BookServiceMP;
import com.luoli.controller.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private BookServiceMP bookServiceMP;

    @GetMapping
    public R getAll() {
        return new R(true, bookServiceMP.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) {
        // System.out.println(1/0);
        boolean flag = bookServiceMP.save(book);
        return new R(flag, flag ? "添加成功" : "添加失败");
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(bookServiceMP.updateById(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(bookServiceMP.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, bookServiceMP.getById(id));
    }

    //    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
//        IPage<Book> page = bookServiceMP.getPage(currentPage, pageSize);
//        //如果当前页码值大于总页码，那吗重新执行查询操作，使用最大页码作为当前页码值
//        if(currentPage>page.getPages()){
//            page=bookServiceMP.getPage((int)page.getPages(), pageSize);
//        }
//        return new R(true,page);
//    }
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize, Book book) {
        System.out.println(book);
        IPage<Book> page = bookServiceMP.getPage(currentPage, pageSize, book);
        //如果当前页码值大于总页码，那吗重新执行查询操作，使用最大页码作为当前页码值
        if (currentPage > page.getPages()) {
            page = bookServiceMP.getPage((int) page.getPages(), pageSize, book);
        }
        return new R(true, page);
    }
}
