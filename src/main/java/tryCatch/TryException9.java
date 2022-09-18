package tryCatch;

public class TryException9 {
    public static void main(String[]args){
        try{
            int data = 30;
            System.out.println(data);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally Block Always Executed");
        }
        System.out.println("Rest of code");
    }
}
