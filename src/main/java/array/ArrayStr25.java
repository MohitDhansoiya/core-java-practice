package array;

import java.util.Scanner;

public class ArrayStr25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int length = scan.nextInt();
        int numArray[] = new int [length];
        for(int i = 0 ; i <= numArray.length - 1; i++){
            numArray[i] = scan.nextInt();
        }
        System.out.println("duplicate Element in the given Array:");
        for(int i = 0 ; i < numArray.length ; i++){
            for(int j = i + 1; j < numArray.length; j++){
                if (numArray[i] == numArray [j])
                    System.out.println(numArray[j]);
            }
        }
    }
}
