package thread;

/**
 * @Author: qitong
 * @Date: 2019/11/19 22:26
 */

public class Ticket1 implements Runnable {
    private int ticket=500;
    @Override
    public void run() {
        while (true){
            if (ticket>0){
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name+"正在卖"+ticket--);
            }
        }
    }
}
