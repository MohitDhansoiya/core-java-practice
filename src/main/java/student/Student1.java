package student;

import java.util.Scanner;

public class Student1 {
    String name;
    int rollno;
    String college;
    Student1(String name,String college,int rollno){
        this.name = name;
        this.college = college;
        this.rollno = rollno;
    }
    void displayDetails(){
        System.out.println(name + ""+ college + ""+ rollno);
    }
}
class TestStu{
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("student.Student Bio Data");
        String name = scan.nextLine();
        System.out.println("Name of student.Student:"+name);
        int rollno = scan.nextInt();
        System.out.println("student.Student rollno:"+rollno);
        String college = scan.nextLine();
        System.out.println("Name of college:"+college);
        scan.close();
        Student1 obj = new Student1("name","college",rollno);
        obj.displayDetails();
    }
}
