package array;

import java.net.Socket;
import java.util.Scanner;

public class ArrayStr27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int length = scan.nextInt();
        int [] numArray = new int [length];
        for(int i = 0; i <= numArray.length - 1; i++) {
            numArray[i] = scan.nextInt();
        }

        System.out.println("value of array:");
        for(int i = 0 ; i <= numArray.length - 1 ; i++){
            System.out.println(numArray[i]);
        }
        System.out.println("Array in Reverse Order :");
        for(int i = numArray.length - 1; i >= 0 ; i--){
            System.out.println(numArray[i]);
        }
        }
    }
