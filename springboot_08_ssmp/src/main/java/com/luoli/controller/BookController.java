package com.luoli.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.luoli.domain.Book;
import com.luoli.service.BookServiceMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookServiceMP bookServiceMP;

    @GetMapping
    public List<Book> getAll(){
        return bookServiceMP.list();
    }

    @PostMapping
    public Boolean save(@RequestBody Book book){
        return bookServiceMP.save(book);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book){
        return bookServiceMP.updateById(book);
    }
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return bookServiceMP.removeById(id);
    }
    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return bookServiceMP.getById(id);
    }
    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return bookServiceMP.getPage(currentPage,pageSize, null);
    }
}
