package array;

import java.util.Scanner;

public class ArrayStr16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  value choice is yours positive and negtive ");
        String  num = scan.nextLine();
        String  [] length =  num.split(" ");
        for(int i = 0; i <= num.length ()-1 ; i++){
            System.out.println(length[i]);
        }
    }
}
