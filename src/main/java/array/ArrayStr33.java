package array;

import java.util.Scanner;

public class ArrayStr33 {
    public static void main(String[] args) {
        int temp = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Length of Array:");
        int length = scan.nextInt();
        int numAraray [] = new int [length];
        System.out.println("Please Enter"+ length +" numbers ");

        for(int i = 0; i < numAraray.length - 1; i++){
            numAraray [i]  = scan.nextInt();
        }
        for(int i = 0; i < numAraray.length -1; i++){
            for(int j = i + 1; j < numAraray.length-1; j++){
                if(numAraray[i] > numAraray[j]){
                    temp =  numAraray[i];
                    numAraray[i] = numAraray[j];
                    numAraray[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Array Element in ascending order");
        for(int i = 0;  i < numAraray.length; i++ ){
            System.out.println(numAraray[i]);
        }
    }
}
