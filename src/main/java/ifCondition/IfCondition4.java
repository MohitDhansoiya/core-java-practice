package ifCondition;

import java.util.Scanner;

public class IfCondition4 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int no;
        System.out.println("Number Type");
        no = scan.nextInt();
        scan.close();
        if(no > 0){
            System.out.println("Positive Number");
        }
        else if (no < 0){
            System.out.println("Negtive Number");
        }
        else{
            System.out.println("Zero");
        }
    }
}
