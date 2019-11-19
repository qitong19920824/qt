package thread;

/**
 * @Author: qitong
 * @Date: 2019/11/19 22:18
 */

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
