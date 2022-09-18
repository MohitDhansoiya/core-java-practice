package array;

import java.util.Scanner;

public class ArrayStr9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String name = scan.nextLine();
//        System.out.println("Find the length of String:");

        String [] arrayString = name.split(" ");
        int arraySize = arrayString.length;
        for(int i = 0; i <= arraySize - 1 ; i++){
            System.out.println(arrayString[i]);
        }
    }
}
