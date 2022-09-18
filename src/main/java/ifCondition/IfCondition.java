package ifCondition;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Age is greater");
         age = scan.nextInt();
        if(age > 18){
            System.out.println("valid for vote");
            scan.close();
        }
    }
}
