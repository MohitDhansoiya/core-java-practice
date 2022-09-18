package student;

import java.util.Scanner;

public class Student18 {
    int id;
    String name ;
    static  String clg = "RPIIT";
    void insert(int i , String n){
        id = i;
        name = n;
    }
    void displayDetails(){
        System.out.println(id + "  " + name + "  " + clg );
    }
}
class TestStudent18{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("student.Student information");
        int noOfStudent = scan.nextInt();
        for(int no = 1; no <= noOfStudent ; no++){
            System.out.println("student.Student Id:");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("student.Student Name:");
            String name = scan.nextLine();
            Student18 st = new Student18();
            st.insert(id, name);
            st.displayDetails();
        }
        scan.close();
    }
}
