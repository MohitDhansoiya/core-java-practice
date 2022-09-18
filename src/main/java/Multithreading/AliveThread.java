package Multithreading;

public class AliveThread extends Thread {
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println("is run()method:"+Thread.currentThread().isAlive());
        }catch(InterruptedException e){}
    }

    public static void main(String[] args) {
        AliveThread t1 = new AliveThread();
        System.out.println("before starting thread isAlive:"+t1.isAlive());
        t1.start();
        System.out.println("after starting thread isAlive:"+t1.isAlive());
    }
}
