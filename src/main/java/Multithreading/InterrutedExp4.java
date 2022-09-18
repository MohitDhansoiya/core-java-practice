package Multithreading;

public class InterrutedExp4 extends Thread {
    public void run(){
        for(int i = 1; i <= 3; i++){
            System.out.println("doing task ...:"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        InterrutedExp4 ob1 = new InterrutedExp4();
        InterrutedExp4 ob2 = new InterrutedExp4();
        ob1.start();
        ob2.start();
        System.out.println("is thread t1 interrupted..:"+ob1.interrupted());
        ob1.interrupt();
        System.out.println("is thread ob1 interrupted..:"+ob1.interrupted());
        System.out.println("is thread ob2 interrupted..:"+ob2.interrupted());
    }
}
