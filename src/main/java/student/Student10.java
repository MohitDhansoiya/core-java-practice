package student;

import java.util.Scanner;

public class Student10 {
    int id ;
    String name;
    String clg;
    Student10(int i ,String n){
        id = i;
        name = n;
    }
    Student10(int i,String n,String c){
        id = i;
        name = n;
        clg = c;
    }
    void dispalyDetails(){
        System.out.println(id +" "+ name + " "+ clg);
    }
}
class TestStudent10{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println(":::::::::::student.Student Details Program::::::::::");
        System.out.println("Enter number of Students to display: ");
        int noOfStudents = scan.nextInt();
        for(int no=1; no<=noOfStudents; no++) {
            System.out.println("Enter student.Student id: ");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter student.Student Name");
            String name = scan.nextLine();
            System.out.print("Enter student.Student College");
            String clg = scan.nextLine();
            Student10 st = new Student10(id,name,clg);
            st.dispalyDetails();

        }
        scan.close();
    }
}
