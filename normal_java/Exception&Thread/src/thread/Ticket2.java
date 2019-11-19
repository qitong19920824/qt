package thread;

/**
 * @Author: qitong
 * @Date: 2019/11/19 22:26
 */

public class Ticket2 implements Runnable {
    private int ticket=500;
    Object lock=new Object();
    @Override
    public void run() {
        while (true){
           synchronized (lock){
               if (ticket>0){
                   try {
                       Thread.sleep(20);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   String name = Thread.currentThread().getName();
                   System.out.println(name+"正在卖"+ticket--);
               }
           }
        }
    }
}
