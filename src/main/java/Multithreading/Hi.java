package Multithreading;

class Hi implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println();
            }
        }
    }
}
    class Hello implements Runnable{
        public void run() {
            for (int i = 1; i <= 5;i++ ) {
                System.out.println("Hello");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
            }
        }
    }
    class ThreadDemo {
        public static void main(String[] args) {
            Runnable ob = new Hi();
            Runnable ob2 = new Hello();

            Thread t1 = new Thread(ob);
            Thread t2 = new Thread(ob2);

            t1.start();
            try{Thread.sleep(10);
            }catch (Exception e){
            }
            t2.start();
        }
    }
