package array;

import java.util.Scanner;

public class ArrayStr34 {
    public static void main(String[] args) {
        int temp = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Length Of Array:");
        int lenght = scan.nextInt();
        int numArray [] = new int[lenght];
        System.out.println("Please Enter"+ lenght +" numbers ");
        for(int i = 0; i <= numArray.length - 1; i++){
            numArray [i] = scan.nextInt();
        }
        for(int i = 0; i < numArray.length-1; i++){
            for(int j = i + 1; j < numArray.length-1; j++){
                if(numArray[i] < numArray[j]){
                    temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Array Element in Descending order:");
        for(int i = 0; i< numArray.length -1; i++){
            System.out.println(numArray[i]+"");
        }
    }
}
