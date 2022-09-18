package Multithreading;

public class IdThread extends Thread {
    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        IdThread t1 = new IdThread();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Id of t1:"+t1.getId());
        t1.start();
    }
}
