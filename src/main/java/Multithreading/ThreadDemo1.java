package Multithreading;

public class ThreadDemo1 implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadDemo r1 = new ThreadDemo();
        Thread t1 = new Thread((Runnable) r1);
        t1.start();
    }
}