package Multithreading;

public class RunExp3 extends Thread {
    public void run(){
        for(int i = 1; i < 6; i++){
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        RunExp3 t1 = new RunExp3();
        RunExp3 t2 = new RunExp3();
        t1.start();
        t2.interrupt();
    }
}
