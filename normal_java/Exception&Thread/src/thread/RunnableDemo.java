package thread;

/**
 * @Author: qitong
 * @Date: 2019/11/19 22:19
 */

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();
        //创建线程对象
        Thread t=new Thread(mr,"小强");
        t.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("旺财"+i);
        }
    }
}
