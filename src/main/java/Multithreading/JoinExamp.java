package Multithreading;

public class JoinExamp extends Thread {
    public void run(){
        for(int i = 1; i <= 4; i++){
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoinExamp t1 = new JoinExamp();
        JoinExamp t2 = new JoinExamp();
        JoinExamp t3 = new JoinExamp();
        t1.start();
        try{
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
