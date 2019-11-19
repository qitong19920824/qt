package thread;

/**
 * @Author: qitong
 * @Date: 2019/11/19 22:08
 */

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread=new MyThread("新的线程");
        myThread.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("主线程"+i);
        }
    }
}
