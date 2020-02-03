package dao;

import dao.IuserDao;
import dao.IuserDaoImpl;

/**
 * @Author: qitong
 * @Date: 2019/12/1 21:59
 */

public class StaticFactoryBean {
    public static IuserDao createBean(){
        return new IuserDaoImpl();
    }
}
