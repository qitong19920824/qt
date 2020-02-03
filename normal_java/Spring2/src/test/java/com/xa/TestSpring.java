package com.xa;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * @Author: qitong
 * @Date: 2019/12/4 22:53
 */

public class TestSpring {
    @Test
    public void testc3po() throws Exception {
        //创建数据库
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        //设置数据库连接参数
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/myssm");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        //连接数据库
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
    @Test
    public void testdrubid() throws Exception {
        //创建数据库
        DruidDataSource dataSource=new DruidDataSource();
        //设置数据库连接参数
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/myssm");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //连接数据库
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
    @Test
    public void testjdbcProperties() throws Exception {
        //加载类路径
        ResourceBundle rs=ResourceBundle.getBundle("jdbc");
        //创建数据库
        DruidDataSource dataSource=new DruidDataSource();
        //设置数据库连接参数
        dataSource.setDriverClassName(rs.getString("jdbc.driver"));
        dataSource.setUrl("jdbc:mysql://localhost:3306/myssm");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //连接数据库
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
    @Test
    public void testAnnot() throws Exception{
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
