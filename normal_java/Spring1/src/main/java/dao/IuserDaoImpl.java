package dao;

import java.util.List;

/**
 * @Author: qitong
 * @Date: 2019/11/26 21:13
 */

public class IuserDaoImpl implements IuserDao {
    private String name;
    private String gender;
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void saveuser() {
        System.out.println("UserDao save somthing");
        System.out.println(name+gender);
        System.out.println(list);
    }
}
