package tryCatch;

public class TryException8 {
    public static void main(String[]args){
        try{
            System.out.println("Divide on");
                int b= 30/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            int a []= new int[5];
            a[5] = 4;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        System.out.println("other Statement");
         }
         catch(Exception e){
        System.out.println("Handled ");
        }
        System.out.println("normal flow..");
    }
}
