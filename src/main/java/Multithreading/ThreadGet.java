package Multithreading;

public class ThreadGet extends Thread {
    public void run(){
        System.out.println("running thread name is:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGet t1 = new ThreadGet();
        ThreadGet t2 = new ThreadGet();
        System.out.println(" t1 thread priority:"+t1.getPriority());
        System.out.println("t2 thread priority :"+ t2.getPriority());
        t1.start();
        t2.start();
    }
}
