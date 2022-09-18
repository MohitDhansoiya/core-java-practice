package student;

import java.util.Scanner;

public class Student12 {
    int id ;
    String name;
    void insert(int i ,String n){
        System.out.println(id + "  " + name);
    }
}
class TestStudent12{
    public static void main(String[]args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("student.Student Details");
        System.out.println("Id Of student.Student:");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Name of student.Student:");
        String name = scan.nextLine();
        Student12 st = new Student12();
        st.insert(id ,name);
        scan.close();
    }
}
