package array;

import java.util.Scanner;

public class ArrayStr3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month 1 to 12:");
        int num = scan.nextInt();

        switch(num){
            case 1: ;
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
                System.out.println("31 days in this month");
                break;
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("30 days in this month ");
                break;
            case 2:
                System.out.println("28 days in this month:");
                    break;
            default:
        }
        System.out.println("Invalid Number:");
    }
}
