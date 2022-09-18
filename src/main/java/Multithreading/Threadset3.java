package Multithreading;

public class Threadset3 extends Thread{
    public void run(){
        System.out.println("running...:"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Threadset3 t1 = new Threadset3();
        Threadset3 t2 = new Threadset3();
        t1.setPriority(4);
        t2.setPriority(5);
        System.out.println("Priority of therad t1 is:"+t1.getPriority());
        System.out.println("Priority of thread t2 is:"+t2.getPriority());
        t1.start();
    }
}
