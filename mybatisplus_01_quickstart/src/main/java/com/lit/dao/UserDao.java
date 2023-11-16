package com.lit.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lit.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {

}
