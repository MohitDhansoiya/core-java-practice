package Multithreading;

public class GetStateExp implements Runnable {
    public void run(){
        Thread.State state = Thread.currentThread().getState();
        System.out.println("Running thread name:"+Thread.currentThread().getName());
        System.out.println("State of thread:"+state);
    }

    public static void main(String[] args) {
        GetStateExp g = new GetStateExp();
        Thread t1 = new Thread(g);
        Thread t2 = new Thread(g);
        t1.start();
        t2.start();
    }
}
