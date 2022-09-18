package array;

import java.util.Scanner;

public class ArrayStr7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\t***\tEnter the Character\t ***\t");
        String name =scan.nextLine();
        System.out.println("Find the length of String:");
        int sizeOfString = scan.nextInt();
        for(int i = sizeOfString -1;  i >= 0; i-- ){
            System.out.print(name.charAt(i));
        }
    }
}
