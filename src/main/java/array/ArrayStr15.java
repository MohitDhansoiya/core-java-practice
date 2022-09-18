package array;

import java.util.Scanner;

public class ArrayStr15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Take a string :");
        String sentence = scan.nextLine();
        String[] arrayStr = sentence.split(" ");
        for (int i = arrayStr.length - 1; i >= 0  ; i--) {
            System.out.println(arrayStr[i]);
        }
    }
}