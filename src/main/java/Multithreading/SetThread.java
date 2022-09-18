package Multithreading;

public class SetThread extends Thread{
    public void run(){
        System.out.println("running...:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SetThread t1 = new SetThread();
        SetThread t2 = new SetThread();
        t1.start();
        t2.start();
        t1.setName("Anu");
        t2.setName("Dhansoiya");
        System.out.println(t1.getName()+""+ t2.getName());
    }
}
