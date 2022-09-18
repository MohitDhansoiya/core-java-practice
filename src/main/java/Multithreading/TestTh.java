package Multithreading;

public class TestTh extends Thread{
    public void run(){
        System.out.println("child thread");
        System.out.println("child thread priority:"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println("Main thread old priority:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("Main thread new priority:"+Thread.currentThread().getPriority());
        TestTh t = new TestTh();
        t.start();
    }
}
