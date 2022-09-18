package student;

import java.util.Scanner;

public class Student21 {
    int id ;
    String name;
    static String clg = "RPIIT";
    static void method(){
        clg = "PIET";
    }
    Student21(int i , String n){
        id = i;
        name = n;
    }
    void displayDetails(){
        System.out.println(id + "  " + name  + "  " +clg);
    }
}
class TestSudent21{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("student.Student Information");
        System.out.println(" student.Student Id:");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("student.Student Name:");
        String name = scan.nextLine();
        Student21 st = new Student21(id,name);
        st.displayDetails();
        Student21.method();
        st.displayDetails();
    }
}
