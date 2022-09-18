package Multithreading;

public class ThreadActive extends Thread{
    ThreadActive(String threadname , ThreadGroup tg){
        super(tg,threadname);
        start();
    }
    public void run(){
        System.out.println("runnning thread name is:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroup ob1 = new ThreadGroup("parent thread group");
        ThreadActive t1 = new ThreadActive("Thread-1",ob1);
        ThreadActive t2 = new ThreadActive("Thread-2",ob1);
        System.out.println("number of active thread:"+ob1.activeCount());
    }
}
