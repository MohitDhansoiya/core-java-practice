package ifCondition;

import java.util.Scanner;

public class IfCondition2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.println("Year is ");
        year = scan.nextInt();
        if(year %2==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Common year");
        }

    }
}
