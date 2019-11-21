package cn.star.dao;

import cn.star.domain.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: qitong
 * @Date: 2019/11/21 21:38
 */
@Repository
public interface UsersDao {
    //查询所有用户
    @Select("select * from users")
    public List<Users> findAllUser();
    //用户注册
    @Insert("insert into users (username, PASSWORD) values (#{username},#{PASSWORD})")
    public void loginInsert(Users user);
    //用户登陆
    @Select("select * from users where username=#{username} and PASSWORD=#{PASSWORD}")
    public Users   login(Users user);
}
