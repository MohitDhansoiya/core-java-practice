package LastParactice;

import com.sun.org.apache.xerces.internal.impl.xs.models.XSCMBinOp;

import java.util.Scanner;

public class Calculator {
        int a ;
        int b ;
        int res  = 0;
        Calculator(int a,int b){
           this.a = a;
           this.b = b;
        }
        void value(){
            System.out.println("Welcome in Calculator");
        }
        void add(){
            res = a + b;
            System.out.println("number is add:"+res);
        }
        void sub(){
            res = a - b;
            System.out.println("number is sub:"+res);
        }
        void mul(){
            res = a * b;
            System.out.println("number is mul:"+ res);
        }
        void div(){
            res = a/b;
            System.out.println("number is div:"+res);
        }
        void operation(String operationType){
            if(operationType.equalsIgnoreCase("addition")){
                res = a + b;
            }
            if(operationType.equalsIgnoreCase("subtraction")){
                res = a - b;
            }
            if(operationType.equalsIgnoreCase("multiply")){
                res = a * b;
            }
            if(operationType.equalsIgnoreCase("divide")){
            }
            else {
                System.out.println("please given addion,subtract,multiply,divide");
            }
            System.out.println("Result Of "+operationType.toUpperCase()  +"   "+"opertionResult:"+res);
        }
}
class TestCalcu{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("add");
        System.out.println("sub");
        System.out.println("mul");
        System.out.println("div");
        String opertion = scan.nextLine();
        System.out.println("Enter First No");
        int firstNumber= scan.nextInt();
        System.out.println("Enter Second No");
        int secondNumber= scan.nextInt();
        Calculator cl = new Calculator(firstNumber,secondNumber);
        cl.operation(opertion);
        }
    }

