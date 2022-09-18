package array;

import java.util.Scanner;

public class ArrayStr20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence in String ");
        String num = scan.nextLine();
        for(int i = 0; i <= num.length(); i++){
            System.out.println(num.charAt(i));
        }

    }
}

