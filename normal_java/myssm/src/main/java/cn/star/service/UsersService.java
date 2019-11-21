package cn.star.service;

import cn.star.domain.Users;

import java.util.List;

/**
 * @Author: qitong
 * @Date: 2019/11/21 21:39
 */

public interface UsersService {
    //查询所有用户
    public List<Users> findAllUser();
    //用户注册
    public void loginInsert(Users user);
    //用户登陆
    public boolean  login(Users user);
}
