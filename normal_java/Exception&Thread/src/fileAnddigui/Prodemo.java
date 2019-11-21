package fileAnddigui;

import java.util.Properties;
import java.util.Set;

/**
 * @Author: qitong
 * @Date: 2019/11/21 21:11
 */

public class Prodemo {
    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.setProperty("name","qitong");
        properties.setProperty("age","18");
        properties.setProperty("address","西安");
        System.out.println(properties);
        System.out.println(properties.get("name"));
        System.out.println(properties.getProperty("name"));

        Set<String> sets = properties.stringPropertyNames();
        for (String set : sets) {
            System.out.println(set+":"+properties.getProperty(set));
        }
    }
}
