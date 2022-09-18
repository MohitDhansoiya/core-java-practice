package Multithreading;

import javax.imageio.stream.ImageInputStream;

public class InterruptExp1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
    InterruptExp1 ob = new InterruptExp1();
    ob.start();
    ob.interrupt();
    }
}

