package student;

import java.util.Scanner;

public class Student16 {
    int rollno;
    String name;
    String school;
    Student16(int r,String n,String s){
        rollno = r;
        name = n;
        school = s;
    }
    void information(){
        System.out.println("Name Of student.Student:"+name);
        System.out.println("RollNo Of student.Student:"+rollno);
        System.out.println("NAme Of School:"+school);
    }
    void display(){
        System.out.println(rollno + "" +name + ""+ school);
    }
}
class TestStudent16{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("student.Student Information");
        System.out.println("rollNO of student.Student:");
        int rollno = scan.nextInt();
        System.out.println("Name Of student.Student:");
        String name = scan.nextLine();
        System.out.println("Name Of School:");
        String school = scan.nextLine();
        scan.nextLine();
        Student16 st = new Student16(rollno ,"name","school");
        Student16 st1 = new Student16(rollno,"name", "school");
        st.display();
        st.display();
        st.information();
    }
}
