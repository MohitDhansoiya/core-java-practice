package Multithreading;

public class HoldThread implements Runnable {
    public void run(){
        System.out.println("currently executing thread is:"+Thread.currentThread().getName());
        System.out.println("Does thread holds lock:"+Thread.holdsLock(this));
        synchronized (this){
            System.out.println("Does thread holds lock:"+Thread.holdsLock(this));
        }
    }

    public static void main(String[] args) {
        HoldThread ob1 = new HoldThread();
        Thread t1 = new Thread(ob1);
        t1.start();
    }
}
