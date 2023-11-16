package com.luoli.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luoli.dao.CommentDao;
import com.luoli.domain.Comment;
import com.luoli.service.CommentServiceMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceMPImpl extends ServiceImpl<CommentDao,Comment>{

}
