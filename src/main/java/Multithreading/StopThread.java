package Multithreading;

public class StopThread extends Thread {
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
        StopThread t1 = new StopThread();
        StopThread t2 = new StopThread();
        StopThread t3 = new StopThread();
        t1.start();
        t2.start();
        t3.stop();
        System.out.println("Thread t3 is Stopped");
    }
}
