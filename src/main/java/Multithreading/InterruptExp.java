package Multithreading;

public class InterruptExp extends Thread{
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println("Anu");
        }catch(InterruptedException e){
            System.out.println("Exception handled:"+e);
        }
        System.out.println("threading is running..");
    }

    public static void main(String[] args) {
        InterruptExp ob1 = new InterruptExp();
        InterruptExp ob2 = new InterruptExp();
        ob1.start();
        ob1.interrupt();
    }
}
