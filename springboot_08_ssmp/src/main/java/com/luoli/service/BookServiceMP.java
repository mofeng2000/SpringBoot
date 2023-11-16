package com.luoli.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.luoli.domain.Book;

public interface BookServiceMP extends IService<Book> {

    boolean saveBook(Book book);
    IPage<Book> getPage(int currentPage, int pageSize);

    IPage<Book> getPage(Integer currentPage, Integer pageSize, Book book);
}
