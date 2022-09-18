package ifCondition;

import java.util.Scanner;

public class IfCondition3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int marks ;
        System.out.println("student.Student Marks");
        marks = scan.nextInt();
        scan.close();
        if(50 > marks){
            System.out.println("fail");
        }
        else if(marks > 50 && marks < 60){
            System.out.println("D Grade");
        }
        else if(marks >60 && marks < 70){
            System.out.println("C Grade");
        }
        else if(marks > 70 && marks < 80) {
            System.out.println(" B Grade");
        }
        else if (marks > 80 && marks < 90){
            System.out.println("A Grade");
        }
        else {
            System.out.println(" Invalid");
        }
    }
}
