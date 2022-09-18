package Multithreading;

public class DumpThread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        thread.setName("My ThreadDump");
        thread.setPriority(6);
        System.out.println("Current thread:"+thread);
        int count = Thread.activeCount();
        System.out.println("Current active thread:"+ thread);
        Thread.dumpStack();
    }
}
