package student;

import java.util.Scanner;

public class Student9 {
    int rollNo ;
    String name;
    String school;
    Student9(int r, String n) {
        rollNo = r;
        name = n;
    }
    void dispalyDetails(){
        System.out.println(rollNo + " " + name );
    }
}
class TestStudent9{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println(" student.Student Details");
        System.out.println("Rollno Of student.Student");
        int rollNo = scan.nextInt();
        System.out.println("Name of student.Student");
        String name = scan.nextLine();
        scan.close();
        Student9 st = new Student9(rollNo ,name);
        st.dispalyDetails();
    }
}
