package com.lit.mp_generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;

import javax.sql.DataSource;


public class Generator {
    public static void main(String[] args) {
        //设置代码生成器
        AutoGenerator autoGenerator=new AutoGenerator();
        DataSourceConfig datasource =new DataSourceConfig();
        datasource.setDriverName("com.mysql.cj.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/mybatisplus_db?serverTimezone=UTC");
        datasource.setPassword("root");
        datasource.setUsername("root");
        autoGenerator.setDataSource(datasource);
        autoGenerator.execute();
        //设计全局配置

    }
}
