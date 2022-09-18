package Multithreading;

public class GetStackTrace {
    public static void main(String[] args) {
        first();
    }
    public static void first(){
        second();
    }
    public static void second(){
        third();
    }
    public static void third(){
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println("Displaying Stack trace using ");
        for(StackTraceElement st : stackTrace){
            System.out.println(st);
        }
    }
}
