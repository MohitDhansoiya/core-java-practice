package others;

import java.util.Scanner;;

public class ScannerDemo2 {
    int a;
    int b;
    int result = 0;
    ScannerDemo2(int a,int b){
        this.a = a;
        this.b = b;
    }
    void value(){
        System.out.println("Welcome in calculator");
    }
    void add(){
        result = a + b ;
        System.out.println("Add value is:"+result);
    }
    void Subtract(){
        result = a - b;
        System.out.println("Subtract value is:"+result);
    }
    void multiply(){
        result = a * b;
        System.out.println("Multiple value is:"+result);
    }
    void divide(){
        result = a /b;
        System.out.println("Divide value is:"+result);
    }
    void opertaion(String operationType){
        if(operationType .equalsIgnoreCase("add")){
            result = a+b;
        }
        if(operationType.equalsIgnoreCase("subtract")){
            result = a -b;
        }
        if(operationType.equalsIgnoreCase("multiply")){
            result = a*b;
        }
        if(operationType.equalsIgnoreCase("divide")){
            result = a/b;
        }
        else{
            System.out.println("please given value:add,subtract,multiply,divide");
        }
            System.out.println("Result of"+operationType.toUpperCase()+" opertaion is:"+result);
    }
}
class TestDemo{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("please select Calculator operation");
        System.out.println("add");
        System.out.println("subtract");
        System.out.println("Multiple");
        System.out.println("divide");
        String operation = scan.nextLine();
        System.out.println("Enter your number");
        int firstnumber = scan.nextInt();
        System.out.println("Enter another number");
        int secondnumber = scan.nextInt();


        ScannerDemo2 obj = new ScannerDemo2( firstnumber,secondnumber );
        obj.opertaion(operation);

    }
}
