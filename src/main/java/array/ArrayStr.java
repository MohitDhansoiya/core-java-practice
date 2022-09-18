package array;

import java.util.Scanner;

public class ArrayStr {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please give an integer value :");
            int sizeOfArray = scan.nextInt();
//            int StudentRollNo[] = new int[sizeOfArray];
//            System.out.println("Array size:" + StudentRollNo.length);
            System.out.println("Which type of array you want:");
            System.out.println("Please press 1 for Integer array \n press 2 for String array ");
            int press = scan.nextInt();
            switch(press) {
                case 1:
                    int StudentRollNo[] = new int[sizeOfArray];
                    System.out.println("your array size:"+ StudentRollNo.length);
                    break;
                case 2:
                    String[] StudentRollNo1 = new String[sizeOfArray];
            System.out.println("Your array size :"+StudentRollNo1.length);
            }
    }
}