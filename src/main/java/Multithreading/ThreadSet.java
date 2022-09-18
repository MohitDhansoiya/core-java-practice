package Multithreading;

public class ThreadSet extends Thread {
    public void run(){
        System.out.println("Priority of thread is:"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadSet t1 = new ThreadSet();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
    }
}
