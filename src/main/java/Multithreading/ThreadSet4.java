package Multithreading;

public class ThreadSet4 extends Thread {
    public void run(){
        System.out.println("running....");
    }

    public static void main(String[] args) {
        ThreadSet4 t1 = new ThreadSet4();
        ThreadSet4 t2 = new ThreadSet4();
        t1.setPriority(12);
        t2.setPriority(7);
        System.out.println("Priority of thread t1 is:"+t1.getPriority());
        System.out.println("Priority of thread is:"+t2.getPriority());
        t1.start();
    }
}
