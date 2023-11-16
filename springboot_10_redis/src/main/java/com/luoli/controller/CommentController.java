package com.luoli.controller;

import com.luoli.domain.Comment;
import com.luoli.service.CommentServiceMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired(required = true)
    private CommentServiceMP commentServiceMP;

    @GetMapping
    public List<Comment> getAll() {
        return commentServiceMP.list();
    }

}
