package cn.star.test;

import cn.star.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: qitong
 * @Date: 2019/11/21 21:56
 */

public class springtest {
    @Test
    public void test(){
        //加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:spring.xml");

        UsersService userservice = (UsersService) ac.getBean("usersService");

        userservice.findAllUser();
    }
}
