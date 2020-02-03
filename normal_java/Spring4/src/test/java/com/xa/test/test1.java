package com.xa.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

/**
 * @Author: qitong
 * @Date: 2019/12/16 21:58
 */

public class test1 {
    @Test
    public void test1() throws PropertyVetoException {
        ComboPooledDataSource source = new ComboPooledDataSource();
        source.setDriverClass("com.mysql.jdbc.Driver");
        source.setJdbcUrl("jdbc:mysql://localhost:3306/myssm");
        source.setUser("root");
        source.setPassword("root");
        //设置数据源对象
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(source);
        //执行操作
        int i = jdbcTemplate.update("insert into  account values (?,?)", "tome", 5000);
        System.out.println(i);
    }
}
