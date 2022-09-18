package student;

import java.util.Scanner;

public class Student13 {
    int id ;
    String name;
}
class Teststudent{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("student.Student Details");
        System.out.println("student.Student Id:");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("student.Student Name:");
        String name = scan.nextLine();
        Student13 st = new Student13();
        st.id = id;
        st.name = name;
        System.out.println(st.id + "   " + st.name);
    }
}
