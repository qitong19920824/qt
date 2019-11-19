import java.util.Scanner;

/**
 * @Author: qitong
 * @Date: 2019/11/19 21:42
 */

public class RegisterTest {
    static String[] names={"bill","hill","nill"};
    public static void main(String[] args) {
        System.out.println("请输入注册姓名");
        String name = new Scanner(System.in).nextLine();
        try {
            checkName(name);
            System.out.println("注册成功");
        } catch (RegisterException e) {
            e.printStackTrace();
        }
    }
    public static boolean checkName(String uname) throws RegisterException{
        for (String name : names) {
            if (name.equals(uname)){
                throw new RegisterException("该名字已经被注册了");
            }
        }
        return true;
    }
}
