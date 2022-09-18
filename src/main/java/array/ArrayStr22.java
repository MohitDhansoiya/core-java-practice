package array;

import java.util.Scanner;

public class ArrayStr22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length Of Array:");
        int num = scan.nextInt();
        int numArray [] = new int[num];
        for(int i = 0; i <= numArray.length -1 ; i++) {
            numArray[i] = scan.nextInt();
        }
        for(int i = 0; i <= numArray.length - 1; i++){
            if(numArray[i] % 2== 0){
                System.out.println("no is even:");
            }else{
                System.out.println("no is odd");
            }
        }
    }
}
