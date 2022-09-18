package others;

import java.util.Scanner;

public class Calculator1 {
    int ab ;
    int ba ;
    int result ;
    Calculator1(int a , int  b){
     this.ab = a;
     this.ba = b;
    }
    void add(){
        result = ab + ba;
        System.out.println("Add Value:"+ result);
    }
    void sub(){
        result = ab - ba;
        System.out.println("Sub Value:"+result);
    }
    void mul(){
        result = ab * ba;
        System.out.println("Mul Value:"+result);
    }
    void calculation(String opertionType){
        if(opertionType.equalsIgnoreCase("add")) {
            result = ab + ba;
        }
         else if(opertionType.equalsIgnoreCase("subtract")) {
            result = ab - ba;
        }
         else if(opertionType.equalsIgnoreCase("multiply")){
            result = ab * ba;
        } else {
            System.out.println("please give the value = add ,sub");
          }
         System.out.println("Reslt is"+ opertionType.toUpperCase()+"result");
    }
}
class TestCal{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("this is calculator");
        System.out.println("add");
        System.out.println("sub");
        System.out.println("mul");
        String  calculation = scan.nextLine();
        System.out.println("Enter the First Value");
        int ab =  scan.nextInt();
        System.out.println("Enter the Second Value");
        int ba = scan.nextInt();
        Calculator1 ct = new Calculator1(ab ,ba);
        ct.calculation(calculation);

    }
}
