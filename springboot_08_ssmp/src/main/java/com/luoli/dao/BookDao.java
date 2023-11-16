package com.luoli.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luoli.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper//MP做法
public interface BookDao extends BaseMapper<Book> {
    //mybatis做法
//    @Select("select * from  tbl_book where id=#{id}")
//    Book getById(Integer id);

}
