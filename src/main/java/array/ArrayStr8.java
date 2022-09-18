package array;

import java.util.Scanner;

public class ArrayStr8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" \t*\t*\t*\tEnter the Character of the string\t*\t*\t*");
        String name = scan.nextLine();
        System.out.println("Find the length of String:");

        String [] words = name.split(name, name.length());
        for(int i = name.length()- 1; i >= 0; i--) {
            System.out.print( name.charAt(i));
        }


    }
}
