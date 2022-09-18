package Multithreading;

public class Threadget1 extends Thread {
    public void run(){
        System.out.println("Thread is running..:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Threadget1 t1 = new Threadget1();
        Threadget1 t2 = new Threadget1();
        System.out.println("Name of t1:"+ t1.getName());
        System.out.println("Name of t2:"+t2.getName());
        t1.start();
        t2.start();
    }
}
