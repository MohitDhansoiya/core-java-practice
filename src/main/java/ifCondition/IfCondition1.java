package ifCondition;

import java.util.Scanner;

public class IfCondition1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int no;
        System.out.println("Number is Integer");
        no = scan.nextInt();
        if(no %2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
