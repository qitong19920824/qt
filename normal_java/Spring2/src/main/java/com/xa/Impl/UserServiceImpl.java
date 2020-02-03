package com.xa.Impl;

import com.xa.UserDao;
import com.xa.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: qitong
 * @Date: 2019/12/5 22:08
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;
    @Override
    public void save() {

    }
}
