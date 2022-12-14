package Multithreading;

public class DaemonThread extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daaemon thread work");
        } else {
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();
        DaemonThread t3 = new DaemonThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}