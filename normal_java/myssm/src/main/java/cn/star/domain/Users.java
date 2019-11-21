package cn.star.domain;

/**
 * @Author: qitong
 * @Date: 2019/11/21 21:38
 */

public class Users {
    private Integer id;
    private String username;
    private String PASSWORD;

    @Override
    public String toString() {
        return "UsersController{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
}
