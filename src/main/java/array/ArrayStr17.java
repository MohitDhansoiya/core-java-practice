package array;

import java.util.Scanner;
public class ArrayStr17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer value postive or negtive choice is yours");
        int value = scan.nextInt();
        int [] number = new int[value];
        if(value > 0){
            System.out.println("number is Postive:"+value);
        }else if(value < 0){
            System.out.println("number is Negtive:"+value);
        }else{
            System.out.println("zero");
        }
    }
}
