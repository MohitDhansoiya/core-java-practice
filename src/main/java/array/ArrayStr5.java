package array;

import java.util.Scanner;

public class ArrayStr5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\t ***\t Week of the day \t***\t");
        System.out.println("Enter Integer value :");
        int week = scan.nextInt();
        scan.nextLine();
        switch (week){
            case 1:
                System.out.println("The day is Sunday");
                break;
            case 2:
                System.out.println("The Day is Monday");
                break;
            case 3:
                System.out.println("The Day is Tuesday");
                break;
            case 4:
                System.out.println("The Day is Wednesday");
                break;
            case 5:
                System.out.println("The Day is Thurasday");
                break;
            case 6:
                System.out.println("The Day is Friday");
                break;
            case 7:
                System.out.println("The Day is Saturady");
                break;
            default:
                break;
        }
        System.out.println("Invalid Value");
    }
}
