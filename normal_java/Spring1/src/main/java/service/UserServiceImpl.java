package service;

import dao.IuserDao;
import domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Properties;

/**
 * @Author: qitong
 * @Date: 2019/12/4 21:42
 */

public class UserServiceImpl implements UserService {
    private List<User> users;

    public void setUsers(List<User> users) {
        this.users = users;
    }
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private IuserDao iuserDao;
    public void setIuserDao(IuserDao iuserDao){
        this.iuserDao=iuserDao;
    }
    public void save() {
        iuserDao.saveuser();
        System.out.println(users);
        System.out.println(properties);
    }
}
