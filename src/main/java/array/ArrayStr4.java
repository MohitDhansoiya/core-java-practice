package array;

import java.util.Scanner;

public class ArrayStr4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter integer Value of array size:");
        int value = scan.nextInt();
        int[] month  = new int [value];
        scan.nextLine();
        int num = scan.nextInt();

        switch(num) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            default:
        }
                System.out.println("Number of Month:"+ month.length);
                for(int i = 0; i <= month.length-1; i++){
                    System.out.println(month[i]);
                }
        }
    }

