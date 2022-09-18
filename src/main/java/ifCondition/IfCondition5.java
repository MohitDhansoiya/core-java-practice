package ifCondition;

import java.util.Scanner;

public class IfCondition5 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int ammount ;
        System.out.println("online Verification");
        ammount = scan.nextInt();
        scan.close();
        if(ammount > 100000){
            System.out.println("Rich");
        }
        else if(ammount < 100000){
            System.out.println("medium");
        }
        else if(ammount > 100000){
            System.out.println("Lower");
        }
        else {
            System.out.println(" BPL");
        }
        }
    }

