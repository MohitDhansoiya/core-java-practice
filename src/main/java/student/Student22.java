package student;

import java.util.Scanner;

public class Student22 {
    int id;
    String name;
    int marks ;
    String branch;
    String city;
    void method(int i,String n, int m,String b,String c){
        id = i;
        name = n;
        marks = m;
        branch = b;
        city = c;
    }
    void displayDetails(){
        System.out.println("student.Student Details are :");
        System.out.println(" ID: "+id + "\n Name: " + name + "\n Marks: " + marks + "\n Branch: " + branch + "\n City: "+ city );
    }
}
class TestStudent22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No of student.Student :");
        int EnterNoOfStudent = scan.nextInt();
        for (int no = 1; no <= EnterNoOfStudent;no++) {
            System.out.println("*\t*\t* Please Provide  student.Student " +no+ " detils *\t*\t*  ");
            System.out.println("student.Student id:");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("student.Student name:");
            String name = scan.nextLine();
            System.out.println("student.Student marks:");
            int marks = scan.nextInt();
            scan.nextLine();
            System.out.println("student.Student branch:");
            String branch = scan.nextLine();
            System.out.println("student.Student city:");
            String city = scan.nextLine();
            Student22 st = new Student22();
            st.method(id, name, marks, branch, city);
            st.displayDetails();
            System.out.println("We are done with student.Student " + no);
            System.out.println();
        }
        scan.close();
    }
}
