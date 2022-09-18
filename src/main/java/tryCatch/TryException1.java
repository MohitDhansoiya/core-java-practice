package tryCatch;

public class TryException1 {
    public static void main(String[]args){
        try{
            int data = 100/2;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Rest of code");
    }
}
