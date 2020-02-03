package domain;

/**
 * @Author: qitong
 * @Date: 2019/12/4 22:17
 */

public class User {
    private String country;
    private String lanuage;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLanuage(String lanuage) {
        this.lanuage = lanuage;
    }

    @Override
    public String toString() {
        return "User{" +
                "country='" + country + '\'' +
                ", lanuage='" + lanuage + '\'' +
                '}';
    }
}
