package Multithreading;

public class IsInterrutedExp3 extends Thread {
    public void run(){
        for(int i = 1; i <= 3; i++){
            System.out.println("Doing task ..."+i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
       IsInterrutedExp3 ob1 = new IsInterrutedExp3();
       IsInterrutedExp3 ob2 = new IsInterrutedExp3();
       ob1.start();
       ob2.start();
        System.out.println("is thread interrupted..:"+ob1.isInterrupted());
        System.out.println(" is thread interrupted..:"+ob2.isInterrupted());
        ob1.interrupt();
        System.out.println("is thread interrupted..:"+ob1.isInterrupted());
        System.out.println("is thread interputed..:"+ob2.isInterrupted());
    }
}
