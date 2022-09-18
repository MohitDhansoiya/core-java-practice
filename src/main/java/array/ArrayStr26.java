package array;

import java.util.Scanner;

public class ArrayStr26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lenght of array :");
        int length = scan.nextInt();
        int numArray [] = new int[length];
        for(int i = 0 ; i < numArray.length ; i++){
            numArray [i] = scan.nextInt();
        }
        System.out.println("Element Given Array present even postion:");
        for(int i = 0 ; i <= numArray.length - 1; i = i + 2){
            System.out.println(numArray[i]);
        }
    }
}
