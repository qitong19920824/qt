package cn.star.service.impl;

import cn.star.dao.UsersDao;
import cn.star.domain.Users;
import cn.star.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: qitong
 * @Date: 2019/11/21 21:39
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public List<Users> findAllUser() {
        System.out.println("用户查询");
        return usersDao.findAllUser();
    }

    @Override
    public void loginInsert(Users user) {
        System.out.println("用户注册");
        usersDao.loginInsert(user);
    }

    @Override
    public boolean login(Users user) {
        System.out.println("用户登陆");
        usersDao.login(user);
        if(usersDao.login(user)==null){
            return false;
        }else{
            return true;
        }
    }
}
