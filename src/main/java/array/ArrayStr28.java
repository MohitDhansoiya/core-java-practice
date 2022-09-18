package array;

import java.util.Scanner;

public class ArrayStr28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array length size:");
        int length = scan.nextInt();
        int numArray [] = new int [length];
        for(int i = 0 ; i <= numArray.length-1 ; i++){
            numArray[i] = scan.nextInt();
        }
        for(int i = 0 ; i <= numArray.length; i = i + 1){
            System.out.println("Odd no index value:"+numArray[i]);
        }

    }
}
