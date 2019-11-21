package cn.star.test;

import cn.star.dao.UsersDao;
import cn.star.domain.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: qitong
 * @Date: 2019/11/21 22:50
 */

public class mybatistest {
    @Test
    public void run1() throws Exception{
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("mybatis.xml");

        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(in);
        //创建对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取到代理对象
        UsersDao mapper = sqlSession.getMapper(UsersDao.class);

        List<Users> users = mapper.findAllUser();
        for (Users user : users) {
            System.out.println(user);

        }

        sqlSession.close();
        in.close();
    }
    @Test
    public void run2() throws Exception{
        Users users=new Users();
        users.setUsername("qitong");
        users.setPASSWORD("789");
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("mybatis.xml");

        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(in);
        //创建对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取到代理对象
        UsersDao mapper = sqlSession.getMapper(UsersDao.class);

        mapper.loginInsert(users);

        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}
