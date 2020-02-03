package com.xa.Impl;

import com.xa.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: qitong
 * @Date: 2019/12/5 22:06
 */
@Repository("userDao")
@Scope("singleton")
public class UserDaoImpl implements UserDao {
    @Value("字符串")
    private String str;
    @Value("${jdbc.driver}")
    private String driver;
    @PostConstruct
    public void init(){
        System.out.println("init");
    }
    @Override
    public void save() {
        System.out.println("something saving ....");
        System.out.println(str);
        System.out.println(driver);
    }
    @PreDestroy
    public void destory(){
        System.out.println("destory");
    }
}
