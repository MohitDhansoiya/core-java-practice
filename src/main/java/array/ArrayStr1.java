package array;

import java.util.Scanner;

public class ArrayStr1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give an integer value");
        int sizeOfArray = scan.nextInt();
        int age []= new int[sizeOfArray];
        System.out.println("Students age array size:"+age.length);
        for(int i = 0; i <= age.length-1; i++) {
            System.out.println("Please Enter Age " + i + " :");
            int age1 = scan.nextInt();
            age[i] = age1;
        }
        System.out.println("student.Student array Age:");
        for(int i = 0; i <= age.length-1;i++){

            System.out.println(age[i]);

        }}
    }

