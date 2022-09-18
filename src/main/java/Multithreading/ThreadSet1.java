package Multithreading;

public class ThreadSet1 extends Thread {
    public void run(){
        System.out.println("Priority of thread is:"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadSet1 t1 = new ThreadSet1();
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
    }
}
