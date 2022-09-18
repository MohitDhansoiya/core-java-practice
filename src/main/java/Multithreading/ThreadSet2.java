package Multithreading;

public class ThreadSet2 extends Thread {
    public void run(){
        System.out.println("Priority of thread is:"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadSet2 t1 = new ThreadSet2();
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();
    }
}
