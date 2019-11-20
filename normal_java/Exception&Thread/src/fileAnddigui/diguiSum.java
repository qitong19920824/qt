package fileAnddigui;

/**
 * @Author: qitong
 * @Date: 2019/11/20 21:19
 */

public class diguiSum {
    public static void main(String[] args) {
        System.out.println(getSum(4));
    }
    public static int getSum(int n){
        if (n==1){
            return 1;
        }
        return n+getSum(n-1);
    }
}
