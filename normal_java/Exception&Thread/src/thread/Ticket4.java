package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: qitong
 * @Date: 2019/11/19 22:26
 */

public class Ticket4 implements Runnable {
    private int ticket=500;
    Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            if (ticket>0){
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name+"正在卖"+ticket--);
            }
            lock.unlock();
        }
    }
}
