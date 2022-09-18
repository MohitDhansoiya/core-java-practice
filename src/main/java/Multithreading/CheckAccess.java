package Multithreading;

public class CheckAccess extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException{
        CheckAccess ob1 = new CheckAccess();
        CheckAccess ob2 = new CheckAccess();
        ob1.start();
        ob2.start();
        ob1.checkAccess();
        System.out.println(ob1.getName()+"has access");
        ob2.checkAccess();
        System.out.println(ob2.getName()+"has access");
    }
}
