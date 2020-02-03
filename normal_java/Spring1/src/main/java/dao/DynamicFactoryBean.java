package dao;

/**
 * @Author: qitong
 * @Date: 2019/12/1 22:09
 */

public class DynamicFactoryBean {
    public IuserDao createUserDao(){
        return new IuserDaoImpl();
    }
}
