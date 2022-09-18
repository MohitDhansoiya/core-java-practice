package Multithreading;

public class DestroyThread extends Thread{
    DestroyThread(String threadname,ThreadGroup tg){
        super(tg ,threadname);
        start();
    }
    public void run(){
        for(int i = 0; i < 2; i++){
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException,SecurityException
    {
        ThreadGroup g1 = new ThreadGroup("Parent thread");
        ThreadGroup g2 = new ThreadGroup(g1,"child thread");

        DestroyThread t1 = new DestroyThread("Thread-1",g1);
        DestroyThread t2 = new DestroyThread("Thread-2",g2);
        t1.join();
        t2.join();
        g2.destroy();
        System.out.println(g2.getName()+"  destroyed");
        g1.destroy();
        System.out.println(g1.getName()+"  destroyed");
    }
}
