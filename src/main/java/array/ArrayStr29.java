package array;

import java.util.Scanner;

public class ArrayStr29 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Length of array:");
        int length = scan.nextInt();
        int[] numArray = new int[length];
        System.out.println("Please Enter " + length + " numbers");
        for (int i = 0; i <= numArray.length - 1; i++) {
            numArray[i] = scan.nextInt();
        }
        for (int i = 0; i <= numArray.length - 1; i++) {
            sum = sum + numArray[i];
        }
        System.out.println("Sum of Array Elements : " + sum);

    }
}
