package Multithreading;

import javax.imageio.stream.ImageInputStream;

public class EnumerateExp extends Thread {
    EnumerateExp(String threadname,ThreadGroup tg){
        super(tg,threadname);
        start();
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Exception encounterd");
            }
            System.out.println(Thread.currentThread().getName() + "excuted complte");
        }
    }
        public static void main(String args[]) throws InterruptedException,SecurityException{
            ThreadGroup g1 = new ThreadGroup("Parent thread");
            ThreadGroup g2 = new ThreadGroup(g1,"child thread");
            EnumerateExp ob = new EnumerateExp("Thread-1",g1);
            System.out.println("Starting of thread-2");
            EnumerateExp ob2 = new EnumerateExp("Thread-2",g1);
            System.out.println("Starting of thread-1");
            Thread[] group = new Thread[g1.activeCount()];
            int count = g1.enumerate(group);
            for(int i = 0; i < count ; i++){
                System.out.println(group[i].getName()+"found");
            }
        }
    }

