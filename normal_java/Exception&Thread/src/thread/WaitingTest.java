package thread;

/**
 * @Author: qitong
 * @Date: 2019/11/19 22:59
 */

public class WaitingTest {
    public static Object object;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (object) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "获取锁对象，调用wait方法" +
                                    "，进入waitting状态，释放锁对象");
                            object.wait(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "=== 从waiting状 " +
                                "态醒来，获取到锁对象，继续执行了");
                    }
                }
            }
        }, "等待线程").start();
        new Thread(new Runnable() {
            @Override
            public void run() { //
                while (true){ //
                    try {System.out.println( Thread.currentThread().getName() +"‐‐‐‐‐ 等待3秒钟");
                        Thread.sleep(3000); }
                        catch (InterruptedException e) {
                        e.printStackTrace(); }
                        synchronized (object){
                        System.out.println( Thread.currentThread().getName() +"‐‐‐‐‐ 获取到锁对 象,调用notify方法，释放锁对象"); object.notify(); } }
            }
        });
    }}