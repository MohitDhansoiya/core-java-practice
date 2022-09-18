package array;

import java.util.Scanner;

public class ArrayStr30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("length of array:");
        int length = scan.nextInt();
        scan.nextLine();
        String wordsString [] = new String [length];
        for(int i  = 0; i <= wordsString.length - 1; i++){
             wordsString[i] = scan.nextLine();
        }
        System.out.println("Duplicate String in the given array:");
        for(int i = 0; i < wordsString.length ; i++){
            for(int j = i + 1 ; j < wordsString.length ; j++){
                if(wordsString[i].equals(wordsString[j]))
                    System.out.println(wordsString[j]);
            }
        }
    }
}
