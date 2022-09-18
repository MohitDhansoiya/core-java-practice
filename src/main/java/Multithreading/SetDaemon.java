package Multithreading;

public class SetDaemon extends Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread work");
        }
        else{
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        SetDaemon ob1 = new SetDaemon();
        SetDaemon ob2 = new SetDaemon();
        SetDaemon ob3 = new SetDaemon();

        ob1.setDaemon(true);
        ob1.start();
        ob2.setDaemon(true);
        ob2.start();
        ob3.start();
    }
}
