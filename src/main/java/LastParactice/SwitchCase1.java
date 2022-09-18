package LastParactice;

import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide array Size");
        int noOfElement = scan.nextInt();
        System.out.println("Which type of value you want");
        System.out.println("press 1 for integer \npress 2 for String ");
        int press = scan.nextInt();
        scan.nextLine();
        switch (press) {
            case 1:
                int studentRollNo[] = new int[noOfElement];
                System.out.println("No of Student:" + studentRollNo.length);
                for (int i = 0; i <= studentRollNo.length - 1; i++) {
                    System.out.println("Enter student.Student roll no" + i + " :");
                    int rollNo = scan.nextInt();
                    studentRollNo[i] = rollNo;
                }
                System.out.println("student.Student class rollNo:");
                for (int i = 0; i <= studentRollNo.length - 1; i++) {
                    System.out.println(studentRollNo[i]);
                }
                break;
            case 2:
                String nameOfStudent[] = new String[noOfElement];
                System.out.println("name of Student:" + nameOfStudent.length);
                for (int i = 0; i <= nameOfStudent.length - 1; i++) {
                    System.out.println("Enter Student.Student name:" + i + " :");
                }
                System.out.println("Student.nameOfStudent");
                for (int i = 0; i <= nameOfStudent.length - 1; i++) {
                    System.out.println(nameOfStudent[i]);
                }
                break;
            default:
                System.out.println("Invalid no only press\n 1 or 2");
                break;
        }

    }
}


