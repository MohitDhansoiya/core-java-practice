package tryCatch;

public class TryException7 {
    public static void main(String[]args){
        try{
            String s= null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e){
            System.out.println("Airthmetic Exception Occur");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("Parent Exception occur");
        }
        System.out.println("Rest of code");
    }
}
