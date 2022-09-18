package Multithreading;

public class ThreadSuspend extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                sleep(500);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadSuspend t1 = new ThreadSuspend();
        ThreadSuspend t2 = new ThreadSuspend();
        ThreadSuspend t3 = new ThreadSuspend();
        t1.start();
        t2.start();
        t2.suspend();
        t3.start();
    }
}
