package tryCatch;

public class TryException10 {
    public static void main(String[]args){
        try{
            int a = 30;
            int b = 2;
            int data = 30/2;
            System.out.println(data);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block is always Executed");
        }
        System.out.println("rest of code");
    }
}
