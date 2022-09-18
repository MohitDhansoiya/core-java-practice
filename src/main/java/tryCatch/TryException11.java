package tryCatch;

public class TryException11 {
    public static void main(String[]args){
        try{
            int a = 30;
            int b = 0;
            int data = 30/0;
            System.out.println(data);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally block always excuteed");
        }
        System.out.println("Rest of code");
    }
}
