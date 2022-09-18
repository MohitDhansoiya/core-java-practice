package Multithreading;

public class InteruptThread extends Thread {
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Anu");
        }catch (InterruptedException e){
            throw new RuntimeException("Thread interrupted..:"+e);
        }
    }

    public static void main(String[] args) {
        InteruptThread ob = new InteruptThread();
        ob.start();
        try{
            ob.interrupt();
        }catch(Exception e){
            System.out.println("Exception handled:"+e);
        }
    }
}
