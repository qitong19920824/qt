package thread;

/**
 * @Author: qitong
 * @Date: 2019/11/19 22:08
 */

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(getName()+"正在执行"+i);
        }
    }
}
