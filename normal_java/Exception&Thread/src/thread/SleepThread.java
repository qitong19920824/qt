package thread;

/**
 * @Author: qitong
 * @Date: 2019/11/19 22:49
 */

public class SleepThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if ((i) % 10 == 0) {
                System.out.println("‐‐‐‐‐‐‐" + i);
            }
            System.out.print(i);
            try {
                Thread.sleep(1000);
                System.out.print(" 线程睡眠1秒！\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new SleepThread().start();
    }
}
