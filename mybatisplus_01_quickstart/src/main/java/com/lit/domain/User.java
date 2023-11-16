package com.lit.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

//lombok
@TableName("user")//对应表名
@Data
public class User {
    private Long id;
    private String name;
    //@TableField(value = "pwd")//对应数据库的字段
    @TableField(value = "pwd", select = false)
    private String password;
    private Integer age;
    private String tel;
    @TableField(exist = false)//设计数据库字段不存在
    private Integer online;


    //逻辑删除字段，标记当前字段是否删除
    @TableLogic(value = "0",delval = "1")
    private Integer deleted;
    @Version
    private Integer version;//设置乐观锁
}
