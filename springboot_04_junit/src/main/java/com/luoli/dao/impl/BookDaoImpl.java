package com.luoli.dao.impl;

import com.luoli.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("save running...");
    }
}
