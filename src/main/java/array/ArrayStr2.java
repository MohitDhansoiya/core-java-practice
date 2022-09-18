package array;

import java.util.Scanner;

public class ArrayStr2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide array size:");
        int numberOfElements = scan.nextInt();
        System.out.println("which type of value you want:");
        System.out.println("press 1 for integer \npress 2 for String");
        int press = scan.nextInt();
        scan.nextLine();
        switch(press){
            case 1:
                int studentRollNo [] = new int [numberOfElements];
                System.out.println("Size of array is:"+ studentRollNo.length);
                for(int i = 0; i <= studentRollNo.length - 1;i++){
                    System.out.println("Enter student.Student roll no"+ i+" :");
                    int rollNo = scan.nextInt();
                   studentRollNo  [i] = rollNo;
                }
                System.out.println("student.Student class rollNo:");
                for(int i = 0; i <= studentRollNo.length - 1; i++){
                    System.out.println(studentRollNo[i]);
                }
                break;
            case 2:
                String studentName [] = new String [numberOfElements];
                System.out.println("Size of array is:"+ studentName.length);
                for(int i = 0; i <= studentName.length - 1;i++){
                    System.out.println("Enter student.Student name"+ i+" :");
                    String name = scan.nextLine();
                    studentName  [i] = name;
                }
                System.out.println("Array:: student.Student name:");
                for(int i = 0; i <= studentName.length - 1;i++){
                    System.out.println(studentName[i]);
                }
                break;
            default:
                System.out.println("Invalid input... \n Please give 1 or 2.");
                break;
        }
    }
}
