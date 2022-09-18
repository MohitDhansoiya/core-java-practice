package others;

import java.util.Scanner;

public class Calculator {
    int a ;
    int b ;
    int result = 0;
    Calculator(int a,int b){
        this.a = a;
        this.b = b;
    }
    void add(){
        result = a + b;
        System.out.println("Add value :"+result);
    }
    void sub(){
        result = b-a;
        System.out.println("Subtract value:"+result);
    }
    void mul(){
        result = a*b;
        System.out.println("Multiple value:"+result);
    }
    void divide(){
        result = a/b;
        System.out.println("Divide value :"+result);
    }

    void operation(String operationType) {

        if (operationType.equalsIgnoreCase("add")) {
            result = a + b;

        } else if (operationType.equalsIgnoreCase("subtract")) {
            result = b - a;
        } else if (operationType.equalsIgnoreCase("multiply")) {
            result = a * b;
        } else if (operationType.equalsIgnoreCase("divide")) {
            result = a / b;
        } else {
            System.out.println("please given value =add,subtract,mul,divide");
        }
        System.out.println("Result of " + operationType.toUpperCase() + " operation is : " + result);
    }
}
class Test{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Mohit Calculator....!!!!");
        System.out.println("Please select calculator operation:");
        System.out.println("Add");
        System.out.println("Subtract");
        System.out.println("Multiply");
        System.out.println("Divide");
        String operation = scanner.nextLine();
        System.out.println("Please enter a number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter another number:");
        int secondNumber = scanner.nextInt();

        Calculator obj = new Calculator(firstNumber,secondNumber);
//        obj.add();
//        obj.sub();
//        obj.mul();
//        obj.divide();
        obj.operation(operation);
    }
}
