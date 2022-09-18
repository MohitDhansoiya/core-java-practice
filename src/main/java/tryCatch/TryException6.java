package tryCatch;

public class TryException6 {
    public static void main(String[]args){
        try {
            int a[] = new int[5];
            a[5]= 30/0;
        }
        catch(ArithmeticException e){
            System.out.println("Airthmetic Exception occur");
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
